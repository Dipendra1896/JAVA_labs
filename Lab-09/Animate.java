import java.awt.*;
public class Animate extends Frame {
    static Image im[];
    static int numImages = 4;
    static int counter=0;
    Animate () {
        super ("Animate");
    }
    public static void main (String[] args) {
        Frame f = new Animate();
        f.resize (400, 400);
        f.setVisible(true);
        im = new Image[numImages];
        for (int i=0;i<numImages;i++) {
            im[i] = Toolkit.getDefaultToolkit().getImage ("clock"+i+".png");
/*
note that you must have four images in the current directory i.e. 
* clock1.png, clock2.png,clock3.png and clock4.png
*/
        }
    }
    public synchronized void paint (Graphics g) {
        g.translate (insets().left, insets().top);
        g.drawImage (im[counter], 0, 0, this);
        counter++;
        if (counter == numImages)
            counter = 0;
        repaint (200);
    }
}