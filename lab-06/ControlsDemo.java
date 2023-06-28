import java.awt.*;

public class ControlsDemo  extends Frame{
    private Label DemoLabel;
    private Button DemoButton;
    private Scrollbar DemoSlider;
    private Checkbox DemoRadio;
    private Checkbox DemoBox;
    private TextField DemoText;
    private TextArea DemoArea;
    private Choice DemoCombo;
    private List DemoList;
    private LayoutManager Layout;
    private CheckboxGroup Group;

    public ControlsDemo(){
        DemoLabel = new Label ();
        DemoSlider = new Scrollbar();
        Group = new CheckboxGroup();
        DemoRadio =  new Checkbox("Chechbox", Group, false);
        DemoBox = new Checkbox();
        DemoButton = new Button();
        DemoText = new TextField();
        DemoList = new List(3);
        Layout = new FlowLayout();
        DemoCombo = new Choice();
        DemoArea = new TextArea ( 5,30);
        setLayout (Layout);
        add(DemoLabel);
        add(DemoButton);
        add(DemoRadio);
        add(DemoBox);
        add(DemoText);
        add(DemoList);
        add(DemoCombo);
        add(DemoArea);
        add(DemoSlider);
        
        DemoLabel.setText("Label");
        DemoSlider.setName("Scrollbar");
        DemoButton.setLabel("Button");
        DemoBox.setLabel("Checkbox");
        DemoText.setText("TextField");
        DemoCombo.addItem("Choice");
        DemoCombo.addItem("Selection");
        DemoList.add("List");
        DemoList.add("Selection");
        DemoArea.setText("TextArea");
      }
      public static void main(String[] args) {
        ControlsDemo t = new ControlsDemo();
        t.setVisible(true);
        t.setSize(300,300);
      }
    }

      

