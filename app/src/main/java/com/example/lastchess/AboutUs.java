package com.example.btl_android;

import android.graphics.Typeface;
import android.os.Bundle;

import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;


public class AboutUs extends AppCompatActivity {
    private ListView listView;

    int[] images = { R.drawable.thang, R.drawable.hieu, R.drawable.duong, R.drawable.duy};

    String[] name = { "Đỗ Văn Thắng", "Nguyễn Trung Hiếu", "Nguyễn Hoàng Dương", "Nguyễn Đình Duy"};

    String[] masv = { "1951061012", "1951060023", "1951060652", "1951060659"};

    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        lView = (ListView) findViewById(R.id.androidList);

        lAdapter = new ListAdapter(getBaseContext(), name, masv, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getBaseContext(), name[i]+" "+masv[i], Toast.LENGTH_SHORT).show();

            }// ham sk khi bam vao tung dong
        });

    }

}
