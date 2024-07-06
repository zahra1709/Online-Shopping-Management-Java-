/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintWriter;
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
class RegistrationPage extends JFrame implements ActionListener,ItemListener,MouseListener{
    private JLabel username_label;
    private JTextField username;
    private JLabel password_label;
    private JPasswordField password;
    private JLabel confirmPswrd_label;
    private JPasswordField confirmPswrd;
    private JButton registerButton;
    private JPanel panel;
    private JCheckBox display_pswrd;
    private JLabel have_acc;
    private JLabel role;
    private JComboBox roleCbbox;
    
    public RegistrationPage(){
        setSize(320,250);
        setTitle("Register");
        
        
        username_label = new JLabel("Username: ");
        username_label.setBounds(10,20,80,25);
        username = new JTextField(15);
        username.setBounds(130,20,165,25);
        password_label = new JLabel("Password: ");
        password_label.setBounds(10,50,80,25);
        password = new JPasswordField(15);
        password.setBounds(130,50,165,25);
        confirmPswrd_label = new JLabel("Confirm Password:");
        confirmPswrd_label.setBounds(10,80,165,25);
        confirmPswrd = new JPasswordField(15);
        confirmPswrd.setBounds(130, 80, 165, 25);
        confirmPswrd.addActionListener(this);
        registerButton = new JButton("Register");
        registerButton.setBounds(110,140,90,25);
        registerButton.addActionListener(this); 
        display_pswrd = new JCheckBox("Show password");
        display_pswrd.setBounds(130,110,165,25);
        display_pswrd.addItemListener(this);
        have_acc = new JLabel("Have an account?");
        have_acc.setBounds(100,170,165,25);
        have_acc.addMouseListener(this);
        have_acc.setForeground(Color.BLUE);
        
        panel = new JPanel();
        //Set layout of the component which the component in the panel will align vertically
        panel.setLayout(null);
        panel.add(username_label);
        panel.add(username);
        panel.add(password_label);
        panel.add(password);
        panel.add(confirmPswrd_label);
        panel.add(confirmPswrd);
        panel.add(display_pswrd);
        panel.add(registerButton);
        panel.add(have_acc);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel is added to the JFrane's content panel
        getContentPane().add(panel);
        //Set this frame visible and display
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==registerButton){
            if(!username.getText().equals("") && !password.getText().equals("") && !confirmPswrd.getText().equals("") && (password.getText().equals(confirmPswrd.getText()))){
                JOptionPane.showMessageDialog(null,"Account is registered successfully.");
                String a = username.getText();
                String b = password.getText();
                String c = "Admin";
                UserLogin user = new UserLogin(a,b,c);
                JavaAssignment.allUser.add(user);
                
                try{
                    PrintWriter p = new PrintWriter("AllLogins.txt");
                    for(int i=0;i<JavaAssignment.allUser.size();i++){
                        UserLogin userLogin = JavaAssignment.allUser.get(i);
                        p.println(userLogin.getLoginUsername());
                        p.println(userLogin.getLoginPassword());
                        p.println(userLogin.getRole());
                        p.println();
                    }
                    p.close();
                }catch(Exception ex){
                    
                } 
            }
            
            else if (username.getText().equals("") || password.getText().equals("") || confirmPswrd.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please fill your information completely","WARNING", JOptionPane.WARNING_MESSAGE);
            }
            
            else if (!(password.getText().equals(confirmPswrd.getText()))){
                JOptionPane.showMessageDialog(null,"Please confirmed that both of the passwords entered are matched","WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==display_pswrd){
            if(display_pswrd.isSelected()){
                 // Setting a value of 0 indicates that you wish to see the text
                //as it is typed, similar to the behavior of a standard JTextField
                display_pswrd.setText("Hide Password");
                password.setEchoChar((char)0);
                confirmPswrd.setEchoChar((char)0);
            }else{
                display_pswrd.setText("Show Password");
                password.setEchoChar('*');
                confirmPswrd.setEchoChar('*');
            }
        }
    }
    
    //MouseListener
    public void mouseClicked(MouseEvent me){
        int a = JOptionPane.showConfirmDialog(null, "Already have an account?");
        
        if (a == JOptionPane.YES_OPTION){
            setVisible(false);
            LoginPage l = new LoginPage();
            l.setVisible(true);
        }
        
        else{
            setVisible(true);
        }
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}


