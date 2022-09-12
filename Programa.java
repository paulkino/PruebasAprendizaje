package mx.utel.poo.fundamentos;

import java.util.Scanner;
public class Programa {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useDelimiter("\n");
        Programa prog = new Programa();
        int opcion = prog.mostrarMenu(scn);
        if (opcion != 0) prog.realizarOperacion(opcion, scn);
    }
    private void realizarOperacion(int opcion, Scanner scn) {
        int num1 = leerEntero("Ingrese el primer numero: ", scn);
        int num2 = leerEntero("Ingrese el segundo numero: ", scn);
        Operaciones oper = new Operaciones();
        switch (opcion) {
            case 1:
                System.out.println("Suma: " + oper.sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resta: " + oper.restar(num1, num2));
                break;
            case 3:
                System.out.println("Multiplica: " + oper.multiplcar(num1, num2));
                break;
            case 4:
                System.out.println("Divide: " + oper.dividir(num1, num2));
                break;
            case 5:
                System.out.println("Residuo: " + oper.residuo(num1, num2));
                break;
        }
    }
    private int leerEntero(String mensaje, Scanner scn) {
        System.out.print(mensaje);
        return scn.nextInt();
    }
    private int mostrarMenu(Scanner scn) {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Residuo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
        return scn.nextInt();
    }
}
