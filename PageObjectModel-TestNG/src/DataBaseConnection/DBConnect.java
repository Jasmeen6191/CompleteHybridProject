package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {	
	public static void DatabaseSelenium() throws  ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver"); 

			 String dbUrl = "jdbc:mysql://localhost:3036/emp";					
			String username = "root";	
			String password = "";		
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		 System.out.print("connection sucessfull");
			 
		 }


	
	

}
