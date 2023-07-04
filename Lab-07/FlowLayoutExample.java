import java.awt.*;
import java.awt.event.*;
public class FlowLayoutExample extends Frame {
    //  Constructor
    public FlowLayoutExample(String title){
        //It creates the Frame by calling the constructor of Frame class.
        super(title);
        //Setting up Flow Layout
        setLayout(new FlowLayout());

        //Creating a button and adding it to the frame
        Button b1 = new Button("Button:1");
        add(b1);
        //Adding other components to the Frame
        Button b2 = new Button("Button:2");
        add(b2);
        Button b3 = new Button("Button:3");
        add(b3);
        Button b4 = new Button("Button:4");
        add(b4);
        Button b5 = new Button("Button:5");
        add(b5);
        Button b6 = new Button("Button:6");
        add(b6);
        Button b7 = new Button("Button:7");
        add(b7);
        Button b8 = new Button("Button:8");
        add(b8);


          addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application

        }
    });
    }
    public static void main(String[] args) {
        // Enter Your Code Here
        FlowLayoutExample screen = new FlowLayoutExample("Flow Layout Example");
        screen.setSize(400,150);
        screen.setVisible(true);
    }
    
}
