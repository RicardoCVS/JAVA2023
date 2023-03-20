import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
    //---------------------------Ejercicio 2 ---------------------------
    /*int[] numeros = {1, 2, 3, 4, 5, 6,7,8,9,10,11,12};
    ArrayList<Integer> pares = new ArrayList<Integer>();
    ArrayList<Integer> impares = new ArrayList<Integer>();
    for (int i = 0; i < numeros.length; i++) {
        if(numeros[i] % 2 == 0){
            System.out.println(numeros[i]);
            pares.add(numeros[i]);
            if(numeros[i]%3 == 0){
                System.out.println(numeros[i]);
                impares.add(numeros[i]);
            }
        }if(numeros[i]%3 == 0 && numeros[i]%2!= 0){
            System.out.println(numeros[i]);
            impares.add(numeros[i]);
        }
        }
    System.out.println("Los numeros divisibles entre 2 son:"+ pares);
    System.out.println("Los numeros divisibles entre 3 son:"+ impares);
    //  -------------------------Ejercicio 3---------------------------
        System.out.println("¡Hola!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de saludos adicionales: ");
        int numSaludos = scanner.nextInt();

        // Bucle for que envía el número de saludos indicados
        for (int i = 0; i < numSaludos; i++) {
            System.out.println("¡Hola de nuevo!");
        }

        scanner.close();*/
        //  -------------------------Ejercicio 4---------------------------

        char letra;
        int n = 25; // número de letras en el abecedario


        for (int i = 0; i <n ; i++) {
            for (letra = (char) ('Z' - i); letra >= 'A'; letra--) {
                System.out.print(letra);
            }
            System.out.println();
        }
        for (int i = n; i >=0 ; i--) {
            for (letra = (char) ('Z' - i); letra >= 'A'; letra--) {
                System.out.print(letra);
            }
            System.out.println();
        }

     }
}
