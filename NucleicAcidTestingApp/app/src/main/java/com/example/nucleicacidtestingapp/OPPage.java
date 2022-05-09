package com.example.nucleicacidtestingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class OPPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppage);
    }

    public void searchOP(View view){
        //获取日期
        DatePicker datepicker1 = findViewById(R.id.starttimepicker);
        int startyear = datepicker1.getYear();
        int startmonth = datepicker1.getMonth();
        int startday = datepicker1.getDayOfMonth();
        DatePicker datepicker2 = findViewById(R.id.endtimepicker);
        int endyear = datepicker2.getYear();
        int endmonth = datepicker2.getMonth();
        int endday = datepicker2.getDayOfMonth();
        //将日期传入新页面
        Intent intent = new Intent(this,OPResult.class);
        Bundle bundle = new Bundle();
        bundle.putInt("startyear",startyear);
        bundle.putInt("startday",startday);
        bundle.putInt("startmonth",startmonth);
        bundle.putInt("endyear",endyear);
        bundle.putInt("endmonth",endmonth);
        bundle.putInt("endday",endday);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}