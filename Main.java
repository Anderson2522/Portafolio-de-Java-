import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scannNumeros = new Scanner(System.in);
        int opcion;

        
        do {
            // Menú
            
                vistas.vista.banner();
                programas.opciones.opciones();
            

                System.out.println("[0] Salir:");
                System.out.println("[?]:");


                opcion = scannNumeros.nextInt();
            
        
                // Opciones
                switch (opcion) {
                case 1:
                System.out.println("----------");
                    programas.Sumar.Sumar();
                System.out.println("----------");
                    break;

                case 2:
                System.out.println("----------");
                programas.Resta.Resta();
                System.out.println("----------");

                 
                     
                    break;

                case 3:
                System.out.println("----------");
                programas.Multiplicacion.Multiplicacion();
                System.out.println("----------");

                    
                    break;

                case 4:
                System.out.println("----------");
                programas.Division.División();
                System.out.println("----------");
                 
                   
                    break;

                case 5:
                System.out.println("----------");
                programas.Modulo.Modulo();
                System.out.println("----------");
                 
                    break;

                case 6:
                
                System.out.println("----------");
                programas.Promedio.Promedio();
                System.out.println("----------");
                 
                 
            
                    break;

                case 7:
                System.out.println("----------");
                programas.NumMyMeDosNumeros.NumMyMeDosNumeros();
                System.out.println("----------");
                
                break;
                    
       

                 
                case 8:
                System.out.println("----------");
                programas.NumMyMenTresNumeros.NumMyMenTresNumeros();
                System.out.println("----------");
        
             
                break;

        
                case 9:
                System.out.println("----------");
                programas.ConversionKaG.ConversionKaG();
                System.out.println("----------");
                
                break;
                case 10:
                System.out.println("----------");
                programas.ConversionMac.ConversionMac();
                 System.out.println("----------");
                break;

                case 0:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Error de entrada");
                    break;
            }

            System.out.println(); 
        } while (opcion != 0);

     
    }
}