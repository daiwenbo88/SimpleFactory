package com.example.daiwenbo.designmode.factory.dao.product;

import android.net.IpPrefix;

import com.example.daiwenbo.designmode.factory.bean.Product;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class SqlServiceProductDao implements IProductDao {
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
