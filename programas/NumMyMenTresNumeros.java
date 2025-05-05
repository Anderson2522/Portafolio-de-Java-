package programas;

    import java.util.Scanner;

    public class NumMyMenTresNumeros{

    public static void NumMyMenTresNumeros() {
    Scanner scannNumeros = new Scanner(System.in);

    System.out.print("Pon el primer número: ");
    double Numero1 = scannNumeros.nextDouble();

    System.out.print("Pon el segundo número: ");
    double Numero2 = scannNumeros.nextDouble();

    System.out.print("Pon el tercer número: ");
    double Numero3 = scannNumeros.nextDouble();

    double mayor = Numero1;
    double menor = Numero1;

    if (Numero2 > mayor) {
    mayor = Numero2;
    }
    if (Numero3 > mayor) {
    mayor = Numero3;
    }

    if (Numero2 < menor) {
    menor = Numero2;
    }
    if (Numero3 < menor) {
    menor = Numero3;
    System.out.println("Este es el número mayor es: " + mayor);
    System.out.println("Este es el número menor es: " + menor);
    }

    }


}