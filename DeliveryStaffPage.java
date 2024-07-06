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
class DeliveryStaffPage extends JFrame implements ActionListener, ItemListener {

    //declaration here
    private JTabbedPane tp;

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
    private JLabel orderTimeLabel;
    private JTextField orderTimeTxtField;
    private JLabel orderDeliveredTimeLabel;
    private JTextField orderDeliveredTimeTxtField;
    private JLabel orderStatusLabel;
    private JComboBox orderStatusCmbBox;
    private JLabel orderFeedbackLabel;
    private JTextField orderFeedbackTxtField;
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

    public DeliveryStaffPage() {
        setSize(1200, 600);
        setTitle("Delivery Staff Window");

        tp = new JTabbedPane();

        //order stuff start here
        orderDeliveryPanel = new JPanel();
        orderDeliveryPanel.setLayout(null); //default layout is flow layout, set it to null so then easily to set the location of each component

        orderIDLabel = new JLabel("Order ID: ");
        orderIDLabel.setBounds(10, 20, 80, 25);
        
        String username;
        String orderID;
        String name;
        String contact;
        String address;
        String items;
        String quantity;
        Double amount;
        String paymentMethod;
        String cardType;
        String cardNumber;
        String cvv;
        String expiryDate;
        String orderTime;
        String orderDeliveredTime;
        String orderStatus;
        String deliveryStaff = JavaAssignment.staff.getName();
        String orderFeedback;
        for (int i = 0; i < JavaAssignment.allDeliveries.size(); i++) {
            OrderDetails delivery = JavaAssignment.allDeliveries.get(i);
            if (deliveryStaff.equals(delivery.getDeliveryStaff()) && !delivery.getOrderStatus().equals("In Progress")) {
                username = delivery.getLoginUsername();
                orderID = delivery.getOrderID();
                name = delivery.getName();
                contact = delivery.getContact();
                address = delivery.getAddress();
                items = delivery.getItem();
                quantity = delivery.getQuantity();
                amount = delivery.getAmount();
                paymentMethod = delivery.getPaymentMethod();
                cardType = delivery.getCardType();
                cardNumber = delivery.getCardNumber();
                cvv = delivery.getCVV();
                expiryDate = delivery.getExpiryDate();
                orderTime = delivery.getOrderTime();
                orderDeliveredTime = delivery.getOrderDeliveredTime();
                orderStatus = delivery.getOrderStatus();
                orderFeedback = delivery.getOrderFeedback();
                OrderDetails deliveryDetails = new OrderDetails(username, orderID, name, contact, address, items, quantity, amount, paymentMethod, cardType, cardNumber, cvv, expiryDate, orderTime, orderDeliveredTime, orderStatus, deliveryStaff, orderFeedback);
                JavaAssignment.deliveryInfo.add(deliveryDetails);
            }
        }

        //every registered category will be passed into this category combo box
        ArrayList<String> deliveryList = new ArrayList<String>();
        deliveryList.add("");
        for (int i = 0; i < JavaAssignment.deliveryInfo.size(); i++) {
            OrderDetails dd = JavaAssignment.deliveryInfo.get(i);
            deliveryList.add(dd.getOrderID());
        }
        orderIDCmbBox = new JComboBox(deliveryList.toArray());
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

        orderTimeLabel = new JLabel("Ordered Time:");
        orderTimeLabel.setBounds(10, 170, 165, 25);

        orderTimeTxtField = new JTextField(25);
        orderTimeTxtField.setBounds(120, 170, 230, 25);
        orderTimeTxtField.setEditable(false);

        orderDeliveredTimeLabel = new JLabel("Delivered Time:");
        orderDeliveredTimeLabel.setBounds(10, 200, 165, 25);

        orderDeliveredTimeTxtField = new JTextField(25);
        orderDeliveredTimeTxtField.setBounds(120, 200, 230, 25);
        orderDeliveredTimeTxtField.setEditable(false);

        orderStatusLabel = new JLabel("Order Status:");
        orderStatusLabel.setBounds(10, 230, 165, 25);

        String[] statusList = {"", "Ready To Deliver", "Delivering", "Delivered Successfully", "Completed"};
        orderStatusCmbBox = new JComboBox(statusList);
        orderStatusCmbBox.setBounds(120, 230, 230, 25);

        orderFeedbackLabel = new JLabel("Feedback: ");
        orderFeedbackLabel.setBounds(10, 260, 165, 25);

        orderFeedbackTxtField = new JTextField(25);
        orderFeedbackTxtField.setBounds(120, 260, 230, 25);
        orderFeedbackTxtField.setEditable(false);

        orderDeliveryTableLabel = new JLabel("Record Table: ");
        orderDeliveryTableLabel.setBounds(370, 1, 165, 25);

        int oderSize = JavaAssignment.deliveryInfo.size();
        String[][] orderData = new String[oderSize][8];
        for (int i = 0; i < oderSize; i++) {
            OrderDetails order = JavaAssignment.deliveryInfo.get(i);
            if (order.getOrderDeliveredTime().equals("")) {
                orderData[i][0] = order.getOrderID();
                orderData[i][1] = "" + order.getName();
                orderData[i][2] = "" + order.getContact();
                orderData[i][3] = "" + order.getAddress();
                orderData[i][4] = "" + order.getOrderTime();
                orderData[i][5] = "" + order.getOrderDeliveredTime();
                orderData[i][6] = "" + order.getOrderStatus();
                orderData[i][7] = "" + order.getOrderFeedback();
            }
        }
        String[] orderColumns = {"Order ID", "Customer Name", "Contact", "Address", "Order Time", "Delivered Time", "Order Status", "Feedback"};
        DefaultTableModel orderModel = new DefaultTableModel(orderData, orderColumns);
        orderDeliveryTable = new JTable(orderModel);
        orderDeliverySp = new JScrollPane(orderDeliveryTable);
        orderDeliverySp.setBounds(370, 20, 1100, 400);

        orderDeliverySearchButton = new JButton("Search");
        orderDeliverySearchButton.setBounds(120, 50, 165, 25);
        orderDeliverySearchButton.addActionListener(this);

        orderDeliveryUpdateButton = new JButton("Update");
        orderDeliveryUpdateButton.setBounds(120, 290, 165, 25);
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
        orderDeliveryPanel.add(orderIDLabel);
        orderDeliveryPanel.add(orderIDCmbBox);
        orderDeliveryPanel.add(orderNameLabel);
        orderDeliveryPanel.add(orderNameTxtField);
        orderDeliveryPanel.add(orderContactLabel);
        orderDeliveryPanel.add(orderContactTxtField);
        orderDeliveryPanel.add(orderAddressLabel);
        orderDeliveryPanel.add(orderAddressTxtField);
        orderDeliveryPanel.add(orderTimeLabel);
        orderDeliveryPanel.add(orderTimeTxtField);
        orderDeliveryPanel.add(orderDeliveredTimeLabel);
        orderDeliveryPanel.add(orderDeliveredTimeTxtField);
        orderDeliveryPanel.add(orderStatusLabel);
        orderDeliveryPanel.add(orderStatusCmbBox);
        orderDeliveryPanel.add(orderFeedbackLabel);
        orderDeliveryPanel.add(orderFeedbackTxtField);
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

        tp.add("Order Delivery Management", orderDeliveryPanel);
        tp.add("Modify User Account", modifyPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel is added to the JFrane's content panel
        getContentPane().add(tp);
        //Set this frame visible to be display
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == orderDeliverySearchButton) {
            for (OrderDetails order : JavaAssignment.allOrders) {
                String orderID = orderIDCmbBox.getSelectedItem().toString();
                if (orderID.equals(order.getOrderID())) {
                    orderNameTxtField.setText(order.getName());
                    orderContactTxtField.setText(order.getContact());
                    orderAddressTxtField.setText(order.getAddress());
                    orderTimeTxtField.setText(order.getOrderTime());
                    orderDeliveredTimeTxtField.setText(order.getOrderDeliveredTime());
                    orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                    orderFeedbackTxtField.setText(order.getOrderFeedback());
                }
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
                try{
                String status = orderStatusCmbBox.getSelectedItem().toString();
                String deliveredTime = orderDeliveredTimeTxtField.getText();
                if (!status.equals("")) {
                    if (order.getOrderStatus().equals("Completed")) {
                        if (status.equals("Ready To Deliver") || status.equals("Delivering") || status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "Order is already completed");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        }
                    } else if (order.getOrderStatus().equals("Ready To Deliver")) {
                        if (status.equals("Ready To Deliver")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        } else if (status.equals("Completed") || status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "This order is not delivered successfully yet");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        } else if (status.equals("Delivering")) {
                            JOptionPane.showMessageDialog(this, "This order is accepted and started delivering to " + order.getName());
                            order.setOrderStatus(status);
                            //setValueAt(the new value, the row whose value is to be changed,the column whose value is to be changed)
                            DefaultTableModel orderModel = (DefaultTableModel) orderDeliveryTable.getModel();
                            orderModel.setValueAt(status, i, 6);
                        }
                    } else if (order.getOrderStatus().equals("Delivering")) {
                        if (status.equals("Ready To Deliver")) {
                            JOptionPane.showMessageDialog(this, "This order is being delivered");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        } else if (status.equals("Delivering")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        } else if (status.equals("Completed")) {
                            JOptionPane.showMessageDialog(this, "This order is not delivered successfully yet");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        } else if (status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "This order is delivered successfully to " + order.getName());
                            Calendar cal = Calendar.getInstance();
                            SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
                            deliveredTime = simpleformat.format(cal.getTime());
                            order.setOrderDeliveredTime(deliveredTime);
                            order.setOrderStatus(status);
                            //setValueAt(the new value, the row whose value is to be changed,the column whose value is to be changed)
                            DefaultTableModel orderModel = (DefaultTableModel) orderDeliveryTable.getModel();
                            orderModel.setValueAt(deliveredTime, i, 5);
                            orderModel.setValueAt(status, i, 6);
                        }
                    } else if (order.getOrderStatus().equals("Delivered Successfully")) {
                        if (status.equals("Completed")) {
                            JOptionPane.showMessageDialog(this, "Further status will be updated by admin");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        } else if (status.equals("Delivered Successfully")) {
                            JOptionPane.showMessageDialog(this, "Please select another option");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
//                        } else if (status.equals("In Progress") || status.equals("Delivering") || status.equals("Ready To Deliver")) {
                        } else if (status.equals("Delivering") || status.equals("Ready To Deliver")) {
                            JOptionPane.showMessageDialog(this, "This order is already delivered successfully");
                            orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid option");
                        orderStatusCmbBox.setSelectedItem(order.getOrderStatus());
                    }
                }
                    
                }catch(Exception ex){
                    
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
            JavaAssignment.allDeliveries.clear();
            JavaAssignment.deliveryInfo.clear();
            setVisible(false);
            LoginPage Login = new LoginPage();
            Login.setVisible(true);
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
                            p.println(JavaAssignment.staff.getLoginPassword());
                            p.println(JavaAssignment.staff.getName());
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
