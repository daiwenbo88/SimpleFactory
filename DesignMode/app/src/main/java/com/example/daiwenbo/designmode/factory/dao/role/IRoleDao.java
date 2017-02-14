package com.example.daiwenbo.designmode.factory.dao.role;

import com.example.daiwenbo.designmode.factory.bean.Role;
import com.example.daiwenbo.designmode.factory.bean.User;

/**
 * Created by daiwenbo on 17/2/14.
 */

public interface IRoleDao {
    void add(Role role);
    void remove(Role role);
    Role getUser(String  role);
}
