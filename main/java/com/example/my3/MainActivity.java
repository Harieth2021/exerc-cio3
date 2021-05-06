package com.example.my3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    TextView resultado;
    Button  btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.txt1);
        text2=findViewById(R.id.txt2);
        resultado=findViewById(R.id.txt_resultado);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String nome= text1.getText().toString();
             String nome2= text2.getText().toString();

             if (nome.isEmpty() || nome2.isEmpty()){
                 Toast.makeText(MainActivity.this, " Nome não inserido", Toast.LENGTH_LONG).show();
             } else {
                 Toast.makeText(MainActivity.this, "Olá" + nome+"" +nome2, Toast.LENGTH_LONG).show();
             }
            }
        });
    }
}