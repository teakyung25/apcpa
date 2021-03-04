import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.*;

public class App extends JFrame {

    // Inheritance - use existing functionality, and add more - is a relationship 

    // Composition - use many objects together

    private JPanel panel;
    private JLabel text;
    private JButton button;

    public static void main(String[] args) throws Exception {

        ArrayList<String> food = new ArrayList<String>();

        food.add("apple");
        food.add("pear");
        food.add("cheese");

        for(String f : food) {
            System.out.println(f);
        }

        food.forEach((f) -> System.out.println(f));

        // foo(1);
        // public static int foo(int... args) {
        //     args[0];
        // }

        EventQueue.invokeLater(() -> {
            App app = new App();
            app.setVisible(true);
        });
    }

    public App() {
        setTitle("Example App");
        setSize(1000,800);
        //center the window on screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        text = new JLabel("0", SwingConstants.CENTER);
        text.setFont(new Font("Serif",Font.BOLD, 20));
        text.setBounds(0,20,getBounds().width,100);
        panel.add(text);

        button = new JButton("Click Me");
        button.setBounds(getBounds().width/2 -100,100,200,40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Integer.toString(Integer.valueOf(text.getText())+1));
            }
        });
        panel.add(button);
    }


}
