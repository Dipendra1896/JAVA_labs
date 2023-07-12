import java.awt.*;
import java.awt.event.*;
// Java extension packages
import javax.swing.*;
public class ShapeDemo extends JFrame {
   // set window's title bar String and dimensions
public ShapeDemo()
   {
      super( "Shapes Demo" );
      setSize( 300, 120 );
      setVisible( true );
   }
   // display various lines, rectangles and ovals
public void paint( Graphics g )
   {
     super.paint( g );     
      g.fillRoundRect( 15, 40, 80, 55, 50, 50 );
      g.setColor( Color.cyan );   
      g.fill3DRect( 100, 40, 80, 55, false );
      g.setColor( Color.red);
      g.drawOval( 195, 40, 80, 55 );
   }
      // execute application
public static void main( String args[] )
   {
      ShapeDemo demo = new ShapeDemo();
      demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
}  