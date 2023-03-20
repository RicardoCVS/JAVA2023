import java.util.Random;
public class Ejercicio21 {

    public static String java0rNu110(String palabra) {
        if (palabra.equals("java")) {
            return "java";
        } else {
            return null;
        }
    }

    public static String login(String usuario, String password) {
        if (usuario.equals("admin") && password.equals("1234")) {
            return "Login true";
        } else {
            return "Login false";
        }
    }

    public static boolean esPar() {
        Random r = new Random();
        int numero = r.nextInt(100); // Generamos un número aleatorio entre 0 y 99
        if (numero % 2 == 0) { // Si el resto de la división entre 2 es cero, es par
            return true;
        } else { // Si no, es impar
            return false;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la función java0rNu110
        String resultado1 = java0rNu110("java");
        String resultado2 = java0rNu110("otraPalabra");
        System.out.println(resultado1); // Debería imprimir "java"
        System.out.println(resultado2); // Debería imprimir "null"

        // Ejemplo de uso de la función login
        String resultado3 = login("admin", "1234");
        String resultado4 = login("otroUsuario", "otroPassword");
        System.out.println(resultado3); // Debería imprimir "Login true"
        System.out.println(resultado4); // Debería imprimir "Login false"

        // Ejemplo de uso de la función esPar
        boolean resultado5 = esPar();
        System.out.println(resultado5); // Debería imprimir true o false de forma aleatoria
    }
}


