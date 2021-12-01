package jdbc;

import java.sql.*;
import java.util.concurrent.Callable;

public class CallableDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver
            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdata", "Sharad", "password");

            CallableStatement callableStatement=connection.prepareCall("call getEmpData()");

            ResultSet rs= callableStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }


        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }

}
