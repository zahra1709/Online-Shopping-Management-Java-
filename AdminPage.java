/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import static java.awt.Color.BLUE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Zahra
 */
class AdminPage extends JFrame implements ActionListener, ItemListener {

    //declaration here
    private JTabbedPane TP;

    //user
    private JPanel pnlUser;
    private JLabel lblName;
    private JTextField nameTextField;
    private JLabel passwordLabel;
    private JTextField passwordTxtField;
    private JLabel genderLabel;
    private JComboBox genderCmbBox;
    private JLabel contactLabel;
    private JTextField contactTxtField;
    private JLabel postcodeLabel;
    private JTextField postcodeTxtField;
    private JLabel stateLabel;
    private JComboBox stateCmbBox;
    private JLabel addressLabel;
    private JTextField addressTxtField;
    private JLabel emailLabel;
    private JTextField emailTxtField;
    private JLabel roleLabel;
    private JComboBox roleCmbBox;
    private JLabel userTableLabel;
    private JTable userTable;
    private JScrollPane userSp;
    private JButton searchButton;
    private JButton registerButton;
    private JButton editButton;
    private JButton clearButton;
    private JButton deleteButton;
    private JButton logoutButton;

    //category
    private JPanel categoryPanel;
    private JLabel categoryNameLabel;
    private JTextField categoryNameTxtField;
    private JLabel categoryCodeLabel;
    private JTextField categoryCodeTxtField;
    private JLabel categoryTableLabel;
    private JTable categoryTable;
    private JScrollPane categorySp;
    private JButton categorySearchButton;
    private JButton categoryCreateButton;
    private JButton categoryEditButton;
    private JButton categoryClearButton;
    private JButton categoryDeleteButton;
    private JButton categoryLogoutButton;

    //item
    private JPanel itemPanel;
    private JLabel itemNameLabel;
    private JTextField itemNameTextField;
    private JLabel itemCodeLabel;
    private JTextField itemCodeTextField;
    private JLabel itemPriceLabel;
    private JTextField itemPriceTextField;
    private JLabel categorizationCategoryNameLabel;
    private JComboBox categorizationCategoryNameCmbBox;
    private JLabel categorizationCategoryCodeLabel;
    private JTextField categorizationCategoryCodeTextField;
    private JLabel itemTableLabel;
    private JTable itemTable;
    private JScrollPane itemSp;
    private JButton itemSearchButton;
    private JButton itemCreateButton;
    private JButton itemEditButton;
    private JButton itemClearButton;
    private JButton itemDeleteButton;
    private JButton itemLogoutButton;
    private JButton getCategoryCodeBtn;

    //order delivery
    private JPanel orderDeliveryPanel;
    private JLabel orderIDLabel;
    private JComboBox orderIDCmbBox;
    private JLabel orderNameLabel;
    private JTextField orderNameTxtField;
    private JLabel orderContactLabel;
    private JTextField orderContactTxtField;
    private JLabel orderAddressLabel;
    private JTextField orderAddressTxtField;
    private JLabel orderItemLabel;
    private JTextField orderItemTxtField;
    private JLabel orderQuantityLabel;
    private JTextField orderQuantityTxtField;
    private JLabel orderAmountLabel;
    private JTextField orderAmountTxtField;
    private JLabel orderPaymentLabel;
    private JTextField orderPaymentTxtField;
    private JLabel orderCardLabel;
    private JTextField orderCardTxtField;
    private JLabel orderTimeLabel;
    private JTextField orderTimeTxtField;
    private JLabel orderDeliveredTimeLabel;
    private JTextField orderDeliveredTimeTxtField;
    private JLabel orderFeedbackLabel;
    private JTextField orderFeedbackTxtField;
    private JLabel orderStatusLabel;
    private JComboBox orderStatusCmbBox;
    private JLabel orderDeliveryStaffLabel;
    private JComboBox orderDeliveryStaffCmbBox;
    private JLabel orderDeliveryTableLabel;
    private JTable orderDeliveryTable;
    private JScrollPane orderDeliverySp;
    private JButton orderDeliverySearchButton;
    private JButton orderDeliveryUpdateButton;
    private JButton orderDeliveryLogoutButton;

    //user account
    private JPanel modifyPanel;
    private JTextField modifyUsername;
    private JPasswordField modifyPassword;
    private JTextField newUsername;
    private JPasswordField newPassword;
    private JLabel MUsername;
    private JLabel MPassword;
    private JButton modifyUserAccountBtn;
    private JLabel New;
    private JLabel Old;
    private JLabel NewUsername;
    private JLabel NewPassword;

    public AdminPage() {
        setSize(1200, 600);
        setTitle("Admin Window");

        TP = new JTabbedPane();

        //user stuff start here
        pnlUser = new JPanel();
        pnlUser.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        lblName = new JLabel("Name: ");
        lblName.setBounds(10, 20, 160, 25);

        nameTextField = new JTextField(25);
        nameTextField.setBounds(120, 20, 200, 25);
        
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 80, 165, 25);

        passwordTxtField = new JTextField(25);
        passwordTxtField.setBounds(120, 80, 230, 25);

        genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(10, 110, 165, 25);

        String[] genderList = {"", "Male", "Female", "Other"};
        genderCmbBox = new JComboBox(genderList);
        genderCmbBox.setBounds(120, 110, 230, 25);

        contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(10, 260, 165, 25);

        contactTxtField = new JTextField(15);
        contactTxtField.setBounds(120, 260, 230, 25);

        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(10, 290, 165, 25);

        addressTxtField = new JTextField(30);
        addressTxtField.setBounds(120, 290, 230, 25);

        postcodeLabel = new JLabel("Postcode:");
        postcodeLabel.setBounds(10, 320, 165, 25);

        postcodeTxtField = new JTextField(15);
        postcodeTxtField.setBounds(120, 320, 230, 25);

        stateLabel = new JLabel("State:");
        stateLabel.setBounds(10, 350, 165, 25);

        String[] stateList = {"", "Sarawak", "Sabah", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Selangor", "Terengganu", "Kuala Lumpur", "Labuan", "Putrajaya", "Other"};
        stateCmbBox = new JComboBox(stateList);
        stateCmbBox.setBounds(120, 350, 230, 25);

        emailLabel = new JLabel("Email: (Username)");
        emailLabel.setBounds(10, 380, 165, 25);

        emailTxtField = new JTextField(30);
        emailTxtField.setBounds(120, 380, 230, 25);

        roleLabel = new JLabel("Role:");
        roleLabel.setBounds(10, 410, 165, 25);

        String[] roleList = {"", "Admin", "Delivery Staff"};
        roleCmbBox = new JComboBox(roleList);
        roleCmbBox.setBounds(120, 410, 230, 25);

        userTableLabel = new JLabel("Records Table: ");
        userTableLabel.setBounds(370, 1, 165, 25);

        int userSize = JavaAssignment.allStaffs.size();
        String[][] userData = new String[userSize][9];
        for (int i = 0; i < userSize; i++) {
            StaffProfile user = JavaAssignment.allStaffs.get(i);
            userData[i][0] = user.getName();
            userData[i][1] = "" + user.getLoginPassword();
            userData[i][2] = "" + user.getGender();
            userData[i][3] = "" + user.getContact();
            userData[i][4] = "" + user.getAddress();
            userData[i][5] = "" + user.getPostcode();
            userData[i][6] = "" + user.getState();
            userData[i][7] = "" + user.getEmail();
            userData[i][8] = "" + user.getRole();

        }
        String[] userColumns = {"Name", "Password", "Gender", "Contact", "Address", "Postcode", "State", "Email", "Role"};
        DefaultTableModel userModel = new DefaultTableModel(userData, userColumns);
        userTable = new JTable(userModel);
        userSp = new JScrollPane(userTable);
        userSp.setBounds(370, 20, 1100, 400);

        searchButton = new JButton("SEARCH");
        searchButton.setBounds(120, 50, 165, 25);
        searchButton.addActionListener(this);

        registerButton = new JButton("REGISTER");
        registerButton.setBounds(450, 450, 165, 25);
        registerButton.addActionListener(this);

        editButton = new JButton("EDIT");
        editButton.setBounds(650, 450, 165, 25);
        editButton.addActionListener(this);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(850, 450, 165, 25);
        clearButton.addActionListener(this);

        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(1050, 450, 165, 25);
        deleteButton.addActionListener(this);

        logoutButton = new JButton("LOGOUT");
        logoutButton.setBounds(1250, 450, 165, 25);
        logoutButton.addActionListener(this);

        //user stuff end here
        //category stuff start here
        categoryPanel = new JPanel();
        categoryPanel.setLayout(null);

        categoryNameLabel = new JLabel("Category Name: ");
        categoryNameLabel.setBounds(10, 20, 80, 25);

        categoryNameTxtField = new JTextField(15);
        categoryNameTxtField.setBounds(120, 20, 230, 25);

        categoryCodeLabel = new JLabel("Category Code: ");
        categoryCodeLabel.setBounds(10, 80, 165, 25);

        categoryCodeTxtField = new JTextField(15);
        categoryCodeTxtField.setBounds(120, 80, 230, 25);

        categoryTableLabel = new JLabel("Record Table: ");
        categoryTableLabel.setBounds(370, 1, 165, 25);

        int categorySize = JavaAssignment.allCategories.size();
        String[][] rows = new String[categorySize][2];
        for (int i = 0; i < categorySize; i++) {
            CategoryDetails category = JavaAssignment.allCategories.get(i);
            rows[i][0] = category.getCategoryName();
            rows[i][1] = "" + category.getCategoryCode();

        }
        String[] categoryColumns = {"Category Name", "Category Code"};
        DefaultTableModel categoryModel = new DefaultTableModel(rows, categoryColumns);
        categoryTable = new JTable(categoryModel);
        categorySp = new JScrollPane(categoryTable);
        categorySp.setBounds(370, 20, 1100, 400);

        categorySearchButton = new JButton("SEARCH");
        categorySearchButton.setBounds(120, 50, 165, 25);
        categorySearchButton.addActionListener(this);

        categoryCreateButton = new JButton("CREATE");
        categoryCreateButton.setBounds(450, 450, 165, 25);
        categoryCreateButton.addActionListener(this);

        categoryEditButton = new JButton("EDIT");
        categoryEditButton.setBounds(650, 450, 165, 25);
        categoryEditButton.addActionListener(this);

        categoryClearButton = new JButton("CLEAR");
        categoryClearButton.setBounds(850, 450, 165, 25);
        categoryClearButton.addActionListener(this);

        categoryDeleteButton = new JButton("DELETE");
        categoryDeleteButton.setBounds(1050, 450, 165, 25);
        categoryDeleteButton.addActionListener(this);

        categoryLogoutButton = new JButton("LOGOUT");
        categoryLogoutButton.setBounds(1250, 450, 165, 25);
        categoryLogoutButton.addActionListener(this);

        //category stuff end here
        //item stuff start here
        itemPanel = new JPanel();
        itemPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        itemNameLabel = new JLabel("Item Name: ");
        itemNameLabel.setBounds(10, 20, 80, 25);

        itemNameTextField = new JTextField(25);
        itemNameTextField.setBounds(120, 20, 230, 25);

        itemCodeLabel = new JLabel("Item Code: ");
        itemCodeLabel.setBounds(10, 80, 165, 25);

        itemCodeTextField = new JTextField(25);
        itemCodeTextField.setBounds(120, 80, 230, 25);

        itemPriceLabel = new JLabel("Price: ");
        itemPriceLabel.setBounds(10, 140, 80, 25);

        itemPriceTextField = new JTextField(25);
        itemPriceTextField.setBounds(120, 140, 230, 25);

        categorizationCategoryNameLabel = new JLabel("Category: ");
        categorizationCategoryNameLabel.setBounds(10, 170, 80, 25);

        //every registered category will be passed into this category combo box
        ArrayList<String> categoryList = new ArrayList<String>();
        categoryList.add("");
        for (int i = 0; i < JavaAssignment.allCategories.size(); i++) {
            CategoryDetails cd = JavaAssignment.allCategories.get(i);
            categoryList.add(cd.getCategoryName());
        }
        categorizationCategoryNameCmbBox = new JComboBox(categoryList.toArray());
        categorizationCategoryNameCmbBox.setBounds(120, 170, 230, 25);

        categorizationCategoryCodeLabel = new JLabel("Category Code: ");
        categorizationCategoryCodeLabel.setBounds(10, 200, 165, 25);

        categorizationCategoryCodeTextField = new JTextField(25);
        categorizationCategoryCodeTextField.setBounds(120, 200, 230, 25);
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

        itemSearchButton = new JButton("Search");
        itemSearchButton.setBounds(120, 50, 165, 25);
        itemSearchButton.addActionListener(this);

        itemCreateButton = new JButton("Create");
        itemCreateButton.setBounds(450, 450, 165, 25);
        itemCreateButton.addActionListener(this);

        itemEditButton = new JButton("Edit");
        itemEditButton.setBounds(650, 450, 165, 25);
        itemEditButton.addActionListener(this);

        itemClearButton = new JButton("Clear");
        itemClearButton.setBounds(850, 450, 165, 25);
        itemClearButton.addActionListener(this);

        itemDeleteButton = new JButton("Delete");
        itemDeleteButton.setBounds(1050, 450, 165, 25);
        itemDeleteButton.addActionListener(this);

        itemLogoutButton = new JButton("Logout");
        itemLogoutButton.setBounds(1250, 450, 165, 25);
        itemLogoutButton.addActionListener(this);

        getCategoryCodeBtn = new JButton("Get Category Code");
        getCategoryCodeBtn.setBounds(120, 230, 165, 25);
        getCategoryCodeBtn.addActionListener(this);

        //item stuff end here
        //order stuff start here
        orderDeliveryPanel = new JPanel();
        orderDeliveryPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        orderIDLabel = new JLabel("Order ID: ");
        orderIDLabel.setBounds(10, 20, 80, 25);

        //every registered category will be passed into this category combo box
        ArrayList<String> orderList = new ArrayList<String>();
        orderList.add("");
        for (int i = 0; i < JavaAssignment.allOrders.size(); i++) {
            OrderDetails od = JavaAssignment.allOrders.get(i);
            orderList.add(od.getOrderID());
        }
        orderIDCmbBox = new JComboBox(orderList.toArray());
        orderIDCmbBox.setBounds(120, 20, 230, 25);// change to order id (add order id using randomuuid), put it in the second row in txt file (between username and name)

        orderNameLabel = new JLabel("Customer Name:");
        orderNameLabel.setBounds(10, 80, 165, 25);

        orderNameTxtField = new JTextField(25);
        orderNameTxtField.setBounds(120, 80, 230, 25);
        orderNameTxtField.setEditable(false);

        orderContactLabel = new JLabel("Contact Number:");
        orderContactLabel.setBounds(10, 110, 165, 25);

        orderContactTxtField = new JTextField(25);
        orderContactTxtField.setBounds(120, 110, 230, 25);
        orderContactTxtField.setEditable(false);

        orderAddressLabel = new JLabel("Address:");
        orderAddressLabel.setBounds(10, 140, 165, 25);

        orderAddressTxtField = new JTextField(25);
        orderAddressTxtField.setBounds(120, 140, 230, 25);
        orderAddressTxtField.setEditable(false);

        orderItemLabel = new JLabel("Items:");
        orderItemLabel.setBounds(10, 170, 165, 25);

        orderItemTxtField = new JTextField(25);
        orderItemTxtField.setBounds(120, 170, 230, 25);
        orderItemTxtField.setEditable(false);

        orderQuantityLabel = new JLabel("Quantity:");
        orderQuantityLabel.setBounds(10, 200, 165, 25);

        orderQuantityTxtField = new JTextField(25);
        orderQuantityTxtField.setBounds(120, 200, 230, 25);
        orderQuantityTxtField.setEditable(false);

        orderAmountLabel = new JLabel("Total Amount:");
        orderAmountLabel.setBounds(10, 230, 165, 25);

        orderAmountTxtField = new JTextField(25);
        orderAmountTxtField.setBounds(120, 230, 230, 25);
        orderAmountTxtField.setEditable(false);

        orderPaymentLabel = new JLabel("Payment Method:");
        orderPaymentLabel.setBounds(10, 260, 165, 25);

        orderPaymentTxtField = new JTextField(25);
        orderPaymentTxtField.setBounds(120, 260, 230, 25);
        orderPaymentTxtField.setEditable(false);

        orderCardLabel = new JLabel("Card Details:");
        orderCardLabel.setBounds(10, 290, 165, 25);

        orderCardTxtField = new JTextField(25);
        orderCardTxtField.setBounds(120, 290, 230, 25);
        orderCardTxtField.setEditable(false);

        orderTimeLabel = new JLabel("Ordered Time:");
        orderTimeLabel.setBounds(10, 320, 165, 25);

        orderTimeTxtField = new JTextField(25);
        orderTimeTxtField.setBounds(120, 320, 230, 25);
        orderTimeTxtField.setEditable(false);

        orderDeliveredTimeLabel = new JLabel("Delivered Time:");
        orderDeliveredTimeLabel.setBounds(10, 350, 165, 25);

        orderDeliveredTimeTxtField = new JTextField(25);
        orderDeliveredTimeTxtField.setBounds(120, 350, 230, 25);
        orderDeliveredTimeTxtField.setEditable(false);

        orderFeedbackLabel = new JLabel("Feedback:");
        orderFeedbackLabel.setBounds(10, 380, 165, 25);

        orderFeedbackTxtField = new JTextField(25);
        orderFeedbackTxtField.setBounds(120, 380, 230, 25);
        orderFeedbackTxtField.setEditable(false);

        orderStatusLabel = new JLabel("Order Status:");
        orderStatusLabel.setBounds(10, 410, 165, 25);

        String[] statusList = {"", "In Progress", "Ready To Deliver", "Delivering", "Delivered Successfully", "Completed"};
        orderStatusCmbBox = new JComboBox(statusList);
        orderStatusCmbBox.setBounds(120, 410, 230, 25);

        orderDeliveryStaffLabel = new JLabel("Delivery Staff: ");
        orderDeliveryStaffLabel.setBounds(10, 440, 165, 25);

        //every registered delivery staff will be passed into this category combo box
        ArrayList<String> staffList = new ArrayList<String>();
        staffList.add("");
        for (int i = 0; i < JavaAssignment.allStaffs.size(); i++) {
            StaffProfile SPD = JavaAssignment.allStaffs.get(i);
            if (SPD.getRole().equals("Delivery Staff")) {
                staffList.add(SPD.getName());
            }
        }
        orderDeliveryStaffCmbBox = new JComboBox(staffList.toArray());
        orderDeliveryStaffCmbBox.setBounds(120, 440, 230, 25);

        orderDeliveryTableLabel = new JLabel("Record Table: ");
        orderDeliveryTableLabel.setBounds(370, 1, 165, 25);

        int oderSize = JavaAssignment.allOrders.size();
        String[][] orderData = new String[oderSize][11];
        for (int i = 0; i < oderSize; i++) {
            OrderDetails order = JavaAssignment.allOrders.get(i);
            if (order.getPaymentMethod().equals("Card")) {
                String cardDetails = order.getCardType() + ", " + order.getCardNumber() + ", " + order.getCVV() + ", " + order.getExpiryDate();
                orderData[i][0] = order.getOrderID();
                orderData[i][1] = "" + order.getItem();
                orderData[i][2] = "" + order.getQuantity();
                orderData[i][3] = "" + order.getAmount();
                orderData[i][4] = "" + order.getPaymentMethod();
                orderData[i][5] = "" + cardDetails;
                orderData[i][6] = "" + order.getOrderTime();
                orderData[i][7] = "" + order.getOrderDeliveredTime();
                orderData[i][8] = "" + order.getOrderStatus();
                orderData[i][9] = "" + order.getDeliveryStaff();
                orderData[i][10] = "" + order.getOrderFeedback(); //check if feedback
            } else if (order.getPaymentMethod().equals("Cash On Delivery")) {
                String emptyCardDetails = "-";
                orderData[i][0] = order.getOrderID();
                orderData[i][1] = "" + order.getItem();
                orderData[i][2] = "" + order.getQuantity();
                orderData[i][3] = "" + order.getAmount();
                orderData[i][4] = "" + order.getPaymentMethod();
                orderData[i][5] = "" + emptyCardDetails;
                orderData[i][6] = "" + order.getOrderTime();
                orderData[i][7] = "" + order.getOrderDeliveredTime();
                orderData[i][8] = "" + order.getOrderStatus();
                orderData[i][9] = "" + order.getDeliveryStaff();
                orderData[i][10] = "" + order.getOrderFeedback();
            }
        }
        String[] orderColumns = {"Order ID", "Items", "Quantity", "Total Amount", "Payment Method", "Card Details", "Ordered Time", "Delivered Time", "Order Status", "Delivery Staff", "Feedback"};
        DefaultTableModel orderModel = new DefaultTableModel(orderData, orderColumns);
        orderDeliveryTable = new JTable(orderModel);
        orderDeliverySp = new JScrollPane(orderDeliveryTable);
        orderDeliverySp.setBounds(370, 20, 1100, 400);

        orderDeliverySearchButton = new JButton("Search");
        orderDeliverySearchButton.setBounds(120, 50, 165, 25);
        orderDeliverySearchButton.addActionListener(this);

        orderDeliveryUpdateButton = new JButton("Update");
        orderDeliveryUpdateButton.setBounds(120, 470, 165, 25);
        orderDeliveryUpdateButton.addActionListener(this);

        orderDeliveryLogoutButton = new JButton("Logout");
        orderDeliveryLogoutButton.setBounds(1250, 450, 165, 25);
        orderDeliveryLogoutButton.addActionListener(this);

        //order stuff end here
        //modify user account stuff start here
        modifyPanel = new JPanel();
        modifyPanel.setLayout(null);

        Old = new JLabel("Old");
        Old.setBounds(580, 10, 165, 25);

        New = new JLabel("New");
        New.setBounds(980, 10, 165, 25);

        MUsername = new JLabel("Username:");
        MUsername.setBounds(420, 50, 165, 25);

        NewUsername = new JLabel("New Username:");
        NewUsername.setBounds(820, 50, 165, 25);

        newUsername = new JTextField(25);
        newUsername.setBounds(920, 50, 165, 25);

        MPassword = new JLabel("Password:");
        MPassword.setBounds(420, 150, 165, 25);

        NewPassword = new JLabel("New Password:");
        NewPassword.setBounds(820, 150, 165, 25);

        newPassword = new JPasswordField(25);
        newPassword.setBounds(920, 150, 165, 25);
        
        modifyUsername = new JTextField(25);
        modifyUsername.setBounds(520, 50, 165, 25);

        modifyPassword = new JPasswordField(25);
        modifyPassword.setBounds(520, 150, 165, 25);
        
        modifyUserAccountBtn = new JButton("Modify");
        modifyUserAccountBtn.setBounds(680, 350, 165, 25);
        modifyUserAccountBtn.addActionListener(this);

        //modify stuff end here
        pnlUser.add(lblName);
        pnlUser.add(nameTextField);
        pnlUser.add(passwordTxtField);
        pnlUser.add(passwordTxtField);
        pnlUser.add(genderLabel);
        pnlUser.add(genderCmbBox);
        pnlUser.add(contactLabel);
        pnlUser.add(contactTxtField);
        pnlUser.add(addressLabel);
        pnlUser.add(addressTxtField);
        pnlUser.add(postcodeLabel);
        pnlUser.add(postcodeTxtField);
        pnlUser.add(stateLabel);
        pnlUser.add(stateCmbBox);
        pnlUser.add(emailLabel);
        pnlUser.add(emailTxtField);
        pnlUser.add(roleLabel);
        pnlUser.add(roleCmbBox);
        pnlUser.add(userTableLabel);
        pnlUser.add(userSp);
        pnlUser.add(searchButton);
        pnlUser.add(registerButton);
        pnlUser.add(editButton);
        pnlUser.add(clearButton);
        pnlUser.add(deleteButton);
        pnlUser.add(logoutButton);

        categoryPanel.add(categoryNameLabel);
        categoryPanel.add(categoryNameTxtField);
        categoryPanel.add(categoryCodeLabel);
        categoryPanel.add(categoryCodeTxtField);
        categoryPanel.add(categoryTableLabel);
        categoryPanel.add(categorySp);
        categoryPanel.add(categorySearchButton);
        categoryPanel.add(categoryCreateButton);
        categoryPanel.add(categoryEditButton);
        categoryPanel.add(categoryClearButton);
        categoryPanel.add(categoryDeleteButton);
        categoryPanel.add(categoryLogoutButton);

        itemPanel.add(itemNameLabel);
        itemPanel.add(itemNameTextField);
        itemPanel.add(itemCodeLabel);
        itemPanel.add(itemCodeTextField);
        itemPanel.add(itemPriceLabel);
        itemPanel.add(itemPriceTextField);
        itemPanel.add(categorizationCategoryNameLabel); //change later
        itemPanel.add(categorizationCategoryNameCmbBox);
        itemPanel.add(categorizationCategoryCodeLabel);
        itemPanel.add(categorizationCategoryCodeTextField);
        itemPanel.add(itemTableLabel);
        itemPanel.add(itemSp);
        itemPanel.add(itemSearchButton);
        itemPanel.add(itemCreateButton);
        itemPanel.add(itemEditButton);
        itemPanel.add(itemClearButton);
        itemPanel.add(itemDeleteButton);
        itemPanel.add(itemLogoutButton);
        itemPanel.add(getCategoryCodeBtn);

        orderDeliveryPanel.add(orderIDLabel);
        orderDeliveryPanel.add(orderIDCmbBox);
        orderDeliveryPanel.add(orderNameLabel);
        orderDeliveryPanel.add(orderNameTxtField);
        orderDeliveryPanel.add(orderContactLabel);
        orderDeliveryPanel.add(orderContactTxtField);
        orderDeliveryPanel.add(orderAddressLabel);
        orderDeliveryPanel.add(orderAddressTxtField);
        orderDeliveryPanel.add(orderItemLabel);
        orderDeliveryPanel.add(orderItemTxtField);
        orderDeliveryPanel.add(orderQuantityLabel);
        orderDeliveryPanel.add(orderQuantityTxtField);
        orderDeliveryPanel.add(orderAmountLabel);
        orderDeliveryPanel.add(orderAmountTxtField);
        orderDeliveryPanel.add(orderPaymentLabel);
        orderDeliveryPanel.add(orderPaymentTxtField);
        orderDeliveryPanel.add(orderCardLabel);
        orderDeliveryPanel.add(orderCardTxtField);
        orderDeliveryPanel.add(orderTimeLabel);
        orderDeliveryPanel.add(orderTimeTxtField);
        orderDeliveryPanel.add(orderDeliveredTimeLabel);
        orderDeliveryPanel.add(orderDeliveredTimeTxtField);
        orderDeliveryPanel.add(orderFeedbackLabel);
        orderDeliveryPanel.add(orderFeedbackTxtField);
        orderDeliveryPanel.add(orderStatusLabel);
        orderDeliveryPanel.add(orderStatusCmbBox);
        orderDeliveryPanel.add(orderDeliveryStaffLabel);
        orderDeliveryPanel.add(orderDeliveryStaffCmbBox);
        orderDeliveryPanel.add(orderDeliveryTableLabel);
        orderDeliveryPanel.add(orderDeliverySp);
        orderDeliveryPanel.add(orderDeliverySearchButton);
        orderDeliveryPanel.add(orderDeliveryUpdateButton);
        orderDeliveryPanel.add(orderDeliveryLogoutButton);

        modifyPanel.add(modifyUsername);
        modifyPanel.add(modifyPassword);
        modifyPanel.add(MUsername);
        modifyPanel.add(MPassword);
        modifyPanel.add(modifyUserAccountBtn);
        modifyPanel.add(New);
        modifyPanel.add(Old);
        modifyPanel.add(NewUsername);
        modifyPanel.add(NewPassword);
        modifyPanel.add(newPassword);
        modifyPanel.add(newUsername);

        TP.add("User Management", pnlUser);
        TP.add("Category Management", categoryPanel);
        TP.add("Item Management", itemPanel);
        TP.add("Order Delivery Management", orderDeliveryPanel);
        TP.add("Modify User Account", modifyPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel is added to the JFrane's content panel
        getContentPane().add(TP);
        //Set this frame visible to be display
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == searchButton) {
            boolean found = false;
            for (StaffProfile staff : JavaAssignment.allStaffs) {
                String staffName = nameTextField.getText();
                if (staffName.equals(staff.getName()))
                {
                    passwordTxtField.setText(staff.getLoginPassword());
                    genderCmbBox.setSelectedItem(staff.getGender());
                    contactTxtField.setText(staff.getContact());
                    addressTxtField.setText(staff.getAddress());
                    postcodeTxtField.setText(Integer.toString(staff.getPostcode()));
                    stateCmbBox.setSelectedItem(staff.getState());
                    emailTxtField.setText(staff.getEmail());
                    roleCmbBox.setSelectedItem(staff.getRole());
                    found = true;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Staff not found");
            }
        } else if (e.getSource() == registerButton) {
            String name = nameTextField.getText();
            String gender = genderCmbBox.getSelectedItem().toString();
            String contact = contactTxtField.getText();
            String address = addressTxtField.getText();
            String postcode = postcodeTxtField.getText();
            String state = stateCmbBox.getSelectedItem().toString();
            String email = emailTxtField.getText();
            String role = roleCmbBox.getSelectedItem().toString();
            String username = emailTxtField.getText();
            String password = passwordTxtField.getText();

            if (!name.equals("") && !gender.equals("") && !contact.equals("") && !address.equals("") && !postcode.equals("") && !state.equals("") && !email.equals("") && !role.equals("")) {
                boolean found = false;
                for (int i = 0; i < JavaAssignment.allStaffs.size(); i++) {
                    StaffProfile user = JavaAssignment.allStaffs.get(i);
                    if (name.equals(user.getName()) || email.equals(user.getEmail())) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(this, "Staff is registered successfully");
                    StaffProfile user = new StaffProfile(username, password,name, gender, contact, address, Integer.parseInt(postcode), state, email, role);
                    UserLogin userLogin = new UserLogin(username, password, role);
                    JavaAssignment.allUser.add(userLogin); //admin and delivery staff to create user account can refer to this (can be implemented when creating user profile in admin user management)
                    JavaAssignment.allStaffs.add(user);
                    DefaultTableModel userModel = (DefaultTableModel) userTable.getModel();
                    userModel.addRow(new Object[]{name, password, gender, contact, address, postcode, state, email, role});

                    try {
                        PrintWriter p = new PrintWriter("StaffData.txt");
                        for (int i = 0; i < JavaAssignment.allStaffs.size(); i++) {
                            StaffProfile staffProfile = JavaAssignment.allStaffs.get(i);
                            p.println(staffProfile.getLoginUsername());
                            p.println(staffProfile.getLoginPassword());
                            p.println(staffProfile.getName());
                            p.println(staffProfile.getGender());
                            p.println(staffProfile.getContact());
                            p.println(staffProfile.getAddress());
                            p.println(staffProfile.getPostcode());
                            p.println(staffProfile.getState());
                            p.println(staffProfile.getEmail());
                            p.println(staffProfile.getRole());
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
                } else {
                    JOptionPane.showMessageDialog(this, "This staff is existing in the record");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the information completely");
            }
        } else if (e.getSource() == editButton) {
            StaffProfile user = null;
            String name = nameTextField.getText();
            boolean found = false;
            int i = 0;
            for (i = 0; i < JavaAssignment.allStaffs.size(); i++) {
                StaffProfile staffProfile = JavaAssignment.allStaffs.get(i);
                if (name.equals(staffProfile.getName())) {
                    found = true;
                    user = staffProfile;
                    break;
                }
            }
            if (found) {
                String password = passwordTxtField.getText();
                String gender = genderCmbBox.getSelectedItem().toString();
                String contact = contactTxtField.getText();
                String address = addressTxtField.getText();
                String postcode = postcodeTxtField.getText();
                String state = stateCmbBox.getSelectedItem().toString();
                String email = emailTxtField.getText();
                String role = roleCmbBox.getSelectedItem().toString();

                JOptionPane.showMessageDialog(this, "Profile is edited successfully!");
                user.setLoginPassword(password);
                user.setGender(gender);
                user.setContact(contact);
                user.setAddress(address);
                user.setPostcode(Integer.parseInt(postcode));
                user.setState(state);
                user.setEmail(email);
                user.setRole(role);

                //setValueAt(the new value, the row whose value is to be changed,the column whose value is to be changed)
                DefaultTableModel userModel = (DefaultTableModel) userTable.getModel();
                userModel.setValueAt(password, i, 1);
                userModel.setValueAt(gender, i, 2);
                userModel.setValueAt(contact, i, 3);
                userModel.setValueAt(address, i, 4);
                userModel.setValueAt(postcode, i, 5);
                userModel.setValueAt(state, i, 6);
                userModel.setValueAt(email, i, 7);
                userModel.setValueAt(role, i, 8);

                try {
                    PrintWriter pw1 = new PrintWriter("StaffData.txt");
                    for (int ii = 0; ii < JavaAssignment.allStaffs.size(); ii++) {
                        StaffProfile staffProfileDetails = JavaAssignment.allStaffs.get(ii);
                        pw1.println(staffProfileDetails.getLoginUsername());
                        pw1.println(staffProfileDetails.getLoginPassword());
                        pw1.println(staffProfileDetails.getName());
                        pw1.println(staffProfileDetails.getGender());
                        pw1.println(staffProfileDetails.getContact());
                        pw1.println(staffProfileDetails.getPostcode());
                        pw1.println(staffProfileDetails.getState());
                        pw1.println(staffProfileDetails.getAddress());
                        pw1.println(staffProfileDetails.getEmail());
                        pw1.println(staffProfileDetails.getRole());
                        pw1.println();
                    }
                    pw1.close();
                } catch (Exception exc) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! This staff is not existing in the record");
            }
        } else if (e.getSource() == clearButton) {
            nameTextField.setText("");
            passwordTxtField.setText("");
            genderCmbBox.setSelectedIndex(0);
            contactTxtField.setText("");
            addressTxtField.setText("");
            postcodeTxtField.setText("");
            stateCmbBox.setSelectedIndex(0);
            emailTxtField.setText("");
            roleCmbBox.setSelectedIndex(0);

        } else if (e.getSource() == deleteButton) {
            StaffProfile user = null;
            String name = nameTextField.getText();
            boolean found = false;
            int i = 0;
            for (i = 0; i < JavaAssignment.allStaffs.size(); i++) {
                StaffProfile staffProfile = JavaAssignment.allStaffs.get(i);
                if (name.equals(staffProfile.getName())) {
                    found = true;
                    user = staffProfile;
                    JavaAssignment.allStaffs.remove(staffProfile);
                    break;
                }
            }
            if (found) {
                DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                model.removeRow(i);
                try {
                    PrintWriter p1 = new PrintWriter("StaffData.txt");
                    for (int ii = 0; ii < JavaAssignment.allStaffs.size(); ii++) {
                        StaffProfile staffProfileDetails = JavaAssignment.allStaffs.get(ii);
                        p1.println(staffProfileDetails.getLoginUsername());
                        p1.println(staffProfileDetails.getLoginPassword());
                        p1.println(staffProfileDetails.getName());
                        p1.println(staffProfileDetails.getGender());
                        p1.println(staffProfileDetails.getContact());
                        p1.println(staffProfileDetails.getPostcode());
                        p1.println(staffProfileDetails.getState());
                        p1.println(staffProfileDetails.getAddress());
                        p1.println(staffProfileDetails.getEmail());
                        p1.println(staffProfileDetails.getRole());
                        p1.println();
                    }
                    p1.close();
                } catch (Exception exc) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! This staff is not existing in record");
            }
        } else if (e.getSource() == logoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Logout" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {
                JOptionPane.showMessageDialog(this, er);
            }
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == categorySearchButton) {
            boolean found = false;
            for (CategoryDetails category : JavaAssignment.allCategories) {
                String categoryName = categoryNameTxtField.getText();
                if (categoryName.equals(category.getCategoryName())) {
                    categoryCodeTxtField.setText(category.getCategoryCode());
                    found = true;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Category not found");
            }
        } else if (e.getSource() == categoryCreateButton) {
            String categoryName = categoryNameTxtField.getText();
            String categoryCode = categoryCodeTxtField.getText();

            if (!categoryName.equals("") && !categoryCode.equals("")) {
                boolean found = false;
                for (int i = 0; i < JavaAssignment.allCategories.size(); i++) {
                    CategoryDetails category = JavaAssignment.allCategories.get(i);
                    if (categoryName.equals(category.getCategoryName())) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    CategoryDetails category = new CategoryDetails(categoryName, categoryCode);
                    JavaAssignment.allCategories.add(category);
                    DefaultTableModel categoryModel = (DefaultTableModel) categoryTable.getModel();
                    categoryModel.addRow(new Object[]{categoryName, categoryCode});
                    categorizationCategoryNameCmbBox.addItem(categoryName);
                    JOptionPane.showMessageDialog(this, "Category is created successfully!");

                    try {
                        PrintWriter p2 = new PrintWriter("CategoryData.txt");
                        for (int i = 0; i < JavaAssignment.allCategories.size(); i++) {
                            CategoryDetails categoryDetails = JavaAssignment.allCategories.get(i);
                            p2.println(categoryDetails.getCategoryName());
                            p2.println(categoryDetails.getCategoryCode());
                            p2.println();
                        }
                        p2.close();
                    } catch (Exception exc) {

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "This category exists in the record");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill the information completely!");
            }
        } else if (e.getSource() == categoryEditButton) {
            CategoryDetails category = null;
            String categoryName = categoryNameTxtField.getText();
            boolean found = false;
            int i = 0;
            for (i = 0; i < JavaAssignment.allCategories.size(); i++) {
                CategoryDetails categoryDetails = JavaAssignment.allCategories.get(i);
                if (categoryName.equals(categoryDetails.getCategoryName())) {
                    found = true;
                    category = categoryDetails;
                    break;
                }
            }
            if (found) {
                String categoryCode = categoryCodeTxtField.getText();

                JOptionPane.showMessageDialog(this, "Category is edited successfully!");

                category.setCategoryCode(categoryCode);
                DefaultTableModel categoryModel = (DefaultTableModel) categoryTable.getModel();
                categoryModel.setValueAt(categoryCode, i, 1);

                try {
                    PrintWriter p2 = new PrintWriter("CategoryData.txt");
                    for (int u = 0; u < JavaAssignment.allCategories.size(); u++) {
                        CategoryDetails categoryDetails = JavaAssignment.allCategories.get(u);
                        p2.println(categoryDetails.getCategoryName());
                        p2.println(categoryDetails.getCategoryCode());
                        p2.println();
                    }
                    p2.close();
                } catch (Exception exc) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "This category is not existing in the record");
            }
        } else if (e.getSource() == categoryClearButton) {
            categoryNameTxtField.setText("");
            categoryCodeTxtField.setText("");

        } else if (e.getSource() == categoryDeleteButton) {
            CategoryDetails category = null;
            String categoryName = categoryNameTxtField.getText();
            boolean found = false;
            int i = 0;
            for (i = 0; i < JavaAssignment.allCategories.size(); i++) {
                CategoryDetails categoryDetails = JavaAssignment.allCategories.get(i);
                if (categoryName.equals(categoryDetails.getCategoryName())) {
                    found = true;
                    category = categoryDetails;
                    JavaAssignment.allCategories.remove(categoryDetails);
                    break;
                }
            }
            if (found) {
                DefaultTableModel categoryModel = (DefaultTableModel) categoryTable.getModel();
                categoryModel.removeRow(i);

                try {
                    PrintWriter p2 = new PrintWriter("CategoryData.txt");
                    for (int ii = 0; ii < JavaAssignment.allCategories.size(); ii++) {
                        CategoryDetails CD = JavaAssignment.allCategories.get(ii);
                        p2.println(CD.getCategoryName());
                        p2.println(CD.getCategoryCode());
                        p2.println();
                    }
                    p2.close();
                } catch (Exception exc) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "This category does not exist in the record!");
            }
        } else if (e.getSource() == categoryLogoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Logout" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {
                JOptionPane.showMessageDialog(this, er);
            }
            setVisible(false);
            LoginPage lg = new LoginPage();
            lg.setVisible(true);
        } else if (e.getSource() == itemSearchButton) {
            boolean found = false;
            for (ItemDetails item : JavaAssignment.allItems) {
                String itemName = itemNameTextField.getText();
                if (itemName.equals(item.getItemName())) {
                    itemCodeTextField.setText(item.getItemCode());
                    itemPriceTextField.setText(item.getItemPrice().toString());
                    categorizationCategoryNameCmbBox.setSelectedItem(item.getCategoryName());
                    categorizationCategoryCodeTextField.setText(item.getCategoryCode());
                    found = true;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Item not found");
            }
        } else if (e.getSource() == itemCreateButton) {
            String itemName = itemNameTextField.getText();
            String itemCode = itemCodeTextField.getText();
            String itemPrice = itemPriceTextField.getText();
            String categoryName = categorizationCategoryNameCmbBox.getSelectedItem().toString();
            String categoryCode = categorizationCategoryCodeTextField.getText();

            if (!itemName.equals("") && !itemCode.equals("") && !itemPrice.equals("") && !categoryName.equals("") && !categoryCode.equals("")) {
                boolean found = false;
                for (int i = 0; i < JavaAssignment.allItems.size(); i++) {
                    ItemDetails item = JavaAssignment.allItems.get(i);
                    if (itemName.equals(item.getItemName())) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    ItemDetails item = new ItemDetails(itemName, itemCode, Double.parseDouble(itemPrice), categoryName, categoryCode);
                    JavaAssignment.allItems.add(item);
                    DefaultTableModel itemModel = (DefaultTableModel) itemTable.getModel();
                    itemModel.addRow(new Object[]{itemName, itemCode, itemPrice, categoryName, categoryCode});
                    JOptionPane.showMessageDialog(this, "Item [ " + itemName + " ] is successfully categorized into [ " + categoryName + " ]");
                    try {
                        PrintWriter p3 = new PrintWriter("ItemData.txt");
                        for (int i = 0; i < JavaAssignment.allItems.size(); i++) {
                            ItemDetails itemDetails = JavaAssignment.allItems.get(i);
                            p3.println(itemDetails.getItemName());
                            p3.println(itemDetails.getItemCode());
                            p3.println(itemDetails.getItemPrice());
                            p3.println(itemDetails.getCategoryName());
                            p3.println(itemDetails.getCategoryCode());
                            p3.println();
                        }
                        p3.close();
                    } catch (Exception ect) {

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "This item exists in the record");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill the information completely");
            }
        } else if (e.getSource() == itemEditButton) {
            ItemDetails item = null;
            //MarkDetails mdl = null;
            String itemName = itemNameTextField.getText();
            String itemCode = itemCodeTextField.getText();
            String itemPrice = itemPriceTextField.getText();
            String categoryName = categorizationCategoryNameCmbBox.getSelectedItem().toString();
            String categoryCode = categorizationCategoryCodeTextField.getText();
            boolean found = false;
            int i = 0;
            for (i = 0; i < JavaAssignment.allItems.size(); i++) {
                ItemDetails itemDetails = JavaAssignment.allItems.get(i);
                if (itemName.equals(itemDetails.getItemName()) && categoryName.equals(itemDetails.getCategoryName())) {
                    found = true;
                    item = itemDetails;
                    break;
                }
            }
            if (found) {
                JOptionPane.showMessageDialog(this, "Item is edited successfully");
                item.setItemCode(itemCode);
                item.setItemPrice(Double.valueOf(itemPrice));
                item.setCategoryName(categoryName);
                item.setCategoryCode(categoryCode);

                //setValueAt(the new value, the row whose value is to be changed,the column whose value is to be changed)
                DefaultTableModel itemModel = (DefaultTableModel) itemTable.getModel();
                itemModel.setValueAt(itemCode, i, 1);
                itemModel.setValueAt(itemPrice, i, 2);
                itemModel.setValueAt(categoryName, i, 3);
                itemModel.setValueAt(categoryCode, i, 4);

                try {
                    PrintWriter p3 = new PrintWriter("ItemData.txt");
                    for (int ii = 0; ii < JavaAssignment.allItems.size(); ii++) {
                        ItemDetails itemDetails = JavaAssignment.allItems.get(ii);
                        p3.println(itemDetails.getItemName());
                        p3.println(itemDetails.getItemCode());
                        p3.println(itemDetails.getItemPrice());
                        p3.println(itemDetails.getCategoryName());
                        p3.println(itemDetails.getCategoryCode());
                        p3.println();
                    }
                    p3.close();
                } catch (Exception ect) {

                }

            } else {
                JOptionPane.showMessageDialog(this, "Item and category does not match");
            }
        } else if (e.getSource() == itemClearButton) {
            itemNameTextField.setText("");
            itemCodeTextField.setText("");
            itemPriceTextField.setText("");
            categorizationCategoryNameCmbBox.setSelectedIndex(0);
            categorizationCategoryCodeTextField.setText("");
        } else if (e.getSource() == itemDeleteButton) {
            ItemDetails item = null;
            boolean found = false;
            int i = 0;
            String itemName = itemNameTextField.getText();
            String itemCode = itemCodeTextField.getText();
            String itemPrice = itemPriceTextField.getText();
            String categoryName = categorizationCategoryNameCmbBox.getSelectedItem().toString();
            String categoryCode = categorizationCategoryCodeTextField.getText();

            for (i = 0; i < JavaAssignment.allItems.size(); i++) {
                ItemDetails itemDetails = JavaAssignment.allItems.get(i);
                if (itemName.equals(itemDetails.getItemName())) {
                    found = true;
                    item = itemDetails;
                    JavaAssignment.allItems.remove(itemDetails);
                    break;

                }
            }
            if (found) {
                DefaultTableModel itemModel = (DefaultTableModel) itemTable.getModel();
                itemModel.removeRow(i);
                try {
                    PrintWriter p3 = new PrintWriter("ItemData.txt");
                    for (int ii = 0; ii < JavaAssignment.allItems.size(); ii++) {
                        ItemDetails itemDetails = JavaAssignment.allItems.get(ii);
                        p3.println(itemDetails.getItemName());
                        p3.println(itemDetails.getItemCode());
                        p3.println(itemDetails.getItemPrice());
                        p3.println(itemDetails.getCategoryName());
                        p3.println(itemDetails.getCategoryCode());
                        p3.println();
                    }
                    p3.close();
                } catch (Exception ect) {

                }
            }
        } else if (e.getSource() == itemLogoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Logout" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {
                JOptionPane.showMessageDialog(this, er);
            }
            setVisible(false);
            LoginPage lg = new LoginPage();
            lg.setVisible(true);
        } else if (e.getSource() == getCategoryCodeBtn) {
            for (CategoryDetails category : JavaAssignment.allCategories) {
                String categoryName = categorizationCategoryNameCmbBox.getSelectedItem().toString();

                if (categoryName.equals(category.getCategoryName())) {
                    categorizationCategoryCodeTextField.setText(category.getCategoryCode());
                }
            }
        } else if (e.getSource() == orderDeliverySearchButton) {
            for (OrderDetails order : JavaAssignment.allOrders) {
                String orderID = orderIDCmbBox.getSelectedItem().toString();
                String cardDetails = order.getCardType() + ", " + order.getCardNumber() + ", " + order.getCVV() + ", " + order.getExpiryDate();
                if (orderID.equals(order.getOrderID())) {
                    orderNameTxtField.setText(order.getName());
                    orderContactTxtField.setText(order.getContact());
                    orderAddressTxtField.setText(order.getAddress());
                    orderItemTxtField.setText(order.getItem());
                    orderQuantityTxtField.setText(order.getQuantity());
                    orderAmountTxtField.setText(order.getAmount().toString());
                    orderPaymentTxtField.setText(order.getPaymentMethod());
                    orderTimeTxtField.setText(order.getOrderTime());
                    orderDeliveredTimeTxtField.setText(order.getOrderDeliveredTime());
                    orderFeedbackTxtField.setText(order.getOrderFeedback());
                    orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                    orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                    if (order.getPaymentMethod().equals("Card")) {
                        orderCardTxtField.setText(cardDetails);
                    } else if (order.getPaymentMethod().equals("Cash On Delivery")) {
                        orderCardTxtField.setText("");
                    }
                }
            }
            if (orderDeliveryStaffCmbBox.getSelectedItem().equals("Delivering") || orderDeliveryStaffCmbBox.getSelectedItem().equals("Delivered Successfully")) {
                orderDeliveryStaffCmbBox.setEnabled(false);
            }
        } else if (e.getSource() == orderDeliveryUpdateButton) {
            OrderDetails order = null;
            String orderID = orderIDCmbBox.getSelectedItem().toString();
            boolean found = false;
            int i;
            for (i = 0; i < JavaAssignment.allOrders.size(); i++) {
                OrderDetails orderDetails = JavaAssignment.allOrders.get(i);
                if (orderID.equals(orderDetails.getOrderID())) {
                    found = true;
                    order = orderDetails;
                    break;
                }
            }
            if (found) {
                String status = orderStatusCmbBox.getSelectedItem().toString();
                String deliveryStaff = orderDeliveryStaffCmbBox.getSelectedItem().toString();
                if (!status.equals("")) {
                    if (order.getOrderStatus().equals("Completed")) {
                        if (status.equals("In Progress") || status.equals("Ready To Deliver") || status.equals("Delivering") || status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "Order is already completed");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        }
                    } else if (order.getOrderStatus().equals("In Progress")) {
                        if (status.equals("Ready To Deliver")) {
                            if (deliveryStaff.equals("")) {
                                JOptionPane.showMessageDialog(this, "Please assign this order to a delivery staff");
                            } else if (!deliveryStaff.equals("")) {
                                JOptionPane.showMessageDialog(this, "Order has been assigned to " + deliveryStaff + " successfully");
                                order.setOrderStatus(status);
                                order.setDeliveryStaff(deliveryStaff);
                                DefaultTableModel orderModel = (DefaultTableModel) orderDeliveryTable.getModel();
                                orderModel.setValueAt(status, i, 8);
                                orderModel.setValueAt(deliveryStaff, i, 9);
                            }
                        } else if (status.equals("In Progress")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        } else if (status.equals("Completed") || status.equals("Delivering") || status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "This order has not been assigned to any deliery staff yet");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        }
                    } else if (order.getOrderStatus().equals("Ready To Deliver")) {
                        if (status.equals("In Progress")) {
                            JOptionPane.showMessageDialog(this, "Order is ready to be delivered");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        } else if (status.equals("Ready To Deliver")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        } else if (status.equals("Completed") || status.equals("Delivering") || status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "The assigned delivery staff has not delivered this order yet");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        }
                    } else if (order.getOrderStatus().equals("Delivering")) {
                        if (status.equals("In Progress") || status.equals("Completed") || status.equals("Ready To Deliver") || status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "Staff is handling the order now");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        } else if (status.equals("Delivering")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        }
                    } else if (order.getOrderStatus().equals("Delivered Successfully")) {
                        if (status.equals("Completed")) {
                            JOptionPane.showMessageDialog(this, "This order is now completed");
                            order.setOrderStatus(status);
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                            DefaultTableModel orderModel = (DefaultTableModel) orderDeliveryTable.getModel();
                            orderModel.setValueAt(status, i, 8);
                        } else if (status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        } else if (status.equals("In Progress") || status.equals("Delivering") || status.equals("Ready To Deliver")) {
                            JOptionPane.showMessageDialog(this, "Staff is handling the order now");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                            orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid option");
                        orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        orderDeliveryStaffCmbBox.setSelectedItem(order.getDeliveryStaff());
                    }

                }
                try {
                    PrintWriter p1 = new PrintWriter("AllOrders.txt");
                    for (int ii = 0; ii < JavaAssignment.allOrders.size(); ii++) {
                        OrderDetails orderDetails = JavaAssignment.allOrders.get(ii);
                        p1.println(orderDetails.getLoginUsername());
                        p1.println(orderDetails.getOrderID());
                        p1.println(orderDetails.getName());
                        p1.println(orderDetails.getContact());
                        p1.println(orderDetails.getAddress());
                        p1.println(orderDetails.getItem());
                        p1.println(orderDetails.getQuantity());
                        p1.println(orderDetails.getAmount());
                        p1.println(orderDetails.getPaymentMethod());
                        p1.println(orderDetails.getCardType());
                        p1.println(orderDetails.getCardNumber());
                        p1.println(orderDetails.getCVV());
                        p1.println(orderDetails.getExpiryDate());
                        p1.println(orderDetails.getOrderTime());
                        p1.println(orderDetails.getOrderDeliveredTime());
                        p1.println(orderDetails.getOrderStatus());
                        p1.println(orderDetails.getDeliveryStaff());
                        p1.println(orderDetails.getOrderFeedback());
                        p1.println();
                    }
                    p1.close();
                } catch (Exception exc) {

                }
            }
        } else if (e.getSource() == orderDeliveryLogoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Logout" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {
                JOptionPane.showMessageDialog(this, er);
            }
            setVisible(false);
            LoginPage lg = new LoginPage();
            lg.setVisible(true);
        } else if (e.getSource() == modifyUserAccountBtn) {
            if (!modifyUsername.getText().equals("") && !modifyPassword.getText().equals("") && !newUsername.getText().equals("") && !newPassword.getText().equals("")) {
                UserLogin userlog = null;
                String modusername = modifyUsername.getText();
                String modpassword = modifyPassword.getText();
                String role = "";
                boolean datafound = false;
                for (int i = 0; i < JavaAssignment.allUser.size(); i++) {
                    UserLogin UL = JavaAssignment.allUser.get(i);
                    if (modusername.equals(UL.getLoginUsername()) && modpassword.equals(UL.getLoginPassword())) {
                        datafound = true;
                        role = UL.getRole();
                        userlog = UL;
                        break;
                    }

                }
                if (datafound) {
                    String username = newUsername.getText();
                    String password = newPassword.getText();

                    JOptionPane.showMessageDialog(this, "User account is successfully modified");
                    userlog.setLoginUsername(username);
                    userlog.setLoginPassword(password);
                    userlog.setRole(role);

                    JavaAssignment.customer.setLoginUsername(username);
                    JavaAssignment.customer.setLoginPassword(password);

                    try {
                        PrintWriter p = new PrintWriter("AllLogins.txt");
                        for (int j = 0; j < JavaAssignment.allUser.size(); j++) {
                            UserLogin UL = JavaAssignment.allUser.get(j);
                            p.println(UL.getLoginUsername());
                            p.println(UL.getLoginPassword());
                            p.println(UL.getRole());

                            p.println();
                        }
                        p.close();
                    } catch (Exception ex) {
                    }
                    try {
                        PrintWriter p = new PrintWriter("StaffData.txt");
                        for (int j = 0; j < JavaAssignment.allStaffs.size(); j++) {
                            JavaAssignment.staff = JavaAssignment.allStaffs.get(j);
                            p.println(JavaAssignment.staff.getLoginUsername());
                            p.println(JavaAssignment.staff.getName());
                            p.println(JavaAssignment.staff.getLoginPassword());
                            p.println(JavaAssignment.staff.getGender());
                            p.println(JavaAssignment.staff.getContact());
                            p.println(JavaAssignment.staff.getAddress());
                            p.println(JavaAssignment.staff.getPostcode());
                            p.println(JavaAssignment.staff.getState());
                            p.println(JavaAssignment.staff.getEmail());
                            p.println(JavaAssignment.staff.getLoginPassword());
                            p.println(JavaAssignment.staff.getRole());

                            p.println();
                        }
                        p.close();
                    } catch (Exception ex) {
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong initial account information!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all the details");
            }
        }
    }

    public void itemStateChanged(ItemEvent ie) {
        
    }
}
