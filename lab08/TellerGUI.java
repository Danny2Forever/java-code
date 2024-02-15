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
public class TellerGUI {
    private JFrame frame;
    private JPanel infoInterface;
    private JPanel btnInterface;
    private JPanel btnContainer;
    public TellerGUI(){
        frame = new JFrame();
        frame.setLayout(new GridLayout(2,1));
        
        infoInterface = new JPanel();
        infoInterface.setLayout(new GridLayout(2,2));
        infoInterface.add(new JLabel("Balance"));      
        infoInterface.add(new JLabel("6000"));
        infoInterface.add(new JLabel("Amount"));
        infoInterface.add(new JTextArea());
        
        frame.add(infoInterface);
        
        btnContainer = new JPanel();
        btnContainer.setLayout(new FlowLayout());
        btnContainer.add(new JButton("Deposite"));
        btnContainer.add(new JButton("Withdraw"));
        btnContainer.add(new JButton("Exit"));
        
        btnInterface = new JPanel();
        btnInterface.setLayout(new GridLayout(2,1));
        
        btnInterface.add(btnContainer);
        btnInterface.add(new JPanel());
    
        frame.add(btnInterface);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
