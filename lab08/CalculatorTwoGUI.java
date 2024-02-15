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
public class CalculatorTwoGUI {
    private JFrame frame;
    private JPanel btnContainer;
    public CalculatorTwoGUI(){
        frame = new JFrame("CalculatorTwoGUI");
        
        frame.setLayout(new BorderLayout());
        frame.add(new JTextArea(), BorderLayout.NORTH);
        
        btnContainer = new JPanel();
        btnContainer.setLayout(new GridLayout(4,4));
        btnContainer.add(new JButton("7"));
        btnContainer.add(new JButton("8"));
        btnContainer.add(new JButton("9"));
        btnContainer.add(new JButton("+"));
        
        btnContainer.add(new JButton("4"));
        btnContainer.add(new JButton("5"));
        btnContainer.add(new JButton("6"));
        btnContainer.add(new JButton("-"));
        
        btnContainer.add(new JButton("1"));
        btnContainer.add(new JButton("2"));
        btnContainer.add(new JButton("3"));
        btnContainer.add(new JButton("x"));
        
        btnContainer.add(new JButton("0"));
        btnContainer.add(new JButton("c"));
        btnContainer.add(new JButton("="));
        btnContainer.add(new JButton("/"));
        
        frame.add(btnContainer, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
