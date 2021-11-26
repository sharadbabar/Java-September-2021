package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver
            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdata", "Sharad", "password");


            Statement statement = connection.createStatement();


            String str="select * from employee";
            ResultSet rs=statement.executeQuery(str);
            ResultSetMetaData rms=rs.getMetaData();

            System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+" "+rms.getColumnName(3));
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
/*

*/