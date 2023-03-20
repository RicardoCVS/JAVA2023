import java.util.Random;

public class Ejercicio23 {

    private static final String[] TEXT_COLORS = {
            "\u001B[30m", // negro
            "\u001B[31m", // rojo
            "\u001B[32m", // verde
            "\u001B[33m", // amarillo
            "\u001B[34m", // azul
            "\u001B[35m", // magenta
            "\u001B[36m", // cyan
            "\u001B[37m"  // blanco
    };

    private static final String[] BACKGROUND_COLORS = {
            "\u001B[40m", // negro
            "\u001B[41m", // rojo
            "\u001B[42m", // verde
            "\u001B[43m", // amarillo
            "\u001B[44m", // azul
            "\u001B[45m", // magenta
            "\u001B[46m", // cyan
            "\u001B[47m"  // blanco
    };

    private static final String[] TEXT_STYLES = {
            "\u001B[1m",  // negrita
            "\u001B[3m",  // itálica
            "\u001B[4m"   // subrayado
    };

    private static final Random random = new Random();

    public static void main(String[] args) {
        String[] texts = {"Hola", "amigos", "del", "arcoíris!", "¿", "Cómo", "es", "un", "mundo", "lleno", "de", "colores", "?"};

        for (String text : texts) {
            // Generamos aleatoriamente un color de fondo, un color de texto y un estilo de texto
            String backgroundColor = BACKGROUND_COLORS[random.nextInt(BACKGROUND_COLORS.length)];
            String textColor = TEXT_COLORS[random.nextInt(TEXT_COLORS.length)];
            String textStyle = TEXT_STYLES[random.nextInt(TEXT_STYLES.length)];

            // Imprimimos el texto con el formato generado aleatoriamente
            System.out.print(backgroundColor + textColor + textStyle + text + "\u001B[0m" + " ");
        }
    }
}
