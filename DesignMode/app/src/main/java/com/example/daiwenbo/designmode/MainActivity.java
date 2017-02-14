package com.example.daiwenbo.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daiwenbo.designmode.factory.MySqlDaoFactory;
import com.example.daiwenbo.designmode.factory.SqlServiceDaoFactory;
import com.example.daiwenbo.designmode.factory.bean.Role;
import com.example.daiwenbo.designmode.factory.bean.User;
import com.example.daiwenbo.designmode.factory.dao.role.IRoleDao;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;
import com.example.daiwenbo.designmode.simpefactory.BuleCar;
import com.example.daiwenbo.designmode.simpefactory.Car;
import com.example.daiwenbo.designmode.simpefactory.CarFactory;
import com.example.daiwenbo.designmode.simpefactory.CarFactory2;

public class MainActivity extends AppCompatActivity {

    private TextView tv_text;
    protected final static String RED="红色";
    protected final static String BACK="黑色";
    protected final static String BULE="蓝色";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = CarFactory.newCar(RED);
        tv_text =(TextView)findViewById(R.id.tv_text);
        tv_text.setText(car.drive());

        car= CarFactory2.newCar(BuleCar.class);
        tv_text.setText(car.drive());

        IUserDao userDao = new MySqlDaoFactory().createUserDao();
        User user = userDao.getUser("LiLei");
        tv_text.setText(user.getName());

        IRoleDao roleDao = new SqlServiceDaoFactory().createRoleDao();
        Role role = roleDao.getUser("抽象工厂方法");
        tv_text.setText(role.getName());
    }
}
