package com.example.rapidoatienda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

/**
 * @name rapidoATienda
 * @author Javier Tienda González
 * @date 08/11/2022
 * @version v1.0
 * Aplicacion para la implementacion de listviews
 */
public class MainActivity extends AppCompatActivity {

    //Campos de clase
    private Personal[] trabajadores;
    private Coches[] coches;

    /**
     * Inicio de la ejecucion del programa
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializacion arrays de clase
        trabajadores = new Personal[]{new Personal("Angel", "Director", 3000),
                new Personal("María", "Oficial", 1500),
                new Personal("Juan", "Médico", 2700),
                new Personal("Guadalupe", "Informático", 1700)};

        coches = new Coches[]{new Coches("Audi", "Negro"),
                new Coches("BMW", "Blanco"),
                new Coches("Toyota", "Rojo"),
                new Coches("Honda", "Verde"),
                new Coches("Citroën", "Amarillo")};

        Adaptador adaptador = new Adaptador(this, trabajadores, coches);
        ListView listTrabajadores = findViewById(R.id.lV1);
        listTrabajadores.setAdapter(adaptador);
    }
}