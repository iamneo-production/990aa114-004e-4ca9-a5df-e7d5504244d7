package service;

import model.Gadgets;

import java.util.List;
/*import utility.ConnectionManager;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.List;*/
public interface GadgetsDao {
	
	List<Gadgets> viewGadgetsById();

	Gadgets viewGadgetsById(int id);
	
	boolean addGadgets(Gadgets gadgets);
	
	boolean updateGadgets(Gadgets gadgets);
	
	boolean deleteGadgets(int id);
}
	
/*
public class GadgetsDao {
    

     Connection connection = null;
     ResultSet resultSet = null;
     Statement statement = null;
     PreparedStatement preparedStatement = null;

     public int addGadgets(Gadgets gadgets) throws ClassNotFoundException {
         int flag = 0;
         try {

             String sql = " INSERT INTO gadgets ( gadgetName , gadgetPrice, imageUrl, quantity, details ) VALUES ('"
                     + gadgets.getgadgetName() + "', '" + gadgets.getgadgetPrice() + "', '" + gadgets.getimageUrl()
                     + "', '" + gadgets.getquantity() + "', '" + gadgets.getdetails() + "') ";
             connection = ConnectionManager.openConnection();
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.executeUpdate();
             flag = 1;

         } catch (SQLException e) {
             e.printStackTrace();

         }
         return flag;

     }

     public boolean updateGadgets(Gadgets gadgets) {
         boolean flag = false;
         try {
             String sql = "UPDATE gadgets SET gadgetName = '" + gadgets.getgadgetName() + "', " + "gadgetPrice = '"
                     + gadgets.getgadgetPrice() + "', imageUrl = '" + gadgets.getimageUrl() + "', quantity = '"
                     + gadgets.getquantity() + "', details = '" + gadgets.getdetails() + "' where gadgetId="
                     + gadgets.getgedgetId();
             connection = ConnectionManager.openConnection();
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.executeUpdate();
             flag = true;
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return flag;

     }

   

     public boolean deleteGadgets(int id) {
         boolean flag = false;
         try {
             String sql = "DELETE FROM gadgets where gadgetId=" + id;
             connection = ConnectionManager.openConnection();
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.executeUpdate();
             flag = true;
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return flag;
     }

     public List<Gadgets> get() {

         List<Gadgets> list = null;
         Gadgets gadgets = null;

         try {

             list = new ArrayList<Gadgets>();
             String sql = "SELECT * FROM gedgets";
             connection = ConnectionManager.openConnection();
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             while (resultSet.next()) {
                 gadgets = new Gadgets();
                 gadgets.setgadgetId(resultSet.getInt("gedgetId"));
                 gadgets.setgadgetName(resultSet.getString("gadgetName"));
                 gadgets.setgadgetPrice(resultSet.getDouble("gadgetPrice"));
                 gadgets.setimageUrl(resultSet.getString("imageUrl"));
                 gadgets.setquantity(resultSet.getInt("quantity"));
                 gadgets.setdetails(resultSet.getString("details"));
                 list.add(gadgets);
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return list;
     }

     public Gadgets viewGadgetsById(int gadgetId) {

         Gadgets gadgets = null;

         try {
             gadgets = new Gadgets();
             String sql = "SELECT * FROM gedgets where gadgetId=" + gadgetId;
             connection = ConnectionManager.openConnection();
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             ;
             if (resultSet.next()) {
                 gadgets.setgadgetId(resultSet.getInt("gedgetId"));
                 gadgets.setgadgetName(resultSet.getString("gadgetName"));
                 gadgets.setgadgetPrice(resultSet.getDouble("gadgetPrice"));
                 gadgets.setimageUrl(resultSet.getString("imageUrl"));
                 gadgets.setquantity(resultSet.getInt("quantity"));
                 gadgets.setdetails(resultSet.getString("details"));
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return gadgets;

     }

 }
 */
