package com.quidelsoft.celiamigos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enlazarEventos();
    }

    public void enlazarEventos(){
        ImageView img = (ImageView) findViewById(R.id.img_porzona);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Por ZONA", Toast.LENGTH_SHORT).show();
            }
        });

        img = (ImageView) findViewById(R.id.img_anadirproducto);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Añadir Producto", Toast.LENGTH_SHORT).show();
            }
        });

        img = (ImageView) findViewById(R.id.img_buscador);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Buscador", Toast.LENGTH_SHORT).show();
            }
        });

        img = (ImageView) findViewById(R.id.img_cercademi);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Cerca de Mi", Toast.LENGTH_SHORT).show();
            }
        });

        img = (ImageView) findViewById(R.id.img_ranking);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Ranking", Toast.LENGTH_SHORT).show();
            }
        });

        img = (ImageView) findViewById(R.id.img_aniadirresto);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Agregar Restaurante", Toast.LENGTH_SHORT).show();
            }
        });


        img = (ImageView) findViewById(R.id.img_escanear);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                Toast.makeText(getApplicationContext(),"realizaste click en Escanear Producto", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
