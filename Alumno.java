public class Alumno {
    // Atributes defining
    String matricula;
    String nombre;
    int edad;

    // Constructor without parameters
    public Alumno(){
        matricula = "A221677";
        nombre = "Karla Díaz Aguilar";
        edad = 19;
    }

    // Constructor with parameters
    public Alumno(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Methods
    public void mostrarAlumno(){
        System.out.println("Hola soy " + nombre + " , tengo " + edad + " y mi matricula es " + matricula);  
    }
}
