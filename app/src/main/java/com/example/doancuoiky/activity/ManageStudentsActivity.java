package com.example.doancuoiky.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.R;
import com.example.doancuoiky.adapter.ClassesAdapter;
import com.example.doancuoiky.model.Classes;
import com.example.doancuoiky.sqlite.ClassesDAO;

import java.util.List;

public class ManageStudentsActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etStudentId, etName, etDob;
    private Spinner spClasses;
    private List<Classes> classesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_students);
        etStudentId = findViewById(R.id.etStudentsID);
        etName = findViewById(R.id.etName);
        etDob = findViewById(R.id.etDob);
        spClasses = findViewById(R.id.spClasses);

        fillClassesToSpiner();

        findViewById(R.id.btSave).setOnClickListener(this);
    }
    private void fillClassesToSpiner(){
        ClassesDAO dao = new ClassesDAO(this);
        classesList = dao.getAll();
        ClassesAdapter classesAdapter = new ClassesAdapter(this,classesList);
        spClasses.setAdapter(classesAdapter);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btSave:
                break;
        }
    }
}