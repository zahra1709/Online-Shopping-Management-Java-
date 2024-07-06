/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */
class OrderDetails extends CustomerProfile {
    private String OrderID;
    private String Item;
    private String Quantity;
    private Double Amount;
    private String PaymentMethod;
    private String CardType;
    private String CardNumber;
    private String CVV;
    private String ExpiryDate;
    private String OrderTime;
    private String OrderDeliveredTime;
    private String OrderStatus;
    private String DeliveryStaff;
    private String OrderFeedback;

    public OrderDetails(String UName, String OrderID, String Name, String Contact, String Address, String Item, String Quantity, Double Amount, String PaymentMethod, String CardType, String CardNumber, String CVV, String ExpiryDate, String OrderTime, String OrderDeliveredTime, String OrderStatus, String DeliveryStaff, String OrderFeedback) {
        super(Name, Contact, Address, UName);
        this.OrderID = OrderID;
        this.Item = Item;
        this.Quantity = Quantity;
        this.Amount = Amount;
        this.PaymentMethod = PaymentMethod;
        this.CardType = CardType;
        this.CardNumber = CardNumber;
        this.CVV = CVV;
        this.ExpiryDate = ExpiryDate;
        this.OrderTime = OrderTime;
        this.OrderDeliveredTime = OrderDeliveredTime;
        this.OrderStatus = OrderStatus;
        this.DeliveryStaff = DeliveryStaff;
        this.OrderFeedback = OrderFeedback;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }
    
    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    public String getOrderDeliveredTime() {
        return OrderDeliveredTime;
    }

    public void setOrderDeliveredTime(String OrderDeliveredTime) {
        this.OrderDeliveredTime = OrderDeliveredTime;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getDeliveryStaff() {
        return DeliveryStaff;
    }

    public void setDeliveryStaff(String DeliveryStaff) {
        this.DeliveryStaff = DeliveryStaff;
    }

    public String getOrderFeedback() {
        return OrderFeedback;
    }

    public void setOrderFeedback(String OrderFeedback) {
        this.OrderFeedback = OrderFeedback;
    }

    public String getLoginUsername() {
        return LoginUsername;
    }

    public void setLoginUsername(String LoginUsername) {
        this.LoginUsername = LoginUsername;
    }

    public String getLoginPassword() {
        return LoginPassword;
    }

    public void setLoginPassword(String LoginPassword) {
        this.LoginPassword = LoginPassword;
    }
    
}