import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class TimerClock extends JFrame {

  public TimerClock() {
    super("Clock using Timer");
    setSize(300, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    TimeLabel clock = new TimeLabel();
	getContentPane().add(clock, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    TimerClock ct = new TimerClock();
    ct.setVisible(true);
  }
}

class TimeLabel extends JLabel implements ActionListener {

  public TimeLabel() {
    super(" " + new Date());
    Timer t = new Timer(100, this);// the delay is 100 millisecond
    t.start();
  }

  public void actionPerformed(ActionEvent ae) {
    setText((new Date()).toString());
  }
}