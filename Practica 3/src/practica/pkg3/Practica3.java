/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Practica 2
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite su edad: "));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Si puedo votar ");
            JOptionPane.showMessageDialog(null, "Si puedo tomar ");
            JOptionPane.showMessageDialog(null, "Si puedo manejar ");
            if (edad >= 30) {
                JOptionPane.showMessageDialog(null, "Si puedo ser presidente ");
            }
            else{ 
                 JOptionPane.showMessageDialog(null,"No puedo ser presiente");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Eres menor de edad ");
        }
        JOptionPane.showMessageDialog(null, "Programa terminado ");
*/
        String dia=null;
        
        switch (dia) {
            case "1":
                JOptionPane.showMessageDialog(null,"Es lunes");
            case "2":
                JOptionPane.showMessageDialog(null,"Es Martes");
            case "3":
                JOptionPane.showMessageDialog(null,"Es Miercoles");
            case "4":
                JOptionPane.showMessageDialog(null,"Es Jueves");
            case "5":
                JOptionPane.showMessageDialog(null,"Es Viernes");
            case "6":
                JOptionPane.showMessageDialog(null,"Es Sabado");
            case "7":
                JOptionPane.showMessageDialog(null,"Es Domingo");
                break;
            default:
                throw new AssertionError();
        }
    }

}
