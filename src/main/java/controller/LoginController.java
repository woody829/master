package controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by woody on 2017/3/26.
 */
@Controller
public class LoginController {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(LoginController.class);
    @RequestMapping(value = "Login.do")
    public ModelAndView loginPage(HttpServletRequest request) {
        LOG.debug("goto LoginController");
            // 1.取得参数
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            if("cfca".equals(userName) && "123qwe".equals(password)){
                return new ModelAndView("main");
            }else{
                request.setAttribute("info", "用户名或密错误");
                return new ModelAndView("index");
            }
    }
}
