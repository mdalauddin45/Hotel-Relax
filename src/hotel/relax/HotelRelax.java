package hotel.relax;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelRelax extends JFrame{
    HotelRelax(){
        super("Hotel Relax");
    
        // Set the size of the window
        setBounds(100, 100, 1366, 565);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Background Image
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1366, 565);
        add(image);
        
        // Heading
        JLabel l1 = new JLabel("Hotel Relax");
        l1.setBounds(20, 430, 600, 90);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("serif", Font.PLAIN, 70));
        image.add(l1);

        // Button
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1150, 450, 150, 50);
        b1.setFont(new Font("serif", Font.PLAIN, 15));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setFocusPainted(false);
        // b1.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
        //         new Login().setVisible(true);
        //         setVisible(false);
        //     }
        // });
        image.add(b1);
        
        setVisible(true);

        // Animation
        while(true){
            l1.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            } 
            l1.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new HotelRelax();
    }
    
}
