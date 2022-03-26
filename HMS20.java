import java.sql.*;
import java.io.*;

public class HMS20
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//System.out.println("driver registered");

			Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
			//System.out.println("Connection created");
		
			Statement s=co.createStatement();

s.execute("create table appt_tbl(DOC_ID INTEGER, DOC_NAME VARCHAR(20), DOC_DEPARTMENT VARCHAR(20), DOC_DUTY_DAYS VARCHAR(20), DOC_DUTY_TIME VARCHAR(20), DOC_PHONE_NO VARCHAR(20), APPT_ID VARCHAR(20), PAT_ID INTEGER, PAT_NAME VARCHAR(20), PAT_SYMPTOMS VARCHAR(100), APPT_DATE VARCHAR(20), APPT_TIME VARCHAR(20), PAT_PHONE_NO VARCHAR(20), APPT_FEE VARCHAR(20))");
			
			//System.out.println("Table Appointment created");

			s.close();
			co.close();
	 	
			
		}catch(Exception e){}
	
	
	}
}