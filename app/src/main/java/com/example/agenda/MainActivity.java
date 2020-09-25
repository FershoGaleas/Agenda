package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, fecha,celular,correo,descripcion;
    private Button siguiente;
    public Datos datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = (Datos) getIntent().getExtras().getSerializable("datos");

        nombre = (EditText)findViewById(R.id.nombre);
        fecha = (EditText)findViewById(R.id.fecha);
        celular = (EditText)findViewById(R.id.celular);
        correo = (EditText)findViewById(R.id.correo);
        descripcion = (EditText)findViewById(R.id.descripcion);
        siguiente = (Button)findViewById(R.id.boton);

        nombre.setText(datos.getNombre());
        fecha.setText(datos.getFecha());
        celular.setText(datos.getNumero());
        descripcion.setText(datos.getDescripcion());
        correo.setText(datos.getCorreo());




          datos = new Datos(nombre.getText().toString(),
                fecha.getText().toString(),
                celular.getText().toString(),
                correo.getText().toString(),
                descripcion.getText().toString());

    siguiente.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,MainActivity2.class);
             intent.putExtra("datos",datos);
             startActivity(intent);
        }
    });


    }
}