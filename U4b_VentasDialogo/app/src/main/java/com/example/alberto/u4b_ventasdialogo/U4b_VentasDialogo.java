package com.example.alberto.u4b_ventasdialogo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class U4b_VentasDialogo extends FragmentActivity {
    static TextView mostrar;
    Dialogo dialogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u4b__ventas_dialogo);
        mostrar=(TextView) findViewById(R.id.verContido);
        dialogo=new Dialogo();
        /*if (dialogo.bandeira == true) {
            for(int x=0;x<dialogo.resultado.size();x++){
                mostrar.append(dialogo.resultado.get(x)+"\n");
            }
        }*/
    }
    public void btnOnClick(View view){
        FragmentManager fmanager = getSupportFragmentManager();
        Bundle datos=new Bundle();
        if(view.getId()==R.id.btnChamar) datos.putInt("MENSAXE",1);
        dialogo.setArguments(datos);
        dialogo.show(fmanager, "Este texto non fai nada");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_u4b__ventas_dialogo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
