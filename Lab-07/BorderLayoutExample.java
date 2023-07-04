import java.awt.*;
public class BorderLayoutExample extends Frame {
    public BorderLayoutExample(String title){
        super(title);
        add("North",new Button("North"));
        add("South",new Button("South"));
        add("East",new Button("East"));
        add("West",new Button("West"));
        add("Certer",new Button("Center"));
    }
    
    
}
