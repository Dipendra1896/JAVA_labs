import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame implements TextListener {
    //Declaration
    private TextArea ta1;
    private TextArea ta2;
    private LayoutManager Layout;

    public TextAreaDemo(){
        //Instantiation
        ta1 = new TextArea(2,40);
        ta2 = new TextArea(2,40);
        Layout = new FlowLayout();

        //Configuration
        ta1.addTextListener(this);
        ta2.setEditable(false);

        //location
        setLayout(Layout);
        add(ta1);
        add(ta2);

        //Decoration
        setBackground(Color.yellow);
        ta1.setBackground(Color.green);
        ta1.setText("Enter text in this area and watch");
    }

    public void textValueChanged(TextEvent e){
        String Entry;
        Entry = ta1.getText();
        ta2.setText(Entry);
    }
    public static void main(String[] args) {
        TextAreaDemo t = new TextAreaDemo();
        t.setVisible(true);
        t.setSize(500,200);
    }
    
}
