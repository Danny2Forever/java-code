/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class TellerGUI implements ActionListener{
    private JFrame frame;
    private JPanel infoInterface;
    private JPanel btnInterface;
    private JPanel btnContainer;
    private JButton dep, with, ext;
    private JTextArea textArea;
    private JLabel balanceShow;
    private Account acct = new Account(6000, "Tim");
    public TellerGUI(){
        frame = new JFrame();
        frame.setLayout(new GridLayout(2,1));
        
        infoInterface = new JPanel();
        infoInterface.setLayout(new GridLayout(2,2));
        infoInterface.add(new JLabel("Balance"));      
        balanceShow = new JLabel(""+acct.getBalance());
        
        infoInterface.add(balanceShow);
        infoInterface.add(new JLabel("Amount"));
        textArea = new JTextArea();
        infoInterface.add(textArea);
        
        frame.add(infoInterface);
        
        btnContainer = new JPanel();
        btnContainer.setLayout(new FlowLayout());
        
        dep = new JButton("Deposite");  with = new JButton("Withdraw");  ext = new JButton("Exit");
        dep.addActionListener(this);    with.addActionListener(this);    ext.addActionListener(this);
        
        btnContainer.add(dep);  btnContainer.add(with);  btnContainer.add(ext);
        
        btnInterface = new JPanel();
        btnInterface.setLayout(new GridLayout(2,1));
        
        btnInterface.add(btnContainer);
        btnInterface.add(new JPanel());
    
        frame.add(btnInterface);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(dep)) {
              acct.deposit(Double.valueOf(textArea.getText()));
              balanceShow.setText(""+acct.getBalance());
        }
        else if (ae.getSource().equals(with)) {
            if (Double.valueOf(textArea.getText()) <= acct.getBalance()){
                acct.withdraw(Double.valueOf(textArea.getText()));
                balanceShow.setText(""+acct.getBalance());
            }
        }
    }
}
