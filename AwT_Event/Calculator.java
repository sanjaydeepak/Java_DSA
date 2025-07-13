package AwT_Event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button btn0, equals,clear, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, sum, multiply, diff, divide;

    Calculator() {
        display = new TextField("0");
        display.setBounds(50, 50, 400, 50);
        btn1 = new Button("1");
        btn1.setBounds(50, 120, 80, 60);
        add(btn1);

        btn2 = new Button("2");
        btn2.setBounds(140, 120, 80, 60);
        add(btn2);

        btn3 = new Button("3");
        btn3.setBounds(230, 120, 80, 60);
        add(btn3);

        btn4 = new Button("4");
        btn4.setBounds(50, 190, 80, 60);
        add(btn4);

        btn5 = new Button("5");
        btn5.setBounds(140, 190, 80, 60);
        add(btn5);

        btn6 = new Button("6");
        btn6.setBounds(230, 190, 80, 60);
        add(btn6);

        btn7 = new Button("7");
        btn7.setBounds(50, 260, 80, 60);
        add(btn7);

        btn8 = new Button("8");
        btn8.setBounds(140, 260, 80, 60);
        add(btn8);

        btn9 = new Button("9");
        btn9.setBounds(230, 260, 80, 60);
        add(btn9);

        btn0 = new Button("0");
        btn0.setBounds(140, 330, 80, 60);
        add(btn0);

        // === Operators & Actions ===
        sum = new Button("+");
        sum.setBounds(320, 120, 80, 60);
        add(sum);

        diff = new Button("-");
        diff.setBounds(320, 190, 80, 60);
        add(diff);

        multiply = new Button("*");
        multiply.setBounds(320, 260, 80, 60);
        add(multiply);

        divide = new Button("/");
        divide.setBounds(320, 330, 80, 60);
        add(divide);

        equals = new Button("=");
        equals.setBounds(230, 330, 80, 60);
        add(equals);

        clear = new Button("C");
        clear.setBounds(50, 330, 80, 60);
        add(clear);
        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(sum);
        add(diff);
        add(multiply);
        add(divide);
        add(clear);
        add(equals);
        setSize(500,600);
        setLayout(null);
        setTitle("calc");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn0)
        {
           String expression =display.getText();
           expression +="0";
           display.setText(expression);
        }if(e.getSource()==btn1)
        {
           String expression =display.getText();
           expression +="1";
           display.setText(expression);
        }if(e.getSource()==btn2)
        {
           String expression =display.getText();
           expression +="2";
           display.setText(expression);
        }if(e.getSource()==btn3)
        {
           String expression =display.getText();
           expression +="3";
           display.setText(expression);
        }if(e.getSource()==btn4)
        {
           String expression =display.getText();
           expression +="4";
           display.setText(expression);
        }if(e.getSource()==btn5)
        {
           String expression =display.getText();
           expression +="5";
           display.setText(expression);
        }if(e.getSource()==btn6)
        {
           String expression =display.getText();
           expression +="6";
           display.setText(expression);
        }if(e.getSource()==btn7)
        {
           String expression =display.getText();
           expression +="7";
           display.setText(expression);
        }if(e.getSource()==btn8)
        {
           String expression =display.getText();
           expression +="8";
           display.setText(expression);
        }if(e.getSource()==btn9)
        {
           String expression =display.getText();
           expression +="9";
           display.setText(expression);
           }
//        }if(e.getSource()==btn0)
//        {
//           String expression =display.getText();
//           expression +="0";
//           display.setText(expression);
//        }if(e.getSource()==btn0)
//        {
//           String expression =display.getText();
//           expression +="0";
//           display.setText(expression);
//        }if(e.getSource()==btn0)
//        {
//           String expression =display.getText();
//           expression +="0";
//           display.setText(expression);
//        }if(e.getSource()==btn0)
//        {
//           String expression =display.getText();
//           expression +="0";
//           display.setText(expression);
//        }if(e.getSource()==btn0)
//        {
//           String expression =display.getText();
//           expression +="0";
//           display.setText(expression);
//        }if(e.getSource()==btn0)
//        {
//           String expression =display.getText();
//           expression +="0";
//           display.setText(expression);
//        }
    }
    public static void main(String[] args) {

new Calculator();
    }
}
