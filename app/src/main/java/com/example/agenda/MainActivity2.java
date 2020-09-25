package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView nombre, telefono, email, descripcion,fecha;
    private Button confirm;
    public Datos datos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        datos = (Datos) getIntent().getExtras().getSerializable("datos");

        nombre = (TextView)findViewById(R.id.t2);
        telefono = (TextView)findViewById(R.id.t7);
        email = (TextView)findViewById(R.id.t9);
        descripcion = (TextView)findViewById(R.id.t11);
        fecha = (TextView)findViewById(R.id.t5);
        confirm = (Button)findViewById(R.id.button2);

        nombre.setText(datos.getNombre());
        telefono.setText(datos.getNumero());
        email.setText(datos.getCorreo());
        descripcion.setText(datos.getDescripcion());
        fecha.setText(datos.getFecha());

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("datos",datos);
                startActivity(intent);
            }
        });



    }
}