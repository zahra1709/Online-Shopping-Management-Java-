/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */
class Cart extends CustomerProfile {
    
    private Double TotalPrice;
    private String Item;
    private String Quantity;
    
    public Cart(String UName, String Item, String Quantity, Double TotalPrice) {
        super(UName);
        this.Item = Item;
        this.Quantity = Quantity;
        this.TotalPrice = TotalPrice;
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

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double TotalPrice) {
        this.TotalPrice = TotalPrice;
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
