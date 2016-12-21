package com.liu.smallProgram.talkHall.controller;


import com.liu.smallProgram.talkHall.service.MessageBoardHallService;
import com.liu.smallProgram.talkHall.service.UserAccountService;
import com.liu.smallProgram.talkHall.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    @Autowired
    MessageBoardHallService messageBoardHallService;

    @Autowired
    UserAccountService userAccountService;
    @Autowired
    UserInfoService userInfoService;
    /**
     * Index string.
     *
     * @return the string
     */
    @RequestMapping(value = "/index",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView index(){
        LOGGER.info("this is the first jsp page");
        return new ModelAndView("index");
    }


}
