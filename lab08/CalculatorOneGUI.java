/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class CalculatorOneGUI {
    private JFrame frame;
    private JPanel btnContainer;
    private JPanel btn;
    public CalculatorOneGUI(){
        frame = new JFrame("Frame");
        btnContainer = new JPanel();
        btn = new JPanel();
        
        frame.setLayout(new GridLayout(4,1));
        btnContainer.setLayout(new FlowLayout());

        frame.add(new JTextField());
        frame.add(new JTextField());

        btnContainer.add(new JButton("+"));
        btnContainer.add(new JButton("-"));
        btnContainer.add(new JButton("x"));
        btnContainer.add(new JButton("/"));
        frame.add(btn.add(btnContainer));
        frame.add(new JTextField());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
   
}
