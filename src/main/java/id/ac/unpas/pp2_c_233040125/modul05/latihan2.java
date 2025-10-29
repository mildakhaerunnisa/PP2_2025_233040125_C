/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040125.modul05;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class latihan2 {
    public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JFrame frame = new JFrame ("JENDELA PERTAMAKU");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                
                JLabel label = new JLabel ("Ini adalah JLabel");
                frame.add(label);
                
                frame.setVisible(true);
            }
        });
    }
}
