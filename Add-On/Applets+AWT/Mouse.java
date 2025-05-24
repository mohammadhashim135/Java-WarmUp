import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
2. Write a Java program to demonstrate the mouse event handlers.
*/

public class Mouse extends Applet implements MouseListener, MouseMotionListener
{
    String msg = "";
    int x = 0, y = 0;

    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.lightGray);
    }

    public void mouseClicked(MouseEvent e)
    {
        msg = "Mouse Clicked";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e)
    {
        msg = "Mouse Pressed";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e)
    {
        msg = "Mouse Released";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e)
    {
        msg = "Mouse Entered";
        x = 10;
        y = 20;
        repaint();
    }

    public void mouseExited(MouseEvent e)
    {
        msg = "Mouse Exited";
        x = 10;
        y = 20;
        repaint();
    }

    public void mouseDragged(MouseEvent e)
    {
        msg = "Mouse Dragged";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e)
    {
        msg = "Mouse Moved";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, x, y);
    }
}
 {
    
}
