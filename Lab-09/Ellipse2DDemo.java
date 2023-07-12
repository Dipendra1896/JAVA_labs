import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Ellipse2DDemo extends JFrame{
  
  public Ellipse2DDemo () {
	setSize(250,250);
	setTitle("Eclipse 2D Demo");
	Container c = getContentPane();
	Drawpanel p = new Drawpanel();
	c.add(p);
  }
  
  public static void main(String args[]){
	Ellipse2DDemo ed = new Ellipse2DDemo();
	ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ed.setVisible(true);
  }
}

class Drawpanel extends JPanel{	
	
  public void paintComponent (Graphics g) {
    Graphics2D g2= (Graphics2D) g;
    g2.setStroke(new BasicStroke(10.5f));
	
	g2.setPaint(Color.cyan);
	Rectangle2D r = new Rectangle2D.Double(40.5,40.5,150.5,150.5);
	g2.draw(r);
	g2.setPaint(Color.red);
	g2.fill(r);
	
	g2.setPaint(Color.blue);
	Ellipse2D e1 = new Ellipse2D.Double();
	e1.setFrame(r);
	g2.draw(e1);
	
	g2.setPaint(Color.green);	
	g2.setStroke(new BasicStroke(2.5f));
	Ellipse2D e2 = new Ellipse2D.Float (40,50,150,50);
	g2.draw(e2);
  }
}