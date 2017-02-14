package com.example.daiwenbo.designmode.factory.dao.user;

import com.example.daiwenbo.designmode.factory.bean.User;

/**
 * Created by daiwenbo on 17/2/14.
 */

public interface IUserDao {
    void add(User user);
    void remove(User user);
    User getUser(String usrname);
}
