public class Ejercicio27 {
    public static void main(String[] args) {
        //Hacemos conversion de tipos double -> float -> long -> int -> short -> byte
        double miDouble = 3.1416;
        float miFloat = (float) miDouble;
        long miLong = (long) miFloat;
        int miInt = (int) miLong;
        short miShort = (short) miInt;
        byte miByte = (byte) miShort;

        //Comprobamos que todos esten correctos
        System.out.println(miDouble);
        System.out.println(miFloat);
        System.out.println(miLong);
        System.out.println(miInt);
        System.out.println(miShort);
        System.out.println("------------------------------------------------------------------------------------------------");
        //Realizamos un casting al reves
        byte miByte2 = 3;
        short miShort2 = (short) miByte2;
        int miInt2 = (int) miShort2;
        long miLong2 = (long) miInt2;
        float miFloat2 = (float) miLong2;
        double miDouble2 = (double) miFloat2;


        //Volvemos a comprobar que los valores son correctos
        System.out.println(miByte2);
        System.out.println(miShort2);
        System.out.println(miInt2);
        System.out.println(miLong2);
        System.out.println(miFloat2);
        System.out.println(miDouble2);

        System.out.println("------------------------------------------------------------------------------------------------");

        //Declaramos el byte 100
        byte miByte3 = 100;
        byte miByte4 = (byte) (miByte3*2);
        System.out.println("el valor de mi byte de 100 * 2 es:" + miByte4);
        /*Lo que está sucediendo es que al multiplicar el valor de la variable "miByte" por 2,
         se está excediendo el rango de valores permitido para el tipo de dato "byte".
         El rango permitido para el tipo de dato "byte" es de -128 a 127.
         Al multiplicar el valor 100 por 2, se obtiene 200, que está fuera de este rango permitido.*/
        short miShort3 = (short) (miByte3 *2);
        System.out.println("el valor de mi short multiplicado por 2 tras hacer casting es:" + miShort3);
    }
}
