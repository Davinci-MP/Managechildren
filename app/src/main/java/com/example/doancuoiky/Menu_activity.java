package com.example.doancuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.Dialog.NewClassDialog;
import com.example.doancuoiky.activity.ManageStudentsActivity;

public class Menu_activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
        findViewById(R.id.btView).setOnClickListener(this);
        findViewById(R.id.btLogin).setOnClickListener(this);
        findViewById(R.id.btAddUser).setOnClickListener(this);
        findViewById(R.id.btExist).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btView:
//                Intent intent = new Intent(this, ListClassesActivity.class);
//                startActivity(intent);
                Intent mngintent = new Intent(this, ManageStudentsActivity.class);
                startActivity(mngintent);
                Toast.makeText(this,"Xem Danh Sach",Toast.LENGTH_SHORT).show();

                break;
            case R.id.btLogin:


                NewClassDialog dialog = new NewClassDialog(this);
                dialog.show();

                break;
            case R.id.btAddUser:
                break;
            case R.id.btExist:
                break;
        }
    }
}