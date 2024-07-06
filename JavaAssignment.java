/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javaassignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zahra
 */
public class JavaAssignment {

    
    public static LoginPage Login = new LoginPage();
    public static ArrayList<UserLogin> allUser = new ArrayList<UserLogin>();
    public static ArrayList<StaffProfile> allStaffs = new ArrayList<StaffProfile>();
    public static ArrayList<CategoryDetails> allCategories = new ArrayList<CategoryDetails>();
    public static ArrayList<ItemDetails> allItems = new ArrayList<ItemDetails>();
    public static ArrayList<CustomerProfile> allCustomers = new ArrayList<CustomerProfile>();
    public static ArrayList<Cart> Cart= new ArrayList<Cart>();
    public static ArrayList<OrderDetails> allOrders = new ArrayList<OrderDetails>();
    public static ArrayList<OrderDetails> allHistory = new ArrayList<OrderDetails>();
    public static ArrayList<OrderDetails> userHistory = new ArrayList<OrderDetails>();
    public static ArrayList<OrderDetails> allDeliveries = new ArrayList<OrderDetails>();
    public static ArrayList<OrderDetails> deliveryInfo = new ArrayList<OrderDetails>();
    public static UserLogin user = null;
    public static StaffProfile staff = null;
    public static CustomerProfile customer = null;
    public static Cart cart = null;
    public static OrderDetails order = null;
    
    public static void main(String[] args) {
        try {
            Scanner USER = new Scanner(new File("AllLogins.txt"));
            while(USER.hasNext()){
                String UName = USER.nextLine();
                String UPass = USER.nextLine();
                String URole = USER.nextLine();
                USER.nextLine();
                UserLogin UL = new UserLogin(UName,UPass,URole);
                allUser.add(UL);
            }
            Scanner STAFF = new Scanner(new File("StaffData.txt"));
            while(STAFF.hasNext()){
                String uname = STAFF.nextLine();
                String pass = STAFF.nextLine();
                String name = STAFF.nextLine();
                String gender = STAFF.nextLine();
                String contact = STAFF.nextLine();
                String address = STAFF.nextLine();
                int post = Integer.parseInt(STAFF.nextLine());
                String state = STAFF.nextLine();
                String email = STAFF.nextLine();
                String role = STAFF.nextLine();
                STAFF.nextLine();
                StaffProfile StProf = new StaffProfile(uname,pass,name,gender,contact,address,post,state,email,role);
                allStaffs.add(StProf);
            }
            Scanner CAT = new Scanner(new File("CategoryData.txt"));
            while(CAT.hasNext()){
                String CatName = CAT.nextLine();
                String CatCode = CAT.nextLine();
                CAT.nextLine();
                CategoryDetails CatDet = new CategoryDetails(CatName,CatCode);
                allCategories.add(CatDet);
            }
            Scanner FILE = new Scanner(new File("ItemData.txt"));
            while(FILE.hasNext()){
                String name = FILE.nextLine();
                String code = FILE.nextLine();
                String price = FILE.nextLine();
                String CatName = FILE.nextLine();
                String CatCode = FILE.nextLine();
                FILE.nextLine();
                ItemDetails ItDet = new ItemDetails(name,code,Double.parseDouble(price),CatName,CatCode);
                allItems.add(ItDet);
            }
            Scanner CUST = new Scanner(new File("CustomerData.txt"));
            while(CUST.hasNext()){
                String uname = CUST.nextLine();
                String pass = CUST.nextLine();
                String name = CUST.nextLine();
                String gender = CUST.nextLine();
                String contact = CUST.nextLine();
                String address = CUST.nextLine();
                int post = Integer.parseInt(CUST.nextLine());
                String state = CUST.nextLine();
                String email = CUST.nextLine();
                String role = CUST.nextLine();
                CUST.nextLine();
                CustomerProfile CustProf = new CustomerProfile(uname,pass,name,gender,contact,address,post,state,email,role);
                allCustomers.add(CustProf);
            }
            Scanner CART = new Scanner(new File("Cart.txt"));
            while(CART.hasNext()){
                String uname = CART.nextLine();
                String item = CART.nextLine();
                String quantity = CART.nextLine();
                Double price = Double.parseDouble(CART.nextLine());
                CART.nextLine();
                Cart ct = new Cart(uname,item,quantity,price);
                Cart.add(ct);
            }
            Scanner ORD = new Scanner(new File("OrderInfo.txt"));
            while(ORD.hasNext()){
                String aa = ORD.nextLine(); //change variables
                String pp = ORD.nextLine();
                String bb = ORD.nextLine();
                String cc = ORD.nextLine();
                String dd = ORD.nextLine();
                String ee = ORD.nextLine();
                String ff = ORD.nextLine();
                Double gg = Double.parseDouble(ORD.nextLine());
                String hh = ORD.nextLine();
                String ii = ORD.nextLine();
                String jj = ORD.nextLine();
                String kk = ORD.nextLine();
                String ll = ORD.nextLine();
                String mm = ORD.nextLine();
                String nn = ORD.nextLine();
                String oo = ORD.nextLine();
                String qq = ORD.nextLine();
                String rr = ORD.nextLine();
                ORD.nextLine();
                OrderDetails ord = new OrderDetails(aa,pp,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,qq,rr);
                allOrders.add(ord);
            }
        }catch (Exception ex) {
            
        }
    }
}
