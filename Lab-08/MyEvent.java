import javax.swing.*;
import java.awt.event.*;

public class MyEvent extends JFrame {
    JButton b1;
    public static void main (String[]args){
        MyEvent event = new MyEvent();
    }
    //Constructor for the event derived class
    public MyEvent(){
        super("window Title:Event Handing");
        b1 = new JButton("Click Me");
        //place ther button objects on the window
        getContentPane().add(b1);

        //Register the LIstener for the button
        ButtonListener listen = new ButtonListener();
        b1.addActionListener(listen);
        //display the window in a specific size
        setVisible(true);
        setSize(200,200);
            
}

//The Listener Class
class ButtonListener implements ActionListener{
    //Definition for ActionPerformed()method
    public void actionPerformed(ActionEvent evt){
        JButton source = (JButton)evt.getSource();
        source.setText("Button Clicked");
    }
    }
}
