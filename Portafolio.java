import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {   
        Scanner Entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("");
            System.out.println("Bienvenidos a mi escalante java [escalante Versión 2.0 ] ");
            System.out.println("");

            System.out.println(" _____               _             _       ");
            System.out.println("| ____|___  ___ __ _| | __ _ _ __ | |_ ___ ");
            System.out.println("|  _| / __|/ __/ _` | |/ _` | '_ \\| __/ _ \\");
            System.out.println("| |___\\__ \\ (_| (_| | | (_| | | | | ||  __/");
            System.out.println("|_____|___/\\___\\__,_|_|\\__,_|_| |_|\\__\\___|");
            System.out.println("");

            System.out.println("[?] Selecciona una opción para poder iniciar");
            System.out.println("Proyecto Iniciado -->> Mar 18 8:45 am 2025");
            System.out.println("");

            //MENU
            System.out.println("[1] La suma de 2 numeros");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[0] Salir");
            System.out.print("[?]: ");
            opcion = Entrada.nextInt();

            //MENU
            switch (opcion) {
                case 1:
                    System.out.print("Pon un numero: ");
                    int numero1 = Entrada.nextInt();

                    System.out.print("Pon un numero: ");
                    int numero2 = Entrada.nextInt();

                    int Resultado = numero1 + numero2;

                    System.out.println();
                    System.out.println("El resultado de la suma es de: " + Resultado);
                    System.out.println();
                    break;
            
                default:
                    break;
            }

        }while(opcion !=0);
    }
}