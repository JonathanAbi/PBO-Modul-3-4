
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

public class PrintTidakLulus {
    public PrintTidakLulus(){
        Controller controller = new Controller();
        String kodeMK = JOptionPane.showInputDialog("Masukkan kode mata kuliah : ");
        JOptionPane.showMessageDialog(null, controller.printTidakLulus(kodeMK));
    }
}
