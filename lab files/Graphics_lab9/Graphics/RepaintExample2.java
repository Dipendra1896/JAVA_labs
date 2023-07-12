import java.awt.*;
import java.awt.event.*;

public class RepaintExample2 extends Frame implements ActionListener {
    private int x = 10;
    private int y = 100;

    public RepaintExample2() {
        setTitle("Repaint Example");
     
        setLayout(null); // Disable layout manager
        Button startButton = new Button("MOve Rect");
        startButton.addActionListener(this);
        startButton.setBounds(150, 40, 100, 30); // Set button position and size
        add(startButton);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRoundRect(x, y, 80, 50,60,30);
    }

    public void actionPerformed(ActionEvent e) {
		x += 10;
		repaint();        
    }
	
  public static void main(String[] args) {
        RepaintExample2 frm = new RepaintExample2();
        frm.setSize(400, 200);
        frm.setVisible(true);
    }
}
