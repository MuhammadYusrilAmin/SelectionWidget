package com.example.selectionwidget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class FormInput extends AppCompatActivity {
    // Mendefinisikan "Tambah,Cancel" sebagai Button
    private Button Tambah,Cancel;
    // Membuat Array String
    private static final String[] KOTA = new String[]{
            "Bangkalan","Banyuwangi","Bojonegoro","Bondowoso","Jombang","Jember","Lamongan","Lumajang","Nganjuk","Ngawi"
    };
    // Mendefinisikan "spinner" sebagai Spinner
    Spinner spinner;
    // Mendefinisikan "AutoComplete" sebagai AutoCompleteTextView
    AutoCompleteTextView AutoComplete;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_input);

        //Mengambil Button dari form_input.xml Berdasarkan Id Button
        Tambah = (Button) findViewById(R.id.tambah);
        //Mengambil Button dari form_input.xml Berdasarkan Id Button
        Cancel = (Button) findViewById(R.id.cancel);
        //Mengambil Spinner dari form_input.xml Berdasarkan Id Button
        spinner =findViewById(R.id.provinsi);
        //Mengambil AutoCompleteTextView dari form_input.xml Berdasarkan Id AutoCompleteTextView
        AutoComplete = findViewById(R.id.kota);

        // Mengatur konten yang akan ditmpilkan pada View Berdasarkan Array Yang kita buat
        ArrayAdapter<String> Daftar = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KOTA);
        //set adapter pada AutoCompleteTextView
        AutoComplete.setAdapter(Daftar);

        // Mengatur konten yang akan ditmpilkan pada View Berdasarkan Array yang ditambahkan di strings.xml di folder values
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.provinsi, android.R.layout.simple_spinner_item);
        // Menampilkan konten dengan DropDown
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //set adapter pada Spinner
        spinner.setAdapter(adapter);

        // Membuat action jika di klik
        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code untuk pindah halaman
                startActivity(new Intent(FormInput.this,MainActivity.class));
            }
        });

        // Membuat action jika di klik
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code untuk pindah halaman
                startActivity(new Intent(FormInput.this,MainActivity.class));
            }
        });
    }
}
