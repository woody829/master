package com.shrbank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by woody on 2017/8/1.
 */
@Controller
@RequestMapping("/msg")
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/index")
    public String index() {
        logger.info("ccccc");



        return "index";
    }
}
