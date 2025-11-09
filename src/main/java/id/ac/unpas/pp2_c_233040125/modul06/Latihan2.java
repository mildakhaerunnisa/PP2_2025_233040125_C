/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040125.modul06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author milda
 */
public class Latihan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konversi Celcius ke Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel lcelcius = new JLabel("Celcius");
        JTextField tcelcius = new JTextField();

        JLabel labelFahrenheit = new JLabel("Fahrenheit");
        JTextField textFahrenheit = new JTextField();
        textFahrenheit.setEditable(false); 

        JButton tombolKonversi = new JButton("Konversi");
        JLabel pesanError = new JLabel(""); // warna default: hitam

        frame.add(lcelcius);
        frame.add(tcelcius);

        frame.add(labelFahrenheit);
        frame.add(textFahrenheit);

        frame.add(new JLabel("")); // baris kosong untuk tombol di tengah
        frame.add(tombolKonversi);
        frame.add(pesanError); // pesan error sejajar kiri

        // Aksi tombol
        tombolKonversi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesanError.setText("");
                try {
                    double celcius = Double.parseDouble(tcelcius.getText());
                    double fahrenheit = (celcius * 9 / 5) + 32;
                    textFahrenheit.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    pesanError.setText("Input harus angka");
                    textFahrenheit.setText("");
                }
            }
        });

        frame.setVisible(true);
    }
}
