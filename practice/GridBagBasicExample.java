import java.awt.*;
import javax.swing.*;

public class GridBagBasicExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Adding padding

        gbc.gridx = 0;
        gbc.gridy = 0;
        p.add(new JLabel("Java"), gbc);

        gbc.gridx = 1;
        p.add(new JLabel("Programming"), gbc);

        gbc.gridx = 2;
        p.add(new JLabel("Year 1"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        p.add(new JButton("Button1"), gbc);

        gbc.gridx = 1;
        p.add(new JButton("Button2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3; // Spanning multiple columns
        p.add(new JTextField("Pokhara Gandaki"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // Resetting gridwidth
        p.add(new JTextField("2"), gbc);

        gbc.gridy = 2;
        p.add(new JTextField("3"), gbc);

        f.getContentPane().add(p);
        f.setSize(600, 200);
        f.setVisible(true);
    }
}
