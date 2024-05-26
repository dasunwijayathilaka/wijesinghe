package lk.ijse.repository;

import lk.ijse.db.DbConnection;

import lk.ijse.model.returnexchange;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReturnRepo {
    public static List<returnexchange> getAll() throws SQLException {
        String sql = "SELECT * FROM RETURN_EXCHANGE";

        PreparedStatement pstm = DbConnection.getInstance().getConnection()
                .prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<returnexchange> returnexchangeList = new ArrayList<>();

        while (resultSet.next()) {

            String return_id = resultSet.getString(1);
            String order_id = resultSet.getString(2);
            Date return_date = resultSet.getDate(3);
            double amount = resultSet.getDouble(4);
            String return_reason = resultSet.getString(5);
            boolean exchangerequest = resultSet.getBoolean(6);
            String status = resultSet.getString(7);



            returnexchange returnexchange = new returnexchange(return_id, order_id, return_reason, status, exchangerequest, return_date, amount);
            returnexchangeList.add(returnexchange);
        }
        return returnexchangeList;


    }

    public static boolean delete(String returnID) {
        String sql = "DELETE FROM return_exchange WHERE R_id = ?";

        try {
            Connection connection = DbConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement(sql);

            pstm.setString(1, returnID);

            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }


    public static boolean save(returnexchange returnexchange) {
        String sql = "INSERT INTO return (R_ID,O_ID, R_Date, Refund_Amount, R_Reason, Exchange_Request,R_Status) VALUES (?, ?, ?, ?, ?, ?,?)";

        try {
            Connection connection = DbConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement(sql);

            pstm.setString(1, returnexchange.getR_ID());
            pstm.setString(2, returnexchange.getO_ID());
            pstm.setDate(3, returnexchange.getR_Date());
            pstm.setDouble(4,returnexchange.getRefund_Amount());
            pstm.setString(5,returnexchange.getR_Reason());
            pstm.setBoolean(6,returnexchange.isExchange_Request());
            pstm.setString(7,returnexchange.getR_Status());

            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static returnexchange searchById(String id) throws SQLException {
        String sql = "SELECT * FROM return_exchange WHERE R_id = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, id);

        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()) {
            String return_id = resultSet.getString(1);
            String order_id = resultSet.getString(2);
            Date return_date = resultSet.getDate(3);
            double amount = resultSet.getDouble(4);
            String return_reason = resultSet.getString(5);
            boolean exchangerequest = resultSet.getBoolean(6);
            String status = resultSet.getString(7);

            returnexchange returnexchange = new returnexchange(return_id, order_id, return_reason, status, exchangerequest, return_date, amount);


            return returnexchange;
        }
        return null;
    }



    public static boolean update(returnexchange returnexchange) throws SQLException {
        String sql = "UPDATE return SET R_ID = ?, O_ID = ?, R_Date = ?, Refund_Amount = ?, R_Reason = ?, Exchange_Request = ?, R_Status = ? WHERE R_ID = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, returnexchange.getR_ID());
        pstm.setString(2, returnexchange.getO_ID());
        pstm.setDate(3, returnexchange.getR_Date());
        pstm.setDouble(4, returnexchange.getRefund_Amount());
        pstm.setString(5, returnexchange.getR_Reason());
        pstm.setBoolean(6, returnexchange.isExchange_Request());
        pstm.setString(7, returnexchange.getR_Status());



        return pstm.executeUpdate() > 0;

    }





}