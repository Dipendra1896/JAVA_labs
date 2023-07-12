import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RepaintDemo extends Frame implements ActionListener {
	JTextField t;
	JButton b;
	String s= "Repaint Demo";
	int x=100 ,y=80;	
	public void RepaintDemo(){	
			
		t = new JTextField(22);
		t.setBackground(Color.cyan);
		b = new JButton("Display");
		
		//setLayout(new FlowLayout());
		add(t);
		add(b);
		b.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		if(cmd.equals("Display")){
			s=t.getText();
			y=y+20;
		}
		//repaint();//to call the update method
	}
	
	public void paint(Graphics g){
		g.drawString(s,x,y);
	}
	
	public static void main(String[] args){
		RepaintDemo  d = new RepaintDemo();
		
		d.setSize(300,200);
		d.setVisible(true);
		
	}
} 