import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener {
    Label label;

    MouseEventExample(){
        label = new Label();
        label.setBounds(20,50,100,20);
        add(label);

        addMouseListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e){
        label.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        label.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        label.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        label.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        label.setText("Mouse Released");
        label.setBackground(Color.cyan);
    }
    public static void main(String[] args){
        MouseEventExample obj = new MouseEventExample();
    }
}
