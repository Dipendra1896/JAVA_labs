import java.awt.*;
import java.awt.event.*;

public class KeyPress extends Frame {
    Label label;
    TextField txtField;
    public static void main (String[] args){
        KeyPress k = new KeyPress();
    }

    public KeyPress(){
        super("Key Press Event Frame");
        Panel panel = new Panel(); // #1
        label = new Label();
        txtField = new TextField(20);
        txtField.addKeyListener(new MyKeyListener());  
        add(label, BorderLayout.NORTH);
        panel.add(txtField, BorderLayout.CENTER);   //#2
        add(panel,BorderLayout.CENTER);  //#3
        //add(txtField,BorderLayout.CENTER);
        /*
        we can directly add the txtField without adding
        it to the panel(removing #1,#2,#3)
         */

         //for closing the window by clicking on the  cross
         addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
         });
         setSize(400,400);
         setVisible(true);
    }

    //class which inherits Frame class and implements KeyListener interface
    public class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent ke){
            char i = ke.getKeyChar();
            String str = Character.toString(i);
            label.setText(str);
        }
    }
    
}
