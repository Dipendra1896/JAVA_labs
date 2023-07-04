import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BoxLayoutBasic extends Frame{
    public BoxLayoutBasic (String title){
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));

        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application

        }
    });
    }
    public static void main(String[]args){
        BoxLayoutBasic blb = new BoxLayoutBasic("BoxLayout Basic");
        blb.setSize(300,200);
        blb.setVisible(true);
        }
    
}
