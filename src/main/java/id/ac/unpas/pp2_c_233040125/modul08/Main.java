/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_c_233040125.modul08;

import id.ac.unpas.pp2_c_233040125.modul08.controller.PersegiPanjangController;
import id.ac.unpas.pp2_c_233040125.modul08.model.PersegiPanjangModel;
import id.ac.unpas.pp2_c_233040125.modul08.view.PersegiPanjangView;

/**
 *
 * @author milda
 */
public class Main {
    public static void main(String[] args) {
        //1. instansiasi model
        PersegiPanjangModel model= new PersegiPanjangModel();
        
        //2. instansiasi view
        PersegiPanjangView view = new PersegiPanjangView();
        
        //3. instansiasi controller (hubungkan model & view)
        PersegiPanjangController controller = new PersegiPanjangController(model, view);
        
        //4. tampilkan view
        view.setVisible(true);
    }
}
