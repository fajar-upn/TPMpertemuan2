package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PindahData extends AppCompatActivity {


    public static String EXTRA_DATA = "extra_data";
    private TextView tvNama;
    private Button btnPerkalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_data);

        tvNama = findViewById(R.id.tv_nama);
        btnPerkalian = findViewById(R.id.btn_perkalian);

        final String hasil = getIntent().getStringExtra(EXTRA_DATA);
        String nama = "Hi!"+hasil;
        tvNama.setText(nama);

        btnPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PindahData.this, Perkalian.class);
                startActivity(intent);
            }
        });
    }


}
