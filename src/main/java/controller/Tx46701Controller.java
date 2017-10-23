package controller;

import com.shrbank.entity.MsgDTO;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import request.Tx46701Request;

/**
 * Created by woody on 2017/3/26.
 */
@Controller
public class Tx46701Controller {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Tx46701Controller.class);

    @RequestMapping(value = "Tx46701.do")
    public ModelAndView handleRequest(MsgDTO msgDTO) throws Exception {
        Tx46701Request tx46701Request = new Tx46701Request();
        tx46701Request.process(msgDTO);

        ModelAndView modelAndView = new ModelAndView("Request");
        modelAndView.addObject("msgDTO", msgDTO);
        return modelAndView;
    }
}
