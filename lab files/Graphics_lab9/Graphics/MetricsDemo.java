import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MetricsDemo extends JFrame {
   // set window's title bar String and dimensions
public MetricsDemo()
   {
      super( "Metrics Demo" );
      
      setSize( 470, 160 );
      setVisible( true );
   }
   // display font metrics
 public void paint( Graphics g )
   {
      // call superclass's paint method
      super.paint( g );	  
      Font font = new Font( "Arial", Font.ITALIC + Font.BOLD, 12 );
      FontMetrics metrics = g.getFontMetrics( font );
      g.setFont( font );
	  g.setColor(Color.red);
      g.drawString( "Current font: " + font, 15, 50 );
      g.drawString( "Ascent: " + metrics.getAscent(), 15, 70 );
      g.drawString( "Descent: " + metrics.getDescent(), 15, 90);
	  g.setColor(Color.green);
      g.drawString( "Height: " + metrics.getHeight(), 15, 110 );
      g.drawString( "Leading: " + metrics.getLeading(), 15, 130);
   }
   // execute application
public static void main( String args[] )
   {
      MetricsDemo demo = new MetricsDemo();
	  demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
   }
} 
