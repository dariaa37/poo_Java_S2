import java.util.Scanner;

public class rectaguloPrincipal {
    public static void main(String [] args){
        // Paso 1: Crear objetos de la clase Rectangulo
        rectangulo dato1 = new rectangulo(0, 0);
        rectangulo dato2 = new rectangulo(0, 0);

        Scanner teclado = new Scanner(System.in);

        // Solicita datos para BASE
        System.out.println("Ingrese BASE: ");
        float b = teclado.nextFloat();
        dato1.establecerBase(b);
        
        // Solicita datos para BASE
        System.out.println("Ingrese ALTURA: ");
        float h = teclado.nextFloat();
        dato2.establecerAltura(h);

        rectangulo datos = new rectangulo(b, h);
        
        System.out.println("| PERIMETRO = " + datos.getPerimetro());
        System.out.println("| ÁREA = " + datos.getArea());
    }
}
