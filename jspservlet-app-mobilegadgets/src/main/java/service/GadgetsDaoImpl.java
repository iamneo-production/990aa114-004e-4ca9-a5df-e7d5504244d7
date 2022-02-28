
package service;
import model.Gadgets;
import utility.ConnectionManager;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class GadgetsDaoImpl implements GadgetsDao {

    ResultSet resultSet = null;
    Statement statement = null;

    
    public boolean addGadgets(Gadgets gadgets) {
        boolean flag = false;
        try {

            String sql = " INSERT INTO gadgets ( gadgetName , gadgetPrice, imageUrl, quantity, details ) VALUES ('"
                    + gadgets.getgadgetName() + "', '" + gadgets.getgadgetPrice() + "', '" + gadgets.getimageUrl()
                    + "', '" + gadgets.getquantity() + "', '" + gadgets.getdetails() + "') ";
            Connection connection = ConnectionManager.openConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            flag = true;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return flag;

    }

    public boolean updateGadgets(Gadgets gadgets) {
        boolean flag = false;
        try {
            String sql = "UPDATE gadgets SET gadgetName = '" + gadgets.getgadgetName() + "', " + " gadgetPrice = '"
                    + gadgets.getgadgetPrice() + "', imageUrl = '" + gadgets.getimageUrl() + "', quantity = '"
                    + gadgets.getquantity() + "', details = '" + gadgets.getdetails() + "' where gadgetId='"+ gadgets.getgadgetId()+"'";
            Connection connection = ConnectionManager.openConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
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
            Connection connection = ConnectionManager.openConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public List<Gadgets> viewGadgetsById() {

        List<Gadgets> list = null;
        //Gadgets gadgets = null;

        try {

            list = new ArrayList<Gadgets>();
            String sql = "SELECT * FROM mobilegadgets.gadgets";
            Connection connection = ConnectionManager.openConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Gadgets gadgets = new Gadgets();
                //gadgets.setgedgetId(resultSet.getInt("gadgetId"));
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
            String sql = "SELECT * FROM gadgets where gadgetId='" + gadgetId+"'";
            Connection connection = ConnectionManager.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            ;
            if (resultSet.next()) {
                //gadgets.setgedgetId(resultSet.getInt("gedgetId"));
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

 

