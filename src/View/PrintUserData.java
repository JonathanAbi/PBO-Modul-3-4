package View;

import Controller.Controller;
import javax.swing.JOptionPane;
import Model.User;
import java.util.ArrayList;

public class PrintUserData {

    public PrintUserData() {
        Controller controller=new Controller();
        String nama = JOptionPane.showInputDialog("Masukkan nama : ");
        JOptionPane.showMessageDialog(null, controller.printUserData(nama));
    }
}
