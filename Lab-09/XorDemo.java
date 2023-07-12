import java.awt.*;
class XorDemo extends Frame
{
	public XorDemo(){
		super("XorDemo ");
		setSize(200, 250);
		setVisible(true);
		setBackground (Color.red);
	}
	
    public void paint (Graphics g) {
        g.setColor (Color.green);
        g.setXORMode (Color.blue);
        g.fillRect (10, 40, 100, 100);
        g.fillRect (10, 100, 100, 100);
        
        g.setPaintMode (); // reset to normal mode        
        g.drawLine (20, 20, 100, 200);
    }

	public static void main(String[] args){
		new XorDemo();
	}
}