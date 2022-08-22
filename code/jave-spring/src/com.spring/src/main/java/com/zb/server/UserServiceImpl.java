package com.zb.service;

import com.zb.pojo.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void UserService() {
        userDao.getUserDao();
    }
}
