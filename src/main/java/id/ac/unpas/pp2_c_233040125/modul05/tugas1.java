/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040125.modul05;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author milda
 */
public class tugas1 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JFrame frame = new JFrame ("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
               
                frame.setLayout(new BorderLayout ());
                JLabel label = new JLabel("Label ada di Atas (NORTH)");
                JButton button = new JButton("Tombol ada di Bawah(SOUTH)");
                JButton center = new JButton("CENTER");
                JButton west = new JButton ("West");
                JButton east = new JButton ("EAST");
                
                button.addActionListener( e -> {
                    label.setText("Tombol di SOUTH diklik!");
                });
                
                center.addActionListener(e -> {
                    label.setText("Tombol di CENTER diklik!");
                });
                
                west.addActionListener(e -> {
                    label.setText("Tombol di WEST diklik!");
                });
                
                east.addActionListener(e -> {
                    label.setText("Tombol di EAST diklik!");
                });
                
               frame.add(label, BorderLayout.NORTH);
               frame.add(button, BorderLayout.SOUTH);
               frame.add(center, BorderLayout.CENTER);
               frame.add(west, BorderLayout.WEST);
               frame.add(east, BorderLayout.EAST);
               
               frame.setVisible(true);
            }
        });
    }
    
}
