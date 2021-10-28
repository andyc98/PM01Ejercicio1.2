package com.example.pm01ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Agregar_Activity extends AppCompatActivity {

    public static final String ENVIAR_NOMBRES ="nombres";
    public static final String ENVIAR_APELLIDOS ="apellidos";
    public static final String ENVIAR_EDAD ="edad";
    public static final String ENVIAR_CORREO ="correo";



    EditText nombres, apellidos, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);


        Button send = (Button) findViewById(R.id.Btn_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send_information();
            }
        });
    }

    public void send_information (){
        Intent intent = new Intent(this, Mostrar_Activity.class);
        nombres = (EditText) findViewById(R.id.Txt_nombres);
        apellidos = (EditText) findViewById(R.id.Txt_apellidos);
        edad = (EditText) findViewById(R.id.Txt_edad);
        correo = (EditText) findViewById(R.id.Txt_correo);

        String get_nombres = nombres.getText().toString();
        String get_apellidos = apellidos.getText().toString();
        String get_edad = edad.getText().toString();
        String get_correo = correo.getText().toString();

        if(get_nombres.equals("")||get_apellidos.equals("")||
                get_edad.equals("")||get_correo.equals("")){
            Toast.makeText(getApplicationContext(),"Favor complete los campos necesarios", Toast.LENGTH_LONG).show();

        }else{

        intent.putExtra(ENVIAR_NOMBRES, get_nombres);
        intent.putExtra(ENVIAR_APELLIDOS, get_apellidos);
        intent.putExtra(ENVIAR_EDAD, get_edad);
        intent.putExtra(ENVIAR_CORREO, get_correo);
        startActivity(intent);
        }


    }
}