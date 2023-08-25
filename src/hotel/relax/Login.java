package hotel.relax;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame {
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);
                                        
        JTextField t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);                                 

        JLabel l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 30);
        add(t2);

        JButton b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40, 140, 120, 30);

        // b1.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
        //         String username = t1.getText();
        //         String password = t2.getText();
        //         conn c = new conn();
        //         String str = "select * from login where username = '"+username+"' and password = '"+password+"'";
        //         try{
        //             ResultSet rs = c.s.executeQuery(str);
        //             if(rs.next()){
        //                 new Dashboard().setVisible(true);
        //                 setVisible(false);
        //             }else{
        //                 JOptionPane.showMessageDialog(null, "Invalid username or password");
        //                 setVisible(false);
        //             }
        //         }catch(Exception e){
        //             System.out.println(e);
        //         }
        //     }
        // });
        add(b1);

        JButton b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(180, 140, 120, 30);

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        add(b2);



        setBounds(500, 200, 600, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
