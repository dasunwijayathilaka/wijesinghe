package lk.ijse.repository;

import lk.ijse.db.DbConnection;
import lk.ijse.model.tm.CartItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderRepo {
    public static boolean Save(List<CartItem> cartItems) {
        try {
            for (CartItem OrderCart : cartItems) {
                Connection connection = DbConnection.getInstance().getConnection();
                String sql = "INSERT INTO supply_store VALUES(?,?,?,?,?)";
                PreparedStatement pstm = connection.prepareStatement(sql);
                pstm.setObject(1, OrderCart.getSupplierId());
                pstm.setObject(2, OrderCart.getStoreId());
                pstm.setObject(3, OrderCart.getQuantity());
                pstm.setObject(4, OrderCart.getUnitPrice());
                pstm.setObject(5, OrderCart.getTotalPrice());

                if (pstm.executeUpdate() == 0) {
                    return false;
                }
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

