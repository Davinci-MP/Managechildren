package com.example.doancuoiky;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.Dialog.NewClassDialog;

public class Menu_activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
        findViewById(R.id.btView).setOnClickListener(this);
        findViewById(R.id.btReg).setOnClickListener(this);
        findViewById(R.id.btAddUser).setOnClickListener(this);
        findViewById(R.id.btLogout).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btView:
//                Toast.makeText(this,"Xem Danh Sach",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btReg:
                NewClassDialog dialog = new NewClassDialog(this);
                dialog.show();
                break;
            case R.id.btAddUser:
                break;
            case R.id.btLogout:
                break;
        }
    }
}