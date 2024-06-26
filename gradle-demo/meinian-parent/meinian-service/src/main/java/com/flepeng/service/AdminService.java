package com.flepeng.service;

import com.flepeng.bean.Admin;

import com.flepeng.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    public List<Admin> getAdminList(){
        return adminMapper.getAdminList();
    }
}
