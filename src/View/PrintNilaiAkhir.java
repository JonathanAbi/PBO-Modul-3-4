package View;

import Controller.Controller;
import javax.swing.JOptionPane;

public class PrintNilaiAkhir {

    public PrintNilaiAkhir() {
        Controller controller=new Controller();
        int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim : "));
        String kodeMK = JOptionPane.showInputDialog("Masukkan kode mata kuliah : ");
        JOptionPane.showMessageDialog(null, controller.printNilaiAkhir(nim, kodeMK));
    }
}
