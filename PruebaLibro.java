// Program use "Scanner" class
import java.util.Scanner;

public class PruebaLibro{
    // el metodo main empieza la ejecución del programa
    public static void main(String [] args){
        // Create an Object Scanner to got comand window
        Scanner entrada = new Scanner(System.in);

        // Create an object
        LibroCalificaciones miLibro = new LibroCalificaciones();

        // Shows initial value from "nombreDelCurso"
        System.out.println("El nombre inicial del curso es: " + miLibro.obtenerNombreDelCurso());
        System.out.println(); // blanck space

        // Tell user to give a couse name
        System.out.println("Escriba el nombre del curso: ");
    
        // Read a textline
        String elNombre = entrada.nextLine();

        // Stablish course name
        miLibro.establecerNombreDelCurso(elNombre);
        System.out.println();   // blanck space

        // Shows Welcome message
        miLibro.mostrarMensaje();
    }
}
