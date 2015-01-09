package com.evidencias.pina.unidades;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import gif.decoder.GifRun;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{


    ImageView boton1, boton2, boton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (ImageView) findViewById(R.id.imgunidad1);
        boton2 = (ImageView) findViewById(R.id.imgunidad2);
        boton3 = (ImageView) findViewById(R.id.imgunidad3);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);

    }

    @Override
    public void onClick(View arg0) {

        switch (arg0.getId()){
            case R.id.imgunidad1:

                Intent intent =new Intent("com.evidencias.pina.unidades.UNIDAD1");
                startActivity(intent);


                break;
        }

        switch (arg0.getId()){
            case R.id.imgunidad2:

                Intent intent2 =new Intent("com.evidencias.pina.unidades.UNIDAD2");
                startActivity(intent2);

                break;
        }

        switch (arg0.getId()){
            case R.id.imgunidad3:

                Intent intent3 =new Intent("com.evidencias.pina.unidades.UNIDAD3");
                startActivity(intent3);

                break;
        }

    }
}
