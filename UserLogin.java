/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

/**
 *
 * @author Zahra
 */
public class UserLogin {
    
    public String LoginUsername;
    public String LoginPassword;
    public String Role;
    
    //constructor here    
    public UserLogin(String UName, String UPass, String URole){
        LoginUsername = UName;
        LoginPassword = UPass;
        Role = URole;
        
    }
    
    public UserLogin(String UName){
        LoginUsername = UName;
        
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

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

}

