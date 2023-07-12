import java.awt.*;
import java.awt.event.*;
public class FontFamilyDemo extends Frame implements ActionListener {
	TextArea ta;
	Button b;	
	public FontFamilyDemo(){		
		setSize(200,250);
		ta = new TextArea(50,50);
		b = new Button("Display Fonts");
		setLayout(new BorderLayout());
		add(ta, BorderLayout.CENTER);
		add(b, BorderLayout.NORTH);
		b.addActionListener(this);	
	}	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		String[] fonts;
		if(cmd.equals("Display Fonts")){
			GraphicsEnvironment ge = 
					GraphicsEnvironment.getLocalGraphicsEnvironment();
			fonts=ge.getAvailableFontFamilyNames();
			for(int i=0; i< 10; i++)//display only 10 fonts
				ta.append(fonts[i]+"\n");
		}
	}	
	public static void main(String [] args){
		FontFamilyDemo f= new FontFamilyDemo();
		f.setVisible(true);
	}
} 