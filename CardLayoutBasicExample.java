import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutBasicExample extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1,b2,b3,b4;
    Container c;
    CardLayoutBasicExample(){
        c = getContentPane();
        card = new CardLayout(40,30);
        c.setLayout(card);
          //creating buttons 
        b1 = new JButton("Ace");
        b2 = new JButton("King");
        b3 = new JButton("Queen");
        b4 = new JButton("Jocker");
         //adding event listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
           //adding the buttons in the container
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
    }
    public void actionPerformed(ActionEvent e){
        card.next(c);
    }
    public static void main (String[] args){
        CardLayoutBasicExample cl = new CardLayoutBasicExample();
        cl.setSize(500,400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
}
