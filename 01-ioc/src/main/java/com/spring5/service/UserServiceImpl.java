package com.spring5.service;

import com.spring5.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(UserDao userDao) {
        userDao.getUser();
    }
}
