package programas;

public class Opciones {

    String lista [] = {
        "Suma de dos numeros",
        "Resta de dos numero",
        "Multiplicacion de dos numeros"
        "Division de dos numeros",
        "Modulo (Residuo de una division)",
        "Promedio de tres numeros",
        "Numero mayor y menor entre dos numeros",
        "Numero mayor y menor entre tres numeros",
        "Conversion de metros a centimetros",
        "Conversion de kilogramos a gramos",
    };

    // MOSTRAR OPCIONES

    public static void Opciones(){
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+ (i+1) +"]" + lista[i]);
        }
    }
}