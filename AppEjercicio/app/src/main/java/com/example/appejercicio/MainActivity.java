package com.example.appejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appejercicio.Utilidades.Utilidades;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, Utilidades.DATABASE_NAME,null,Utilidades.VERSION);
    }
}