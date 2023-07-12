import java.awt.*;
import java.awt.event.*;

public class GraphicsDemoAwt extends Frame {
	 
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		Font currentFont = new Font("Arial",Font.ITALIC, 30);
		g.setFont(currentFont);
		g.setColor(Color.CYAN);
		g.drawString("Hello Java  Programming!!", 40, 100);
		g.setColor(Color.BLACK);
		g.drawLine(100, 150, 300, 150);
	}
	
	
	public GraphicsDemoAwt(){
		super ("Graphics!");
		setSize(450,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args){
		GraphicsDemoAwt  d = new GraphicsDemoAwt();
		
	}
}
