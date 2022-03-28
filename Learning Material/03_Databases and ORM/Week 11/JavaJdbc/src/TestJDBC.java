import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		//JDBC_Demo is the schema name present in MYSQl
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/JDBC_Demo?useSSL=false";
		
		//userName for MySql login
		String userName = "root";
		
		//passWord for MySql login
		String password = "admin";
		
		try {
			System.out.println(" Connecting to database");
			
			//Using DriverManager to create connection
			Connection myConn = DriverManager.getConnection(jdbcUrl,userName, password);
			
			System.out.println("connection successful");
		}
		
		catch(Exception exc) {
			System.out.println("Error connecting db");
			exc.printStackTrace();
		}
 
	}

}
