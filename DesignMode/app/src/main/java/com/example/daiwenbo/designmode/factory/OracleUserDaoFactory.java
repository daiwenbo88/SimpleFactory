package com.example.daiwenbo.designmode.factory;

import com.example.daiwenbo.designmode.factory.dao.product.IProductDao;
import com.example.daiwenbo.designmode.factory.dao.product.MySqlProductDao;
import com.example.daiwenbo.designmode.factory.dao.role.IRoleDao;
import com.example.daiwenbo.designmode.factory.dao.role.MySqlRoleDao;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;
import com.example.daiwenbo.designmode.factory.dao.user.MySqlUserDao;
import com.example.daiwenbo.designmode.factory.dao.user.OracleUser;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class OracleUserDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new MySqlUserDao();
    }

    @Override
    public IRoleDao createRoleDao() {
        return new MySqlRoleDao();
    }

    @Override
    public IProductDao createProductDao() {
        return new MySqlProductDao();
    }
}
