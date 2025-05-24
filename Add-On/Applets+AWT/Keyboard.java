import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
3. Write a Java program to demonstrate the keyboard event handlers.
*/

public class Keyboard extends Applet implements KeyListener
{
    String msg = "";
    int x = 20, y = 40;

    public void init()
    {
        addKeyListener(this);
        setBackground(Color.pink);
        requestFocus();
    }

    public void keyPressed(KeyEvent e)
    {
        msg = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e)
    {
        msg = "Key Released: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e)
    {
        msg = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, x, y);
    }
}
