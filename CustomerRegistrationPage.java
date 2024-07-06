/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author han
 */
class CustomerRegistrationPage extends JFrame implements ActionListener, ItemListener {

    //declaration here
    private JTabbedPane TP;

    //user
    private JPanel userPanel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel passwordLabel;
    private JTextField passwordTextField;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel genderLabel;
    private JComboBox genderCmbBox;
    private JLabel contactLabel;
    private JTextField contactTxtField;
    private JLabel addressLabel;
    private JTextField addressTxtField;
    private JLabel postcodeLabel;
    private JTextField postcodeTxtField;
    private JLabel stateLabel;
    private JComboBox stateCmbBox;
    private JLabel emailLabel;
    private JTextField emailTxtField;
    private JButton registerButton;
    private JButton backButton;

    //item
    private JPanel itemPanel;
    private JLabel itemNameLabel;
    private JComboBox itemNameCmbBox;
    private JLabel itemCodeLabel;
    private JTextField itemCodeTextField;
    private JLabel itemDescriptionLabel;
    private JTextField itemDescriptionTextField;
    private JLabel itemPriceLabel;
    private JTextField itemPriceTextField;
    private JLabel categorizationCategoryNameLabel;
    private JTextField categorizationCategoryNameTextField;
    private JLabel categorizationCategoryCodeLabel;
    private JTextField categorizationCategoryCodeTextField;
    private JLabel itemTableLabel;
    private JTable itemTable;
    private JScrollPane itemSp;
    private JButton itemBackButton;
    private JButton searchBtn;

    public CustomerRegistrationPage() {
        setSize(1500, 600);
        setTitle("Not-Registered Customer Menu");

        TP = new JTabbedPane();

        //user stuff start here
        userPanel = new JPanel();
        userPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(570, 20, 165, 25);

        usernameTextField = new JTextField(25);
        usernameTextField.setBounds(680, 20, 230, 25);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(570, 50, 165, 25);

        passwordTextField = new JTextField(25);
        passwordTextField.setBounds(680, 50, 230, 25);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(570, 80, 165, 25);

        nameTextField = new JTextField(25);
        nameTextField.setBounds(680, 80, 230, 25);

        genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(570, 140, 165, 25);

        String[] genderList = {"", "Male", "Female", "Other"};
        genderCmbBox = new JComboBox(genderList);
        genderCmbBox.setBounds(680, 140, 230, 25);

        contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(570, 290, 165, 25);

        contactTxtField = new JTextField(15);
        contactTxtField.setBounds(680, 290, 230, 25);

        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(570, 320, 165, 25);

        addressTxtField = new JTextField(30);
        addressTxtField.setBounds(680, 320, 230, 25);

        postcodeLabel = new JLabel("Postcode:");
        postcodeLabel.setBounds(570, 350, 165, 25);

        postcodeTxtField = new JTextField(15);
        postcodeTxtField.setBounds(680, 350, 230, 25);

        stateLabel = new JLabel("State:");
        stateLabel.setBounds(570, 380, 165, 25);

        String[] countryList = {"", "Sarawak", "Sabah", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Selangor", "Terengganu", "Kuala Lumpur", "Labuan", "Putrajaya", "Other"};
        stateCmbBox = new JComboBox(countryList);
        stateCmbBox.setBounds(680, 380, 230, 25);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(570, 410, 165, 25);

        emailTxtField = new JTextField(30);
        emailTxtField.setBounds(680, 410, 230, 25);

        registerButton = new JButton("Register");
        registerButton.setBounds(680, 440, 165, 25);
        registerButton.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setBounds(1250, 450, 165, 25);
        backButton.addActionListener(this);

       //user stuff end here
        //item stuff start here
        itemPanel = new JPanel();
        itemPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        itemNameLabel = new JLabel("Item Name: ");
        itemNameLabel.setBounds(10, 20, 80, 25);

        //every registered category will be passed into this category combo box
        ArrayList<String> itemList = new ArrayList<String>();
        itemList.add("");
        for (int i = 0; i < JavaAssignment.allItems.size(); i++) {
            ItemDetails ITD = JavaAssignment.allItems.get(i);
            itemList.add(ITD.getItemName());
        }
        itemNameCmbBox = new JComboBox(itemList.toArray());
        itemNameCmbBox.setBounds(120, 20, 230, 25);

        itemCodeLabel = new JLabel("Item Code: ");
        itemCodeLabel.setBounds(10, 80, 165, 25);

        itemCodeTextField = new JTextField(25);
        itemCodeTextField.setBounds(120, 80, 230, 25);
        itemCodeTextField.setEditable(false);

        itemDescriptionLabel = new JLabel("Description: ");
        itemDescriptionLabel.setBounds(10, 110, 165, 25);

        itemDescriptionTextField = new JTextField(25);
        itemDescriptionTextField.setBounds(120, 110, 230, 25);
        itemDescriptionTextField.setEditable(false);

        itemPriceLabel = new JLabel("Price: ");
        itemPriceLabel.setBounds(10, 140, 80, 25);

        itemPriceTextField = new JTextField(25);
        itemPriceTextField.setBounds(120, 140, 230, 25);
        itemPriceTextField.setEditable(false);

        categorizationCategoryNameLabel = new JLabel("Category: ");
        categorizationCategoryNameLabel.setBounds(10, 200, 80, 25);

        categorizationCategoryNameTextField = new JTextField(25);
        categorizationCategoryNameTextField.setBounds(120, 200, 230, 25);
        categorizationCategoryNameTextField.setEditable(false);

        categorizationCategoryCodeLabel = new JLabel("Category Code: ");
        categorizationCategoryCodeLabel.setBounds(10, 230, 165, 25);

        categorizationCategoryCodeTextField = new JTextField(25);
        categorizationCategoryCodeTextField.setBounds(120, 230, 230, 25);
        categorizationCategoryCodeTextField.setEditable(false);

        itemTableLabel = new JLabel("Record Table: ");
        itemTableLabel.setBounds(370, 1, 165, 25);

        int itemSize = JavaAssignment.allItems.size();
        String[][] itemData = new String[itemSize][5];
        for (int i = 0; i < itemSize; i++) {
            ItemDetails item = JavaAssignment.allItems.get(i);
            itemData[i][0] = item.getItemName();
            itemData[i][1] = "" + item.getItemCode();
            itemData[i][2] = "" + item.getItemPrice();
            itemData[i][3] = "" + item.getCategoryName();
            itemData[i][4] = "" + item.getCategoryCode();

        }
        String[] itemColumns = {"Item Name", "Item Code", "Price", "Category Name", "Category Code"};
        DefaultTableModel itemModel = new DefaultTableModel(itemData, itemColumns);
        itemTable = new JTable(itemModel);
        itemSp = new JScrollPane(itemTable);
        itemSp.setBounds(370, 20, 1100, 400);
        
        itemBackButton = new JButton("Back");
        itemBackButton.setBounds(1250, 450, 165, 25);
        itemBackButton.addActionListener(this);

        searchBtn = new JButton("Search");
        searchBtn.setBounds(120, 50, 165, 25);
        searchBtn.addActionListener(this);

        //item stuff end here
        userPanel.add(usernameLabel);
        userPanel.add(usernameTextField);
        userPanel.add(passwordLabel);
        userPanel.add(passwordTextField);
        userPanel.add(nameLabel);
        userPanel.add(nameTextField);
        userPanel.add(genderLabel);
        userPanel.add(genderCmbBox);
        userPanel.add(contactLabel);
        userPanel.add(contactTxtField);
        userPanel.add(addressLabel);
        userPanel.add(addressTxtField);
        userPanel.add(postcodeLabel);
        userPanel.add(postcodeTxtField);
        userPanel.add(stateLabel);
        userPanel.add(stateCmbBox);
        userPanel.add(emailLabel);
        userPanel.add(emailTxtField);
        userPanel.add(itemTableLabel);
        userPanel.add(itemSp);
        userPanel.add(registerButton);
        userPanel.add(backButton);

        itemPanel.add(itemNameLabel);
        itemPanel.add(itemNameCmbBox);
        itemPanel.add(itemCodeLabel);
        itemPanel.add(itemCodeTextField);
        itemPanel.add(itemDescriptionLabel);
        itemPanel.add(itemDescriptionTextField);
        itemPanel.add(itemPriceLabel);
        itemPanel.add(itemPriceTextField);
        itemPanel.add(categorizationCategoryNameLabel);
        itemPanel.add(categorizationCategoryNameTextField);
        itemPanel.add(categorizationCategoryCodeLabel);
        itemPanel.add(categorizationCategoryCodeTextField);
        itemPanel.add(itemTableLabel);
        itemPanel.add(itemSp);
        itemPanel.add(itemBackButton);
        itemPanel.add(searchBtn);

        TP.add("Item Details", itemPanel);
        TP.add("Register To Access Other Details", userPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel is added to the JFrane's content panel
        getContentPane().add(TP);
        //Set this frame visible to be display
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameTextField.getText();
            String gender = genderCmbBox.getSelectedItem().toString();
            String contact = contactTxtField.getText();
            String address = addressTxtField.getText();
            String postcode = postcodeTxtField.getText();
            String state = stateCmbBox.getSelectedItem().toString();
            String email = emailTxtField.getText();
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();
            String role = "Customer";
            String item = "";
            String quantity = "";
            Double price = 0.0;

            if (!name.equals("") && !gender.equals("") && !contact.equals("") && !address.equals("") && !postcode.equals("") && !state.equals("") && !email.equals("")) {
                boolean found = false;
                for (int i = 0; i < JavaAssignment.allCustomers.size(); i++) {
                    CustomerProfile  user = JavaAssignment.allCustomers.get(i);
                    if (name.equals(user.getName()) || username.equals(user.getLoginUsername())) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(this, "Customer is registered successfully");
                    CustomerProfile  user = new CustomerProfile (username, password, name, gender, contact, address, Integer.valueOf(postcode), state, email, role);
                    UserLogin userLogin = new UserLogin(username, password, role);
                    Cart cart = new Cart(username, item, quantity, price);
                    JavaAssignment.allUser.add(userLogin); //admin and delivery staff to create user account can refer to this (can be implemented when creating user profile in admin user management)
                    JavaAssignment.allCustomers.add(user);
                    JavaAssignment.Cart.add(cart);
                    JavaAssignment.user = userLogin;
                    JavaAssignment.customer = user;
                    JavaAssignment.cart = cart;

                    try {
                        PrintWriter p = new PrintWriter("CustomerData.txt");
                        for (int i = 0; i < JavaAssignment.allCustomers.size(); i++) {
                            CustomerProfile  customerProfile = JavaAssignment.allCustomers.get(i);
                            p.println(customerProfile.getLoginUsername());
                            p.println(customerProfile.getLoginPassword());
                            p.println(customerProfile.getName());
                            p.println(customerProfile.getGender());
                            p.println(customerProfile.getContact());
                            p.println(customerProfile.getAddress());
                            p.println(customerProfile.getPostcode());
                            p.println(customerProfile.getState());
                            p.println(customerProfile.getEmail());
                            p.println(customerProfile.getLoginPassword());
                            p.println(customerProfile.getRole());
                            p.println();
                        }
                        p.close();
                    } catch (Exception er) {
                        JOptionPane.showMessageDialog(this, er);
                    }
                    try {
                        PrintWriter p = new PrintWriter("AllLogins.txt");
                        for (int i = 0; i < JavaAssignment.allUser.size(); i++) {
                            UserLogin userLoginDetails = JavaAssignment.allUser.get(i);
                            p.println(userLoginDetails.getLoginUsername());
                            p.println(userLoginDetails.getLoginPassword());
                            p.println(userLoginDetails.getRole());
                            p.println();
                        }
                        p.close();
                    } catch (Exception ee) {

                    }
                    try {
                        PrintWriter p = new PrintWriter("Cart.txt");
                        for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                            Cart cartDetails = JavaAssignment.Cart.get(i);
                            p.println(cartDetails.getLoginUsername());
                            p.println(cartDetails.getItem());
                            p.println(cartDetails.getQuantity());
                            p.println(cartDetails.getTotalPrice());
                            p.println();
                        }
                        p.close();
                    } catch (Exception ee) {

                    }
                    try {
                        Scanner history = new Scanner(new File("AllOrders.txt"));
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
                    setVisible(false);
                    CustomerPage cm = new CustomerPage();
                    cm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "This customer is existing in the record");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the information completely");
            }
        } else if (e.getSource() == backButton) {
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == itemBackButton) {
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == searchBtn) {
            for (ItemDetails item : JavaAssignment.allItems) {
                String itemName = itemNameCmbBox.getSelectedItem().toString();

                if (itemName.equals(item.getItemName())) {
                    itemCodeTextField.setText(item.getItemCode());
                    itemPriceTextField.setText(item.getItemPrice().toString());
                    categorizationCategoryNameTextField.setText(item.getCategoryName());
                    categorizationCategoryCodeTextField.setText(item.getCategoryCode());
                }
            }
        }
    }

    public void itemStateChanged(ItemEvent ie) {
        
    }
}
