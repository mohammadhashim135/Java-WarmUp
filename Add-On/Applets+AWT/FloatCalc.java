import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
3. Write an applet that obtains two floating point numbers from the user and displays the sum, product, difference and quotient of these numbers.
*/

public class FloatCalc extends Applet implements ActionListener
{
    TextField t1, t2;
    Button btnCalc;
    Label lblSum, lblProd, lblDiff, lblQuot;

    public void init()
    {
        setLayout(new FlowLayout());

        add(new Label("Number 1:"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Number 2:"));
        t2 = new TextField(10);
        add(t2);

        btnCalc = new Button("Calculate");
        add(btnCalc);

        lblSum = new Label("Sum: ");
        lblProd = new Label("Product: ");
        lblDiff = new Label("Difference: ");
        lblQuot = new Label("Quotient: ");

        add(lblSum);
        add(lblProd);
        add(lblDiff);
        add(lblQuot);

        btnCalc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            float n1 = Float.parseFloat(t1.getText());
            float n2 = Float.parseFloat(t2.getText());

            lblSum.setText("Sum: " + (n1 + n2));
            lblProd.setText("Product: " + (n1 * n2));
            lblDiff.setText("Difference: " + (n1 - n2));
            if (n2 != 0)
                lblQuot.setText("Quotient: " + (n1 / n2));
            else
                lblQuot.setText("Quotient: Divide by zero error");
        }
        catch (NumberFormatException ex)
        {
            lblSum.setText("Sum: Invalid input");
            lblProd.setText("Product: Invalid input");
            lblDiff.setText("Difference: Invalid input");
            lblQuot.setText("Quotient: Invalid input");
        }
    }
}
