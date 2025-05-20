import java.applet.*;
import java.awt.*;

public class Applets extends Applet
{
    public void init()
    {
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        g.drawRect(20, 20, 100, 50);         // Rectangle
        g.drawLine(150, 20, 250, 70);             // Line
        g.drawRect(20, 90, 60, 60);          // Square
        g.drawOval(100, 90, 60, 60);         // Circle
        g.drawOval(180, 90, 100, 50);        // Oval
    }
}

/*

<html>
  <body>
    <applet code="Applets.class" width="700" height="600"></applet>
  </body>
</html>

*/