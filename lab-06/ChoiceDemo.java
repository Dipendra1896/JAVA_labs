import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements ItemListener{
    private LayoutManager Layout;
    private Choice Selector;
    private Font SanSerif;
    public ChoiceDemo(){
        String[] ColorList;
        int i;
        ColorList = new String[9];
        SanSerif = new Font ("SanSerif", Font.BOLD,14);
        Layout = new FlowLayout();
        Selector  = new Choice();
        ColorList [0] = "Red";
        ColorList [1] = "Blue";
        ColorList [2] = "Green";
        ColorList [3] = "White";
        ColorList [4] = "Black";
        ColorList [5] = "Magenta";
        ColorList [6] = "Cyan";
        ColorList [7] = "Yellow";
        ColorList [8] = "Gray";
        for(i = 0;i<ColorList.length;++i){
            Selector.insert(ColorList [i],i);
        }
        Selector.setBackground(Color.yellow);
        Selector.setFont(SanSerif);
        setLayout(Layout);
        add(Selector);
        Selector.addItemListener (this);
        Selector.select(5);
        setBackground(Color.yellow);
    }
    public void itemStateChanged(ItemEvent e){
        int Selection;
        Selection = Selector.getSelectedIndex();
        if(Selection ==0){
            setBackground(Color.red);
        }
        else if (Selection ==1){
            setBackground(Color.blue);
        }
         else if (Selection ==2){
            setBackground(Color.green);
        }
         else if (Selection ==3){
            setBackground(Color.white);
        }
         else if (Selection ==4){
            setBackground(Color.black);
        }
         else if (Selection ==5){
            setBackground(Color.magenta);
        }
         else if (Selection ==6){
            setBackground(Color.cyan);
        }
         else if (Selection ==7){
            setBackground(Color.yellow);
        }
         else if (Selection ==8){
            setBackground(Color.gray);
        }

    }
    public static void main(String[] args) {
        ChoiceDemo cd = new ChoiceDemo();
        cd.setVisible (true);
        cd.setSize(300,300);
        
    }

}