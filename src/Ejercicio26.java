public class Ejercicio26 {
    public static void main(String[] args) {
        //Definimos los datos pedidos
        Long myLong = 123456789L;
        byte myByte = 127;
        short myShort = 32767;
        Integer myInteger = 2147483647;

        //Imprimimos antes del Casting
        System.out.println("Antes del casting queda tal que asi: ");
        System.out.println("Tipo de myLong: " + myLong.getClass());
        System.out.println("Tipo de myByte: " + Byte.TYPE);
        System.out.println("Tipo de myShort: " + Short.TYPE);
        System.out.println("Tipo de myInteger: " + myInteger.getClass());
        //Casting, estamos realizando operaciones
        // aritméticas con estas nuevas variables para cambiar sus propiedades.
        Integer newByteValue = (int) myByte + 1;
        Long newShortValue = (long) myShort - 1;
        //Imprimimos despues del Casting
        System.out.println("Valor original de myByte: " + myByte);
        System.out.println("Nuevo valor de myByte: " + newByteValue.getClass());
        System.out.println("Valor original de myShort: " + myShort);
        System.out.println("Nuevo valor de myShort: " + newShortValue.getClass());

        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        //
        String wrapperType = getWrapperType(boolean.class);
        System.out.println(wrapperType); // Imprime "Integer"

        String longType = getWrapperType(Boolean.class);
        System.out.println(longType); // Imprime "Long"


    }
    public static String getWrapperType(Class<?> type) {
        if (type.isPrimitive()) {
            if (type == boolean.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Boolean.class.getSimpleName();
            } else if (type == byte.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Byte.class.getSimpleName();
            } else if (type == char.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Character.class.getSimpleName();
            } else if (type == short.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Short.class.getSimpleName();
            } else if (type == int.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Integer.class.getSimpleName();
            } else if (type == long.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Long.class.getSimpleName();
            } else if (type == float.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Float.class.getSimpleName();
            } else if (type == double.class) {
                return "El tipo de dato es simple y la clase mas cercana seria :"+Double.class.getSimpleName();
            }
        } else {
            return "El tipo de dato no es simple :"+type.getSimpleName();
        }
        return null;
    }

}
