package programas;

import java.util.Scanner;

public class Division {
    
    public static void Division () {
        Scanner scannNumeros = new Scanner(System.in);
        
        System.out.print("[n1]: ")
        double n1 = scannNumeros.nextDouble();

        System.out.print("[n2]: ")
        double n2 = scannNumeros.nextDouble();

        System.out.println("[Re]: "+ (n1/n2));
    }
}