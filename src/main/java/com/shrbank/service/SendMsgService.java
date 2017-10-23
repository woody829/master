package com.shrbank.service;

import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import util.crypto.P2PMessageUtils;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Created by woody on 2017/3/30.
 */

@Service
public class SendMsgService {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SendMsgService.class);

    private String normalURL;
    private String encryptURL;

    public String getNormalURL() {
        return normalURL;
    }

    public void setNormalURL(String normalURL) {
        this.normalURL = normalURL;
    }

    public String getEncryptURL() {
        return encryptURL;
    }

    public void setEncryptURL(String encryptURL) {
        this.encryptURL = encryptURL;
    }

    public String getRsponseMsg(String msg, String flag) throws Exception {
        String url = getNormalURL();
        logger.debug("Charset.defaultCharset:"+ Charset.defaultCharset());

        if ("Y".equals(flag)) {
            msg = P2PMessageUtils.getEncryptContent(msg);
            url = getEncryptURL();
        }
        logger.debug("xmlContent: sendMsg {}", msg);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = "";
        try {
            HttpPost httpPost = new HttpPost(url);
            RequestConfig defaultRequestConfig = RequestConfig.custom()
                    .setCookieSpec(CookieSpecs.BEST_MATCH)
                    .setExpectContinueEnabled(true)
                    .setStaleConnectionCheckEnabled(true)
                    .setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
                    .setProxyPreferredAuthSchemes(Arrays.asList(AuthSchemes.BASIC))
                    .build();

            // 设置超时
            RequestConfig requestConfig = RequestConfig.copy(defaultRequestConfig)
                    .setSocketTimeout(5000)
                    .setConnectTimeout(5000)
                    .setConnectionRequestTimeout(5000)
                    .build();

            StringEntity se = new StringEntity(msg, "GBK");
            httpPost.setEntity(se);
            httpPost.setConfig(requestConfig);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            //输出调用结果
            if (response != null && response.getStatusLine().getStatusCode() == 200) {
                result = EntityUtils.toString(response.getEntity(), "GBK");
                logger.debug("xmlContent: responseMsg {}", result);
            }
        } catch (Exception e) {
            logger.error("error", e);
            e.printStackTrace();
            throw e;
        } finally {
//            try {
//                EntityUtils.consume(httpEntity);
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                logger.error(e.getMessage(), e);
//            }

            httpClient.close();
        }
        if ("Y".equals(flag)) {
            result = P2PMessageUtils.getDecryptContent(result);
        }
        return result;
    }
}