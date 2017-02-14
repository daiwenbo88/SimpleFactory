package com.example.daiwenbo.designmode.factory.dao.product;

import com.example.daiwenbo.designmode.factory.bean.Product;
import com.example.daiwenbo.designmode.factory.bean.Role;
import com.example.daiwenbo.designmode.factory.dao.role.IRoleDao;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class MySqlProductDao implements IProductDao {

    @Override
    public void add(Product product) {

    }

    @Override
    public void remove(Product product) {

    }

    @Override
    public Product getUser(String usrname) {
        Product product=new Product();
        product.setName(usrname);
        return product;
    }
}
