package com.example.daiwenbo.designmode.factory.dao.product;

import com.example.daiwenbo.designmode.factory.bean.Product;
import com.example.daiwenbo.designmode.factory.bean.User;

/**
 * Created by daiwenbo on 17/2/14.
 */

public interface IProductDao {
    void add(Product product);
    void remove(Product product);
    Product getUser(String usrname);
}
