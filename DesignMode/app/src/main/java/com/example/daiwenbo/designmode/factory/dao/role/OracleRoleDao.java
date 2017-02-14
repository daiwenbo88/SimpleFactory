package com.example.daiwenbo.designmode.factory.dao.role;

import com.example.daiwenbo.designmode.factory.bean.Role;
import com.example.daiwenbo.designmode.factory.bean.User;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class OracleRoleDao implements IRoleDao {

    @Override
    public void add(Role role) {

    }

    @Override
    public void remove(Role role) {

    }

    @Override
    public Role getUser(String name) {
        Role role=new Role();
        role.setName(name);
        return role;
    }
}
