package com.example.rapidoatienda;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @name rapidoATienda
 * @author Javier Tienda González
 * @date 08/11/2022
 * @version v1.0
 * Clase adaptador del ListView coches
 */
public class AdaptadorCoches extends ArrayAdapter {

    //Campos de clase
    private Activity context;
    private ArrayList<Coches> coches;

    /**
     * Constructor de clase parametrizado
     * @param context
     * @param coches
     */
    public AdaptadorCoches(Activity context, ArrayList<Coches> coches) {
        super(context, R.layout.activity_adaptor_coches, coches);
        this.context = context;
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
        View item = inflater.inflate(R.layout.activity_adaptor_coches, null);

        //Introduce los textos en los elementos del listView
        TextView tvCoche = item.findViewById(R.id.tvLabel1);
        tvCoche.setText(coches.get(position).getMarca());

        return item;
    }

}
