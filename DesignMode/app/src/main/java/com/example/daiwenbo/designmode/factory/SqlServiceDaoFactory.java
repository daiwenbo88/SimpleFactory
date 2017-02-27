package com.example.daiwenbo.designmode.factory;

import com.example.daiwenbo.designmode.factory.dao.product.IProductDao;
import com.example.daiwenbo.designmode.factory.dao.product.SqlServiceProductDao;
import com.example.daiwenbo.designmode.factory.dao.role.IRoleDao;
import com.example.daiwenbo.designmode.factory.dao.role.SqlServiceRoleDao;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;
import com.example.daiwenbo.designmode.factory.dao.user.SqlServiceUserDao;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class SqlServiceDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new SqlServiceUserDao();
    }

    @Override
    public IRoleDao createRoleDao() {
        return new SqlServiceRoleDao();
    }

    @Override
    public IProductDao createProductDao() {
        return new SqlServiceProductDao();
    }
}
