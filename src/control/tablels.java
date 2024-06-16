/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;

/**
 *
 * @author Chamika
 */
public class tablels {

    public static void main(String[] args) {
        try {
            String user1Table = "CREATE TABLE IF NOT EXISTS user1 (" + "id INT AUTO_INCREMENT PRIMARY KEY," + "name VARCHAR(200)," + "email VARCHAR(200) UNIQUE," + "mobileNumber VARCHAR(200)," + "address VARCHAR(200)," + "password VARCHAR(200)," + "status VARCHAR(20))";

            String adminDetails = "INSERT INTO user1 (name,email,mobileNumber,address,password,status)VALUES('admin','admin@gmail.com','1234567890','Sri Lanka','admin','true')";

            String categoryTable = "CREATE TABLE IF NOT EXISTS category(" + "id INT AUTO_INCREMENT PRIMARY KEY," + "name VARCHAR(200))";

            String productTable = "CREATE TABLE IF NOT EXISTS product(" + "id INT AUTO_INCREMENT PRIMARY KEY," + "name VARCHAR(200)," + "category VARCHAR(200)," + "price VARCHAR(200))";

            String billTable = "CREATE TABLE IF NOT EXISTS bill("+"id INT PRIMARY KEY,"+"name VARCHAR(200),"+"mobileNumber VARCHAR(200),"+"email VARCHAR(200),"+"date VARCHAR(200),"+"total VARCHAR(200),"+"createdBy VARCHAR(200))";
            
            DbOperations.setDataOrDelete(user1Table, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "category Table Created Successfully");
            DbOperations.setDataOrDelete(productTable, "product Table Created Successfully");
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error creating user table: " + e.getMessage());  
        }
    }

}
