package com.example.nucleicacidtestingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void toRegister(View view) {
        startActivity(new Intent(this,RegisterPage.class));
    }

    public void login(View view){
        //获取输入的信息并设置到UserInfo
        EditText editText1 = findViewById(R.id.editTextTextPassword5);
        EditText editText2 = findViewById(R.id.editTextTextPassword6);
        UserInfo.setId(editText1.getText().toString());
        UserInfo.setPassword(editText2.getText().toString());

        //获取服务器密码
        String pwd = "123"; //服务器密码放到pwd里
        if(UserInfo.login(pwd)){
            //成功登录后  从服务器获取用户信息并放入userinfo里
            String phone = null;
            String name = null;
            UserInfo.setName(name);
            UserInfo.setPhone(phone);
            this.finish();
        }
        else{
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this)
                    .setMessage("没有找到用户信息或者密码错误");
            alertDialog.show();
        }
    }
}