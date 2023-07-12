import java.awt.*;
import java.awt.event.*;
class ManyShapesDemo extends Frame
{
	public ManyShapesDemo(){
		super("Drawing Shapes ");

           //Exit the window
            addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application

        }
    });


	}

	public void paint(Graphics g){
		g.setColor(Color.RED);
		//line
		g.drawLine(10, 70, 70, 100);
		
		// PolyLine
		int[] XArray = {70, 160, 120, 160, 20};
		int[] YArray = {120, 130, 150, 160, 160};
		g.drawPolyline (XArray, YArray, 5);
    
		g.setColor(Color.BLUE);
		//rectangle
		g.drawRect(290, 60, 60, 70);
		g.fillRect(130, 60, 40, 50);
		g.fillRoundRect(220, 60, 50, 50, 20, 60);

		//ellipses and circles
		g.setColor(Color.MAGENTA);
		g.drawOval(180, 150, 30, 30);
		g.fillOval(220, 150, 30, 40);
	}

	public static void main(String[] args){
		ManyShapesDemo l = new ManyShapesDemo();
		l.setSize(400, 200);
		l.setVisible(true);
	}
}