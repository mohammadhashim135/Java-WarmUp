import java.applet.*;
import java.awt.*;

public class Polygons extends Applet
{
    int[] a = {50, 100, 150, 100};
    int[] b = {150, 100, 150, 200};

    public void init()
    {
        setBackground(Color.CYAN); 
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.drawPolygon(a, b, a.length);
        g.setColor(Color.RED);
        g.fillPolygon(a, b, a.length);
    }
}



/* 

<html>
  <body>
    <applet code="Polygons.class" width="300" height="300"></applet>
  </body>
</html>


*/