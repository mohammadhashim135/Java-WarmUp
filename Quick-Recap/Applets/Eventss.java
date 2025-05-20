import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Eventss extends Applet implements ActionListener
{
	Button b1,b2;
	Label l;
	public void init()
	{
		setBackground(Color.lightGray);
		b1=new Button("Play");
		b2=new Button("Stop");
		l=new Label("Click a button");
		add(b1);
		add(b2);
		add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String c=e.getActionCommand();
		if(c.equals("Play"))
		{
			l.setText("Playing Audio...");
		}
		else if(c.equals("Stop"))
		{
			l.setText("Audio Stopped.");
		}
	}
}



/*

<html>
<body>
    <applet code="Eventss.class" width=300 height=100></applet>
</body>
</html>

*/