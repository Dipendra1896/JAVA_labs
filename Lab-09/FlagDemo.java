import java.awt.*;
class FlagDemo extends Frame{

    public FlagDemo(){
    super("FlagDemo ");
    setSize(150, 200);
    setVisible(true) ;
}

    int x[]={10,80,30,80,16};
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
        g.setColor(Color.green) ;
        g.drawLine(10,150,10,190);

        //set the font properties
        Font font = new Font("SansSerif",Font.ITALIC,20);
        g.setFont(font);

        //set the font color to blue
        g.setColor(Color.blue);

        //display the text
        g.drawString("Nepal Flag",20,30);
        // display the font metrics
        FontMetrics fontMetrics = g.getFontMetrics();
        int ascent = fontMetrics.getAscent();
        int descent = fontMetrics.getDescent();
        int leading = fontMetrics.getLeading();
        int height = fontMetrics.getHeight();

        System.out.println("Ascent: " + ascent);
        System.out.println("Descent: " + descent);
        System.out.println("Leading: " + leading);
        System.out.println("Height: " + height);


        }

     public static void main(String[] args){
        new FlagDemo();
        

        }
}
