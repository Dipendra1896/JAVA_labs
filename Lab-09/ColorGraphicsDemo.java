import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorGraphicsDemo extends JFrame {

Color c;
   // constructor sets window's title bar string and dimensions
public ColorGraphicsDemo()
   {
      super( "Using colors" );
      setSize( 400, 150 );
      setVisible( true );
	  c =  new Color( 0, 0, 255 );
   }
   // draw rectangles and Strings in different colors
public void paint( Graphics g )
   {
      // call superclass's paint method
      super.paint( g );
	 // set drawing color using floats
      g.setColor( new Color( 255, 0, 0 ) );
      g.fillRect( 20, 50, 50, 30 );
	  g.setColor( c );
      g.drawString( "Current RGB: " + g.getColor(), 80, 65 );
   }
   // execute application
public static void main( String args[] )
   {
      ColorGraphicsDemo application = new ColorGraphicsDemo();
      application.setDefaultCloseOperation( 
         JFrame.EXIT_ON_CLOSE );
   }
} // end class ColorGraphicsDemo