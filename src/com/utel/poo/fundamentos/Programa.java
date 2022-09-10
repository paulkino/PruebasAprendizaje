package com.utel.poo.fundamentos;

import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Programa prog = new Programa();
        int opcion = prog.imprimeMenu();
        int resultado = prog.realizaOperacion(opcion);
        System.out.printf("El resultado de la operación fue %d \n", resultado);
    }

    private int realizaOperacion(int opcion) {
        Calculadora calc = new Calculadora();
        int x = pedirEntero("Escribe el valor de x: ");
        int y = pedirEntero("Escribe el valor de y: ");
        return switch(opcion) {
            case 1 -> calc.suma(x,y);
            case 2 -> calc.resta(x,y);
            case 3 -> calc.multiplica(x,y);
            case 4 -> calc.divide(x,y);
            default -> 0;
        };
    }

    private int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        return scn.nextInt();
    }

    private int imprimeMenu() {
        System.out.println("PROGRAMA CALCULADORA");
        System.out.println("1. Suma \n2. Resta \n3. Multiplica \n4. Divide");
        System.out.print("Selecciona una opción: ");
        return scn.nextInt();
    }



}
