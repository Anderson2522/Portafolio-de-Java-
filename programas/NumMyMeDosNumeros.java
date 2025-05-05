package programas;

import java.util.Scanner;

public class NumMyMeDosNumeros() {
    Scanner scannNumeros = new Scanner(System.in);

    System.out.print("Pon el primer numero: ");
    Double Numero1 = scannNumeros.nexDouble();
    System.out.print("Pon el segundo numero: ");
    Double Numero2 = scannNumeros.nexDouble();

    if(Numero1 > Numero2) {
        System.out.println(Numero1 + "Estes es el numero mayor");
        System.out.println(Numero2 + "Este es el numero menor");
    } else {
        if(Numero2 > Numero1) {
        System.out.println(Numero2 + "Estes es el numero mayor");
        System.out.println(Numero1 + "Este es el numero menor");
    } else {
        System.out.println("Ambos numeros son iguales.");
    }

    }

}
