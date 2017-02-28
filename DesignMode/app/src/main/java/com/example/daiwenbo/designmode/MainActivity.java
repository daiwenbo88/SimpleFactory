package com.example.daiwenbo.designmode;

import android.app.Activity;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daiwenbo.designmode.build.Room;
import com.example.daiwenbo.designmode.build.WorkBuild;
import com.example.daiwenbo.designmode.factory.MySqlDaoFactory;
import com.example.daiwenbo.designmode.factory.SqlServiceDaoFactory;
import com.example.daiwenbo.designmode.factory.bean.Role;
import com.example.daiwenbo.designmode.factory.bean.User;
import com.example.daiwenbo.designmode.factory.dao.role.IRoleDao;
import com.example.daiwenbo.designmode.factory.dao.user.IUserDao;
import com.example.daiwenbo.designmode.observer.Architect;
import com.example.daiwenbo.designmode.observer.ITalent;
import com.example.daiwenbo.designmode.observer.JuniorEngineer;
import com.example.daiwenbo.designmode.simpefactory.BuleCar;
import com.example.daiwenbo.designmode.simpefactory.Car;
import com.example.daiwenbo.designmode.simpefactory.CarFactory;
import com.example.daiwenbo.designmode.simpefactory.CarFactory2;
import com.example.daiwenbo.designmode.subject.HeadHunter;
import com.example.daiwenbo.designmode.util.HandlerUtils;

public class MainActivity extends Activity {
    private final static int ONE=1;
    private TextView tv_text;
    protected final static String RED="红色";
    protected final static String BACK="黑色";
    protected final static String BULE="蓝色";
    private TextView tv_observice;
    private HandlerUtils.HandlerHolder handlerHolder
            =new HandlerUtils.HandlerHolder(new HandlerUtils.OnReceiveMessageListener() {
        @Override
        public void handlerMessage(Message msg) {
            if (msg.arg1==ONE){
                String message= (String) msg.obj;
                tv_text.setText(message);
            }
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = CarFactory.newCar(RED);
        tv_text =(TextView)findViewById(R.id.tv_text);
        tv_observice =(TextView)findViewById(R.id.tv_observice);
        tv_text.setText(car.drive());

        car= CarFactory2.newCar(BuleCar.class);
        tv_text.setText(car.drive());

        IUserDao userDao = new MySqlDaoFactory().createUserDao();
        User user = userDao.getUser("LiLei");
        tv_text.setText(user.getName());

        IRoleDao roleDao = new SqlServiceDaoFactory().createRoleDao();
        Role role = roleDao.getUser("抽象工厂方法");
        tv_text.setText(role.getName());

        //观察者模式
        final ITalent iTalent=new Architect();
        ITalent iTalent1=new JuniorEngineer();
        final HeadHunter headHunter=new HeadHunter();

        headHunter.addTalent(iTalent);
        headHunter.addTalent(iTalent1);

        headHunter.publishJob("洗碗");


        Room room = new WorkBuild().makeFllor("棕红色地板").makeWindow("蓝色窗户").getRoom();
        Message message=Message.obtain();
        message.obj="棕红色地板";
        message.arg1=ONE;
        handlerHolder.sendMessageDelayed(message,1000);
    }
}
