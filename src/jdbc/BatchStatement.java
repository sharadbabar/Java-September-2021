package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BatchStatement {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver
            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdata", "Sharad", "password");


            String insert = "insert into employee(id,name,address) values(?,?,?)";


            PreparedStatement prepareStatement=connection.prepareStatement(insert);

            for (int i=1;i<=10;i++){
                prepareStatement.setInt(1,i);
                prepareStatement.setString(2,"Name="+i);
                prepareStatement.setString(3,"address="+i);
                prepareStatement.addBatch();
            }
//
            int[] arr =prepareStatement.executeBatch();
            System.out.println("Record Inserted-->" + arr.length);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
