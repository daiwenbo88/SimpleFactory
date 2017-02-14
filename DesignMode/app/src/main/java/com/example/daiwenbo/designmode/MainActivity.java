package com.example.daiwenbo.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daiwenbo.designmode.factory.Car;
import com.example.daiwenbo.designmode.factory.CarFactory;

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
    }
}
