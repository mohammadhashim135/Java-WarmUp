import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
1. Write Java programs to demonstrate the usage of following AWT controls:
i. Buttons, Check Boxes,
ii. Checkbox Group,
iii. Combo Boxes,
iv. Radio Buttons,
v. Lists, Text Field,
vi. Text Area,
vii. Tabbed Panes,
viii. Scroll Panes.
*/

public class AWT extends Applet implements ActionListener, ItemListener
{
    Button b;
    Checkbox c1, c2;
    CheckboxGroup cg;
    Choice ch;
    List l;
    TextField tf;
    TextArea ta;
    Panel tabPanel;
    ScrollPane sp;

    public void init()
    {
        setLayout(new GridLayout(4, 2));
        setBackground(Color.lightGray);

        b = new Button("Click Me");
        add(b);
        b.addActionListener(this);

        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        add(c1);
        add(c2);
        c1.addItemListener(this);
        c2.addItemListener(this);

        cg = new CheckboxGroup();
        Checkbox r1 = new Checkbox("Male", cg, false);
        Checkbox r2 = new Checkbox("Female", cg, false);
        add(r1);
        add(r2);
        r1.addItemListener(this);
        r2.addItemListener(this);

        ch = new Choice();
        ch.add("C");
        ch.add("C++");
        ch.add("Java");
        ch.add("Python");
        add(ch);
        ch.addItemListener(this);

        l = new List(3, false);
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Yellow");
        add(l);
        l.addItemListener(this);

        tf = new TextField("Enter Text", 15);
        add(tf);
        tf.addActionListener(this);

        ta = new TextArea("This is a TextArea", 4, 20);
        add(ta);

        Panel inner = new Panel();
        inner.setLayout(new GridLayout(2, 1));
        inner.add(new Label("This simulates a Tabbed Pane"));
        inner.add(new Label("Use CardLayout for true tab behavior"));

        sp = new ScrollPane();
        sp.add(inner);
        add(sp);
    }

    public void actionPerformed(ActionEvent e)
    {
        showStatus("Action: " + e.getActionCommand());
    }

    public void itemStateChanged(ItemEvent e)
    {
        showStatus("Selected: " + e.getItem());
    }
}
