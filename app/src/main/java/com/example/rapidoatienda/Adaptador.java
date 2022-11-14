package com.example.rapidoatienda;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @name rapidoATienda
 * @author Javier Tienda González
 * @date 08/11/2022
 * @version v1.0
 * Clase adaptador del primer ListView
 */
public class Adaptador extends ArrayAdapter {

    //Campos de clase
    private Activity context;
    private Personal[] trabajadores;
    private Coches[] coches;
    private ArrayList<Coches> cochesSueldoAlto = new ArrayList<>();
    private ArrayList<Coches> restoDeCoches = new ArrayList<>();

    /**
     * Constructor de clase parametrizado
     * @param context
     * @param trabajadores
     * @param coches
     */
    public Adaptador(Activity context, Personal[] trabajadores, Coches[] coches) {
        super(context, R.layout.activity_adaptor,trabajadores);
        this.context = context;
        this.trabajadores = trabajadores;
        this.coches = coches;
    }

    /**
     * Metodo para rellenar la informacion de cada apartado del ListView
     * @param position
     * @param convertView
     * @param parent
     * @return item
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.activity_adaptor, null);

        //Introduce los textos en los elementos del listView
        TextView tvNombre = item.findViewById(R.id.tvLabel1);
        tvNombre.setText(trabajadores[position].getNombre());

        TextView tvCargo = item.findViewById(R.id.tvLabel2);
        tvCargo.setText(trabajadores[position].getCargo());

        //Condicional para agregar al array segun el tipo de coche
        if(cochesSueldoAlto.isEmpty()) {
            for (int i = 0; i < coches.length; i++) {
                if (coches[i].getColor().equals("Negro") || coches[i].getColor().equals("Blanco")) {
                    cochesSueldoAlto.add(coches[i]);
                } else {
                    restoDeCoches.add(coches[i]);
                }
            }
        }

        //Condicional para agregar al listview los distintos coches que puede tener un trabajador
        if(trabajadores[position].getSueldo() > 2000){
            ingresarAlAdaptador(item, cochesSueldoAlto);
        }
        else if(!trabajadores[position].getCargo().equals("Informático")){
            ingresarAlAdaptador(item, restoDeCoches);
        }
        else{
            ingresarAlAdaptador(item, new ArrayList<>(Arrays.asList(coches)));
        }
        return(item);
    }

    /**
     * Metodo para settear el adaptador al listview
     * @param item
     * @param coches
     */
    private void ingresarAlAdaptador(View item, ArrayList<Coches> coches) {
        AdaptadorCoches adaptadorCoches = new AdaptadorCoches(context, coches);
        ListView listCoches = item.findViewById(R.id.lV2);
        listCoches.setAdapter(adaptadorCoches);
    }
}
