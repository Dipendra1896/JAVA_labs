import java.awt.*;
import java.awt.geom.*;

public class Line2D1 extends Frame {
  private Line2D Shape1;
  private Line2D Shape2;

  public Line2D1 () {
    Shape1 = new Line2D.Float (20.F, 30.F, 150.F, 130.F);
    Shape2 = new Line2D.Double ();
    Shape2.setLine (20.F, 60.F, 120.F, 20.F);
    setVisible(true);
    setSize(200,200);
  }

  public void paint (Graphics g) {
    Graphics2D g2D;
    boolean Hit;

    g2D = (Graphics2D) g;
    
    g2D.draw (Shape1);
    g2D.draw (Shape2);
    Hit = Shape1.intersectsLine (Shape2);
    
    g2D.setColor(Color.blue);
    g2D.drawString ("intersects = " + Hit, 20, 145);
  }
  
  public static void main(String[] args){
		new Line2D1();
	}
}
