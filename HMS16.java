import java.sql.*;
import java.io.*;

public class HMS16
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//System.out.println("driver registered");

			Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
			//System.out.println("Connection created");
		
			Statement s=co.createStatement();

			s.execute("create table admin_tbl(admin_id INTEGER , admin_name VARCHAR(20), username VARCHAR(20), password VARCHAR(20))");
			//System.out.println("Table admin created");

			s.close();
			co.close();
	 	
			
		}catch(Exception e){}
	
	
	}
}