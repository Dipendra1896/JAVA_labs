import java.awt.*;
import javax.swing.*;

public class DrawPanelDemo extends JFrame{
	
	public DrawPanelDemo(){
	
		setSize(200,200);
		Container c= getContentPane();
		Drawpanel p= new Drawpanel();
		c.add(p);
	}
	
	public static void main(String args[]){
		
		DrawPanelDemo t= new DrawPanelDemo();
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class Drawpanel extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Graphics Programming",20,20);
	}
}