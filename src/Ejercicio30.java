public class Ejercicio30{
        public static void main(String[] args) {
            // Importar la clase HolaMundo
            HolaMundo hm = new HolaMundo();
            System.out.println(hm.saludar());

            // Importar la clase HastaNunqui
            HastaNunqui hn = new HastaNunqui();
            System.out.println(hn.patada());
        }

        // Clase HolaMundo
        static class HolaMundo {
            public String saludar() {
                return "Hola Mundo!";
            }
        }

        // Clase HastaNunqui
        static class HastaNunqui {
            public String patada() {
                return "Hasta Nunqui!";
            }
        }
}

