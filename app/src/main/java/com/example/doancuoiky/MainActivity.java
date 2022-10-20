package com.example.doancuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btLogin).setOnClickListener(this);
        findViewById(R.id.btSignup).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btLogin:
//                Intent intent = new Intent(this, ListClassesActivity.class);
//                startActivity(intent);
                Intent start = new Intent(this, Menu_activity.class);
                startActivity(start);
               // Toast.makeText(this,"Xem Danh Sach",Toast.LENGTH_SHORT).show();

                break;

        }
    }

    }
