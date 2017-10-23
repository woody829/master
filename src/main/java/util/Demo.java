package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.crypto.CgMessageUtils;

import java.nio.charset.Charset;

/**
 * Created by woody on 2017/3/5.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
    	Logger LOG = LoggerFactory.getLogger(Demo.class);

        System.out.println("Charset.defaultCharset:"+ Charset.defaultCharset());


    	// P2P公司发送报文信息给华瑞存管系统
    	// 加密
    	// 1.存管公钥加密key
    	// 2.p2p私钥签名
    	// 3.key加密发送内容
//    	String msg1 = P2PMessageUtils.getEncryptContent("abcdefg");
//        LOG.debug(msg1);

        // P2P公司接收华瑞存管系统报文信息并解密验签
    	// 解密
    	// 1.p2p私钥解密key
    	// 2.key解密发送内容
    	// 3.存管公钥验签
//        String encryptContent = "P0008000|M/4hHJ1ZqXMBvQ1aQjqBAr5+7cHiKWQNOgHLGmkOmIfe6FFW2P/5F/ONz1uv6/EZS0H8VPb/m4nHrKW8ErHv71+pzVNL25s3e0Of/KhK+/k9WZj5AUSBYWKXEdo740xsT2JCR26+dOb3Yj5lvv+AMsskDApmW+ORwdO0P4mYEJUmopFrqiOy3zL1rSPF/mW3TmGN6PT9S9cbNQ1bbX/zrSyxvX1l08SP5HLa4MNVaSdOGdtvMGShGML6EuOLLKer+9MpA9s7ooPbJKyh3oqQIVvOHpUSra1a9bs/O442T4iXD7Vyd3Qlxw3qeTHfTh4Qh9hS4oC2MBTjrPN5Npap7g==|c2IbD0oZ6Ybi8nLK/UPK21lQSYpQOqoI7K+y/2TebLQoUuSgvZSdtZ1wpcafYuLBXdstww+yq478EWzZJsFU3pPbvTE62pdd3iFuJiDo5Ysc32mum7oogepC8u65zp4v0tvHiWvKieK9j0AtDvsFdFkTHjI3dhiml6dXtmnNFtU=|xzShnQJVkjYCCwiXE9nE8kF2fmvhKh/Us3sOg3xhpx2dd7Esz5day4By1qqdi8LV+ehKsDX06KRQC0oKqk2jR2E3SSUgbOprPerL3+/XcUCnlEmDZ/rpnUgH30g5oxqndjU/T4qKSiGhsfThzOEV3foDuMmnnxj/neLqWYJUu+vN2cfZbB1bD0hnJ/+C2r28P0/hQeNZMKVMhTQMqgEuK0DkDWaL7DELvxk4R1zGgFeXlj9DUL0+VONkIuPxiMp0uQTUEX6bIDlZKr4n0Pflb96MoZyI9ecTOB9JR36r1zcy7JOOGTVm21h419rebN1CTxvCZ0DXnt186OmaYPeirpZ44df/ivtf+oYS7qUsGcrjyl2ZDypuBjAIWD/SiRavOdkEmI18c/K7Jnv4r6QLlj6z0+6LGlRY+jEQOomrdWCLzoTRjBck1N+wCMe1Kg471rTzL+Tz4DhSP/cwxMGpZhlvlrWFXf6IUVcevj/0ZapoBbLVKGe8foj9vjQW5+QBzx3BkpAYNdJYP9Cxng2OZaMz5kLj6agWXg9tjjr9eFszDNEFznL/n5iZx7t8ty5AmGv+Kvsmv+IFmJ8OST5vKsdi2a9av1YeYgDDp5NMPpBK1sCpRO9g08I1+3/2Op+/5anxmCVXR7jPB2o73NHlfDnx4FDYA47sxwmlFBKUVKykqCwCB/LKXKkEnW1nQWTq21IV7Qv86h6D9//YPL7k05Y6Cq4cdE4R7u0nsEs+9gPPsKcRBCkQFFXe6bfFtBJhQOGOHVf6Ql6o2sEzPka1dUsMLo4kzw1fQdmGuhsdQZAfKrh8nz3rTe6PZRuOjWECPeb+yEoztshH4HGoMMtn6cngqBoOmeB4iHjjrL2ecKEZc8rAsjJsnJDOLapPNEi5rgXoewjfWz+LBatvfkzcgQ==";
//        String encryptContent = "P0008000|mGd9wKnP1ccs7a3YzWQzqUlYBF+0dMTjYfz93cC21ok+2BGo6djuW+1rgfKuoYMLqWptzJ61Cam42wDXiQP/ZpxBwFk3+Fkzn6RLz4IxyQuWHYnNSaUMsIj92Rn6iRYAobueD/8Zz8NvjCx5OZRPkXeJs5YGd9mky38NT3kmtftLgdFCldLtu9k9C2M+Wp4wkRCWjzF/opXKQ2h2DVN1XeCYRjlHLJEQW+7FtC+AsTVvNlw2TSgFrZP24v4p52WbMA2zXgSzRnIfcDy+3NZEzjZX40FsQqKL7t6kWVhJjGedR6iVbh66VLneH2uykB8mSeF4hvHP3oAop0uK7tNc1w==|q3Mofc8OIlybqh5HbhQfFenmCKSy9wjeZuQeidBrbXMbR2P938Oequ66WTo3lmDAClSPS7jJRB6RusSDU664QxPrndQiDHYt9QqGibBhWLbzd5T23CYk/FCDrq8FHBfhZqU6wwlZgUjuMFQ0bnkO9UsMtxJYswakomwo1QG9TLQ=|DUUCXYo3TKm8pICLCuOMiBWkqWokzxfq/lB76Da3dOQqqe8LeE9W69dIzDwxa/1KHKGHf4LHHMA84O+cm0rpDqMZD8De4kCchkHYSSTHZ2/72Jf7RRnplpgK4FgOb6WVQb2V/KWqw/ukhvXCsanz/ejlHnQgpDnXEt2PhC/BCK2oT9tTJ9UBvFzPF/5UVijMM3pyvKz8SfyXsjp/tqdFs6gvXhQ7LxjQ6ygOCFDYmssDn6A5qQCpGUmu8lT3w/h9CzjAW/o/qzzRsUSsh1b8rM/pITYMBzPP7D9R5mHYskGXTIluIjo+eLo5ABGgH6x259hAhNtd3U8S67ld/GsKtyULvW3IId/hTKKg0ZNoJt0lcS4/nnPaU8B6C9TRLCq2HRy7KUz1YE9YrZKm0pzh+oyiqGKQbDb7dOj4mpX4MkGo1VApnJFgSTnjvsNlAjriJdGVW5iUmdiROM3S6yYuthyZDis5AE08+r97LawBm+J5N2IkaHPz5tZ5gRQAhXDxky7pvf/61A3REviNCXLK+ap+K8EZx071kLosLWbxLNy0S9VG/184bjgdMfXyRnP+EWJp3fdqcQ+SOrxWQWGuLH9YATlf/gICbUNv6DMkAowVdDeYz+yJQjbDsShsu3q80mGUB5/+1X1B4JxygLLN5Q5DCJ+JILJlK5yeE1yb66nvktaX1VVkMYQ1nI5LWkPq0dG3j9quq8oj1JlMfTNag46hmN2TfdO3c4je29acoS9J6wlsxmSVcUhHix+A7MZm7qtmUa3Bgbx6fQWrlbxDoc/C5xoqOraBZfZLq9qMA1vu/ngl4nxC3IReAWrrEywPBNCpvsAazxFbROvburFu8+f1ZzNNCo6sJG9YYtBRlpO/CN4I9T+/dzn48HqAX2/cYorMaFrtxeVkh9C/upM69w==";
//        String s = P2PMessageUtils.getDecryptContent(encryptContent);
//        System.out.println("info:"+s);




        // 存管接收P2P报文信息并解密验签
        // 解密
        // 1.存管私钥解密key
        // 2.key解密发送内容
        // 3.P2P公钥验签
        String msg="P0013000|FWJQvgiZRXkq0JB42j2VqI7WkKqW9n6rYzJAI7ffcOtwWbs/BSwVmEYwSU9IeRo0KSrU9AE6Tqb/VzFmLqLbwXA2i2MinpkAL8rxHgezprLkkllODfsxi3Bkycvv0ZwvAcGI8+XRahlpaP2NPwrIjed0sx7tWRWnM538rH2ZBJg=|ltApV0CnpD+UWcUWzn9050/CutMpJXiZXLAjmYtx4BmmK/6zGR8q80JtVZoPDAvCmyKumlrfDqj75FVeHm9FMM7bT5oy/KAcgRqEnhTP0+PhoH5CPZW30q8ou298VLjkX6wJdDvB+vbryFz/2r6ee1EBxxaifREfVA7NEsSTVcA=|und8uVQ5Z1khE9LRg8gwITVyJDxhf1t0neXylpFUQ0boFnrY24otcNL85EnLzmXTxPa3KsnDE6cm5gdix5WwwCVLOnfH2C3eaT3D/+wOwMqPgo90/86f6cSpYkskEsYodfkGmFqODssBo3cJ3rA387iMPzr1HTS7mwffeMp/46Wu7YIjh5AwdcIe4IOMouAHIJXD2pfRuvgovxqJc61gp/7yfeXTKM5k5x7K6jIHMeAcuWhokF9DUPkUIjFuKGGijbs/7x06phGB2kl/wmq92FsZEKH9i2c5J84LgrPnh6WNnNYAIK/6Sww5JqbjPcel800pEZs7EWOHostj0QOlmlzU4+fDE23hE+JrPl5kNSCIIV0ANKNuM0zLTGUsxjOiZls/Q/LXXq3LP7sEyaXRXixyj0pQP+3MxNxWaCUEASCgHqTWKOAcuqxKanpDUqDJo0iXWarQjcVvI3Gkimyub+WqgtszbOeuG3S4EcwhqOolbNeuNWjxSau7zTWkqregygvi4nYJ56P1k5nwGX8flOcT2q9mZiKSh1IwPO9If2yLx3T1/f5kfnWCGzY6AzYmEuAo2MK7YQfs1+qW20iPKpxXL8Hgs4QcBH7Nruq4+3wwUmbZCTR80ESV5cfwERKFl4MNd2y2peYmpOSlnZITQFvwhST4OMQkRbdGW+4YYaKZuiQW/cZcedcqWpjyDWnlth/EwTxPUQi2W0iCsHNxZg==";
        CgMessageUtils.getDecryptContent(msg);
    }
}
