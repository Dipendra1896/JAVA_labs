import java.awt.*;
import java.awt.event.*;

public class ImageDemo extends Frame{
  Image image;
  public static void main(String[] args) {
      new ImageDemo();
  }
  public ImageDemo(){
    setTitle("Image Demo Example!");
    setSize(400,300);
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent we){
        System.exit(0);
      }
    });
    setVisible(true);
  }
  public void paint(Graphics g){
    Toolkit tool = Toolkit.getDefaultToolkit();
    image = tool.getImage("jupiter.png");
    g.drawString("Image 1: Jupiter",20,60);
    g.drawImage(image,20,65,this);
    
    image = tool.getImage("earth.jpeg");
    g.drawString("Image 2: Earth",250,60);
    g.drawImage(image,250,65,this);
  }
}
