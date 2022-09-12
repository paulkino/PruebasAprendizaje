package mx.utel.poo.fundamentos;

/**
 * Clase que agrupa las operaciones de matematicas basicas
 */
public class Operaciones {

    /**
     * Suma dos numeros
     * @param x primer numero
     * @param y segundo numero
     * @return suma de los numeros
     */

    public int sumar(int x, int y) {
        return x + y;
    }

    /**
     * Resta dos numeros
     * @param x primer numero
     * @param y segundo numero
     * @return resta de los numeros
     */
    public int restar(int x, int y) {
        return x - y;
    }

    /**
     * Multiplica dos numeros
     * @param x primer numero
     * @param y segundo numero
     * @return multiplica los numeros
     */
    public int multiplcar(int x, int y) {
        return x * y;
    }

    /**
     * Divide dos numeros
     * @param x primer numero
     * @param y segundo numero
     * @return divide dos numeros
     */
    public int dividir(int x, int y) {
        return x / y;
    }

    /**
     * Calcula el residuo de dividir dos numeros
     * @param x primer numero
     * @param y segundo numero
     * @return residuo de la division
     */
    public int residuo(int x, int y) {
        return x % y;
    }

    public boolean esVerdadero() {
        System.out.println("Ejecutando metodo esVerdadero");
        return true;
    }

    public boolean esFalso() {
        System.out.println("Ejecutando metodo esFalso");
        return true;
    }

}
