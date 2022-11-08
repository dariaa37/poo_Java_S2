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
        // Tell user to give a couse name
        System.out.println("Escriba el nombre del curso: ");
    
        // Read a textline
        String elNombre = entrada.nextLine();

        // Stablish course name
        miLibro.establecerNombreDelCurso(elNombre);








        // Shows Welcome message
        miLibro.mostrarMensaje();
        System.out.print("\n\nDíaz Aguilar Karla | 2oM | A221677");
        // Ciclo FOR para obtener promedio grupal (Entrada)
        // Variables
        float promedio, suma = 0;

        System.out.print("\n\n>> Ejemplo CICLO FOR\n");
        for(int i=1; i<=8; i++){
            System.out.println("Numero: " + i);
            suma += i;
        }

        // Obtengo promedio de la suma 
        promedio = suma/8;
        System.out.println();
        System.out.println("SUMA NUMEROS:\t\t" + suma + "\nPROMEDIO NUMEROS:\t" + promedio);
        System.out.print("\n\nDíaz Aguilar Karla | 2oM | A221677");
    }
}
