public class Ejercicio24 {
    public static void main(String[] args) {
        int i,j,k,n;
        n=10; //Modifica este parámetro si quieres
        for(i=0; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=0; k<=2*i; k++){
                if(k==0&&i==0 ){
                    System.out.print("\u001B[41m*"); // Código ANSI de color de fondo rojo, la estrella
                }else {
                    System.out.print("\u001B[42m*"); // Código ANSI de color de fondo verde
                }
            }
            System.out.println("\u001B[0m"); // Restaurar el color a su valor por defecto
        }
        for(i=0; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("\u001B[48;5;233m*"); // Código ANSI de color de fondo negro
            }
            System.out.println("\u001B[0m"); // Restaurar el color a su valor por defecto
        }

    }
}
