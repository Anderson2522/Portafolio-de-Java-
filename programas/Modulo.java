package programas;

import java.util.Scanner;
public class Modulo {

    public static void Modulo() {
        Scanner scannNumeros = new Scanner(System.in);

        System.out.println("[n1]: ")
        double n1 = scannNumeros.nexDouble();

        System.out.println("[n2]: ")
        double n2 = scannNumeros.nexDouble();

        System.out.println("[Re]: " + (n1%n2));

    }
}