package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Perkalian extends AppCompatActivity {


    private EditText etBilangan1, etBilangan2;
    private Button btnkali;
    private TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        etBilangan1 = findViewById(R.id.et_bilangan_1);
        etBilangan2 = findViewById(R.id.et_bilangan_2);
        btnkali = findViewById(R.id.btn_kalikan);
        tvHasil = findViewById(R.id.tv_hasil);

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sBilangan1 = etBilangan1.getText().toString().trim();
                    String sBilangan2 = etBilangan2.getText().toString().trim();

                    double bilangan1 = Double.parseDouble(sBilangan1);
                    double bilangan2 = Double.parseDouble(sBilangan2);

                    double hasil = bilangan1 * bilangan2;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                }catch (NumberFormatException e){
                    Toast.makeText(Perkalian.this,"Mohon isi Field yang kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
