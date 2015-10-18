package com.example.alberto.u4b_ventasdialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by alberto on 17/10/15.
 */
public class Dialogo extends android.support.v4.app.DialogFragment {
    TextView mostrarTexto=U4b_VentasDialogo.mostrar;
    AlertDialog.Builder venta;
    public ArrayList<String> resultado;
    String[] array = {"Madrid","West Ham","Man United","Man City","Juventus","Compostela","Bodegon Arzua"};
    boolean[] boleanos= new boolean[]{false, true, false, false, false, false, true};
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int numero = getArguments().getInt("MENSAXE");
        if(numero==1){
            resultado= new ArrayList<>();
            mostrarTexto.setText("");
            venta = new AlertDialog.Builder(getActivity());
            venta.setIcon(android.R.drawable.ic_dialog_info);
            venta.setTitle("Que equipos prefires:");
            venta.setMultiChoiceItems(array, boleanos, new DialogInterface.OnMultiChoiceClickListener() {
                public void onClick(DialogInterface dialog, int opcion, boolean isChecked) {
                    // Fago todo no boton de aceptar
                }
            });
            venta.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int boton) {
                    resultado= new ArrayList<>();
                    for (int x = 0; x < array.length; x++) {
                        if (boleanos[x] == true) {
                            resultado.add(array[x]);
                        }
                    }
                    for(int i=0;i<resultado.size();i++) mostrarTexto.append(resultado.get(i) + "\n");
                }
            });
            venta.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int boton) {

                }
            });
            return venta.create();
        }
        return null;
    }
}
