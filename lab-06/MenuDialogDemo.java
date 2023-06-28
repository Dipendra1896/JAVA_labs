import java.awt.*;
import java.awt.event.*;
public class MenuDialogDemo  extends Frame implements ActionListener{
    Dialog d;
    Menu filemenu;
    MenuItem openitem;
    MenuItem exititem;
    MenuBar mb;
    Label j;
    public MenuDialogDemo(){
        super("Testing Menu and Dialog");
        setSize(300,200);
        filemenu = new Menu("File");
        openitem = new MenuItem("Display Dialog");
        exititem = new MenuItem("Exit");
        mb = new MenuBar();
       // l = new Label();
        filemenu.add(openitem);
        filemenu.add(exititem);
        mb.add(filemenu);
        setMenuBar(mb);
        openitem.addActionListener(this);
        exititem.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("Exit")){
            System.exit(0);
        }
        else if(cmd.equals("Display Dialog")){
            d = new Dialog(this,"Testing Dialog",false);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        MenuDialogDemo t = new MenuDialogDemo();
        t.setVisible(true);
    }
    
}
