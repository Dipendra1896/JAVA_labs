import java.awt.*;
import java.awt.event.*;
public class GridLayoutBasicExample extends Frame {
    public GridLayoutBasicExample(String title){
        setLayout(new GridLayout(3,2));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));

         addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application
        }
    });
    }
    public static void main(String args[]){
        GridLayoutBasicExample gl = new GridLayoutBasicExample("GridLayout Basic Example");
        gl.setSize(300,200);
        gl.setVisible(true);
    }
    
}
