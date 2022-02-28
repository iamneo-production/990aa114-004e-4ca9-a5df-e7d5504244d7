package utility;

import java.sql.*;

public class ConnectionManager {

   
    private static final String URL = "jdbc:mysql://localhost/mobilegadgets";

    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "examly";

    private static Connection connection = null;

    public static Connection openConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }



    
}
