package com.example.rapidoatienda;

/**
 * @author Javier Tienda González
 * @date 08/11/2022
 * @version v1.0
 * Clase coches
 */
public class Coches {

    //Campos de clase
    private String marca;
    private String color;

    /**
     * Constructor de clase parametrizado
     * @param marca
     * @param color
     */
    public Coches(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    /**
     * getters y setters de clase
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
