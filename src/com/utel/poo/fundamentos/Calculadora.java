package com.utel.poo.fundamentos;

public class Calculadora {

    /**
     * Este método realiza la suma de dos valores enteros
     * @param x El primer número entero a sumar
     * @param y El segundo número entero a sumar
     * @return El resultado de la suma
     */
    public int suma(int x, int y) {
        return x+y;
    }

    /**
     * Este método realiza la resta de dos valores enteros
     * @param x El primer número entero a restar
     * @param y El segundo número entero a restar
     * @return El resultado de la resta
     */
    public int resta(int x, int y) {
        return x-y;
    }

    /**
     * Este método realiza la multiplicación de dos valores enteros
     * @param x El primer número entero a multiplpicar
     * @param y El segundo número entero a mutliplicar
     * @return El resultado de la mutliplicación
     */
    public int multiplica(int x, int y) {
        return x*y;
    }

    /**
     * Este método realiza la división de dos valores enteros
     * @param x El primer número entero a dividir
     * @param y El segundo número entero a dividir
     * @return El resultado de la división
     */
    public int divide(int x, int y) {
        return x/y;
    }

    /**
     * Este método siempre regresa <code>true</code>
     * @return true
     */
    public boolean esVerdadero() {
        System.out.println("Este método regresa verdadero");
        return true;
    }

    /**
     * Este método siempre regresa <code>false</code>
     * @return false
     */
    public boolean esFalso() {
        System.out.println("Este método regresa falso");
        return false;
    }

}
