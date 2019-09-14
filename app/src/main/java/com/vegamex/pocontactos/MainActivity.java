package com.vegamex.pocontactos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> model;
    ListView contactList;
    Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new ArrayList<Contact>();
        model.add(new Contact("Óscar", "vegamex1@gmail.com", "@VegaMexSB", "4451151484", "17 de julio de 1998"));
        myAdapter = new Adapter(model, this);
        contactList = (ListView) findViewById(R.id.contactList);
        contactList.setAdapter(myAdapter);

        findViewById(R.id.btnNewContact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, formaClass.class);
                startActivityForResult(intent, 1000);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == MainActivity.RESULT_OK){
            Contact c = (Contact)data.getSerializableExtra("contact");
            model.add(c);
            Toast.makeText(this, "Se guardó a: " + c.getUser(), Toast.LENGTH_SHORT).show();
            refresh();
        }else{
            Toast.makeText(this, "No se guardó nada, F", Toast.LENGTH_SHORT).show();
        }
    }

    public void refresh(){
        myAdapter = new Adapter(model, this);
        contactList.setAdapter(myAdapter);
    }
}

