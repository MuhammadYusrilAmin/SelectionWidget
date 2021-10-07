package com.example.selectionwidget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mengambil ListView dari activity_main.xml Berdasarkan Id ListView
        ListView list=findViewById(R.id.list_view);

        //Mengambil FloatingButton dari activity_main.xml Berdasarkan Id FloatingButton
        FloatingActionButton fab = findViewById(R.id.btn);
        // Membuat action jika di klik
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code untuk pindah halaman
                startActivity(new Intent(MainActivity.this,FormInput.class));
            }
        });

        //Mendifinisikan list adapter yang kita buat
        list_item adapter=new list_item(this,createPersons());
        //set adapter pada list view.
        list.setAdapter(adapter);
    }

   // untuk menambahkan Data list Pada ListView
    private List<alamat> createPersons(){
        List<alamat>data=new ArrayList<>();
        data.add(new alamat("Bondowoso","Bondowoso","Jawa Timur"));
        data.add(new alamat("Lumajang","Lumajang","Jawa Timur"));
        data.add(new alamat("Jember","Jember","Jawa Timur"));
        data.add(new alamat("Lumajang","Lumajang","Jawa Timur"));

        return data;
    }
}