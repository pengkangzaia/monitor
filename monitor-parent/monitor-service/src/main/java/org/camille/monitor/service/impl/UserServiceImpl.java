package org.camille.monitor.service.impl;

import org.camille.monitor.dao.UserDao;
import org.camille.monitor.dao.pojo.User;
import org.camille.monitor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 彭康
 * @create 2021-05-23 20:21
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String getPassword(String username) {
        User user = userDao.selectByUsername(username);
        return user.getUsername();
    }
}
