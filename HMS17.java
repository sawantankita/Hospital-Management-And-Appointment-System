import java.sql.*;
import java.io.*;

public class HMS17
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//System.out.println("driver registered");

			Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
			//System.out.println("Connection created");
		
			Statement s=co.createStatement();

			s.execute("create table doctor_tbl(DOC_ID INTEGER, DOC_NAME VARCHAR(20),  DOC_AGE VARCHAR(20),  DOC_PHONE_NO VARCHAR(20), DOC_DEPARTMENT VARCHAR(20), DOC_QUALIFICATION VARCHAR(20), DOC_ADDRESS VARCHAR(80), DOC_JOINING_DATE VARCHAR(20), DOC_DUTY_TIME VARCHAR(20), DOC_DUTY_DAYS VARCHAR(20), DOC_USERNAME VARCHAR(20), DOC_PASSWORD VARCHAR(20))");
			//System.out.println("Table doctor created");

			s.close();
			co.close();
	 	
			
		}catch(Exception e){}
	
	
	}
}