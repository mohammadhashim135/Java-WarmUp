import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
1. Write a Java program to implement a simple calculator.
*/

public class Calculator extends Applet implements ActionListener
{
    TextField t1, t2, tResult;
    Button add, sub, mul, div;

    public void init()
    {
        setLayout(new FlowLayout());

        t1 = new TextField(5);
        t2 = new TextField(5);
        tResult = new TextField(10);
        tResult.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(new Label("Num 1:"));
        add(t1);
        add(new Label("Num 2:"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new Label("Result:"));
        add(tResult);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == add)
                result = n1 + n2;
            else if (e.getSource() == sub)
                result = n1 - n2;
            else if (e.getSource() == mul)
                result = n1 * n2;
            else if (e.getSource() == div)
            {
                if (n2 == 0)
                {
                    tResult.setText("Divide by zero!");
                    return;
                }
                result = n1 / n2;
            }

            tResult.setText(String.valueOf(result));
        }
        catch (NumberFormatException ex)
        {
            tResult.setText("Invalid input");
        }
    }
}
