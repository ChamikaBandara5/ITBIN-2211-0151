/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;

/**
 *
 * @author Chamika
 */
public class CategoryControl {
    public static void save(Category category)
    {
       String query = "insert into category (name) values('"+ category.getName()+"')";
       DbOperations.setDataOrDelete(query, "Category Added Successfully");
       
    }
    public static ArrayList<Category> getAllRecords()
    {
        ArrayList<Category> arrayList = new ArrayList<>();
        try
        {
            ResultSet rs = DbOperations.getData("select *from category");
            while(rs.next())
            {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("Name"));
                arrayList.add(category);
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void delete(String id)
    {
        String query  = "delete from category where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Category Deleted Successfully");
    }
    
}
