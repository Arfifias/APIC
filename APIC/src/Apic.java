import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Apic extends JFrame implements ActionListener {
    JButton apic;
    JLabel text;
    JPanel app;
    /*
    *Declaring components
    * In all programming languages,the declaration of variables,components etc...is one of the most important steps to not forget
     */
    Apic(){
        ImageIcon icon = new ImageIcon("images\\APIC.png");//App icon the user can spot it in every frame and almost every single button

        apic = new JButton("APIC");
        apic.setBounds(370,700,250,100);
        apic.setFont(new Font("Flaky",Font.PLAIN,20));
        apic.setBackground(new Color(20,20,100));
        apic.setForeground(new Color(240,230,255));
        apic.setFocusable(false);
        apic.setIcon(icon);
        apic.addActionListener(this);

        text = new JLabel("Welcome to APIC");
        text.setFont(new Font("Flaky",Font.PLAIN,30));
        text.setForeground(new Color(240,230,255));


        app = new JPanel();
        app.setBounds(0,0,1000,70);
        app.setBackground((new Color(20,20,100)));
        app.add(text);

        /*
        *Bellow somebody can see the default format of the application
        * Took many hours to think of the design like 100+ and after some failed attempts I found what I was looking for
        * The format had to match the logo of the application
        * That's why it took me some so long I couldn't decide
         */


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Apic");
        this.getContentPane().setBackground(new Color(30,78,150));
        this.setSize(new Dimension(1000,1000));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setLayout(null);
        this.add(apic);
        this.add(app);
        this.setLocation(500,10);
        this.setVisible(true);
    }

    /*
     * Here you can enter the application
     * This specific class consists of one button
     * This application as an example of the high importance of GUI applications
     * In every desktop in the menu bar everything is a GUI app
     * In this application object-oriented programming was used as almost every single tool in java is an object
     * Instead of actionPerformed method in some classes lambdas were used just to save time and of course make less line of code
     * Less lines of code in brief time is the most effective way
     * But keep in mind object-oriented programming is not always the best solution,depends on what language the developer uses
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == apic){
            new Login();//Transfer to other class
            this.dispose();//Closes the window
        }
    }
}
