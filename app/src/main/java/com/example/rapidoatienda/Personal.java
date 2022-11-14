package com.example.rapidoatienda;

/**
 * @author Javier Tienda González
 * @date 08/11/2022
 * @version v1.0
 * Clase personal
 */
public class Personal {

    //Campos de clase
    private String nombre;
    private String cargo;
    private int sueldo;

    /**
     * Constructor de clase parametrizado
     * @param nombre
     * @param cargo
     * @param sueldo
     */
    public Personal(String nombre, String cargo, int sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /**
     * getters y setters de clase
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
