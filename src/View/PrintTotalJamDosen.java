
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

public class PrintTotalJamDosen {
    public PrintTotalJamDosen(){
        Controller controller=new Controller();
        int nik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nik : "));
        JOptionPane.showMessageDialog(null, controller.printTotalJamDosen(nik));
    }
}
