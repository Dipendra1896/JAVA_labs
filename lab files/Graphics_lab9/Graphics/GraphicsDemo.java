/*
1. Given below is a basic graphic program to work with lines, text and fonts. 
Now modify this program so that you can display the text inside a red rectangle.

NOTE: draw four lines to draw the rectangle, use setColor(Color c ) for coloring.
*/

import java.applet.Applet;
import java.awt.*;

public class GraphicsDemo extends Frame{

  public void paint (Graphics g) {
	Font f;

	g.drawLine (20, 30, 150, 130);
	g.setColor( Color.red);
    g.drawString ("Graphics", 20, 50);
	f = new Font ("serif", Font.PLAIN, 24);
    g.setFont (CurrentFont);
	g.drawString ("Font changed", 20, 80);
  }

}
