public class Ejercicio25 {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        String[] colores = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m"};
        String[] formatos = {"\u001B[0m", "\u001B[1m", "\u001B[2m", "\u001B[3m", "\u001B[4m"};

        // Imprimir encabezado
        System.out.print("\t");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(colores[i] + formatos[i] + numeros[i] + "\t");
        }
        System.out.println("\u001B[0m"); // Restablecer color y formato

        // Imprimir filas
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(colores[i] + formatos[i] + numeros[i] + "\t");
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(colores[i] + formatos[i] + (numeros[i] * numeros[j]) + "\t");
            }
            System.out.println("\u001B[0m"); // Restablecer color y formato
        }
    }

}
