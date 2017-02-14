package com.example.daiwenbo.designmode.factory;

import com.example.daiwenbo.designmode.factory.bean.Product;
import com.example.daiwenbo.designmode.factory.dao.product.IProductDao;
import com.example.daiwenbo.designmode.factory.dao.role.IRoleDao;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;

/**
 * Created by daiwenbo on 17/2/14.
 */

public interface IDaoFactory {
    IUserDao createUserDao();
    IRoleDao createRoleDao();
    IProductDao createProductDao();
}
