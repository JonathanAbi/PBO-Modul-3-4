
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

public class PrintGajiStaff {
    public PrintGajiStaff(){
        Controller controller=new Controller();
        int nik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nik : "));
        JOptionPane.showMessageDialog(null, controller.printGajiStaff(nik));
    }
}
