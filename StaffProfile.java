/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */

 class StaffProfile extends UserLogin {
    private String Name;
    private String Gender;
    private String Contact;
    private String Address;
    private int Postcode;
    private String State;
    private String Email;
 
    
    public StaffProfile(String UName, String UPass, String Name, String Gender, String Contact, String Address, int Postcode, String State, String Email, String URole){
        super(UName, UPass, URole);
        this.Name = Name;
        this.Gender = Gender;
        this.Contact = Contact;
        this.Address = Address;
        this.Postcode = Postcode;
        this.State = State;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPostcode() {
        return Postcode;
    }

    public void setPostcode(int Postcode) {
        this.Postcode = Postcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
}

