package com.example.pm01ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mostrar_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        //Capture of information
        Intent i = getIntent();
        String nombres = i.getStringExtra(Agregar_Activity.ENVIAR_NOMBRES);
        String apellidos = i.getStringExtra(Agregar_Activity.ENVIAR_APELLIDOS);
        String edad = i.getStringExtra(Agregar_Activity.ENVIAR_EDAD);
        String correo = i.getStringExtra(Agregar_Activity.ENVIAR_CORREO);

        Button back = (Button) findViewById(R.id.btn_regresar);

        //View information
        TextView Lbl_nombres = (TextView) findViewById(R.id.Lbl_nombres);
        Lbl_nombres.setText(nombres);
        TextView Lbl_apellidos = (TextView) findViewById(R.id.Lbl_apellidos);
        Lbl_apellidos.setText(apellidos);
        TextView Lbl_edad = (TextView) findViewById(R.id.Lbl_edad);
        Lbl_edad.setText(edad);
        TextView Lbl_correo = (TextView) findViewById(R.id.Lbl_correo);
        Lbl_correo.setText(correo);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplicationContext(), Agregar_Activity.class);
                startActivity(inte);
            }
        });

    }
}