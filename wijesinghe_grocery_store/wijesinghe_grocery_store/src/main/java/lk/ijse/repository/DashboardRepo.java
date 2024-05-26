package lk.ijse.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashboardRepo {

    private static Connection getConnection() throws SQLException {
        // Modify the connection details as per your database configuration
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "yourusername";
        String password = "yourpassword";
        return DriverManager.getConnection(url, user, password);
    }

    public static String getTopCustomer() {
        String query = "SELECT Customer.c_id, Customer.c_name, SUM(Order.total_amount) AS total_spent " +
                "FROM Customer " +
                "JOIN Order ON Customer.c_id = Order.c_id " +
                "GROUP BY Customer.c_id, Customer.c_name " +
                "ORDER BY total_spent DESC " +
                "LIMIT 1";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getString("c_name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getTopSellItem() {
        String query = "SELECT Item.i_id, Item.i_name, SUM(Order_Item.qty) AS total_quantity_sold " +
                "FROM Item " +
                "JOIN Order_Item ON Item.i_id = Order_Item.i_id " +
                "GROUP BY Item.i_id, Item.i_name " +
                "ORDER BY total_quantity_sold DESC " +
                "LIMIT 1";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getString("i_name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static int getOrderCount() {
        String query = "SELECT COUNT(*) AS total_orders FROM Order";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("total_orders");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
}
}
