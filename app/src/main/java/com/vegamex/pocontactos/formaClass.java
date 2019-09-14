package com.vegamex.pocontactos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class formaClass extends AppCompatActivity {

    EditText _txtUser, _txtEmail, _txtTwitter, _txtCellphone, _txtBirthday;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forma);

        _txtUser = (EditText) findViewById(R.id.txtUser);
        _txtEmail = (EditText) findViewById(R.id.txtEmail);
        _txtTwitter = (EditText) findViewById(R.id.txtTwitter);
        _txtCellphone = (EditText) findViewById(R.id.txtCellphone);
        _txtBirthday = (EditText) findViewById(R.id.txtBirthdate);

        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Contact contactObject = new Contact(_txtUser.getText().toString(),
                        _txtEmail.getText().toString(), _txtTwitter.getText().toString(),
                        _txtCellphone.getText().toString(), _txtBirthday.getText().toString());

                Intent i = new Intent(formaClass.this, MainActivity.class);
                Bundle b = new Bundle();
                b.putSerializable("contact", contactObject);
                i.putExtras(b);
                setResult(-1, i);
                finish();

            }
        });
    }

}
