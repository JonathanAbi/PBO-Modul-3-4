
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

public class PrintMatkulAmbil {
   public PrintMatkulAmbil(){
       Controller controller=new Controller();
       int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim : "));
       JOptionPane.showMessageDialog(null, controller.printMatkulAmbil(nim));
   }
}
