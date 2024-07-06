/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author han
 */
class LoginPage extends JFrame implements ActionListener, ItemListener, MouseListener {

    private JLabel userName_label;
    private JTextField userName;
    private JLabel password_label;
    private JPasswordField password;
    private JButton loginButton;
    private JPanel panel;
    private JCheckBox display_pswrd;
    private JLabel noAccount;
    private JLabel role;
    private JComboBox roleCmb;

    public LoginPage() {
        final int win_width = 300; //window width in pixels
        final int win_height = 250; //window height in pixels

        setTitle("Login"); //set this window's title
        setSize(win_width, win_height); //set the size of this window

        //Create the components here
        userName_label = new JLabel("Username: ");
        userName_label.setBounds(10, 20, 80, 25);
        userName = new JTextField(15);
        userName.setBounds(100, 20, 165, 25);
        password_label = new JLabel("Password: ");
        password_label.setBounds(10, 50, 80, 25);
        password = new JPasswordField(15);
        password.setBounds(100, 50, 165, 25);
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 140, 80, 25);
        loginButton.addActionListener(this);
        role = new JLabel("Role: ");
        role.setBounds(10, 80, 80, 25);
        String[] roleList = {"", "Admin", "Delivery Staff", "Customer"};
        roleCmb = new JComboBox(roleList);
        roleCmb.setBounds(100, 80, 165, 25);
        display_pswrd = new JCheckBox("Show password");
        display_pswrd.setBounds(100, 110, 165, 25);
        display_pswrd.addItemListener(this);
        noAccount = new JLabel("Don't have an account?");
        noAccount.setBounds(70, 170, 165, 25);
        //set text color
        noAccount.setForeground(Color.BLUE); //set text color
        noAccount.addMouseListener(this);

        panel = new JPanel();
        //Set layout of the component which the component in the panel will align vertically
        panel.setLayout(null);
        panel.add(userName_label);
        panel.add(userName);
        panel.add(password_label);
        panel.add(password);
        panel.add(role);
        panel.add(roleCmb);
        panel.add(display_pswrd);
        panel.add(loginButton);
        panel.add(noAccount);

        //set border for the panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel is added to the JFrane's content panel
        getContentPane().add(panel);
        //Set this frame visible and display
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            String usr = userName.getText();
            String pswrd = password.getText();
            String loginRole = roleCmb.getSelectedItem().toString();
            UserLogin userLoginDetails = null;
            boolean found = false;
            for (UserLogin user : JavaAssignment.allUser) {  //for each user with details of username, password and role
                if (user.getLoginUsername().equals(usr) && user.getLoginPassword().equals(pswrd) && user.getRole().equals(loginRole)) {
                    userLoginDetails = user;
                    JavaAssignment.user = user;
                    System.out.println(user.getLoginUsername() + "\t" + userName.getText());
                    System.out.println(user.getLoginPassword() + "\t" + password.getText());
                    System.out.println(user.getRole() + "\t" + roleCmb.getSelectedItem().toString());
                    System.out.println("");
                    found = true;
                    break;
                }
            }
            if (found) {
                if (JavaAssignment.user != null) {
                    if (userLoginDetails.getRole().equals("Admin")) {
                        setVisible(false);
                        AdminPage admin = new AdminPage();
                        admin.setVisible(true);
                    } else if (userLoginDetails.getRole().equals("Delivery Staff")) {
                        for (StaffProfile staff : JavaAssignment.allStaffs) {
                            if (staff.getLoginUsername().equals(JavaAssignment.user.LoginUsername)) {
                                JavaAssignment.staff = staff;
                            }
                        }
                        try {
                            Scanner delivery = new Scanner(new File("OrderInfo.txt"));
                            while (delivery.hasNext()) {
                                String aa = delivery.nextLine();
                                String pp = delivery.nextLine();
                                String bb = delivery.nextLine();
                                String cc = delivery.nextLine();
                                String dd = delivery.nextLine();
                                String ee = delivery.nextLine();
                                String ff = delivery.nextLine();
                                Double gg = Double.parseDouble(delivery.nextLine());
                                String hh = delivery.nextLine();
                                String ii = delivery.nextLine();
                                String jj = delivery.nextLine();
                                String kk = delivery.nextLine();
                                String ll = delivery.nextLine();
                                String mm = delivery.nextLine();
                                String nn = delivery.nextLine();
                                String oo = delivery.nextLine();
                                String qq = delivery.nextLine();
                                String rr = delivery.nextLine();
                                delivery.nextLine();
                                OrderDetails deliveryDetails = new OrderDetails(aa, pp, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll, mm, nn, oo, qq, rr);
                                JavaAssignment.allDeliveries.add(deliveryDetails);
                            }
                        } catch (Exception ex) {

                        }
                        DeliveryStaffPage deliveryStaff = new DeliveryStaffPage();
                        setVisible(false);
                        deliveryStaff.setVisible(true);
                    } else if (userLoginDetails.getRole().equals("Customer")) {
                        for (CustomerProfile customer : JavaAssignment.allCustomers) {
                            if (customer.getLoginUsername().equals(JavaAssignment.user.LoginUsername)) {
                                JavaAssignment.customer = customer;
                            }
                        }
                        for (Cart cart : JavaAssignment.Cart) {
                            if (cart.getLoginUsername().equals(JavaAssignment.user.LoginUsername)) {
                                JavaAssignment.cart = cart;
                            }
                        }
                        try {
                            Scanner history = new Scanner(new File("OrderInfo.txt"));
                            while (history.hasNext()) {
                                String aa = history.nextLine();
                                String pp = history.nextLine();
                                String bb = history.nextLine();
                                String cc = history.nextLine();
                                String dd = history.nextLine();
                                String ee = history.nextLine();
                                String ff = history.nextLine();
                                Double gg = Double.parseDouble(history.nextLine());
                                String hh = history.nextLine();
                                String ii = history.nextLine();
                                String jj = history.nextLine();
                                String kk = history.nextLine();
                                String ll = history.nextLine();
                                String mm = history.nextLine();
                                String nn = history.nextLine();
                                String oo = history.nextLine();
                                String qq = history.nextLine();
                                String rr = history.nextLine();
                                history.nextLine();
                                OrderDetails historyDetails = new OrderDetails(aa, pp, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll, mm, nn, oo, qq, rr);
                                JavaAssignment.allHistory.add(historyDetails);
                            }
                        } catch (Exception ex) {

                        }
                        CustomerPage registeredCustomer = new CustomerPage();
                        setVisible(false);
                        registeredCustomer.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Login failed");
                        JavaAssignment.user = null;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Login failed");
                    JavaAssignment.user = null;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Login failed");
                JavaAssignment.user = null;
            }

            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                //p.print("USERNAME\tROLE\t\tACTION\t\tLOGON_TIME\n");
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Login" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {
            }

        }
    }

    //Detect the change of state of checkbox 
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == display_pswrd) {
            if (display_pswrd.isSelected()) {
                // Setting a value of 0 indicates that you wish to see the text
                //as it is typed, similar to the behavior of a standard JTextField
                display_pswrd.setText("Hide Password");
                password.setEchoChar((char) 0);
            } else {
                display_pswrd.setText("Show Password");
                password.setEchoChar('*');
            }
        }
    }

    public void mouseClicked(MouseEvent me) {
        int a = JOptionPane.showConfirmDialog(null, "Do your want to a register a new customer account?");
        if (a == JOptionPane.YES_OPTION) {
            setVisible(false);
            CustomerRegistrationPage reg = new CustomerRegistrationPage();
            reg.setVisible(true);
        } else {
            setVisible(true);
        }
    }

    public void mouseReleased(MouseEvent e) {
        //...
    }

    public void mouseEntered(MouseEvent e) {
        //...
    }

    public void mouseExited(MouseEvent e) {
        //....
    }

    public void mousePressed(MouseEvent e) {
        ///......
    }
}
