import javax.swing.*;
import gui.frmMain;

public class App {

    static JLabel label = new JLabel("prueba");
    static JPanel pnl = new JPanel();

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                frmMain frmMain = new frmMain(true, 900, 450, "Ventana de prueba");
                
                frmMain.init(true, 200);
                frmMain.containerLefthColor(31, 35, 53);
                frmMain.containerCenterColor(36, 40, 59);
                pnl.add(label);
                frmMain.addContent(pnl);
            }
        });
    }

}
