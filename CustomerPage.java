
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
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
 * @author han
 */
class CustomerPage extends JFrame implements ActionListener, ItemListener {

    //declaration here
    private JTabbedPane TP;

    //customer profile
    private JPanel userPanel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel nameLabel;
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
    private JButton editButton;
    private JButton logoutButton;

    //purchase history
    private JPanel historyPanel;
    private JLabel historyTableLabel;
    private JTable historyTable;
    private JScrollPane historySp;
    private JButton historyLogoutButton;

    //order feedback
    private JPanel orderFeedbackPanel;
    private JLabel orderIDLabel;
    private JComboBox orderIDCmbBox;
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
    private JTextField orderStatusTxtField;
    private JButton orderFeedbackSearchButton;
    private JButton sendFeedbackButton;
    private JButton orderFeedbackLogoutButton;

    //shop
    private JPanel shopPanel;
    private JLabel searchLabel;
    private JLabel itemNameLabel;
    private JComboBox itemNameCmbBox;
    private JLabel itemCodeLabel;
    private JTextField itemCodeTextField;
    private JLabel itemPriceLabel;
    private JTextField itemPriceTextField;
    private JLabel categorizationCategoryNameLabel;
    private JTextField categorizationCategoryNameTextField;
    private JLabel categorizationCategoryCodeLabel;
    private JTextField categorizationCategoryCodeTextField;
    private JLabel itemTableLabel;
    private JTable itemTable;
    private JScrollPane itemSp;
    private JButton itemLogoutButton;
    private JButton itemSearchButton;
    private JLabel orderLabel;
    private JLabel itemLabel;
    private JComboBox itemCmbBox;
    private JLabel quantityLabel;
    private JTextField quantityTextField;
    private JLabel priceLabel;
    private JTextField priceTextField;
    private JButton addToCartBtn;
    private JButton checkPriceBtn;

    //cart
    private JPanel cartPanel;
    private JLabel cartItemLabel;
    private JTextField cartItemTxtField;
    private JLabel cartQuantityLabel;
    private JTextField cartQuantityTxtField;
    private JLabel cartAmountLabel;
    private JTextField cartAmountTxtField;
    private JLabel cartNameLabel;
    private JTextField cartNameTxtField;
    private JLabel cartContactLabel;
    private JTextField cartContactTxtField;
    private JLabel cartAddressLabel;
    private JTextField cartAddressTxtField;
    private JLabel paymentLabel;
    private JComboBox paymentCmbBox;
    private JLabel cardTypeLabel;
    private JComboBox cardTypeCmbBox;
    private JLabel cardNumberLabel;
    private JTextField cardNumberTxtField;
    private JLabel cvvLabel;
    private JTextField cvvTxtField;
    private JLabel expiryDateLabel;
    private JTextField expiryDateTxtField;
    private JButton removeCartBtn;
    private JButton checkoutCartBtn;
    private JButton cartLogoutButton;

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

    public CustomerPage() {
        setSize(1200, 600);
        setTitle("Customer Window");

        TP = new JTabbedPane();

        //user stuff start here
        userPanel = new JPanel();
        userPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(570, 20, 165, 25);

        String currentUser = JavaAssignment.user.getLoginUsername();
        usernameTextField = new JTextField(currentUser, 25);
        usernameTextField.setBounds(680, 20, 230, 25);
        usernameTextField.setEditable(false);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(570, 50, 165, 25);

        nameTextField = new JTextField(JavaAssignment.customer.getName());
        nameTextField.setBounds(680, 50, 230, 25);

        passwordLabel = new JLabel("IC Number: ");
        passwordLabel.setBounds(570, 80, 165, 25);

        passwordTxtField = new JTextField(JavaAssignment.customer.getLoginPassword());
        passwordTxtField.setBounds(680, 80, 230, 25);

        genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(570, 110, 165, 25);

        String[] genderList = {"", "Male", "Female", "Other"};
        genderCmbBox = new JComboBox(genderList);
        genderCmbBox.setBounds(680, 110, 230, 25);
        genderCmbBox.setSelectedItem(JavaAssignment.customer.getGender());

        contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(570, 260, 165, 25);

        contactTxtField = new JTextField(JavaAssignment.customer.getContact());
        contactTxtField.setBounds(680, 260, 230, 25);

        addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(570, 290, 165, 25);

        addressTxtField = new JTextField(JavaAssignment.customer.getAddress());
        addressTxtField.setBounds(680, 290, 230, 25);

        postcodeLabel = new JLabel("Postcode:");
        postcodeLabel.setBounds(570, 320, 165, 25);

        postcodeTxtField = new JTextField(Integer.toString(JavaAssignment.customer.getPostcode()));
        postcodeTxtField.setBounds(680, 320, 230, 25);

        stateLabel = new JLabel("State:");
        stateLabel.setBounds(570, 350, 165, 25);

        String[] countryList = {"", "Sarawak", "Sabah", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Selangor", "Terengganu", "Kuala Lumpur", "Labuan", "Putrajaya", "Other"};
        stateCmbBox = new JComboBox(countryList);
        stateCmbBox.setBounds(680, 350, 230, 25);
        stateCmbBox.setSelectedItem(JavaAssignment.customer.getState());

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(570, 380, 165, 25);

        emailTxtField = new JTextField(JavaAssignment.customer.getEmail());
        emailTxtField.setBounds(680, 380, 230, 25);

        editButton = new JButton("Edit");
        editButton.setBounds(680, 410, 165, 25);
        editButton.addActionListener(this);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(1250, 450, 165, 25);
        logoutButton.addActionListener(this);

        //user stuff end here
        //history stuff start here
        historyPanel = new JPanel();
        historyPanel.setLayout(null);

        historyTableLabel = new JLabel("Record Table: ");
        historyTableLabel.setBounds(10, 1, 165, 25);

        String username = JavaAssignment.customer.getLoginUsername(); 
        
        for (int i = 0; i < JavaAssignment.allHistory.size(); i++) {
            OrderDetails history = JavaAssignment.allHistory.get(i);
            if (username.equals(history.getLoginUsername())) {
                String orderID = history.getOrderID();
                String name = history.getName();
                String contact = history.getContact();
                String address = history.getAddress();
                String items = history.getItem();
                String quantity = history.getQuantity();
                Double amount = history.getAmount();
                String paymentMethod = history.getPaymentMethod();
                String cardType = history.getCardType();
                String cardNumber = history.getCardNumber();
                String cvv = history.getCVV();
                String expiryDate = history.getExpiryDate();
                String orderTime = history.getOrderTime();
                String orderDeliveredTime = history.getOrderDeliveredTime();
                String orderStatus = history.getOrderStatus();
                String deliveryStaff = history.getDeliveryStaff();
                String orderFeedback = history.getOrderFeedback();
                OrderDetails userHistory = new OrderDetails(username, orderID, name, contact, address, items, quantity, amount, paymentMethod, cardType, cardNumber, cvv, expiryDate, orderTime, orderDeliveredTime, orderStatus, deliveryStaff, orderFeedback);
                JavaAssignment.userHistory.add(userHistory);
            }
        }
        int historySize = JavaAssignment.userHistory.size();
        String[][] rows = new String[historySize][10];
        for (int i = 0; i < historySize; i++) {
            OrderDetails history = JavaAssignment.userHistory.get(i);
            if (history.getPaymentMethod().equals("Card")) {
                String cardDetails = history.getCardType() + ", " + history.getCardNumber() + ", " + history.getCVV() + ", " + history.getExpiryDate();
                rows[i][0] = history.getOrderID();
                rows[i][1] = "" + history.getItem();
                rows[i][2] = "" + history.getQuantity();
                rows[i][3] = "" + history.getAmount();
                rows[i][4] = "" + history.getPaymentMethod();
                rows[i][5] = "" + cardDetails;
                rows[i][6] = "" + history.getOrderTime();
                rows[i][7] = "" + history.getOrderDeliveredTime();
                rows[i][8] = "" + history.getOrderStatus();
                rows[i][9] = "" + history.getOrderFeedback();
            } else if (history.getPaymentMethod().equals("Cash On Delivery")) {
                String emptyCardDetails = "-";
                rows[i][0] = history.getOrderID();
                rows[i][1] = "" + history.getItem();
                rows[i][2] = "" + history.getQuantity();
                rows[i][3] = "" + history.getAmount();
                rows[i][4] = "" + history.getPaymentMethod();
                rows[i][5] = "" + emptyCardDetails;
                rows[i][6] = "" + history.getOrderTime();
                rows[i][7] = "" + history.getOrderDeliveredTime();
                rows[i][8] = "" + history.getOrderStatus();
                rows[i][9] = "" + history.getOrderFeedback();
            }
        }
        String[] historyColumns = {"Order ID", "Items", "Quantity", "Total Amount", "Payment Method", "Card Details", "Ordered Time", "Delivered Time", "Order Status", "Feedback"};
        DefaultTableModel historyModel = new DefaultTableModel(rows, historyColumns);
        historyTable = new JTable(historyModel);
        historySp = new JScrollPane(historyTable);
        historySp.setBounds(10, 20, 1460, 400);

        historyLogoutButton = new JButton("Logout");
        historyLogoutButton.setBounds(1250, 450, 165, 25);
        historyLogoutButton.addActionListener(this);

        //history stuff end here
        //order stuff start here
        orderFeedbackPanel = new JPanel();
        orderFeedbackPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        orderIDLabel = new JLabel("Order ID: ");
        orderIDLabel.setBounds(570, 20, 80, 25);

        //every registered category will be passed into this category combo box
        ArrayList<String> orderList = new ArrayList<String>();
        orderList.add("");
        for (int i = 0; i < JavaAssignment.allOrders.size(); i++) {
            OrderDetails OD = JavaAssignment.allOrders.get(i);
            if (OD.getLoginUsername().equals(username) && OD.getOrderStatus().equals("Delivered Successfully")) {
                orderList.add(OD.getOrderID());
            }
        }
        orderIDCmbBox = new JComboBox(orderList.toArray());
        orderIDCmbBox.setBounds(680, 20, 230, 25);

        orderItemLabel = new JLabel("Items:");
        orderItemLabel.setBounds(570, 80, 165, 25);

        orderItemTxtField = new JTextField(25);
        orderItemTxtField.setBounds(680, 80, 230, 25);
        orderItemTxtField.setEditable(false);

        orderQuantityLabel = new JLabel("Quantity:");
        orderQuantityLabel.setBounds(570, 110, 165, 25);

        orderQuantityTxtField = new JTextField(25);
        orderQuantityTxtField.setBounds(680, 110, 230, 25);
        orderQuantityTxtField.setEditable(false);

        orderAmountLabel = new JLabel("Total Amount:");
        orderAmountLabel.setBounds(570, 140, 165, 25);

        orderAmountTxtField = new JTextField(25);
        orderAmountTxtField.setBounds(680, 140, 230, 25);
        orderAmountTxtField.setEditable(false);

        orderPaymentLabel = new JLabel("Payment Method:");
        orderPaymentLabel.setBounds(570, 170, 165, 25);

        orderPaymentTxtField = new JTextField(25);
        orderPaymentTxtField.setBounds(680, 170, 230, 25);
        orderPaymentTxtField.setEditable(false);

        orderCardLabel = new JLabel("Card Details:");
        orderCardLabel.setBounds(570, 200, 165, 25);

        orderCardTxtField = new JTextField(25);
        orderCardTxtField.setBounds(680, 200, 230, 25);
        orderCardTxtField.setEditable(false);

        orderTimeLabel = new JLabel("Ordered Time:");
        orderTimeLabel.setBounds(570, 230, 165, 25);

        orderTimeTxtField = new JTextField(25);
        orderTimeTxtField.setBounds(680, 230, 230, 25);
        orderTimeTxtField.setEditable(false);

        orderDeliveredTimeLabel = new JLabel("Delivered Time:");
        orderDeliveredTimeLabel.setBounds(570, 260, 165, 25);

        orderDeliveredTimeTxtField = new JTextField(25);
        orderDeliveredTimeTxtField.setBounds(680, 260, 230, 25);
        orderDeliveredTimeTxtField.setEditable(false);

        orderFeedbackLabel = new JLabel("Feedback:");
        orderFeedbackLabel.setBounds(570, 290, 165, 25);

        orderFeedbackTxtField = new JTextField(25);
        orderFeedbackTxtField.setBounds(680, 290, 230, 25);

        orderStatusLabel = new JLabel("Order Status:");
        orderStatusLabel.setBounds(570, 320, 165, 25);

        orderStatusTxtField = new JTextField(25);
        orderStatusTxtField.setBounds(680, 320, 230, 25);
        orderStatusTxtField.setEditable(false);

        orderFeedbackSearchButton = new JButton("Search");
        orderFeedbackSearchButton.setBounds(680, 50, 165, 25);
        orderFeedbackSearchButton.addActionListener(this);

        sendFeedbackButton = new JButton("Submit Feedback");
        sendFeedbackButton.setBounds(680, 350, 165, 25);
        sendFeedbackButton.addActionListener(this);

        orderFeedbackLogoutButton = new JButton("Logout");
        orderFeedbackLogoutButton.setBounds(1250, 450, 165, 25);
        orderFeedbackLogoutButton.addActionListener(this);

        //order stuff end here
        //item stuff start here
        shopPanel = new JPanel();
        shopPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        searchLabel = new JLabel("----------------Item Details----------------");
        searchLabel.setBounds(10, 1, 400, 25);

        itemNameLabel = new JLabel("Item Name: ");
        itemNameLabel.setBounds(10, 30, 80, 25);

        //every registered category will be passed into this category combo box
        ArrayList<String> itemList = new ArrayList<String>();
        itemList.add("");
        for (int i = 0; i < JavaAssignment.allItems.size(); i++) {
            ItemDetails cd = JavaAssignment.allItems.get(i);
            itemList.add(cd.getItemName());
        }
        itemNameCmbBox = new JComboBox(itemList.toArray());
        itemNameCmbBox.setBounds(120, 30, 230, 25);

        itemCodeLabel = new JLabel("Item Code: ");
        itemCodeLabel.setBounds(10, 90, 165, 25);

        itemCodeTextField = new JTextField(25);
        itemCodeTextField.setBounds(120, 90, 230, 25);
        itemCodeTextField.setEditable(false);

        itemPriceLabel = new JLabel("Price: ");
        itemPriceLabel.setBounds(10, 150, 80, 25);

        itemPriceTextField = new JTextField(25);
        itemPriceTextField.setBounds(120, 150, 230, 25);
        itemPriceTextField.setEditable(false);

        categorizationCategoryNameLabel = new JLabel("Category: ");
        categorizationCategoryNameLabel.setBounds(10, 180, 80, 25);

        categorizationCategoryNameTextField = new JTextField(25);
        categorizationCategoryNameTextField.setBounds(120, 180, 230, 25);
        categorizationCategoryNameTextField.setEditable(false);

        categorizationCategoryCodeLabel = new JLabel("Category Code: ");
        categorizationCategoryCodeLabel.setBounds(10, 210, 165, 25);

        categorizationCategoryCodeTextField = new JTextField(25);
        categorizationCategoryCodeTextField.setBounds(120, 210, 230, 25);
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

        orderLabel = new JLabel("----------------Order Here----------------");
        orderLabel.setBounds(10, 240, 400, 25);

        itemLabel = new JLabel("Select Item: ");
        itemLabel.setBounds(10, 270, 165, 25);

        //every registered category will be passed into this category combo box
        ArrayList<String> item = new ArrayList<String>();
        item.add("");
        for (int i = 0; i < JavaAssignment.allItems.size(); i++) {
            ItemDetails ITD = JavaAssignment.allItems.get(i);
            item.add(ITD.getItemName());
        }
        itemCmbBox = new JComboBox(item.toArray());
        itemCmbBox.setBounds(120, 270, 230, 25);

        quantityLabel = new JLabel("Select Quantity: ");
        quantityLabel.setBounds(10, 300, 165, 25);

        quantityTextField = new JTextField(25);
        quantityTextField.setBounds(120, 300, 230, 25);

        priceLabel = new JLabel("Total Price: ");
        priceLabel.setBounds(10, 330, 165, 25);

        priceTextField = new JTextField(25);
        priceTextField.setBounds(120, 330, 230, 25);
        priceTextField.setEditable(false);

        checkPriceBtn = new JButton("Check Price");
        checkPriceBtn.setBounds(120, 360, 165, 25);
        checkPriceBtn.addActionListener(this);

        addToCartBtn = new JButton("Add To Cart");
        addToCartBtn.setBounds(120, 390, 165, 25);
        addToCartBtn.addActionListener(this);

        itemLogoutButton = new JButton("Logout");
        itemLogoutButton.setBounds(1250, 450, 165, 25);
        itemLogoutButton.addActionListener(this);

        itemSearchButton = new JButton("Search");
        itemSearchButton.setBounds(120, 60, 165, 25);
        itemSearchButton.addActionListener(this);

        //item stuff end here
        //cart stuff start here
        cartPanel = new JPanel();
        cartPanel.setLayout(null);

        cartItemLabel = new JLabel("Items: ");
        cartItemLabel.setBounds(10, 20, 165, 25);

        cartItemTxtField = new JTextField(JavaAssignment.cart.getItem());
        cartItemTxtField.setBounds(120, 20, 230, 25);
        cartItemTxtField.setEditable(false);

        cartQuantityLabel = new JLabel("Quantity: ");
        cartQuantityLabel.setBounds(10, 50, 165, 25);

        cartQuantityTxtField = new JTextField(JavaAssignment.cart.getQuantity());
        cartQuantityTxtField.setBounds(120, 50, 230, 25);
        cartQuantityTxtField.setEditable(false);

        cartAmountLabel = new JLabel("Total Amount: ");
        cartAmountLabel.setBounds(10, 80, 165, 25);

        cartAmountTxtField = new JTextField(JavaAssignment.cart.getTotalPrice().toString());
        cartAmountTxtField.setBounds(120, 80, 230, 25);
        cartAmountTxtField.setEditable(false);

        cartNameLabel = new JLabel("Name: ");
        cartNameLabel.setBounds(570, 20, 165, 25);

        cartNameTxtField = new JTextField(JavaAssignment.customer.getName());
        cartNameTxtField.setBounds(680, 20, 230, 25);
        cartNameTxtField.setEditable(false);

        cartContactLabel = new JLabel("Contact: ");
        cartContactLabel.setBounds(570, 50, 165, 25);

        cartContactTxtField = new JTextField(JavaAssignment.customer.getContact());
        cartContactTxtField.setBounds(680, 50, 230, 25);
        cartContactTxtField.setEditable(false);

        cartAddressLabel = new JLabel("Address: ");
        cartAddressLabel.setBounds(570, 80, 165, 25);

        cartAddressTxtField = new JTextField(JavaAssignment.customer.getAddress());
        cartAddressTxtField.setBounds(680, 80, 230, 25);
        cartAddressTxtField.setEditable(false);

        paymentLabel = new JLabel("Payment Method: ");
        paymentLabel.setBounds(570, 110, 165, 25);

        String[] paymentList = {"", "Cash On Delivery", "Card"};
        paymentCmbBox = new JComboBox(paymentList);
        paymentCmbBox.setBounds(680, 110, 230, 25);

        cardTypeLabel = new JLabel("Card Type: ");
        cardTypeLabel.setBounds(570, 140, 165, 25);

        String[] cardTypeList = {"", "Debit Card", "Credit Card"};
        cardTypeCmbBox = new JComboBox(cardTypeList);
        cardTypeCmbBox.setBounds(680, 140, 230, 25);

        cardNumberLabel = new JLabel("Card Number: ");
        cardNumberLabel.setBounds(570, 170, 165, 25);

        cardNumberTxtField = new JTextField(15);
        cardNumberTxtField.setBounds(680, 170, 230, 25);

        cvvLabel = new JLabel("CVV: ");
        cvvLabel.setBounds(570, 200, 165, 25);

        cvvTxtField = new JTextField(15);
        cvvTxtField.setBounds(680, 200, 230, 25);

        expiryDateLabel = new JLabel("Expiry Date: ");
        expiryDateLabel.setBounds(570, 230, 165, 25);

        expiryDateTxtField = new JTextField(15);
        expiryDateTxtField.setBounds(680, 230, 230, 25);

        removeCartBtn = new JButton("Remove");
        removeCartBtn.setBounds(120, 110, 165, 25);
        removeCartBtn.addActionListener(this);

        checkoutCartBtn = new JButton("Checkout");
        checkoutCartBtn.setBounds(680, 270, 165, 25);
        checkoutCartBtn.addActionListener(this);

        cartLogoutButton = new JButton("Logout");
        cartLogoutButton.setBounds(1250, 450, 165, 25);
        cartLogoutButton.addActionListener(this);

        //cart stuff end here
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
        userPanel.add(usernameLabel);
        userPanel.add(usernameTextField);
        userPanel.add(nameLabel);
        userPanel.add(nameTextField);
        userPanel.add(passwordLabel);
        userPanel.add(passwordTxtField);
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
        userPanel.add(editButton);
        userPanel.add(logoutButton);

        historyPanel.add(historyTableLabel);
        historyPanel.add(historySp);
        historyPanel.add(historyLogoutButton);

        orderFeedbackPanel.add(orderIDLabel);
        orderFeedbackPanel.add(orderIDCmbBox);
        orderFeedbackPanel.add(orderItemLabel);
        orderFeedbackPanel.add(orderItemTxtField);
        orderFeedbackPanel.add(orderQuantityLabel);
        orderFeedbackPanel.add(orderQuantityTxtField);
        orderFeedbackPanel.add(orderAmountLabel);
        orderFeedbackPanel.add(orderAmountTxtField);
        orderFeedbackPanel.add(orderPaymentLabel);
        orderFeedbackPanel.add(orderPaymentTxtField);
        orderFeedbackPanel.add(orderCardLabel);
        orderFeedbackPanel.add(orderCardTxtField);
        orderFeedbackPanel.add(orderTimeLabel);
        orderFeedbackPanel.add(orderTimeTxtField);
        orderFeedbackPanel.add(orderDeliveredTimeLabel);
        orderFeedbackPanel.add(orderDeliveredTimeTxtField);
        orderFeedbackPanel.add(orderFeedbackLabel);
        orderFeedbackPanel.add(orderFeedbackTxtField);
        orderFeedbackPanel.add(orderStatusLabel);
        orderFeedbackPanel.add(orderStatusTxtField);
        orderFeedbackPanel.add(orderFeedbackSearchButton);
        orderFeedbackPanel.add(sendFeedbackButton);
        orderFeedbackPanel.add(orderFeedbackLogoutButton);

        shopPanel.add(searchLabel);
        shopPanel.add(itemNameLabel);
        shopPanel.add(itemNameCmbBox);
        shopPanel.add(itemCodeLabel);
        shopPanel.add(itemCodeTextField);
        shopPanel.add(itemPriceLabel);
        shopPanel.add(itemPriceTextField);
        shopPanel.add(categorizationCategoryNameLabel);
        shopPanel.add(categorizationCategoryNameTextField);
        shopPanel.add(categorizationCategoryCodeLabel);
        shopPanel.add(categorizationCategoryCodeTextField);
        shopPanel.add(itemTableLabel);
        shopPanel.add(itemSp);
        shopPanel.add(itemLogoutButton);
        shopPanel.add(itemSearchButton);
        shopPanel.add(orderLabel);
        shopPanel.add(itemLabel);
        shopPanel.add(itemCmbBox);
        shopPanel.add(quantityLabel);
        shopPanel.add(quantityTextField);
        shopPanel.add(priceLabel);
        shopPanel.add(priceTextField);
        shopPanel.add(addToCartBtn);
        shopPanel.add(checkPriceBtn);

        cartPanel.add(cartItemLabel);
        cartPanel.add(cartItemTxtField);
        cartPanel.add(cartQuantityLabel);
        cartPanel.add(cartQuantityTxtField);
        cartPanel.add(cartAmountLabel);
        cartPanel.add(cartAmountTxtField);
        cartPanel.add(cartNameLabel);
        cartPanel.add(cartNameTxtField);
        cartPanel.add(cartContactLabel);
        cartPanel.add(cartContactTxtField);
        cartPanel.add(cartAddressLabel);
        cartPanel.add(cartAddressTxtField);
        cartPanel.add(paymentLabel);
        cartPanel.add(paymentCmbBox);
        cartPanel.add(cardTypeLabel);
        cartPanel.add(cardTypeCmbBox);
        cartPanel.add(cardNumberLabel);
        cartPanel.add(cardNumberTxtField);
        cartPanel.add(cvvLabel);
        cartPanel.add(cvvTxtField);
        cartPanel.add(expiryDateLabel);
        cartPanel.add(expiryDateTxtField);
        cartPanel.add(removeCartBtn);
        cartPanel.add(checkoutCartBtn);
        cartPanel.add(cartLogoutButton);

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

        TP.add("Profile", userPanel);
        TP.add("Purchase History", historyPanel);
        TP.add("Feedback", orderFeedbackPanel);
        TP.add("Shop", shopPanel);
        TP.add("Cart", cartPanel);
        TP.add("Modify User Account", modifyPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel is added to the JFrane's content panel
        getContentPane().add(TP);
        //Set this frame visible to be display
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editButton) {
            CustomerProfile user = null;
            String name = nameTextField.getText();
            boolean found = false;
            int i = 0;
            for (i = 0; i < JavaAssignment.allCustomers.size(); i++) {
                CustomerProfile customerProfile = JavaAssignment.allCustomers.get(i);
                if (name.equals(customerProfile.getName())) {
                    found = true;
                    user = customerProfile;
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
                String role = "Customer";

                JOptionPane.showMessageDialog(this, "Profile is edited successfully");
                user.setLoginPassword(password);
                user.setGender(gender);
                user.setContact(contact);
                user.setAddress(address);
                user.setPostcode(Integer.parseInt(postcode));
                user.setState(state);
                user.setEmail(email);
                user.setRole(role);

                try {
                    PrintWriter p1 = new PrintWriter("CustomerData.txt");
                    for (int ii = 0; ii < JavaAssignment.allCustomers.size(); ii++) {
                        CustomerProfile customerProfileDetails = JavaAssignment.allCustomers.get(ii);
                        p1.println(customerProfileDetails.getLoginUsername());
                        p1.println(customerProfileDetails.getLoginPassword());
                        p1.println(customerProfileDetails.getName());
                        p1.println(customerProfileDetails.getGender());
                        p1.println(customerProfileDetails.getContact());
                        p1.println(customerProfileDetails.getAddress());
                        p1.println(customerProfileDetails.getPostcode());
                        p1.println(customerProfileDetails.getState());
                        p1.println(customerProfileDetails.getEmail());
                        p1.println(customerProfileDetails.getRole());
                        p1.println();
                    }
                    p1.close();
                } catch (Exception exc) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "Sorry! this customer is not existing in the record");
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
            JavaAssignment.allHistory.clear();
            JavaAssignment.userHistory.clear();
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == historyLogoutButton) {
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
            JavaAssignment.allHistory.clear();
            JavaAssignment.userHistory.clear();
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == orderFeedbackSearchButton) {
            for (OrderDetails order : JavaAssignment.allOrders) {
                String orderID = orderIDCmbBox.getSelectedItem().toString();
                if (orderID.equals(order.getOrderID()) && order.getPaymentMethod().equals("Card")) {
                    String cardDetails = order.getCardType() + ", " + order.getCardNumber() + ", " + order.getCVV() + ", " + order.getExpiryDate();
                    orderItemTxtField.setText(order.getItem());
                    orderQuantityTxtField.setText(order.getQuantity());
                    orderAmountTxtField.setText(order.getAmount().toString());
                    orderPaymentTxtField.setText(order.getPaymentMethod());
                    orderCardTxtField.setText(cardDetails);
                    orderTimeTxtField.setText(order.getOrderTime());
                    orderDeliveredTimeTxtField.setText(order.getOrderDeliveredTime());
                    orderStatusTxtField.setText(order.getOrderStatus());
                    orderFeedbackTxtField.setText(order.getOrderFeedback());
                } else if (orderID.equals(order.getOrderID()) && order.getPaymentMethod().equals("Cash On Delivery")) {
                    String cod = "-";
                    orderItemTxtField.setText(order.getItem());
                    orderQuantityTxtField.setText(order.getQuantity());
                    orderAmountTxtField.setText(order.getAmount().toString());
                    orderPaymentTxtField.setText(order.getPaymentMethod());
                    orderCardTxtField.setText(cod);
                    orderTimeTxtField.setText(order.getOrderTime());
                    orderDeliveredTimeTxtField.setText(order.getOrderDeliveredTime());
                    orderStatusTxtField.setText(order.getOrderStatus());
                    orderFeedbackTxtField.setText(order.getOrderFeedback());
                }
            }
        } else if (e.getSource() == sendFeedbackButton) {
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
                try {
                    String feedback = orderFeedbackTxtField.getText();
                    if (!feedback.equals("")) {
                        JOptionPane.showMessageDialog(this, "Thank you for your precious feedback");
                        order.setOrderFeedback(feedback);//setValueAt(the new value, the row whose value is to be changed,the column whose value is to be changed)
                        DefaultTableModel orderModel = (DefaultTableModel) historyTable.getModel();
                        orderModel.setValueAt(feedback, i, 9);
                    } else {
                        JOptionPane.showMessageDialog(this, "Please provide any feedback to submit");
                    }
                } catch (Exception ex) {

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
        } else if (e.getSource() == orderFeedbackLogoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                //p.print("USERNAME\tROLE\t\tACTION\t\tLOGON_TIME\n");
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
            JavaAssignment.allHistory.clear();
            JavaAssignment.userHistory.clear();
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);
        } else if (e.getSource() == itemSearchButton) {
            for (ItemDetails item : JavaAssignment.allItems) {
                String itemName = itemNameCmbBox.getSelectedItem().toString();

                if (itemName.equals(item.getItemName())) {

                    itemCodeTextField.setText(item.getItemCode());
                    itemPriceTextField.setText(item.getItemPrice().toString());
                    categorizationCategoryNameTextField.setText(item.getCategoryName());
                    categorizationCategoryCodeTextField.setText(item.getCategoryCode());

                }
            }
        } else if (e.getSource() == checkPriceBtn) {
            if (!quantityTextField.getText().equals("")) {
                for (ItemDetails item : JavaAssignment.allItems) {
                    String itemName = itemCmbBox.getSelectedItem().toString();
                    Double quantity = Double.valueOf(quantityTextField.getText());

                    if (itemName.equals(item.getItemName())) {
                        Double totalPrice = item.getItemPrice() * quantity;
                        priceTextField.setText(totalPrice.toString());

                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill a specific quantity");
            }
        } else if (e.getSource() == addToCartBtn) {
            String item = itemCmbBox.getSelectedItem().toString();
            String newItem = "";
            String quantity = quantityTextField.getText();
            String newQuantity = "";
            if (priceTextField.getText().equals("")) {
                priceTextField.setText("0.0");
            }
            Double price = Double.valueOf(priceTextField.getText());
            Double totalAmount = 0.0;
            Double actualTotalPrice = 0.0;

            String username = JavaAssignment.customer.getLoginUsername();

            if (!item.equals("") && !quantity.equals("")) {
                if (!price.equals("")) {
                    boolean found = false;
                    for (int i = 0; i < JavaAssignment.allItems.size(); i++) {
                        ItemDetails itemDetails = JavaAssignment.allItems.get(i);
                        if (item.equals(itemDetails.getItemName())) {
                            found = true;
                            Double actualQuantity = Double.valueOf(quantity);
                            actualTotalPrice = itemDetails.getItemPrice() * actualQuantity;
                            priceTextField.setText(actualTotalPrice.toString());
                            break;
                        }
                    }
                    for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                        Cart cartDetails = JavaAssignment.Cart.get(i);
                        if (username.equals(cartDetails.getLoginUsername())) {
                            if (cartDetails.getItem().equals("")) {
                                newItem = item;
                                newQuantity = quantity;
                                totalAmount = actualTotalPrice;
                                break;
                            } else {
                                newItem = cartDetails.getItem() + ", " + item;
                                newQuantity = cartDetails.getQuantity() + ", " + quantity;
                                totalAmount = cartDetails.getTotalPrice() + actualTotalPrice;
                                break;
                            }
                        }
                    }
                    if (found) {
                        JOptionPane.showMessageDialog(this, "Item is added to cart successfully");
                        JavaAssignment.cart.setItem(newItem);
                        JavaAssignment.cart.setQuantity(newQuantity);
                        JavaAssignment.cart.setTotalPrice(totalAmount);
                        cartItemTxtField.setText(newItem);
                        cartQuantityTxtField.setText(newQuantity);
                        cartAmountTxtField.setText(totalAmount.toString());

                        try {
                            PrintWriter p = new PrintWriter("Cart.txt");
                            for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                                Cart cart = JavaAssignment.Cart.get(i);
                                p.println(cart.getLoginUsername());
                                p.println(cart.getItem());
                                p.println(cart.getQuantity());
                                p.println(cart.getTotalPrice().toString());
                                p.println();
                            }
                            p.close();
                        } catch (Exception er) {
                            JOptionPane.showMessageDialog(this, er);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Not enough stock");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please check total price");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select item and quantity");
            }

        } else if (e.getSource() == removeCartBtn) {
            if (!cartItemTxtField.getText().equals("") && !cartQuantityTxtField.getText().equals("") && !cartAmountTxtField.getText().equals("0.0")) {
                cartItemTxtField.setText("");
                cartQuantityTxtField.setText("");
                cartAmountTxtField.setText("0.0");

                String item = cartItemTxtField.getText();
                String quantity = cartQuantityTxtField.getText();
                Double amount = Double.valueOf(cartAmountTxtField.getText());

                String username = JavaAssignment.customer.getLoginUsername();
                boolean found = false;
                for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                    Cart cartDetails = JavaAssignment.Cart.get(i);
                    if (username.equals(cartDetails.getLoginUsername())) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    JOptionPane.showMessageDialog(this, "Items are removed from cart successfully");
                    JavaAssignment.cart.setItem(item);
                    JavaAssignment.cart.setQuantity(quantity);
                    JavaAssignment.cart.setTotalPrice(amount);

                    try {
                        PrintWriter p = new PrintWriter("Cart.txt");
                        for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                            Cart cart = JavaAssignment.Cart.get(i);
                            p.println(cart.getLoginUsername());
                            p.println(cart.getItem());
                            p.println(cart.getQuantity());
                            p.println(cart.getTotalPrice());
                            p.println();
                        }
                        p.close();
                    } catch (Exception er) {
                        JOptionPane.showMessageDialog(this, er);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "There is no item in cart");
            }

        } else if (e.getSource() == checkoutCartBtn) {
            UUID uuid = UUID.randomUUID();
            String orderID = uuid.toString();
            String item = cartItemTxtField.getText();
            String quantity = cartQuantityTxtField.getText();
            Double amount = Double.valueOf(cartAmountTxtField.getText());
            String name = cartNameTxtField.getText();
            String contact = cartContactTxtField.getText();
            String address = cartAddressTxtField.getText();
            String payment = paymentCmbBox.getSelectedItem().toString();
            String cardType = cardTypeCmbBox.getSelectedItem().toString();
            String cardNumber = cardNumberTxtField.getText();
            String cvv = cvvTxtField.getText();
            String expiryDate = expiryDateTxtField.getText();

            String orderTime = "";
            String orderDeliveredTime = "";
            String orderStatus = "In Progress";
            String deliveryStaff = "";
            String orderFeedback = "";

            String cardDetails = "";

            String username = JavaAssignment.customer.getLoginUsername();

            if (!item.equals("") && !quantity.equals("") && !amount.equals(0.0)) {
                if (payment.equals("Cash On Delivery")) {
                    cardTypeCmbBox.setSelectedItem("");
                    cardNumberTxtField.setText("");
                    cvvTxtField.setText("");
                    expiryDateTxtField.setText(""); //create new variables if there are data in these fields when selected cash on delivery
                    String newCardType = cardTypeCmbBox.getSelectedItem().toString();
                    String newCardNumber = cardNumberTxtField.getText();
                    String newCvv = cvvTxtField.getText();
                    String newExpiryDate = expiryDateTxtField.getText();

                    boolean found = false;
                    for (int i = 0; i < JavaAssignment.allOrders.size(); i++) {
                        OrderDetails orderDetails = JavaAssignment.allOrders.get(i);
                        if (orderDetails.getLoginUsername().equals("")) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(this, "Order is placed successfully");
                        Calendar cal = Calendar.getInstance();
                        SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                        orderTime = simpleformat.format(cal.getTime());

                        OrderDetails order = new OrderDetails(username, orderID, name, contact, address, item, quantity, amount, payment, newCardType, newCardNumber, newCvv, newExpiryDate, orderTime, orderDeliveredTime, orderStatus, deliveryStaff, orderFeedback);
                        JavaAssignment.allOrders.add(order);
                        DefaultTableModel historyModel = (DefaultTableModel) historyTable.getModel();
                        historyModel.addRow(new Object[]{orderID, item, quantity, amount, payment, cardDetails, orderTime, orderDeliveredTime, orderStatus, orderFeedback});
                        JavaAssignment.order = order;

                        try {
                            PrintWriter p = new PrintWriter("AllOrders.txt");
                            for (int i = 0; i < JavaAssignment.allOrders.size(); i++) {
                                OrderDetails orderDetails = JavaAssignment.allOrders.get(i);
                                p.println(orderDetails.getLoginUsername());
                                p.println(orderDetails.getOrderID());
                                p.println(orderDetails.getName());
                                p.println(orderDetails.getContact());
                                p.println(orderDetails.getAddress());
                                p.println(orderDetails.getItem());
                                p.println(orderDetails.getQuantity());
                                p.println(orderDetails.getAmount());
                                p.println(orderDetails.getPaymentMethod());
                                p.println(orderDetails.getCardType());
                                p.println(orderDetails.getCardNumber());
                                p.println(orderDetails.getCVV());
                                p.println(orderDetails.getExpiryDate());
                                p.println(orderDetails.getOrderTime());
                                p.println(orderDetails.getOrderDeliveredTime());
                                p.println(orderDetails.getOrderStatus());
                                p.println(orderDetails.getDeliveryStaff());
                                p.println(orderDetails.getOrderFeedback());
                                p.println();
                            }
                            p.close();
                        } catch (Exception er) {
                            JOptionPane.showMessageDialog(this, er);
                        }
                        cartItemTxtField.setText("");
                        cartQuantityTxtField.setText("");
                        cartAmountTxtField.setText("0.0");

                        String removeItem = cartItemTxtField.getText();
                        String removeQuantity = cartQuantityTxtField.getText();
                        Double removeAmount = Double.valueOf(cartAmountTxtField.getText());

                        boolean foundUsername = false;
                        for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                            Cart cartDetails = JavaAssignment.Cart.get(i);
                            if (username.equals(cartDetails.getLoginUsername())) {
                                foundUsername = true;
                                break;
                            }
                        }
                        if (foundUsername) {
                            JavaAssignment.cart.setItem(removeItem);
                            JavaAssignment.cart.setQuantity(removeQuantity);
                            JavaAssignment.cart.setTotalPrice(removeAmount);

                            try {
                                PrintWriter p = new PrintWriter("Cart.txt");
                                for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                                    Cart cart = JavaAssignment.Cart.get(i);
                                    p.println(cart.getLoginUsername());
                                    p.println(cart.getItem());
                                    p.println(cart.getQuantity());
                                    p.println(cart.getTotalPrice());
                                    p.println();
                                }
                                p.close();
                            } catch (Exception er) {
                                JOptionPane.showMessageDialog(this, er);
                            }
                        }
                    }
                } else if (payment.equals("Card")) {
                    cardDetails = cardType + ", " + cardNumber + ", " + cvv + ", " + expiryDate;

                    boolean found = false;
                    if (!cardType.equals("") && !cardNumber.equals("") && !cvv.equals("") && !expiryDate.equals("")) {
                        for (int i = 0; i < JavaAssignment.allOrders.size(); i++) {
                            OrderDetails orderDetails = JavaAssignment.allOrders.get(i);
                            if (orderDetails.getLoginUsername().equals("")) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            JOptionPane.showMessageDialog(this, "Order is placed successfully");
                            Calendar cal = Calendar.getInstance();
                            SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                            orderTime = simpleformat.format(cal.getTime());

                            OrderDetails order = new OrderDetails(username, orderID, name, contact, address, item, quantity, amount, payment, cardType, cardNumber, cvv, expiryDate, orderTime, orderDeliveredTime, orderStatus, deliveryStaff, orderFeedback);
                            JavaAssignment.allOrders.add(order);
                            DefaultTableModel historyModel = (DefaultTableModel) historyTable.getModel();
                            historyModel.addRow(new Object[]{orderID, item, quantity, amount, payment, cardDetails, orderTime, orderDeliveredTime, orderStatus, orderFeedback});
                            JavaAssignment.order = order;

                            try {
                                PrintWriter p = new PrintWriter("AllOrders.txt");
                                for (int i = 0; i < JavaAssignment.allOrders.size(); i++) {
                                    OrderDetails orderDetails = JavaAssignment.allOrders.get(i);
                                    p.println(orderDetails.getLoginUsername());
                                    p.println(orderDetails.getOrderID());
                                    p.println(orderDetails.getName());
                                    p.println(orderDetails.getContact());
                                    p.println(orderDetails.getAddress());
                                    p.println(orderDetails.getItem());
                                    p.println(orderDetails.getQuantity());
                                    p.println(orderDetails.getAmount());
                                    p.println(orderDetails.getPaymentMethod());
                                    p.println(orderDetails.getCardType());
                                    p.println(orderDetails.getCardNumber());
                                    p.println(orderDetails.getCVV());
                                    p.println(orderDetails.getExpiryDate());
                                    p.println(orderDetails.getOrderTime());
                                    p.println(orderDetails.getOrderDeliveredTime());
                                    p.println(orderDetails.getOrderStatus());
                                    p.println(orderDetails.getDeliveryStaff());
                                    p.println(orderDetails.getOrderFeedback());
                                    p.println();
                                }
                                p.close();
                            } catch (Exception er) {
                                JOptionPane.showMessageDialog(this, er);
                            }
                            cartItemTxtField.setText("");
                            cartQuantityTxtField.setText("");
                            cartAmountTxtField.setText("0.0");

                            String removeItem = cartItemTxtField.getText();
                            String removeQuantity = cartQuantityTxtField.getText();
                            Double removeAmount = Double.valueOf(cartAmountTxtField.getText());

                            boolean foundUsername = false;
                            for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                                Cart cartDetails = JavaAssignment.Cart.get(i);
                                if (username.equals(cartDetails.getLoginUsername())) {
                                    foundUsername = true;
                                    break;
                                }
                            }
                            if (foundUsername) {
                                JavaAssignment.cart.setItem(removeItem);
                                JavaAssignment.cart.setQuantity(removeQuantity);
                                JavaAssignment.cart.setTotalPrice(removeAmount);

                                try {
                                    PrintWriter p = new PrintWriter("Cart.txt");
                                    for (int i = 0; i < JavaAssignment.Cart.size(); i++) {
                                        Cart cart = JavaAssignment.Cart.get(i);
                                        p.println(cart.getLoginUsername());
                                        p.println(cart.getItem());
                                        p.println(cart.getQuantity());
                                        p.println(cart.getTotalPrice());
                                        p.println();
                                    }
                                    p.close();
                                } catch (Exception er) {
                                    JOptionPane.showMessageDialog(this, er);
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please fill all the information completely");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please select a payment method");
                }
            } else {
                JOptionPane.showMessageDialog(this, "There is no item in cart");
            }

        } else if (e.getSource() == cartLogoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                //p.print("USERNAME\tROLE\t\tACTION\t\tLOGON_TIME\n");
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Logout" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {

            }
            JavaAssignment.allHistory.clear();
            JavaAssignment.userHistory.clear();
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == itemLogoutButton) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream("Logfile.txt", true)); //open the file in append mode
                //p.print("USERNAME\tROLE\t\tACTION\t\tLOGON_TIME\n");
                p.print(JavaAssignment.user.getLoginUsername() + "\n");
                p.print(JavaAssignment.user.getRole() + "\n");
                p.print("Logout" + "\n");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                p.print(simpleformat.format(cal.getTime()) + "\n");
                p.println();
                p.close();

            } catch (Exception er) {

            }
            JavaAssignment.allHistory.clear();
            JavaAssignment.userHistory.clear();
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);

        } else if (e.getSource() == modifyUserAccountBtn) {
            if (!modifyUsername.getText().equals("") && !modifyPassword.getText().equals("") && !newUsername.getText().equals("") && !newPassword.getText().equals("")) {
                UserLogin userlog = null;
                String modusername = modifyUsername.getText();
                String modpassword = modifyPassword.getText();
                boolean datafound = false;
                int i = 0;
                for (i = 0; i < JavaAssignment.allUser.size(); i++) {
                    UserLogin UL = JavaAssignment.allUser.get(i);
                    if (modusername.equals(UL.getLoginUsername()) && modpassword.equals(UL.getLoginPassword())) {
                        datafound = true;
                        userlog = UL;
                        break;
                    }
                }
                if (datafound) {
                    String username = newUsername.getText();
                    String password = newPassword.getText();
                    String role = "Customer";

                    JOptionPane.showMessageDialog(this, "User account is successfully modified");
                    userlog.setLoginUsername(username);
                    userlog.setLoginPassword(password);
                    userlog.setRole(role);

                    JavaAssignment.customer.setLoginUsername(username);
                    JavaAssignment.customer.setLoginPassword(password);

                    usernameTextField.setText(JavaAssignment.customer.getLoginUsername());

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
                        PrintWriter p = new PrintWriter("CustomerData.txt");
                        for (int j = 0; j < JavaAssignment.allCustomers.size(); j++) {
                            JavaAssignment.customer = JavaAssignment.allCustomers.get(j);
                            p.println(JavaAssignment.customer.getLoginUsername());
                            p.println(JavaAssignment.customer.getLoginPassword());
                            p.println(JavaAssignment.customer.getName());
                            p.println(JavaAssignment.customer.getGender());
                            p.println(JavaAssignment.customer.getContact());
                            p.println(JavaAssignment.customer.getAddress());
                            p.println(JavaAssignment.customer.getPostcode());
                            p.println(JavaAssignment.customer.getState());
                            p.println(JavaAssignment.customer.getEmail());
                            p.println(JavaAssignment.customer.getRole());

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

