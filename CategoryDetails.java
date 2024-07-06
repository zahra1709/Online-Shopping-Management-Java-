/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */
class CategoryDetails {
    private String CategoryName;
    private String CategoryCode;
    
    public CategoryDetails(String CategoryName, String CategoryCode) {
        this.CategoryName = CategoryName;
        this.CategoryCode = CategoryCode;
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