package hotel.relax;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame {
    Dashboard(){
        setBounds(0,0,1550,1000);
        setLayout(null);

        // Background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 1000);
        add(l1);

        // Heading
        JLabel l2 = new JLabel("The Hotel Relax Welcomes You");
        l2.setBounds(400, 80, 1000, 70);
        l2.setForeground(Color.white);
        l2.setFont(new Font("serif", Font.PLAIN, 70));
        l1.add(l2);
        
        //JMenuBar
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        l1.add(mb);

        //JMenu
        JMenu m1 = new JMenu("Hotel Management");
        m1.setForeground(Color.red);
        mb.add(m1);
        
        //JMenuItem
        JMenuItem i1a = new JMenuItem("Reception");
        m1.add(i1a);

        JMenu m2 = new JMenu("Admin");
        m2.setForeground(Color.red);
        mb.add(m2);

        JMenuItem i2a = new JMenuItem("Add Employee");
        m2.add(i2a);

        JMenuItem i2b = new JMenuItem("Add Rooms");
        m2.add(i2b);

        JMenuItem i2c = new JMenuItem("Add Drivers");
        m2.add(i2c);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard();
    }
}
