import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {


    public JButton button;
    public JLabel label;
    public JPanel panel;
    public JTextField field;
    public JPasswordField field2;

    Login(){
        ImageIcon icon = new ImageIcon("images\\APIC.png");//APIC icon

        button = new JButton("Log in");
        button.setBounds(370,700,250,100);
        button.setFont(new Font("Flaky",Font.PLAIN,20));
        button.setBackground(new Color(20,20,100));
        button.setForeground(new Color(240,230,255));
        button.setFocusable(false);
        button.setIcon(icon);
        button.addActionListener(e -> System.out.println("Welcome " + field.getText()));
        button.addActionListener(e -> System.out.println("Your password:" + field2.getText()));
        button.addActionListener(e -> new Welcome());
        button.addActionListener(e -> this.dispose());

        /*
        *The arrows above are lambdas
        * they can be used instead of implementing an interface in the top of the class
        * Everything else is just customization of the app
         */

        label= new JLabel("Login");
        label.setFont(new Font("Flaky",Font.PLAIN,40));
        label.setForeground(new Color(240,230,255));

        panel = new JPanel();
        panel.setBounds(0,0,1000,70);
        panel.setBackground((new Color(20,20,100)));
        panel.add(label);


        field = new JTextField("Username");
        field.setFont(new Font("Flaky",Font.PLAIN,35));
        field.setBounds(320,250,350,100);
        field.setBackground((new Color(20,20,100)));
        field.setCaretColor(new Color(240,230,255));
        field.setForeground(new Color(240,230,255));
        field.setEnabled(true);

        field2 = new JPasswordField("Password");
        field2.setFont(new Font("Flaky",Font.PLAIN,35));
        field2.setBounds(320,500,350,100);
        field2.setBackground((new Color(20,20,100)));
        field2.setCaretColor(new Color(240,230,255));
        field2.setForeground(new Color(240,230,255));
        field2.setEnabled(true);

        /*
        *From line 44 to 58, both fields are important components
        * We can enter the username and the password in these boxes
        * I am still learning swing,so the personal details can be seen in the console
         */


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("APIC");
        this.getContentPane().setBackground(new Color(30,78,150));
        this.setSize(new Dimension(1000,1000));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setLayout(null);
        this.add(button);
        this.add(panel);
        this.add(field);
        this.add(field2);
        this.setLocation(500,10);
        this.setVisible(true);
    }
}
