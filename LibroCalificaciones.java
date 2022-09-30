public class LibroCalificaciones {
    // Variable declaration
    private String nombreDelCurso; // private acces

        public void establecerNombreDelCurso(String nombre){
            nombreDelCurso = nombre;    // keep course's name
        }

        // Method (Got couse's name)
        public String obtenerNombreDelCurso(){
            return nombreDelCurso;
        }

        // Shows welcome to user
        public void mostrarMensaje(){
            // Call to got "obtenerNombreDelCurso" that represents the course's name from LibroCalificaciones
            System.out.print("Bienvenido al libro de calificaciones para: " + obtenerNombreDelCurso());
        }
}
