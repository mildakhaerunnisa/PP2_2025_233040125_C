/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040125.modul05;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class latihan3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JFrame frame = new JFrame ("JENDELA PERTAMAKU");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
               
                frame.setLayout(new FlowLayout ());
                JLabel label = new JLabel("Teks awal");
                JButton button = new JButton("Klik saya!");
                
                button.addActionListener( e -> {
                    label.setText("Tombol berhasil diklik!");
                });
                
               frame.add(label);
               frame.add(button);
               frame.setVisible(true);
            }
        });
    }
}
