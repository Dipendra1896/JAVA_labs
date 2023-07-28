import java.awt.*;
import java.awt.event.*;

public class CheckPassword  extends Frame implements ActionListener{
    Button b;
    Label l1,l2;
    TextField t;
    GridLayout glay;
    CheckPassword(){
        b = new Button("OK");
        l1 = new Label("Enter Password");
        l2 = new Label();
        t = new TextField(10);
        t.setEchoChar('*');
        glay =new GridLayout(4,1);
        setSize(200,150);
        setLayout(glay);
        add(l1);
        add(t);
        add(l2);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        String psw;
        if(s.equals("OK")){
            psw = t.getText();
            if(psw.equals("BIT")){
                l2.setText("Correct Password");
                l2.setBackground(Color.cyan);
            }
            else{
                l2.setText("Incorrect Password");
                l2.setBackground(Color.red);
            }
        }
    }
    public static void main(String args[]){
        CheckPassword cp = new CheckPassword();
        cp.setVisible(true);
    }
    
}
