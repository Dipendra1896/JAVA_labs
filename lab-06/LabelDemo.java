import java.awt.*;
public class LabelDemo extends Frame {
    //Declaration 
    private LayoutManager Layout;
    private Label Label1;
    private Label Label2;
    private Label Label3;

    public LabelDemo(){
        //Installation
        Layout = new GridLayout(7,1);
        Label1 = new Label("A Simple Label");
        Label2= new Label("A Label with LEFT alignment", Label.LEFT);
        Label3 = new Label("A Label with CENTER alignment", Label.CENTER);
        // Location 
        setLayout(Layout);
        add (Label1);
        add(Label2);
        add(Label3);
        // Decoration 
        Label2.setBackground(Color.yellow);
        Label1.setForeground(Color.blue);
    }
    public static void main(String[] args){
        LabelDemo Id = new LabelDemo();
        Id.setVisible(true);
        Id.setSize(400,400);
    }
    
}
