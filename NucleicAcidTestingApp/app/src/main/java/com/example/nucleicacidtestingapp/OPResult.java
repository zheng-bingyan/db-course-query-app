package com.example.nucleicacidtestingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OPResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opresult);

        //获得开始和截止日期的年月日
        Bundle bundle = this.getIntent().getExtras();
        int startyear = bundle.getInt("startyear");
        int startmonth = bundle.getInt("startmonth");
        int startday = bundle.getInt("startday");

        int endyear = bundle.getInt("endyear");
        int endmonth = bundle.getInt("endmonth");
        int endday = bundle.getInt("endday");

        //从服务器获取信息


        //展示数据

    }
}