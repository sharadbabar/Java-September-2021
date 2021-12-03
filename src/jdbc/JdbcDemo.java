package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver
            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdata", "Sharad", "password");


            Statement statement = connection.createStatement();


            String insert = "insert into employee(id,name,address) values(1,'sharad','pune')";
//            String update=""
            int i = statement.executeUpdate(insert);
            System.out.println("Record Inserted-->" + i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


}

