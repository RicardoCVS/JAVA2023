public class Ejercicio18 {
    public static void main(String[] args) {
        int i,j,k,n;
        n=10; //Modifica este parámetro si quieres
        for(i=0; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=0; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        }

    }
}
