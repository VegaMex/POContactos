package com.vegamex.pocontactos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class formaClass extends AppCompatActivity {

    EditText _txtUser, _txtEmail, _txtTwitter, _txtCellphone, _txtBirthday;
    Button _btnSave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forma);


    }

}
