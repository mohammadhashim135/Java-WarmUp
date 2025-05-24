import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
2. Write an applet to test username and password.
*/

public class LoginTest extends Applet implements ActionListener
{
    TextField tfUser, tfPass;
    Button btnLogin;
    Label lblResult;

    public void init()
    {
        setLayout(new FlowLayout());

        add(new Label("Username:"));
        tfUser = new TextField(15);
        add(tfUser);

        add(new Label("Password:"));
        tfPass = new TextField(15);
        tfPass.setEchoChar('*');
        add(tfPass);

        btnLogin = new Button("Login");
        add(btnLogin);

        lblResult = new Label("");
        add(lblResult);

        btnLogin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String user = tfUser.getText();
        String pass = tfPass.getText();

        if (user.equals("admin") && pass.equals("1234"))
            lblResult.setText("Login Successful!");
        else
            lblResult.setText("Invalid Username or Password");
    }
}
