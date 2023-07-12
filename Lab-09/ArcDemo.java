import java.awt.*;
import java.awt.event.*;
class ArcDemo extends Frame
{
	public ArcDemo()
	{
		super(" Arc Demo ");	
        
         //Exit the window
            addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application

        }
    });
	}

	public void paint(Graphics g)
	{
		g.setColor( Color.red );  
		//drawArc(int x, int y, int width, 
		//         int height, int startAngle, int arcAngle)
		// clockwise  i.e. negative angle
		g.drawArc(150, 120, 100, 100, 0, -170);
		
		g.setColor( Color.cyan );  
		// anti-clockwise i.e. positive angle
		g.fillArc(30, 65, 100, 100, 0, 90);
	}

	public static void main(String[] args)
	{
		ArcDemo d = new ArcDemo();
		d.setSize(400, 250);
		d.setVisible(true);
	}

}