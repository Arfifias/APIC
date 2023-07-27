import javax.swing.*;
import java.awt.*;

public class Quotes extends JFrame {

    JButton quotes;
    JButton back;
    JLabel quote;
    JPanel pane;

    Quotes() {
        ImageIcon icon = new ImageIcon("images\\APIC.png");//APIC logo

        quotes = new JButton("Quotes");
        quotes.setBounds(120, 500, 250, 100);
        quotes.setFont(new Font("Flaky", Font.PLAIN, 20));
        quotes.setIcon(icon);
        quotes.setBackground(new Color(20, 20, 100));
        quotes.setForeground(new Color(240, 230, 255));
        quotes.setFocusable(false);
        quotes.addActionListener(e ->System.out.println("Albert Einstein:" + "Life is like a bicycle....To keep balance you must keep moving"));
        quotes.addActionListener(e -> System.out.println("Les Paul:" + "Don't say you can't until you prove you can't"));
        quotes.addActionListener(e -> System.out.println("Frank Zappa:" + "A mind is like a parachute....it doesn't work if it's not open"));

        /*
        *In this class the user just presses the button Quotes and after that the class make them appear in the console
        * I selected some which have a serious meaning
         */

        back = new JButton("Back");
        back.setBounds(600, 500, 250, 100);
        back.setFont(new Font("Flaky", Font.PLAIN, 20));
        back.setIcon(icon);
        back.setBackground(new Color(20, 20, 100));
        back.setForeground(new Color(240, 230, 255));
        back.setFocusable(false);
        back.addActionListener(e -> new Welcome());
        back.addActionListener(e -> this.dispose());

        quote = new JLabel("Quotes");
        quote.setFont(new Font("Flaky", Font.PLAIN, 40));
        quote.setForeground(new Color(240, 230, 255));

        pane = new JPanel();
        pane.setBounds(0, 0, 1000, 70);
        pane.setBackground((new Color(20, 20, 100)));
        pane.add(quote);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("APIC");
        this.getContentPane().setBackground(new Color(30, 78, 150));
        this.setSize(new Dimension(1000, 1000));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.add(pane);
        this.add(back);
        this.add(quotes);
        this.setLayout(null);
        this.setVisible(true);
    }

}
