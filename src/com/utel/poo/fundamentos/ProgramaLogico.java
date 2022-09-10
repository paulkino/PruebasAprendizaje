package com.utel.poo.fundamentos;

public class ProgramaLogico {

    public static void main(String[] args) {
        var calc = new Calculadora();
        boolean resultado = calc.esVerdadero() && calc.esFalso();
        System.out.println("Resultado: " + resultado);
    }

}
