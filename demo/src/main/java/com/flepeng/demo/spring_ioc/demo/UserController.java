package com.flepeng.demo.spring_ioc.demo;

import com.flepeng.demo.spring_ioc.service.UserService;
import com.flepeng.demo.spring_ioc.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {

    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new FileSystemXmlApplicationContext("C:\\Users\\apple\\IdeaProjects\\Spring\\itheima_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        //UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }

}
