package com.study.wrg.service;

import com.study.wrg.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList() throws Exception;
}
