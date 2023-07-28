import java.awt.*;
import java.awt.event.*;

public class TextListenerExample extends Frame implements TextListener {
    TextField txtField;
    public TextListenerExample(){
        setTitle("Example of Text Listener");
        setLayout(new FlowLayout());
        txtField = new TextField(20);
        add(txtField);
        txtField.addTextListener(this);
        setSize(400,400);
        setVisible(true);

    }

    public void textValueChanged(TextEvent e){
        setTitle(txtField.getText());
    }
    public static void main(String args[]){
        new TextListenerExample();
    }
    
}
