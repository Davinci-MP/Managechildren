package com.example.doancuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.Dialog.NewClassDialog;
import com.example.doancuoiky.activity.ListClassesActivity;
import com.example.doancuoiky.activity.ManageStudentsActivity;

public class Menu_activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
        findViewById(R.id.btnListClasses).setOnClickListener(this);
        findViewById(R.id.btnNewClass).setOnClickListener(this);
        findViewById(R.id.btnManageStudents).setOnClickListener(this);
        findViewById(R.id.btLogout).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnNewClass:


                NewClassDialog dialog = new NewClassDialog(this);
                dialog.show();

                break;
            case R.id.btnListClasses:
                Intent intent = new Intent(this, ListClassesActivity.class);
                startActivity(intent);

//                Toast.makeText(this,"Xem Danh Sach",Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnManageStudents:
                Intent mngintent = new Intent(this, ManageStudentsActivity.class);
                startActivity(mngintent);
                break;
            case R.id.btLogout:
                break;
        }
    }
}