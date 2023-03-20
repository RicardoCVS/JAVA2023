import java.util.ArrayList;

public class Ejercicio29 {
    private String nombre;
    private String apellidos;
    private int curso;
    private int año;

    public Ejercicio29(String nombre, String apellidos, int curso, int año) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCurso() {
        return curso;
    }

    public int getAño() {
        return año;
    }

    public static void main(String[] args) {
        // Crear una lista de alumnos
        ArrayList<Ejercicio29> alumnos = new ArrayList<Ejercicio29>();

        // Añadir algunos alumnos a la lista
        alumnos.add(new Ejercicio29("Juan", "Pérez", 1, 2022));
        alumnos.add(new Ejercicio29("María", "González", 2, 2021));
        alumnos.add(new Ejercicio29("Pedro", "López", 3, 2020));

        // Imprimir la información de todos los alumnos centrado a la izquierda
        System.out.printf("%-15s %-15s %-10s %-10s\n", "Nombre", "Apellidos", "Curso", "Año");
        System.out.printf("%-40s\n","------------------------------------------------");
        for (Ejercicio29 alumno : alumnos) {
            System.out.printf("%-15s\t%-15s\t%-10d\t%-10d\n", alumno.getNombre(), alumno.getApellidos(), alumno.getCurso(), alumno.getAño());
        }
        // Imprimir la información de todos los alumnos centrado en el centro
        System.out.printf("%15s %15s %10s %10s\n", "Nombre", "Apellidos", "Curso", "Año");
        System.out.printf("%40s\n","---------------------------------------------------------");
        for (Ejercicio29 alumno : alumnos) {
            System.out.printf("%15s\t%15s\t%10d\t%10d\n", alumno.getNombre(), alumno.getApellidos(), alumno.getCurso(), alumno.getAño());
        }
    }
}
