import javax.swing.JOptionPane;

public class pruebaFor {
    public static void main(String[] ergs) {
        // Variables
        float promedioI, suma = 0, promedioT = 0;

        // Proceso
        for(int i=1; i<=10; i++){
            promedioI = Integer.parseInt(JOptionPane.showInputDialog("Promedio alumno "+ i + ": "));
            System.out.println("Promedio " + i + ":\t" + promedioI);
            suma += promedioI;
        }
        
        promedioT = suma/10;
        System.out.println();
        System.out.println("SUMA:\t\t" + suma + "\nPROMEDIO GRUPAL:\t\t" + promedioT);
    }
}
