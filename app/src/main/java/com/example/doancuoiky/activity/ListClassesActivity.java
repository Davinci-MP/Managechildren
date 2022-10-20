package com.example.doancuoiky.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancuoiky.R;
import com.example.doancuoiky.adapter.ClassesAdapter;
import com.example.doancuoiky.model.Classes;
import com.example.doancuoiky.sqlite.ClassesDAO;

import java.util.List;

public class ListClassesActivity extends AppCompatActivity {

    private ListView lvClasses;
    private List<Classes> list;
    private ClassesAdapter clsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_classes);

        lvClasses = findViewById(R.id.lvClasses);

        fillClassesListView();

        lvClasses.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                ClassesDAO dao = new ClassesDAO(ListClassesActivity.this);
                Classes cls = list.get(i);
                dao.delete("" + cls.getId());

                fillClassesListView();

                return false;
            }
        });
    }

    private void fillClassesListView() {

        ClassesDAO dao = new ClassesDAO(this);
        list = dao.getAll();

        clsAdapter = new ClassesAdapter(this,list);
        lvClasses.setAdapter(clsAdapter);
    }
}