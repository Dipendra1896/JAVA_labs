import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends Frame {

public BorderLayoutExample(String title) {


    super(title);
    add("North", new Button("North"));
    add("South", new Button("South"));
    add("East", new Button("East"));
    add("West", new Button("west"));
    add("Center", new Button("Center"));

    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application

        }
    });
}

 public static void main(String[] args) {

    BorderLayoutExample ble = new BorderLayoutExample("BorderLayoutExample");
    ble.setSize(300, 200);
    ble.setVisible(true) ;
    }
}
