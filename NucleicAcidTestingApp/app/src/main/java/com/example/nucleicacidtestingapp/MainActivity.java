package com.example.nucleicacidtestingapp;
import android.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testBook(View view) {
        if(UserInfo.getState()){
            //获得编号并展示
                String idnum = null;
                //先从服务器查看有没有已经申请的还没有使用的编号
                //有的话直接获取
                //没有的话生成新编号 提交服务器

                //展示编号
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this)
                    .setMessage("您的核酸编号是:"+idnum);
            alertDialog.show();

        }
        else{
            //页面跳转到登录界面
            startActivity(new Intent(this,LoginPage.class));
        }
    }
    public void resultSearchPage(View view){
        if(UserInfo.getState()){
            //页面跳转到结果
            startActivity(new Intent(this,UserResult.class));
        }
        else{
            //页面跳转到登录界面
            startActivity(new Intent(this,LoginPage.class));
        }
    }

    public void OPSearchPage(View view){
        if(UserInfo.getState()){
            //页面跳转到结果
            if(UserInfo.getIsOP()) {
                startActivity(new Intent(this, OPPage.class));
            }
            else
            {
                //提示没有权限
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this)
                        .setMessage("您没有权限使用管理员功能。");
                alertDialog.show();
            }
        }
        else{
            //页面跳转到登录界面
            startActivity(new Intent(this,LoginPage.class));
        }
    }
}