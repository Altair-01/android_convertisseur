package com.example.projet1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textview2;
    //String degre = "°c";
    //String fahreinheit = "°f";

    //double currentInput= 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        textview2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int celsius = Integer.parseInt(s);
                double fahreinheit = (celsius*1.8) + 32;
                textview2.setText("La valeur de "+celsius+" °C en fahreinheit est de: "+fahreinheit+" °F");
                Toast.makeText(MainActivity.this, "La valeur de "+celsius+" °C en fahreinheit est de: "+fahreinheit+" °F", Toast.LENGTH_SHORT).show();
            }
        });
    }
}