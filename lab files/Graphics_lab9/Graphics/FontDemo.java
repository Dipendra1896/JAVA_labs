import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FontDemo extends JFrame {
   // set window's title bar and dimensions
public FontDemo()
   {
      super( "Font Demo" );
      setSize( 400, 100 );
      setVisible( true );
   }
   // display Strings in different fonts and colors
public void paint( Graphics g )
   {
      // call superclass's paint method
      super.paint( g );
	  
	 // dispaly text in red color
	 g.setColor( Color.red );
     g.setFont( new Font( "Courier New", Font.BOLD, 12 ) );
     g.drawString( "Courier New 12 point bold.", 20, 50 );
     
	// dispaly text in bluecolor
	 g.setColor( Color.blue );
     g.setFont( new Font( "Lucida Console", Font.BOLD + Font.ITALIC, 15 ) );
     g.drawString( "Lucida Console 15 point bold italic.", 20, 80 );
   }
   // execute application
public static void main( String args[] )
   {
      FontDemo fd = new FontDemo();
      fd.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
} 
