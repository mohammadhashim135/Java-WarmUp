import javax.swing.*;
import java.awt.*;

public class Smiley extends JFrame
{
    public Smiley()
    {
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new SmileyPanel());
    }

    class SmileyPanel extends JPanel
    {
        public SmileyPanel()
        {
            setBackground(Color.WHITE);
        }

        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.fillOval(100, 80, 200, 200);

            g.setColor(Color.BLACK);
            g.fillOval(150, 140, 30, 30);
            g.fillOval(220, 140, 30, 30);

            g.setColor(Color.RED);
            g.drawArc(160, 200, 80, 40, 180, 180);
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new Smiley().setVisible(true));
    }
}
