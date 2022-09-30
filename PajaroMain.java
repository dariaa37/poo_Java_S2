// Clase principal - Método main

public class PajaroMain {
    public static void main(String arg[]){
        Pajaro p1 = new Pajaro();
        Pajaro p2 = new Pajaro("Quetzal", "Verde y rojo", 4);
        Pajaro p3 = new Pajaro();
        Pajaro miNombre = new Pajaro();

        p1.imprimirPajaro();
        p2.imprimirPajaro();
        p3.imprimirPajaro();
        miNombre.datosAlumno();

    }
}
