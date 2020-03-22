package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User SelectBySnameAndPass(String sname, String pass) {
        return userDao.SelectBySnameAndPass(sname, pass);
    }
}

