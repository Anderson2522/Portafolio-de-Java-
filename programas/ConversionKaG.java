package programas;

import java.util.Scanner;

public class ConversionKaG{

    public static void ConversionKaG(){
        Scanner scannNumeros,= new Scanner(System.in);

        System.out.print("Introduce la cantidad en kilogramos: ")
                double kilogramos = scannNumeros.nextDouble();
                System.out.println(kilogramos + "Los kilogramos son: " + (kilogramos * 1000) + "gramos")
    }
}