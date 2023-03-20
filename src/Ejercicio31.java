public class Ejercicio31 {
    public static void main(String[] args) {
        String[] tecnologies = {"Markdown", "Regexp","JS", "SQL", "Java", "HTML", "css"};
        recursivo(tecnologies, 0);
    }

    public static void recursivo(String[] tecnologies, int contador) {
        if (tecnologies.length == contador) {
            return;
        }
        if(tecnologies[contador].equals("HTML")) {
            System.out.println("HTML pedaso de crcuk");
            return;
        }
        System.out.println(tecnologies[contador]);
        recursivo(tecnologies, contador + 1);
    }
}
