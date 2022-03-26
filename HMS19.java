import java.sql.*;
import java.io.*;

public class HMS19
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//System.out.println("driver registered");

			Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
			//System.out.println("Connection created");
		
			Statement s=co.createStatement();

s.execute("create table patient_tbl(PAT_ID INTEGER, PAT_NAME VARCHAR(20), PAT_AGE VARCHAR(20), PAT_GENDER VARCHAR(20), PAT_DATE VARCHAR(20), PAT_SYMPTOMS VARCHAR(100), PAT_PHONE_NO VARCHAR(20), PAT_ADDRESS VARCHAR(100), PAT_MEDICINES VARCHAR(100))");
			
			//System.out.println("Table Patient created");

			s.close();
			co.close();
	 	
			
		}catch(Exception e){}
	
	
	}
}