import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS21 extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4,t6,t7,t9,t10,t11;
	JPasswordField t12;
	JComboBox t5,t8;
	JButton b1,b2,b3,b4,b5,b6,b7;
	int a1;
	String a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;


	public HMS21()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,20);
		Font f2=new Font("Century Gothic",Font.BOLD,28);
		Font f3=new Font("Century Gothic",Font.BOLD,18);
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon i1=new ImageIcon("bg4.JPG");   		//bg pic
		ImageIcon i2=new ImageIcon("adddoclogo.PNG");   	//add pic
		ImageIcon i3=new ImageIcon("deletedoclogo.PNG");   	//delete pic
		ImageIcon i4=new ImageIcon("updatedoclogo.PNG");   	//updat epic
		ImageIcon i5=new ImageIcon("viewdoctorlogo.PNG");   	//view pic
		ImageIcon i6=new ImageIcon("homelogo2.PNG");   	//whitehome pic, for blue pic use homologo.png
		ImageIcon i7=new ImageIcon("clearlogo2.PNG");   	//clear pic
		ImageIcon i8=new ImageIcon("searchdoclogo.PNG");   	//search doc pic
		ImageIcon i9=new ImageIcon("doclogo3.PNG");   	//doc pic

		JLabel l1=new JLabel();				//for bg
		 b1=new JButton("  ADD DOCTOR",i2);
		 b2=new JButton("  DELETE DOCTOR",i3);
		 b3=new JButton("  UPDATE DOCTOR",i4);
		 b4=new JButton("  VIEW DOCTOR",i5);
		 b5=new JButton("   HOME",i6);
		 b6=new JButton("  CLEAR",i7);
		 b7=new JButton("  SEARCH DOCTOR",i8);

		JLabel l13=new JLabel ("Doctor ID:");		
		JLabel l2=new JLabel ("Age:");		
		JLabel l3=new JLabel("Department:");		
		JLabel l4=new JLabel ("Address:");
		JLabel l5=new JLabel("Duty Time:");
		JLabel l6=new JLabel ("Name:");		
		JLabel l7=new JLabel ("Phone No:");		
		JLabel l8=new JLabel ("Qualification:");		
		JLabel l9=new JLabel ("Joining Date:");
		JLabel l10=new JLabel ("Duty Days:");
		JLabel l11=new JLabel ("UserName:");		
		JLabel l12=new JLabel ("Password:");
		JLabel l14=new JLabel( "   DOCTOR DETAILS: ",i9,JLabel.LEFT);
		
		String s2[]={"Dental","Cardiology","Orthopadic","Gynecology","Neurology","Dermitology","E.N.T","Surgery","psychiatry","Nephrology"};
		String s3[]={"8:00 AM-4:00 PM","4:00 PM-11:00 PM","11:00 PM-8:00 AM"};
		 t5=new JComboBox(s2);
		 t8=new JComboBox(s3);

		 t1=new JTextField(10);
		 t2=new JTextField(10);			
		 t3=new JTextField(10);		
		 t4=new JTextField(10);		
		 t6=new JTextField(10);			
		 t7=new JTextField(10);		
		 t9=new JTextField(10);	
		 t10=new JTextField(10);
		 t11=new JTextField(10);		
		 t12=new JPasswordField(10);
				
		l1.setIcon(i1);
		l14.setFont(f2);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		b5.setFont(f2);
		b6.setFont(f2);
		b7.setFont(f2);

		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);		
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		l13.setFont(f1);

		t1.setFont(f3);
		t2.setFont(f3);
		t3.setFont(f3);
		t4.setFont(f3);
		t5.setFont(f3);
		t6.setFont(f3);
		t7.setFont(f3);
		t8.setFont(f3);
		t9.setFont(f3);
		t10.setFont(f3);
		t11.setFont(f3);
		t12.setFont(f3);
				
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);

		l14.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		l6.setForeground(Color.WHITE);
		l7.setForeground(Color.WHITE);
		l8.setForeground(Color.WHITE);
		l9.setForeground(Color.WHITE);
		l10.setForeground(Color.WHITE);
		l11.setForeground(Color.WHITE);
		l12.setForeground(Color.WHITE);
		l13.setForeground(Color.WHITE);

		t1.setForeground(Color.WHITE);
		t2.setForeground(Color.WHITE);
		t3.setForeground(Color.WHITE);
		t4.setForeground(Color.WHITE);
		t5.setForeground(Color.WHITE);
		t6.setForeground(Color.WHITE);
		t7.setForeground(Color.WHITE);
		t8.setForeground(Color.WHITE);
		t9.setForeground(Color.WHITE);
		t10.setForeground(Color.WHITE);
		t11.setForeground(Color.WHITE);
		t12.setForeground(Color.WHITE);
		
		b1.setBackground(new Color(27,214,215));
		b2.setBackground(new Color(27,214,215));
		b3.setBackground(new Color(27,214,215));
		b4.setBackground(new Color(27,214,215));
		b5.setBackground(new Color(27,214,215));
		b6.setBackground(new Color(27,214,215));
		b7.setBackground(new Color(27,214,215));
		t1.setBackground(new Color(27,214,215));
		t2.setBackground(new Color(27,214,215));
		t3.setBackground(new Color(27,214,215));
		t4.setBackground(new Color(27,214,215));
		t5.setBackground(new Color(27,214,215));
		t6.setBackground(new Color(27,214,215));
		t7.setBackground(new Color(27,214,215));
		t8.setBackground(new Color(27,214,215));
		t9.setBackground(new Color(27,214,215));
		t10.setBackground(new Color(27,214,215));
		t11.setBackground(new Color(27,214,215));
		t12.setBackground(new Color(27,214,215));
				
		/*b1.setOpaque(false);
		b2.setOpaque(false);
		b3.setOpaque(false);
		b4.setOpaque(false);
		b5.setOpaque(false);*/

		b1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b3.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b6.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b7.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		l14.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));

		t1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t3.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t5.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t6.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t7.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t8.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t9.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t10.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t11.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t12.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		
		l1.setBounds(0,0,1950,1000);
		b1.setBounds(5,5,350,80);
		b2.setBounds(380,5,350,80);
		b3.setBounds(780,5,350,80);
		b4.setBounds(1180,5,350,80);
		b5.setBounds(1550,5,350,80);
		b6.setBounds(1200,500,450,80);
		b7.setBounds(1200,650,450,80);
		
		l14.setBounds(5,100,500,180);
		l13.setBounds(200,300,250,30);
		l2.setBounds(200,400,150,30);
		l3.setBounds(200,500,150,30);
		l4.setBounds(200,600,150,30);
		l5.setBounds(200,700,150,30);
		l6.setBounds(700,300,150,30);
		l7.setBounds(700,400,150,30);
		l8.setBounds(700,500,150,30);
		l9.setBounds(700,600,150,30);
		l10.setBounds(700,700,150,30);
		l11.setBounds(1200,300,150,30);
		l12.setBounds(1200,400,150,30);

		t1.setBounds(400,300,250,30);
		t2.setBounds(900,300,250,30);
		t3.setBounds(400,400,250,30);
		t4.setBounds(900,400,250,30);
		t5.setBounds(400,500,250,30);
		t6.setBounds(900,500,250,30);
		t7.setBounds(400,600,250,30);
		t8.setBounds(400,700,250,30);		
		t9.setBounds(900,600,250,30);
		t10.setBounds(900,700,250,30);
		t11.setBounds(1400,300,250,30);
		t12.setBounds(1400,400,250,30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		t3.addActionListener(this);
		t9.addActionListener(this);		
		
		add(l1);	
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		l1.add(l14);
		l1.add(l13);
		l1.add(l2);
		l1.add(l3);
		l1.add(l4);
		l1.add(l5);
		l1.add(l6);
		l1.add(l7);
		l1.add(l8);
		l1.add(l9);
		l1.add(l10);
		l1.add(l11);
		l1.add(l12);

		l1.add(t1);
		l1.add(t2);
		l1.add(t3);
		l1.add(t4);
		l1.add(t5);
		l1.add(t6);
		l1.add(t7);
		l1.add(t8);
		l1.add(t9);
		l1.add(t10);
		l1.add(t11);
		l1.add(t12);
		l1.add(b6);
		l1.add(b7);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("  ADD DOCTOR"))
		{
			
			 a1=Integer.parseInt(t1.getText().trim());
			 a2=t2.getText().trim();
			 a3=t3.getText().trim();
			 a4=t4.getText().trim();
			 a5=(String)t5.getSelectedItem();		
			 a6=t6.getText().trim();
			 a7=t7.getText().trim();
			 a8=t9.getText().trim();
			 a9=(String)t8.getSelectedItem();
			 a10=t10.getText().trim();
			 a11=t11.getText().trim();
			 a12=t12.getText().trim();

			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				PreparedStatement ps=co.prepareStatement("insert into doctor_tbl values(?,?,?,?,?,?,?,?,?,?,?,?)");		

				ps.setInt(1,a1);
				ps.setString(2,a2);
				ps.setString(3,a3);
				ps.setString(4,a4);
				ps.setString(5,a5);
				ps.setString(6,a6);
				ps.setString(7,a7);
				ps.setString(8,a8);
				ps.setString(9,a9);
				ps.setString(10,a10);
				ps.setString(11,a11);
				ps.setString(12,a12);
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Doctor Added successfully");
				ps.close();
				co.close();
			}
		
			catch(Exception e)
			{System.out.println(e);}
		}
		if(s1.equals("  DELETE DOCTOR"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				 a1=Integer.parseInt(t1.getText().trim());

				PreparedStatement ps=co.prepareStatement("delete from doctor_tbl where DOC_ID=?");
				ps.setInt(1,a1);

				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Doctor Deleted successfully");
				ps.close();
				co.close();
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("  UPDATE DOCTOR"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				 a1=Integer.parseInt(t1.getText().trim());
				 a2=t2.getText().trim();
				 a3=t3.getText().trim();
				 a4=t4.getText().trim();
				 a5=(String)t5.getSelectedItem();		
				 a6=t6.getText().trim();
				 a7=t7.getText().trim();
				 a8=t9.getText().trim();
				 a9=(String)t8.getSelectedItem();
				 a10=t10.getText().trim();
				 a11=t11.getText().trim();
				 a12=t12.getText().trim();

PreparedStatement ps=co.prepareStatement("update doctor_tbl set DOC_NAME=?,DOC_AGE=?,DOC_PHONE_NO=?,DOC_DEPARTMENT=?,DOC_QUALIFICATION=?,DOC_ADDRESS=?,DOC_JOINING_DATE=?,DOC_DUTY_TIME=?,DOC_DUTY_DAYS=?,DOC_USERNAME=?,DOC_PASSWORD=? where DOC_ID=?");
				
				ps.setString(1,a2);
				ps.setString(2,a3);
				ps.setString(3,a4);
				ps.setString(4,a5);
				ps.setString(5,a6);
				ps.setString(6,a7);
				ps.setString(7,a8);
				ps.setString(8,a9);
				ps.setString(9,a10);
				ps.setString(10,a11);
				ps.setString(11,a12);
				ps.setInt(12,a1);

				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Updated successfully");
				ps.close();
				co.close();
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("  VIEW DOCTOR"))
		{
			new HMS22();
			this.dispose();
		}
		if(s1.equals("   HOME"))
		{
			new HMS10();
			this.dispose();
		}
		if(s1.equals("  CLEAR"))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t6.setText("");
			t7.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");
			t12.setText("");
			
		}
		if(s1.equals("  SEARCH DOCTOR"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
			
				Statement st=co.createStatement();

				ResultSet rs=st.executeQuery("select * from doctor_tbl where DOC_ID="+t1.getText().trim());
				
			if(rs.next()==true)
			{
					t2.setText(rs.getString(2));	//setText method only show string value not integer
					t3.setText(rs.getString(3));
					t4.setText(rs.getString(4));
					t5.setSelectedItem(rs.getString(5));		//jcombobox
					t6.setText(rs.getString(6));
					t7.setText(rs.getString(7));
					t8.setSelectedItem(rs.getString(9));	//jcombobox
					t9.setText(rs.getString(8));	
					t10.setText(rs.getString(10));
					t11.setText(rs.getString(11));	
					t12.setText(rs.getString(12));
					
								
			}
			else
			{
				JOptionPane.showMessageDialog(this,"No record found");
			}
				//JOptionPane.showMessageDialog(this,"search successfully");
				co.close();
			}catch(Exception e){System.out.println(e);}
				
		}
	}

	/*public static void main(String args[])
	{
		HMS21 lpg21=new HMS21();
	}*/
}
		