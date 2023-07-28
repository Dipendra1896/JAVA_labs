import java.awt.*;
import java.awt.event.*;

public class CheckboxItemListenerExample implements ItemListener {
    Checkbox checkBox1,checkBox2,checkBox3;
    Label label;
    CheckboxItemListenerExample(){
        Frame f = new Frame("CheckBox ItemListener Example");
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        checkBox1 = new Checkbox("c");
        checkBox1.setBounds(100,100,50,50);
        checkBox2 = new Checkbox("web");
        checkBox2.setBounds(100,150,50,50);
        checkBox3 = new Checkbox("Java");
        checkBox3.setBounds(100,200,50,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);
        f.add(label);

        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==checkBox1){
            label.setText("C Checkbox: " +(e.getStateChange()==1?"checked":"unchecked"));
            label.setBackground(Color.cyan);
        }
         if(e.getSource()==checkBox2){
            label.setText("Web Checkbox: " +(e.getStateChange()==1?"checked":"unchecked"));
            label.setBackground(Color.red);
        }
         if(e.getSource()==checkBox3){
            label.setText("Java Checkbox: " +(e.getStateChange()==1?"checked":"unchecked"));
            label.setBackground(Color.yellow);
        }
    }

    public static void main (String args[]){
        CheckboxItemListenerExample obj = new CheckboxItemListenerExample();
    }
    
}
