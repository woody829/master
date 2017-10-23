package controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by woody on 2017/3/26.
 */
@Controller
public class InfoController {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(InfoController.class);

    @RequestMapping(value = "InfoController.do")
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LOG.debug("goto InfoController");
        String txCode = request.getParameter("txCode");
        String jsp = "Tx" + txCode +".jsp";
        request.setAttribute("txCode", txCode);
        request.getRequestDispatcher(jsp).forward(request, response);
    }

}
