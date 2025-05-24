/*

Develop an applet which scrolls a message “Java Programming”, horizontally from left to right across 
the applet window. Set the background and foreground colors of the banner to cyan and red 
respectively. Also, in the status window display a message “this is the status window”. Modify the 
banner applet such that the message to be scrolled is read from the user. 

*/


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ScrollBanner" width=500 height=100>
    <param name="msg" value="Java Programming">
</applet>
*/

public class Starts extends Applet implements Runnable, ActionListener
{
    String msg = "";
    int x = 0;
    Thread t;
    boolean stopFlag;
    TextField input;

    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        input = new TextField(30);
        add(input);
        input.addActionListener(this);

        msg = getParameter("msg");
        if (msg == null)
        {
            msg = "Java Programming";
        }

        showStatus("this is the status window");
    }

    public void start()
    {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run()
    {
        while (true)
        {
            repaint();
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
            }
            x += 10;
            if (x > getWidth())
            {
                x = -msg.length() * 10;
            }
            if (stopFlag)
            {
                break;
            }
        }
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, x, 60);
    }

    public void stop()
    {
        stopFlag = true;
        t = null;
    }

    public void actionPerformed(ActionEvent e)
    {
        msg = input.getText();
        x = 0;
    }
}
