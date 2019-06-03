/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Alumno.Enderezo ox = new Alumno().new Enderezo("Garcia Barbon",14);  
      Alumno a = new Alumno("Pepe",9,ox);
      a.amosar();
      byte nota=Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce correcion de la nota"));
      a.setNota(nota);
      a.amosar();
    }
    
}
