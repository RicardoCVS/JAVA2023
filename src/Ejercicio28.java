public class Ejercicio28 {
    public static void main(String[] args) {
        ejecucion1();
        System.out.println();
        ejecucion2();
        System.out.println();
        ejecucion3();
        System.out.println();
        ejecucion4();
        System.out.println();
        ejecucion5();
        System.out.println();
        ejecucion6();
        System.out.println();
        ejecucion7();
    }
    public static void ejecucion1() {
        String nombre = "Pepe";
        String nombreUP = nombre.toUpperCase();
        String apellido = "Perez";
        String apellido2 = "Hernandez";
        System.out.printf("Mi nombre es:-%s\tMi apellido:-%s\tY mi segundo apellido:-%s", nombreUP,apellido,apellido2);    }
    public static void ejecucion2() {
        String nombre = "Pepe";
        String nombreUP = nombre.toUpperCase();
        String apellido = "Perez";
        String apellido2 = "Hernandez";
        String espacio = "        ";
        System.out.printf("%S"+"%s"+"%s"+"%s", nombreUP,espacio,apellido,apellido2);
    }
    public static void ejecucion3() {
        String nombre = "Pepe";
        String nombreUP = nombre.toUpperCase();
        String apellido = "Perez";
        String apellido2 = "Hernandez";
        String espacio = "        ";
        System.out.printf("%s,%s,%s", apellido2,apellido,nombreUP);
    }
    public static void ejecucion4() {
        String nombre = "Manolo";
        String nombreUP = nombre.toUpperCase();
        Integer edad = 25;
        System.out.printf("Mi nombre es:-%s\tMi edad:-%d", nombreUP,edad);
    }
    public static void ejecucion5() {
        String nombre = "Manolo";
        String nombreUP = nombre.toUpperCase();
        Integer edad = 25;
        System.out.printf("Mi edad:-%012d",edad);
    }
    public static void ejecucion6() {
        String nombre = "Manolo";
        String nombreUP = nombre.toUpperCase();
        double edad = 17.1829327;
        System.out.printf("Mi edad:-%012.2f",edad);

    }
    public static void ejecucion7() {
        String hola = "Hola";
        String mundo = "Mundo";
        String exclamtion = "!!";
        System.out.printf("%s%s%s", hola,mundo,exclamtion);
    }
}

