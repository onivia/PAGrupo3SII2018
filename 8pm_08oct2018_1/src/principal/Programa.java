package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Programa {

    public static void main(String[] args) {
        conectar();
    }

    public static void conectar() {
// Create a variable for the connection string.
        String connectionUrl = "jdbc:mysql://192.10.1.4:3306/northwind?useSSL=true";
// Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
// Establish the connection.
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionUrl, "root", "123");
// Create and execute an SQL statement that returns some data.
            String SQL = "SELECT * FROM customers LIMIT 2";
            stmt = (Statement) con.createStatement();
            rs = stmt.executeQuery(SQL);
// Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("CustomerID") + " - " +
                        rs.getString("CompanyName") + " - " +
                        rs.getString("City"));
            }
        } // Handle any errors that may have occurrsed.
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
