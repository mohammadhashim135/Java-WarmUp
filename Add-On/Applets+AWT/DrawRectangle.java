import java.awt.*;
import java.awt.event.*;

/**
Write Java program that allows the user to draw a rectangle by dragging the mouse on the application 
window. The upper-left coordinate should be the location where the user presses the mouse button, and 
the lower-right coordinate should be the location where the user releases the mouse button. Also display 
the area of the rectangle.
*/

public class DrawRectangle extends Frame implements MouseListener, MouseMotionListener
{
    int x1, y1, x2, y2;
    boolean drawing = false;

    public DrawRectangle()
    {
        setTitle("Draw Rectangle");
        setSize(600, 400);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        if (drawing)
        {
            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);
            int w = Math.abs(x2 - x1);
            int h = Math.abs(y2 - y1);
            g.setColor(Color.blue);
            g.drawRect(x, y, w, h);

            g.setColor(Color.red);
            g.drawString("Area: " + (w * h), 20, 50);
        }
    }

    public void mousePressed(MouseEvent e)
    {
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseReleased(MouseEvent e)
    {
        x2 = e.getX();
        y2 = e.getY();
        drawing = true;
        repaint();
    }

    public void mouseDragged(MouseEvent e)
    {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args)
    {
        new DrawRectangle();
    }
}
