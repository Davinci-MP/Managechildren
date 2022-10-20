package com.example.doancuoiky.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.doancuoiky.R;
import com.example.doancuoiky.model.Classes;
import com.example.doancuoiky.sqlite.ClassesDAO;

public class NewClassDialog extends Dialog implements View.OnClickListener{
    private Context context;
    private EditText etKP,etTO;
    public NewClassDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_new_class);

        etKP = findViewById(R.id.etKP);
        etTO = findViewById(R.id.etTO);


        findViewById(R.id.btSave).setOnClickListener(this);
        findViewById(R.id.btClose).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btSave:
                Classes cls = new Classes();
                //cls.setName(etNa.getText().toString());
                ClassesDAO dao = new ClassesDAO(context);
                dao.insert(cls);
                Toast.makeText(context,"Khu Phố Đã Được Lưu",Toast.LENGTH_SHORT).show();
            break;

            case R.id.btClose:
                dismiss();
                break;
        }

    }
}
