/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */
class ItemDetails {
    
    private String ItemName;
    private String ItemCode;
    private Double ItemPrice;
    private String CategoryName;
    private String CategoryCode;

    public ItemDetails(String ItemName, String ItemCode, Double ItemPrice, String CategoryName, String CategoryCode) {
        this.ItemName = ItemName;
        this.ItemCode = ItemCode;
        this.ItemPrice = ItemPrice;
        this.CategoryName = CategoryName;
        this.CategoryCode = CategoryCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }
    
    public Double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(Double ItemPrice) {
        this.ItemPrice = Math.round(ItemPrice*100.0)/100.0;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getCategoryCode() {
        return CategoryCode;
    }

    public void setCategoryCode(String CategoryCode) {
        this.CategoryCode = CategoryCode;
    }
    
}
