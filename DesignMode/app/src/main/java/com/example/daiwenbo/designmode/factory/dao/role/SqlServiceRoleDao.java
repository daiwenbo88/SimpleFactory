package com.example.daiwenbo.designmode.factory.dao.role;

import com.example.daiwenbo.designmode.factory.bean.Role;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class SqlServiceRoleDao implements IRoleDao {
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
