package com.haycal.crudmahasiswasederhana.views;

import javax.swing.SwingUtilities;


public class CRUDmahasiswaSederhana {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
    
}
