/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author JONATHAN
 */
public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    private void showMainMenu() {
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: "
                    + "\n1.Print UserData "
                    + "\n2.Print Nilai Akhir "
                    + "\n3.Print Rata-Rata Nilai Akhir "
                    + "\n4.Print banyak mahasiswa tidka lulus "
                    + "\n5. Print matkul ambil "
                    + "\n6. Print jam dosen "
                    + "\n7. Print gaji staff "
                    + "\n8. Exit"));
            switch (pilih) {
                case 1:
                    new PrintUserData();
                    break;
                case 2:
                    new PrintNilaiAkhir();
                    break;
                case 3:
                    new PrintRataRataNilaiAkhir();
                    break;
                case 4:
                    new PrintTidakLulus();
                    break;
                case 5:
                    new PrintMatkulAmbil();
                    break;
                case 6:
                    new PrintTotalJamDosen();
                    break;
                case 7:
                    new PrintGajiStaff();
                    break;
            }
        } while (pilih != 8);
    }
}
