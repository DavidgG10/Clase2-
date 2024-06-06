/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Ejercicio 2 */
       
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite su nota: "));
        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprobo la materia ");
          
        }
        else{
                    JOptionPane.showMessageDialog(null, "Reprobo la materia  ");
                    }
        JOptionPane.showMessageDialog(null, "Programa terminado ");
        
    }
    
}
