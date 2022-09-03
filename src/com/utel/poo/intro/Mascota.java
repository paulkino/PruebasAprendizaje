package com.utel.poo.intro;

public class Mascota {

    private String nombre;
    private int edad;
    private String tipo;

    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        if( edad > 0 ) {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        // Se desperdicia la memoria al concatenar, porque se generan aquí 17 cadenas en total
        // TODO: Mejorar código de concatenación
        return "Mascota{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", tipo='" + tipo + '\'' + '}';
    }
}
