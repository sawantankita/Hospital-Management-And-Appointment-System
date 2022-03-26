import java.sql.*;
import java.io.*;

public class HMS18
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//System.out.println("driver registered");

			Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
			//System.out.println("Connection created");
		
			Statement s=co.createStatement();

s.execute("create table receptionist_tbl(RECEP_ID INTEGER, RECEP_NAME VARCHAR(20),  RECEP_AGE VARCHAR(20), RECEP_GENDER VARCHAR(20), RECEP_PHONE_NO VARCHAR(20), RECEP_ADDRESS VARCHAR(80), RECEP_DUTY_DAYS VARCHAR(20),RECEP_DUTY_TIME VARCHAR(20), RECEP_USERNAME VARCHAR(20), RECEP_PASSWORD VARCHAR(20))");
			//System.out.println("Table Receptionist created");

			s.close();
			co.close();
	 	
			
		}catch(Exception e){}
	
	
	}
}