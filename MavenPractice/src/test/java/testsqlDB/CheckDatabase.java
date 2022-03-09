package testsqlDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;


public class CheckDatabase {
@Test
public void checkdb() throws ClassNotFoundException, SQLException {
	//To use "com.mysql.cj.jdbc" package class we used following method
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded");
	
	//To connect java with database we used class"Connection" and "Driver Manager"
	//Create object of class
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rahuldb","root","Qwerty@123");
	System.out.println("Connected to mysql database");
	
	//After db connected write SQL Statement
	Statement smt= con.createStatement();
	
	//To execute SQL query we used
	ResultSet rs= smt.executeQuery("Select * from employee");
	
	//To fetch record from the table we used while statement
	while(rs.next())
	{
		Integer eid= rs.getInt("emp_id");
		System.out.println("Database Record epm_id is: "+eid);
		
		String name= rs.getString("name");
		System.out.println("Database Record name is: "+name);
		
		String email= rs.getString("email");
		System.out.println("Database Record email is: "+email);
	}	
}
}
