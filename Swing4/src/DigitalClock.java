import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DigitalClock {
    JLabel l1;

    DigitalClock() {
        JFrame f = new JFrame("Image Button Example");
        f.setSize(800, 400); // Increased size to fit everything
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel();
        l1.setBounds(50, 50, 700, 100);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));

        // Load and scale images
        ImageIcon icon1 = new ImageIcon("D:\\javaAssignmentGithub\\swing\\DigitalClock\\digclock.jpg");
        Image img1 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JButton b = new JButton(new ImageIcon(img1));
        b.setBounds(150, 150, 100, 100);

        ImageIcon icon2 = new ImageIcon("D:\\javaAssignmentGithub\\swing\\DigitalClock\\hourglass.jpg");
        Image img2 = icon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JButton b1 = new JButton(new ImageIcon(img2));
        b1.setBounds(500, 150, 100, 100);

        // Add action listeners
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("You have pressed digital clock!");
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("You have pressed hour glass!");
            }
        });

        // Add components
        f.add(l1);
        f.add(b);
        f.add(b1);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
