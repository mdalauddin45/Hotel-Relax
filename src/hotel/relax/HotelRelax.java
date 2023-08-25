package hotel.relax;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelRelax extends JFrame{
    HotelRelax(){
        super("Hotel Relax");
        setSize(1366, 565);
        setLocation(100, 100);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        add(image);

        setVisible(true);
    }

    public static void main(String[] args) {
        new HotelRelax();
    }
    
}
