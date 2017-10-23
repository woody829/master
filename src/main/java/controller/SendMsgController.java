package controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.shrbank.service.SendMsgService;
import util.XmlUtil;

/**
 * Created by woody on 2017/3/26.
 */
@Controller
public class SendMsgController {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SendMsgController.class);

    @Autowired
    private SendMsgService sendMsgService;

    @RequestMapping(value = "SendMessage.do", method = RequestMethod.POST, produces = "text/html;charset=GBK")
    @ResponseBody
    public String handleRequest(@RequestParam(required = true) String message,
                                @RequestParam(required = true) String encryptFlag)
            throws Exception {
        String responseMsg = sendMsgService.getRsponseMsg(message, encryptFlag);
        responseMsg = XmlUtil.createPrettyFormat(responseMsg, "GBK");
        return responseMsg;
    }
}