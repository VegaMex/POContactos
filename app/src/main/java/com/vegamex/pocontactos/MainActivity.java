package com.vegamex.pocontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> model;
    ListView contactList;
    Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new ArrayList<Contact>();

        model.add(new Contact("Oscar", "vegamex@gmail.com", "@VegaMexSB", "4451151484", new Date(1998,7,17)));

        myAdapter = new Adapter(model, this);

        contactList = (ListView) findViewById(R.id.contactList);
        contactList.setAdapter(myAdapter);

        findViewById(R.id.btnNewContact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, formaClass.class);
                startActivity(intent);
                //Aplicacion app = (Aplicacion) getApplication();
                //app.getListaContactos();
            }
        });
    }
}
