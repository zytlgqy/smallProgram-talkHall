package com.liu.smallProgram.talkHall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type Hello controller.
 *
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00 2016/12/6   10:04   Liu Zhaoyang  created
 * @description 类的详细说明
 * @history
 */
@Controller
public class HelloController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    /**
     * Index string.
     *
     * @return the string
     */
    @RequestMapping("/index")
    public String index(){
        LOGGER.info("this is the first jsp page");
        return "index";
    }

}
