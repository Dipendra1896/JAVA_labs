import java.awt.*;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldDemo extends Frame implements TextListener{
    private TextField input;
    private TextField echo;
     private LayoutManager Layout;

    public TextFieldDemo() {
        // Instantiation
        input = new TextField("Input", 35);
        echo = new TextField("Text entered above will appear here.", 35);

        // Decoration
        setBackground(Color.yellow);
        input.setBackground(Color.green);
        echo.setForeground(Color.blue);

        // Layout
        setLayout(new FlowLayout());
        add(input);
        add(echo);

        // Configuration
        setTitle("TextField Demo");
        setSize(300, 300);
        setResizable(false);

        // Window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        TextFieldDemo tfd = new TextFieldDemo();
    }
}
