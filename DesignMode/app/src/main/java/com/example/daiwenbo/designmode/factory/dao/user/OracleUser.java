package com.example.daiwenbo.designmode.factory.dao.user;

import com.example.daiwenbo.designmode.factory.bean.User;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class OracleUser implements IUserDao {
    @Override
    public void add(User user) {

    }

    @Override
    public void remove(User user) {

    }

    @Override
    public User getUser(String usrname) {
        User user=new User();
        user.setName(usrname);
        return user;
    }
}
