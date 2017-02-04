package com.example.quidelsoft.serviciosandroidphp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnIngresar;
    EditText txtUsu, txtPas;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        txtUsu = (EditText) findViewById(R.id.txtusu);
        txtPas = (EditText) findViewById(R.id.txtpas);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(this);

    }




    public String enviarDatosGet(String usu, String pas) {
        URL url = null;
        String linea = "";
        String lineaJSON = "";
        int respuesta = 0;
        StringBuilder result = null;


        try {
            // Local
            // url = new URL("http://192.168.0.9/WebService/valida.php?usu=" + usu + "&pas=" + pas);

            // http://quidelsoft.com/ServiciosWeb/valida.php?usu=A1&pas=euli3755
            url = new URL("http://quidelsoft.com/ServiciosWeb/valida.php?usu=" + usu + "&pas=" + pas);


            HttpURLConnection conection = (HttpURLConnection) url.openConnection();
            respuesta = conection.getResponseCode();
            result = new StringBuilder();
            if (respuesta == HttpURLConnection.HTTP_OK) {
                InputStream in = new BufferedInputStream(conection.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                while ((linea = reader.readLine()) != null) {
                    if (linea.indexOf('{')==0){
                        break;
                    }
                    lineaJSON = linea.substring(linea.indexOf('{'), linea.indexOf('}')+1);
                    //lineaJSON = linea.substring(linea.indexOf('['), linea.indexOf(']')+1);
                    result.append(lineaJSON);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();

    }


    public int objDatosJSON(String response) {
        int res = 0;
        try {
            //JSONArray json = new JSONArray(response);
            JSONObject json = new JSONObject(response);
            if (json.length()>0)
                res = 1;
        } catch (Exception e) {
            e.toString();
        }
        return res;
    }

    @Override
    public void onClick(View v) {

        Thread tr= new Thread(){
            @Override
            public void run(){
                final String resultado = enviarDatosGet(txtUsu.getText().toString(), txtPas.getText().toString());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        int r=objDatosJSON(resultado);
                        if (r>0) {
                            Intent i= new Intent(getApplicationContext(), registroNotas.class);
                            startActivity(i);
                        } else {
                            Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        };
        tr.start();
    }
}
