package com.example.minhaprimeiraoperacao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Ciclo de Vida Activity ", "onCreate ");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de Vida Activity ", "onStart ");
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de Vida Activity ", "onResume ");
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de Vida Activity ", "onPause ");
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }
}