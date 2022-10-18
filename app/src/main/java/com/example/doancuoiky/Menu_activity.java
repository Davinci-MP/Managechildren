package com.example.doancuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.Dialog.NewClassDialog;
import com.example.doancuoiky.activity.ListClassesActivity;
import com.example.doancuoiky.activity.ManageStudentsActivity;

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
//                Intent intent = new Intent(this, ListClassesActivity.class);
//                startActivity(intent);
//                Toast.makeText(this,"Xem Danh Sach",Toast.LENGTH_SHORT).show();


                break;
            case R.id.btReg:
                Intent mngintent = new Intent(this, ManageStudentsActivity.class);
                startActivity(mngintent);

//                NewClassDialog dialog = new NewClassDialog(this); Dialog thêm khu phố
//                dialog.show();
                break;
            case R.id.btAddUser:
                break;
            case R.id.btLogout:
                break;
        }
    }
}