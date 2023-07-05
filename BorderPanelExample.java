import java.awt.*;
import java.awt.event.*;
public class BorderPanelExample extends Frame {
    public BorderPanelExample(String title){
        super(title);
        addComponent("North",new Button("North"));
        addComponent("South",new Button("South"));
        addComponent("East",new Button("East"));
        addComponent("West",new Button("West"));
        addComponent("Center",new Button("Center"));
         //code to Close the window
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);//Exit the Application
        }
    });        
    }
    public void addComponent(String region, Component component){
        Panel panel = new Panel();
        panel.add(component);
        add(region,panel);
    }
    public static void main(String arg[]){
        BorderPanelExample bpe = new BorderPanelExample("BorderPanelExample");
        bpe.setSize(200,150);
        bpe.setVisible(true); 
    }
}

