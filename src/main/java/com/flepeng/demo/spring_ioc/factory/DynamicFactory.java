package com.flepeng.demo.spring_ioc.factory;


import com.flepeng.demo.spring_ioc.dao.UserDao;
import com.flepeng.demo.spring_ioc.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
