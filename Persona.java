public class Persona {
    // Variables declaration
    String curp;
    String nombre;
    int edad;

    // Constructor without parameters
    public Persona(){
        curp = "MELA230339KOL2WE34";
        nombre = "Andrea Mendez León";
        edad = 32;
    }

    // Contructor with parameters
    public Persona(String curp, String nombre, int edad){
        this.curp = curp;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Method
    public void mostrarPersona(){
        System.out.println("Hola soy " + nombre + " tengo " + edad + " años\n");
    }
}
