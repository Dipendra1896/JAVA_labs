import java.awt.*;
import java.awt.event.*;
//class which inherits Frame class and implements KeyListener interface
public class KeyListenerExample extends Frame implements KeyListener {
    Label l;
    TextArea area;


    KeyListenerExample(){
        l = new Label();
        //setting the location of the label in frame
        l.setBounds(10,40,100,20);
        area = new TextArea();
        area.setBounds(10,70,300,300);

        //adding the label and text area to the frame
        add(l);
        add(area);

        //adding the KeyListener to the text area
        area.addKeyListener(this);

        //Define the size,Layout and Visibility of Frame
        setSize(500,400);
        setLayout(null); //Comment this line and default flowlayout will apply
        setVisible(true);
    }
    //overriding the keyPressed() method of KeyListener interface and set the text of the label when key is pressed
    public void keyPressed(KeyEvent e){
        l.setText("Pressed");
        l.setBackground(Color.cyan);
    }

    //overriding the keyReleased() method of KeyListener interface and the text of the label when key is released
    public void keyReleased(KeyEvent e){
        l.setText("Released");
        l.setBackground(Color.yellow);
    }
    
     //overriding the keyTyped() method of KeyListener interface and the text of the label when key is typed
    public void keyTyped(KeyEvent e){
        // l.setText("Typed");
        // l.setBackground(Color.green);
    }

    public static void main(String []args){
        new KeyListenerExample();
    }
}
