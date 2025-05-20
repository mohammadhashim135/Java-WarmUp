import java.applet.*;
import java.awt.*;

public class Smiley extends Applet
{
    public void init()
    {
        setBackground(Color.CYAN); // Sky blue background
    }

    public void paint(Graphics g)
    {
        // Face
        g.setColor(Color.YELLOW);
        g.drawOval(80, 70, 150, 150);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        // Smile
        g.setColor(Color.RED);
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}



/*

<html>
  <body>
    <applet code="Smiley.class" width="300" height="300"></applet>
  </body>
</html>

*/