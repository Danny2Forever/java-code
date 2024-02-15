/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class MDIFromGUI extends JFrame{
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3, menu1Item1;
    private JMenuItem menu1Item2, menu1Item3, menu1Item4;
    private JMenuItem m1I1_1, m1I1_2;
    public MDIFromGUI(){
        desktopPane = new JDesktopPane();
        
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
        frame1.setSize(250, 150);
        frame1.setLocation(50, 350);
        
        
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setVisible(true);
        frame2.setSize(250, 125);
        frame2.setLocation(frame1.getX() + frame1.getWidth() - 20, frame1.getY()-150);
        
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setVisible(true);
        frame3.setSize(250, 250);
        frame3.setLocation(frame2.getX() + frame2.getWidth() + 70, frame2.getY()+50);
        
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("View");
        
        menuBar = new JMenuBar();
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        

        menu1Item1 = new JMenu("New");
        menu1Item2 = new JMenuItem("Open");
        menu1Item3 = new JMenuItem("Setting");
        menu1Item4 = new JMenuItem("Exit");

        menu1.add(menu1Item1);  menu1.add(menu1Item2); menu1.addSeparator();
        menu1.add(menu1Item3);  menu1.addSeparator();         menu1.add(menu1Item4);
        
        m1I1_1 = new JMenuItem("Window");
        m1I1_2 = new JMenuItem("Message");
        
        menu1Item1.add(m1I1_1);     menu1Item1.addSeparator();      menu1Item1.add(m1I1_2);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        this.add(desktopPane, BorderLayout.CENTER);
        
        this.setJMenuBar(menuBar);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1024, 600);
        this.setVisible(true);
    }
}
