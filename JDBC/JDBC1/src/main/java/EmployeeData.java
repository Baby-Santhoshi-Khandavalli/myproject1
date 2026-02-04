import java.sql.*;

public class EmployeeData {
    public static void main(String[] args) throws SQLException {

        //Step1: Load the driver
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Step2: Create connection with database
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","1234");

        if(connection!=null)
            System.out.println("Connection successful");
        else
            System.out.println("problem in connection");

        //Step3: Create statement to execute SQL Query
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select*from employee");
        //resultSet.next();

        while(resultSet.next())
        //ResultSet column index starts from 1 to n
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getFloat(3));
        //System.out.println(resultSet.getInt("Id")+"\t"+resultSet.getString("Name")+"\t"+resultSet.getFloat("Salary"));
        //resultSet.next();   //we get the another record present in the table
    }
}
