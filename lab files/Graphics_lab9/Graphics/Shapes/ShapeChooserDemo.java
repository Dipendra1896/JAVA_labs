import java.awt.*;
import java.awt.event.*;

public class ShapeChooserDemo extends Frame implements ItemListener {
   
    Choice c1,c2;
	RectangleClass f1;
	CircleClass f2;
public ShapeChooserDemo()
   {
      super( "Shapes Chooser Demo" );
      setSize( 300, 120 );
      setVisible( true );
      
      f1= new RectangleClass();
	  f2= new CircleClass();
	  c1= new Choice();
	  c1.add("Rectangle");
	  c1.add("Circle");
	  setLayout(new FlowLayout());
	  add(c1);
	  c1.addItemListener(this);
   }
   
   public void itemStateChanged(ItemEvent e){
		
	  String s = c1.getSelectedItem();
	  if(s.equals("Rectangle")){	
		  f1.show();
		  f2.setVisible(false);
	  }
	  else if(s.equals("Circle")){		
		  f1.setVisible(false);
		  f2.show();
	  }		
    }
		
   public static void main( String args[] )
   {
      ShapeChooserDemo demo = new ShapeChooserDemo();
   }
}  

class CircleClass extends Frame{

		public CircleClass(){
			setSize(300,300);
		}
		
		public void paint(Graphics g){
		
			g.setColor(Color.green);
			g.fillArc(100,100,70,70,0,360);
		}
	}

	class RectangleClass extends Frame{

		public RectangleClass(){
			
			setSize(300,300);
		}
		public void paint(Graphics g){
		
			g.setColor(Color.blue);
			g.fillRect(60,60,150,150);
		}
}
