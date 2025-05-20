import javax.swing.*;
import java.awt.*;

public class Swings extends JPanel
{
    public Swings()
    {
        setBackground(Color.white);
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(20, 20, 150, 80);

        g.setColor(Color.RED);
        g.drawLine(180, 20, 320, 90);

        g.setColor(Color.GREEN);
        g.fillRect(20, 110, 100, 100);

        g.setColor(Color.MAGENTA);
        g.fillOval(140, 110, 100, 100);

        g.setColor(Color.ORANGE);
        g.fillOval(260, 110, 150, 80);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Swing Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        frame.add(new Swings());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
