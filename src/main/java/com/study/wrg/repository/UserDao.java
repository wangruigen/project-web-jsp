package com.study.wrg.repository;

import com.study.wrg.entity.User;

import java.util.List;

public interface UserDao {

    List<User> selectUsers() throws Exception;
}
