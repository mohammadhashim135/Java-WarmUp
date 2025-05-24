import java.awt.*;
import java.awt.event.*;

/**
Write a Java program to demonstrate the usage of Menu Bar and Menus.
Use Dialog Boxes to display the Menu options selected.
*/

public class Menu extends Frame implements ActionListener
{
    MenuBar mb;
    Menu m1, m2;
    MenuItem mi1, mi2, mi3, mi4;

    public MenuDemo()
    {
        setTitle("Menu Bar Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");

        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Open");
        mi3 = new MenuItem("Cut");
        mi4 = new MenuItem("Paste");

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        m1.add(mi1);
        m1.add(mi2);
        m2.add(mi3);
        m2.add(mi4);

        mb.add(m1);
        mb.add(m2);
        setMenuBar(mb);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Dialog d = new Dialog(this, "Menu Selected", true);
        d.setLayout(new FlowLayout());
        d.setSize(200, 100);
        d.add(new Label("You selected: " + e.getActionCommand()));

        Button close = new Button("OK");
        close.addActionListener(f -> d.setVisible(false));
        d.add(close);

        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MenuDemo();
    }
}
