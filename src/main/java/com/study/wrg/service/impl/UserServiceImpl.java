package com.study.wrg.service.impl;

import com.study.wrg.entity.User;
import com.study.wrg.repository.UserDao;
import com.study.wrg.service.UserService;
import com.study.wrg.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUserList() throws Exception {
        List<User> users = new ArrayList<>();
        try{
            users = userDao.selectUsers();
        }catch (Exception e){
            LogUtil.getServiceLogger().error("getUserList() img",e);
            e.printStackTrace();
            throw e;
        }
        return users;
    }
}
