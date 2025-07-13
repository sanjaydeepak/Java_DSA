package AwT_Event;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT {
    AWT() {
        Frame frame = new Frame();
        Label email = new Label("Email");
        email.setBounds(90, 130, 100, 30);
        Label pass = new Label("Password");
        pass.setBounds(90, 170, 100, 30);
        Label age = new Label("Age");
        age.setBounds(90, 210, 100, 30);


        TextField emailinput = new TextField("Enter your Email ");
        TextField passinput = new TextField("Enter your Password");
        TextField ageinput = new TextField("Enter your Age");

        emailinput.setBounds(170, 130, 150, 30);
        passinput.setBounds(170, 170, 150, 30);
        ageinput.setBounds(170, 210, 150, 30);
        Button submit =new Button("Show");
        submit.setBounds(170,280,75,50);

        frame.add(email);
        frame.add(pass);
        frame.add(age);
        frame.add(ageinput);
        frame.add(emailinput);
        frame.add(passinput);
        frame.add(submit);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("A Form by  Java GUI ");
  ButtonListener  buttonlistener=new ButtonListener(emailinput,passinput,ageinput);
   submit.addActionListener(buttonlistener);
    }

    public static void main(String[] args) {
        new AWT();
    }
}
class ButtonListener implements ActionListener{
    TextField emailinput;
    TextField passinput;
    TextField ageinput;
    ButtonListener(TextField emailinput,TextField passinput,TextField ageinput){
this.emailinput=emailinput;
this.ageinput=ageinput;
this.passinput=passinput;
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println(emailinput.getText());
        System.out.println(passinput.getText());
        System.out.println(ageinput.getText());
    }
}
