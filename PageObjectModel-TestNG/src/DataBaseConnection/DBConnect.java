package DataBaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class DBConnect{
	Statement  stmt ;
	Connection connection;
public void connecToDB()
	{
		String url = "jdbc:mysql://localhost:3306/jasmeen";
		String username = "root";
		String password = "";
		System.out.println("Connecting database...");
		try {			
	 connection = DriverManager.getConnection(url, username, password);
		    System.out.println("Database connected!");
		    }
		catch (SQLException e)
		{
		    throw new IllegalStateException("Cannot connect the database!", e);
		}		
	}
public void executeStatement(String query) throws SQLException{
	stmt = connection.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	System.out.println("Query executed and result stored in rs variable"+rs.getFetchSize());
	while(rs.next())
	{
		System.out.println(rs.getString("name"));	
		System.out.println(rs.getInt("age"));	
	}}
	public void update(String query) throws SQLException{
}
	
	public void insert(String query) throws SQLException{
}
public static void main(String[] args) throws SQLException{
	DBConnect db = new DBConnect();
	String exequery ="select * from dbtest where name ='jasmeen';";
	db.connecToDB();
	db.executeStatement(exequery);

}



}

/*http://collabedit.com/cgurb
mysql.server start
mysql.server stop
mysql.server restart
mysql -uroot -p -A
Mysql -uroot -p
show databases;
Use jasmeen;
show tables;*/

