import util.DatabaseConnection;

import java.sql.*;
import java.util.Scanner;

public class EmployeeData1 {
    public static void main(String[] args){

        try{
            //Step1: Load the driver
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

//            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step2: Create connection with database
            //Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","1234");

            Connection connection= DatabaseConnection.getMySqlConnection();

            if(connection!=null)
                System.out.println("Connection successful");
            else
                System.out.println("problem in connection");

            //Step3: Create statement to execute SQL Query
            Statement statement=connection.createStatement();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter id, name, salary");
            int id=scanner.nextInt();
            scanner.nextLine();
            String name=scanner.nextLine();
            float salary=scanner.nextFloat();

            //executeUpdate -- insert, update, delete
            int res=statement.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");
            if(res==1)
                System.out.println(res+" record added");
            //executeQuery -- select
            ResultSet resultSet=statement.executeQuery("select*from employee");

            while(resultSet.next())
                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getFloat(3));
        }
        //catch (SQLException | ClassNotFoundException e){
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
