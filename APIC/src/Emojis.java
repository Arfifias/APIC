import javax.swing.*;
import java.awt.*;

public class Emojis extends JFrame {

    public JButton smiley;
    public JButton sad;
    public JButton angry;
    public JButton wow;
    public JButton love;
    public JButton cry;
    public JButton back;
    public JLabel emojis;
    public JPanel pane;

    Emojis(){
        ImageIcon icon = new ImageIcon("images\\APIC.png");//APIC Logo
        ImageIcon  smile = new ImageIcon("images\\Emojis\\Smile.jpg");
        ImageIcon sadness = new ImageIcon("images\\Emojis\\Sad.jpg");
        ImageIcon anger = new ImageIcon("images\\Emojis\\Anger.jpg");
        ImageIcon wOw = new ImageIcon("images\\Emojis\\wow.jpg");
        ImageIcon loVe = new ImageIcon("images\\Emojis\\Love.jpg");
        ImageIcon cRy = new ImageIcon("images\\Emojis\\crying.jpg");

        /*
        * All of these icons were edited
        * In order to be put in emoji buttons and make them more interactive
        * In this class buttons were again customize to look better(they are smaller and wider)
         */

        smiley = new JButton("Smile");
        smiley.setBounds(200,300,200,70);
        smiley.setFont(new Font("Flaky",Font.PLAIN,20));
        smiley.setBackground(new Color(20,20,100));
        smiley.setForeground(new Color(240,230,255));
        smiley.setIcon(smile);
        smiley.setFocusable(false);
        smiley.addActionListener(e -> System.out.println("Smile"));

        sad = new JButton("Sad");
        sad.setBounds(400,300,200,70);
        sad.setFont(new Font("Flaky",Font.PLAIN,20));
        sad.setBackground(new Color(20,20,100));
        sad.setForeground(new Color(240,230,255));
        sad.setIcon(sadness);
        sad.setFocusable(false);
        smiley.addActionListener(e -> System.out.println("Sad"));

        angry = new JButton("Angry");
        angry.setBounds(600,300,200,70);
        angry.setFont(new Font("Flaky",Font.PLAIN,20));
        angry.setBackground(new Color(20,20,100));
        angry.setForeground(new Color(240,230,255));
        angry.setIcon(anger);
        angry.setFocusable(false);
        angry.addActionListener(e -> System.out.println("Angry"));

        wow = new JButton("Wow");
        wow.setBounds(200,600,200,70);
        wow.setFont(new Font("Flaky",Font.PLAIN,20));
        wow.setBackground(new Color(20,20,100));
        wow.setForeground(new Color(240,230,255));
        wow.setIcon(wOw);
        wow.setFocusable(false);
        wow.addActionListener(e -> System.out.println("Wow"));

        love = new JButton("Love");
        love.setBounds(400,600,200,70);
        love.setFont(new Font("Flaky",Font.PLAIN,20));
        love.setBackground(new Color(20,20,100));
        love.setForeground(new Color(240,230,255));
        love.setIcon(loVe);
        love.setFocusable(false);
        love.addActionListener(e -> System.out.println("Love"));

        cry = new JButton("Cry");
        cry.setBounds(600,600,200,70);
        cry.setFont(new Font("Flaky",Font.PLAIN,20));
        cry.setBackground(new Color(20,20,100));
        cry.setForeground(new Color(240,230,255));
        cry.setIcon(cRy);
        cry.setFocusable(false);
        cry.addActionListener(e -> System.out.println("Cry"));

        back = new JButton("Back");
        back.setBounds(370,800,250,100);
        back.setFont(new Font("Flaky",Font.PLAIN,20));
        back.setBackground(new Color(20,20,100));
        back.setForeground(new Color(240,230,255));
        back.setFocusable(false);
        back.addActionListener(e -> new Welcome());
        back.addActionListener(e -> this.dispose());

        emojis = new JLabel("Emojis");
        emojis.setFont(new Font("Flaky",Font.PLAIN,40));
        emojis.setForeground(new Color(240,230,255));

        pane = new JPanel();
        pane.setBounds(0,0,1000,70);
        pane.setBackground((new Color(20,20,100)));
        pane.add(emojis);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("APIC");
        this.getContentPane().setBackground(new Color(30,78,150));
        this.setSize(new Dimension(1000,1000));
        this.setIconImage(icon.getImage());
        this.add(smiley);
        this.add(sad);
        this.add(angry);
        this.add(wow);
        this.add(love);
        this.add(cry);
        this.add(back);
        this.add(pane);
        this.setResizable(false);
        this.setLocation(500,10);
        this.setLayout(null);
        this.setVisible(true);
    }

}
