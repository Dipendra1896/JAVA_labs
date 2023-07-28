import java.awt.*;
import java.awt.event.*;

public class FocusListenerExample extends Frame implements FocusListener {
    Button b1,b2;
    Label l1,l2;

    public FocusListenerExample(){
        add(b1 = new Button("First"),"North");
        add(b2 = new Button("Second"),"South");
        add(l1 = new Label("See Focus Gained Message"),"East");
        add(l2 = new Label("See Focus Lost Message"),"West");
        b1.addFocusListener(this);
        b2.addFocusListener(this);
        setSize(400,300);
    }

    public void focusGained(FocusEvent fEvnt){
        if(fEvnt.getSource()==b1)
        l1.setText(b1.getLabel()+" Start");
        if(fEvnt.getSource()==b2)
        l1.setText(b2.getLabel()+" Start");
        if(fEvnt.isTemporary())
        l1.setText("Temporary Focus");
    }
     public void focusLost(FocusEvent fEvnt){
        if(fEvnt.getSource()==b1)          
        l2.setText(b1.getLabel()+" Ended");    
        if(fEvnt.getSource()==b2)             
        l2.setText(b2.getLabel()+" Ended");
     }
     public static void main(String args[]){
        new FocusListenerExample().setVisible(true);
     }
    
}
