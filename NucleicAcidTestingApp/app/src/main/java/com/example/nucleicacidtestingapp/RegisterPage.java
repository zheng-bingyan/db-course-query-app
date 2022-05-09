package com.example.nucleicacidtestingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
    }
    public void register(View view){
        //从edittext获取输入的信息
        EditText editText1 = findViewById(R.id.editTextTextPassword);
        EditText editText2 = findViewById(R.id.editTextTextPassword2);
        EditText editText3 = findViewById(R.id.editTextTextPassword3);
        EditText editText4 = findViewById(R.id.editTextTextPassword4);
        String name = editText1.getText().toString();
        String id = editText2.getText().toString();
        String password = editText3.getText().toString();
        String phone = editText4.getText().toString();
        //将数据上传到服务器

        //提示重新登录
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this)
                .setMessage("注册信息已提交，请重新登录");
        alertDialog.show();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                RegisterPage.this.finish();
            }
        },2000);
    }
}