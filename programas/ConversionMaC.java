package programas;

import java.util.Scanner;

public class ConversionMac{
    public static void ConversionMac(){
        Scanner scannNumeros,= new Scanner(System.in);

        System.out.print("Introduce la cantidad en metros: ")
                double metros=scannNumeros.nextDouble();
                System.out.println(metros + "Los metros son: " + (metros * 100) + "centimetros")
    }
}