package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class frmMain extends JFrame {
    JFrame frm;
    JPanel pnlLefth;
    JPanel pnlCenter;
    JButton btnTest;
    Color leftColor;

    public frmMain(int Width, int Heigth, int maxW, int maxH, String header){
        frm = new JFrame(header);
        frm.setLayout(new BorderLayout());
        frm.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Definir tamaño a mostrar y minimo
        frm.setSize(Width, Heigth);
        frm.setMinimumSize(new Dimension(Width, Heigth));

        // Definir tamaño maximo
        frm.setPreferredSize(new Dimension(maxW, maxH));
        
        
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frm.pack();
        frm.setLocationRelativeTo(null);
    }
    public frmMain(boolean Zised_both,int Width, int Heigth, String header){
        frm = new JFrame(header);
        frm.setLayout(new BorderLayout());
        frm.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frm.setMinimumSize(new Dimension(Width, Heigth));

        frm.pack();
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
    }
    
    public void initContainer(int maxWidthMenu){
        pnlLefth = new JPanel();
        pnlCenter = new JPanel(new CardLayout());
        btnTest = new JButton();

        pnlLefth.setLayout(new BoxLayout(pnlLefth, BoxLayout.Y_AXIS));
        pnlLefth.setPreferredSize(new Dimension(maxWidthMenu, pnlLefth.getPreferredSize().height));

        frm.add(pnlLefth, BorderLayout.WEST);
        frm.add(pnlCenter, BorderLayout.CENTER);

        setEventButton(btnTest, "test");
        pnlLefth.add(btnTest);
        pnlLefth.add(btnTest);
    }
    public void containerLefthColor(int r, int g, int b){
        pnlLefth.setBackground(new Color(r,g,b));
        leftColor = new Color(r, g, b);
    }
    public void containerCenterColor(int r, int g, int b){
        pnlCenter.setBackground(new Color(r,g,b));
    }
    public void init(boolean state,int maxWidthMenu){
        initContainer(maxWidthMenu);
        frm.setVisible(state);
    }
    public void addContent(JPanel pnl){
        pnl.setOpaque(false);
        pnlCenter.add(pnl);
    }
    public void addContent(JPanel pnl, boolean opaque){
        pnl.setOpaque(opaque);
        pnlCenter.add(pnl);
    }
    public void setThemeButton(JButton btn, String btnText){
        btn.setText(btnText);
        btn.setOpaque(false);
//btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setSize(new Dimension(100, 200));
        btn.setForeground(new Color(234,234,234));
    }
    public void setEventButton(JButton btn, String urlPnl){
        setThemeButton(btn, urlPnl);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(urlPnl);
            }
        };
        btn.addActionListener(al);
    }
    /* <----- EVENTOS -----> */
}
