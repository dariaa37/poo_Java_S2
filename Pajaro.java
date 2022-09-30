public class Pajaro {
    private String especie;         // Declaro variables y atributos
    private String color;
    private Boolean extinto;
    int edad;

    public Pajaro(){                // Constructor de la clase pajaro
        especie = "Pinzón";
        color = "amarillo";
        extinto = false;
        edad = 3;
    }

    public Pajaro(String s, String c, int e){        // Constructor 
        especie = s;
        color = c;
        edad = e;
    }

    public void imprimirPajaro(){   // Metodos
        System.out.println("---------------------------");   // blanck space
        System.out.println(">> El pajaro es de la especie:\t" + especie + " y tiene " + edad + " años.");
        System.out.println(">> Su plumaje es color:\t" + color);
        System.out.println(">> ¿Esta en peligro de extinión?\t" + extinto);
    }

    public void datosAlumno(){
        System.out.println("____________________________");
        System.out.println("DÍAZ AGUILAR KARLA - A221677");
    }
}
