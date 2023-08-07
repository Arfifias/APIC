import javax.swing.*;
import java.awt.*;

public class Welcome extends JFrame {

    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JPanel container;
    public JLabel welcome;

    Welcome(){

        ImageIcon icon = new ImageIcon("images\\APIC.png");//APIC logo

        button1 = new JButton("Emojis");
        button1.setBounds(170,300,250,100);
        button1.setFont(new Font("Flaky",Font.PLAIN,20));
        button1.setBackground(new Color(20,20,100));
        button1.setForeground(new Color(240,230,255));
        button1.setFocusable(false);
        button1.setIcon(icon);
        button1.addActionListener(e -> new Emojis());
        button1.addActionListener(e -> this.dispose());

        button2 = new JButton("Pictures");
        button2.setBounds(570,300,250,100);
        button2.setFont(new Font("Flaky",Font.PLAIN,20));
        button2.setBackground(new Color(20,20,100));
        button2.setForeground(new Color(240,230,255));
        button2.setFocusable(false);
        button2.setIcon(icon);
        button2.addActionListener(e -> new Pictures());
        button2.addActionListener(e -> this.dispose());

        button3 = new JButton("Quotes");
        button3.setBounds(170,600,250,100);
        button3.setFont(new Font("Flaky",Font.PLAIN,20));
        button3.setBackground(new Color(20,20,100));
        button3.setForeground(new Color(240,230,255));
        button3.setFocusable(false);
        button3.setIcon(icon);
        button3.addActionListener(e -> new Quotes());
        button3.addActionListener(e -> this.dispose());

        button4 = new JButton("Back");
        button4.setBounds(570,600,250,100);
        button4.setFont(new Font("Flaky",Font.PLAIN,20));
        button4.setBackground(new Color(20,20,100));
        button4.setForeground(new Color(240,230,255));
        button4.setFocusable(false);
        button4.setIcon(icon);
        button4.addActionListener(e -> new Login());
        button4.addActionListener(e -> this.dispose());


        welcome = new JLabel("APIC");
        welcome.setFont(new Font("Flaky",Font.PLAIN,40));
        welcome.setForeground(new Color(240,230,255));

        container = new JPanel();
        container.setBounds(0,0,1000,70);
        container.setBackground((new Color(20,20,100)));
        container.add(welcome);

        /*
        *Here is the menu of the app
        * It includes four buttons that can send the user to either funny emojis,images generated by AI or quotes
        * I don't like using AI because it has not been perfected
        * Instead I utilized it as a tool.
        * I think the best class is the pictures where I put two buttons which enable and disable the pictures
         */


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("APIC");
        this.getContentPane().setBackground(new Color(30,78,150));
        this.setSize(new Dimension(1000,1000));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setLocation(500,10);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(container);
        this.setLayout(null);
        this.setVisible(true);
    }
}
