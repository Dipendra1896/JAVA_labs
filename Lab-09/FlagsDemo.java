import java.awt.*;
class FlagsDemo extends Frame
{
	public FlagsDemo(){
		super("FlagDemo ");
		setSize(150, 200);
		setVisible(true);
	}
	
	int x[]={10,80,30,80,10};
	int y[]={40,90,90,150,150};	

	public void paint(Graphics g){		
		//draw the body with red
		g.setColor(Color.red);
		g.fillPolygon(x,y,5);		
		//draw the border
		g.setColor(Color.blue);
		g.drawPolygon(x,y,5);		
		g.setColor(Color.white);
		//draw the sun
		g.fillOval(20,115,20,20);
		//draw the moon
		g.drawArc(20,60,20,20,0,-180);
		//draw the pole
		g.setColor(Color.green);		
		g.drawLine(10,150,10,190);
		
	}

	public static void main(String[] args){
		new FlagDemo();
	}
}