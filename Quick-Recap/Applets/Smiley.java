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
        g.fillOval(50, 50, 200, 200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 20, 30); // Left eye
        g.fillOval(190, 100, 20, 30); // Right eye

        // Smile
        g.setColor(Color.RED);
        g.drawArc(100, 130, 100, 70, 0, -180);
    }
}



/*

<html>
  <body>
    <applet code="Smiley.class" width="300" height="300"></applet>
  </body>
</html>

*/