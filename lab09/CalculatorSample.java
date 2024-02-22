/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;
import GUI.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author User
 */
public class CalculatorSample implements ActionListener {
    private JFrame frame;
    private JPanel btnContainer;
    private JTextArea textArea;
    private String num1 = "", num2 = "", operate = "", sum = "";
    private JButton zero, one, two, three, four, five, six, 
            seven, eight, nine, plus, minus, divide, time, clear, equal;
    private boolean firstPress = true;
    public CalculatorSample(){
        frame = new JFrame("Calculator");
        
        frame.setLayout(new BorderLayout());
        textArea = new JTextArea();
        frame.add(textArea, BorderLayout.NORTH);
        
        btnContainer = new JPanel();
        btnContainer.setLayout(new GridLayout(4,4));
        seven = new JButton("7");   eight = new JButton("8");   nine = new JButton("9");    plus = new JButton("+");
        four = new JButton("4");   five = new JButton("5");   six = new JButton("6");    minus = new JButton("-");
        one = new JButton("1");   two = new JButton("2");   three = new JButton("3");    time = new JButton("x");
        zero = new JButton("0");   clear = new JButton("c");   equal = new JButton("=");    divide = new JButton("/");
        
        seven.addActionListener(this);  eight.addActionListener(this);  nine.addActionListener(this);  plus.addActionListener(this);
        four.addActionListener(this);  five.addActionListener(this);  six.addActionListener(this);  minus.addActionListener(this);
        one.addActionListener(this);  two.addActionListener(this);  three.addActionListener(this);  time.addActionListener(this);
        zero.addActionListener(this);  clear.addActionListener(this);  equal.addActionListener(this);  divide.addActionListener(this);
        
        btnContainer.add(seven);    btnContainer.add(eight);    btnContainer.add(nine);    btnContainer.add(plus);    
        btnContainer.add(four);    btnContainer.add(five);    btnContainer.add(six);    btnContainer.add(minus);    
        btnContainer.add(one);    btnContainer.add(two);    btnContainer.add(three);    btnContainer.add(time);    
        btnContainer.add(zero);    btnContainer.add(clear);    btnContainer.add(equal);    btnContainer.add(divide);    
        
        frame.add(btnContainer, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(zero) | ae.getSource().equals(one) | ae.getSource().equals(two)
            | ae.getSource().equals(three) | ae.getSource().equals(four) | ae.getSource().equals(five)
            | ae.getSource().equals(six) | ae.getSource().equals(seven) | ae.getSource().equals(eight)
            | ae.getSource().equals(nine)) {
            addDisplayNum(textArea, (JButton)ae.getSource());
        }
        else if (ae.getSource().equals(plus) | ae.getSource().equals(minus)
                | ae.getSource().equals(time) | ae.getSource().equals(divide)
                | ae.getSource().equals(clear)) {
            operator(textArea, (JButton)ae.getSource());
        }
        else if (ae.getSource().equals(equal)) {
            equal(textArea);
        }
    }
    
    public void addDisplayNum(JTextArea txt, JButton btn) {
        txt.setText(txt.getText()+btn.getText());
    }
    
    public void operator(JTextArea txt, JButton btn){
        num1 = txt.getText();
        System.out.println(num1);
        txt.setText("");
        String operator = btn.getText();
        if (operator.equals("+")) {
            operate = "plus";
        }
        else if (operator.equals("-")) {
            operate = "minus";
        }
        else if (operator.equals("x")) {
            operate = "time";
        }
        else if (operator.equals("/")) {
            operate = "divide";
        }
    }
    
    public void equal(JTextArea txt) {
        num2 = txt.getText();
        System.out.println(num2);
        System.out.println(operate);
        if (operate.equals("plus")){
            sum += Integer.valueOf(num1) + Integer.valueOf(num2);
        }else if (operate.equals("minus")){
            sum += Integer.valueOf(num1) - Integer.valueOf(num2);
        }else if (operate.equals("time")){
            sum += Integer.valueOf(num1) * Integer.valueOf(num2);
        }else if (operate.equals("divide")){
            sum += Integer.valueOf(num1) / Integer.valueOf(num2);
        }
        txt.setText(sum);
    }
}
