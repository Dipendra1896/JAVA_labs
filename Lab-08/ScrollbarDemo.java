import java.awt.*;
import java.awt.event.*;

public class ScrollbarDemo extends Frame implements AdjustmentListener {
    Scrollbar sb1,sb2;
    TextField tf;
    Label l;
    public ScrollbarDemo(){
        sb1 = new Scrollbar(Scrollbar.VERTICAL,0,0,1,500);
        sb2 = new Scrollbar(Scrollbar.HORIZONTAL,0,0,1,500);
        tf = new TextField(10);
        l = new Label("Sum");
        setLayout(new FlowLayout());
        add(sb1);
        add(sb2);
        add(l);
        add(tf);

        setSize(300,150);
        sb1.addAdjustmentListener(this);
        sb2.addAdjustmentListener(this);

    }

    public void adjustmentValueChanged(AdjustmentEvent e){
        int a = sb1.getValue();
        int b =sb2.getValue();
        int sum;
        sum=a+b;
        tf.setText(""+sum+"");
    
    }

    public static void main(String args[]){
        ScrollbarDemo sd = new ScrollbarDemo();
        sd.setVisible(true);
    }
    
}
