package com.example.doancuoiky.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.R;
import com.example.doancuoiky.adapter.ClassesAdapter;
import com.example.doancuoiky.helper.DateTimeHelper;
import com.example.doancuoiky.model.Classes;
import com.example.doancuoiky.model.Student;
import com.example.doancuoiky.sqlite.ClassesDAO;
import com.example.doancuoiky.sqlite.StudentDAO;
import com.google.android.material.snackbar.Snackbar;

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

        fillClassesToSpinner();

        findViewById(R.id.btSave).setOnClickListener(this);
    }
    private void fillClassesToSpinner(){
        ClassesDAO dao = new ClassesDAO(this);
        classesList = dao.getAll();
        ClassesAdapter classesAdapter = new ClassesAdapter(this,classesList);
        spClasses.setAdapter(classesAdapter);
    }
    @Override
    public void onClick(View view) {
        StudentDAO dao = new StudentDAO(this);
        switch (view.getId()){
            case R.id.btSave:
                try{
                    Student std = new Student();
                    std.setId(etStudentId.getText().toString());
                    std.setName(etName.getText().toString());
                    std.setDob(DateTimeHelper.toDate(etDob.getText().toString()));

                    Classes cls = (Classes) spClasses.getSelectedItem();
                    std.setClassID(cls.getId());
                    String msg;
                    dao.insert(std);
                    msg = "Học sinh đã được lưu!";

                    Snackbar snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_SHORT);
                    snackbar.show();
                    etStudentId.setText("");
                    etName.setText("");
                    etDob.setText("");
                }catch (Exception ex){
                    ex.printStackTrace();
                    Toast.makeText(this,"Error: " + ex.getMessage(),Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}