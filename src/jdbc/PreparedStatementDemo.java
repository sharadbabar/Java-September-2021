package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver
            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdata", "Sharad", "password");
            int id;
            String name;
            String address;


            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter the id");
            id=scanner.nextInt();
            System.out.println("Enter the name:");
            name=scanner.next();
            System.out.println("Enter the address");
            address=scanner.next();


            String insert = "insert into employee(id,name,address) values(?,?,?)";


            PreparedStatement statement=connection.prepareStatement(insert);
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,address);
//
            int i = statement.executeUpdate();
            System.out.println("Record Inserted-->" + i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
