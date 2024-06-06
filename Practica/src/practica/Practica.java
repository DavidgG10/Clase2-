/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import static java.lang.System.out;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog("Digite su nombre:");
        double salario_semanal;
        double salario_seamanl = salario_semanal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite su salario semanal"));

        double salarioBruto = salario_semanal * 4;
        double salarioNeto = salarioBruto * 0.093;
        JOptionPane.showMessageDialog(null, " EL empleado" + nombre + "tiene un salario neto de: "+salarioNeto); 
    
    
   
    
    
    
     
   
    
    
   
    } 
  
}
