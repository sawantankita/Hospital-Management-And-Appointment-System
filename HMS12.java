import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS12 extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4,t6,t7,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23;
	JComboBox t5,t8;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JLabel l11;
	ImageIcon i10;
	Font f4=new Font("Courier",Font.BOLD,14);
	int a1,a8;
	String a2,a3,a4,a5,a6,a7,a9,a10,a11,a12,a13,a14;

	public HMS12()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,20);
		Font f2=new Font("Century Gothic",Font.BOLD,28);
		Font f3=new Font("Century Gothic",Font.BOLD,18);
		Font f4=new Font("Century Gothic",Font.BOLD,14);
		
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon i1=new ImageIcon("bg-12.PNG");   		//bg pic
		ImageIcon i5=new ImageIcon("view.PNG");   	//view pic
		ImageIcon i6=new ImageIcon("backbuttonlogo4.PNG");   	//whitehome pic, for blue pic use homologo.png
		ImageIcon i7=new ImageIcon("clearlogo2.PNG");   	//clear pic
		ImageIcon i9=new ImageIcon("appt5.PNG");   	
		 i10=new ImageIcon("recept.JPG");   
		ImageIcon i11=new ImageIcon("print.PNG");   	
		ImageIcon i12=new ImageIcon("saveappt.PNG");   
		ImageIcon i13=new ImageIcon("doc01.PNG");   	
		ImageIcon i14=new ImageIcon("doc02.PNG"); 
		ImageIcon i15=new ImageIcon("apt.PNG");  
		ImageIcon i16=new ImageIcon("view2.PNG");     	

		JLabel l1=new JLabel();				//for bg
		 b1=new JButton("  VIEW RECEPIT",i5);
		 b2=new JButton(" exit ",i6);
		 b3=new JButton("  CLEAR",i7);
		 b4=new JButton("  PRINT",i11);
		 b5=new JButton("  SAVE",i12);
		 b6=new JButton("SEARCH DOCTOR",i13);
		 b7=new JButton("SEARCH PATIENT",i14);
		 b8=new JButton("DELETE APPT",i15);
		 b9=new JButton("VIEW  APPT",i16);


		JLabel l13=new JLabel ("Doctor ID:");		
		JLabel l2=new JLabel ("Doctor Name:");		
		JLabel l3=new JLabel("Department:");		
		JLabel l4=new JLabel ("Duty Days:");
		JLabel l5=new JLabel("Duty Time:");
		JLabel l51=new JLabel("Dr's Contact No:");
		JLabel l52=new JLabel("Appointmen ID:");
		JLabel l53=new JLabel("Appointment Fee:");
		JLabel l6=new JLabel ("Patient ID:");		
		JLabel l7=new JLabel ("Patient Name:");		
		JLabel l8=new JLabel ("Symptoms:");		
		JLabel l9=new JLabel ("Appointment Date:");
		JLabel l10=new JLabel ("Appointment Time:");
		JLabel l101=new JLabel ("Patients Contact No:");
	 	l11=new JLabel();	
		l11.setIcon(i10);
		JLabel l14=new JLabel( "   SET APPOINTMENT ",i9,JLabel.LEFT);
		
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
		 t12=new JTextField(10);
		 t13=new JTextField(10);		
		 t14=new JTextField(10);

		 t15=new JTextField();	//used on recepit
		 t16=new JTextField();			
		 t17=new JTextField();		
		 t18=new JTextField();		
		 t19=new JTextField();			
		 t20=new JTextField();		
		 t21=new JTextField();	
		 t22=new JTextField();
		 t23=new JTextField();
		 							
		l1.setIcon(i1);			
		l14.setFont(f2);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		b5.setFont(f2);
		b6.setFont(f4);
		b7.setFont(f4);
		b8.setFont(f4);
		b9.setFont(f4);

		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l51.setFont(f1);
		l52.setFont(f1);
		l53.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);		
		l10.setFont(f1);
		l101.setFont(f1);
		l11.setFont(f1);
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
		t13.setFont(f3);
		t14.setFont(f3);
		t15.setFont(f4);
		t16.setFont(f4);
		t17.setFont(f4);
		t18.setFont(f4);
		t19.setFont(f4);
		t20.setFont(f4);
		t21.setFont(f4);
		t22.setFont(f4);
		t23.setFont(f4);
		
				
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b9.setForeground(Color.WHITE);

		l14.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		l51.setForeground(Color.WHITE);
		l52.setForeground(Color.WHITE);
		l53.setForeground(Color.WHITE);
		l6.setForeground(Color.WHITE);
		l7.setForeground(Color.WHITE);
		l8.setForeground(Color.WHITE);
		l9.setForeground(Color.WHITE);
		l10.setForeground(Color.WHITE);
		l101.setForeground(Color.WHITE);
		l11.setForeground(Color.WHITE);
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
		t13.setForeground(Color.WHITE);
		t14.setForeground(Color.WHITE);
		t15.setForeground(Color.BLACK);
		t16.setForeground(Color.BLACK);
		t17.setForeground(Color.BLACK);
		t18.setForeground(Color.BLACK);
		t19.setForeground(Color.BLACK);
		t20.setForeground(Color.BLACK);
		t21.setForeground(Color.BLACK);
		t22.setForeground(Color.BLACK);
		t23.setForeground(Color.BLACK);
		
		
		b1.setBackground(new Color(27,214,215));
		b2.setBackground(new Color(27,214,215));
		b3.setBackground(new Color(27,214,215));
		b4.setBackground(new Color(27,214,215));
		b5.setBackground(new Color(27,214,215));
		b6.setBackground(new Color(27,214,215));
		b7.setBackground(new Color(27,214,215));
		b8.setBackground(new Color(27,214,215));
		b9.setBackground(new Color(27,214,215));
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
		t13.setBackground(new Color(27,214,215));
		t14.setBackground(new Color(27,214,215));

		t15.setBackground(Color.WHITE);
		t16.setBackground(Color.WHITE);
		t17.setBackground(Color.WHITE);
		t18.setBackground(Color.WHITE);
		t19.setBackground(Color.WHITE);
		t20.setBackground(Color.WHITE);
		t21.setBackground(Color.WHITE);
		t22.setBackground(Color.WHITE);
		t23.setBackground(Color.WHITE);				
		
		b2.setOpaque(false);
		
		b1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b3.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b6.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b7.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b8.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b9.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
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
		t13.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t14.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	

		t15.setBorder(BorderFactory.createLineBorder(Color.WHITE));	
		t16.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t17.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t18.setBorder(BorderFactory.createLineBorder(Color.WHITE));	
		t19.setBorder(BorderFactory.createLineBorder(Color.WHITE));	
		t20.setBorder(BorderFactory.createLineBorder(Color.WHITE));	
		t21.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t22.setBorder(BorderFactory.createLineBorder(Color.WHITE));	
		t23.setBorder(BorderFactory.createLineBorder(Color.WHITE));	
		
		
		l1.setBounds(0,0,1950,1000);
		b2.setBounds(1800,50,90,80);
		b1.setBounds(1260,650,380,50);
		b4.setBounds(1260,720,380,50);
		b5.setBounds(1260,800,380,50);
		b3.setBounds(1260,880,380,50);
		b6.setBounds(30,220,200,50);
		b7.setBounds(300,220,200,50);		
		b8.setBounds(600,220,200,50);
		b9.setBounds(900,220,200,50);
		
		
		l14.setBounds(5,50,500,150);
		l13.setBounds(200,300,250,30);
		l2.setBounds(200,400,150,30);
		l3.setBounds(200,500,150,30);
		l4.setBounds(200,600,150,30);
		l5.setBounds(200,700,150,30);
		l51.setBounds(200,800,200,30);
		l52.setBounds(200,900,200,30);
		l53.setBounds(700,900,200,30);
		l6.setBounds(700,300,150,30);
		l7.setBounds(700,400,150,30);
		l8.setBounds(700,500,150,30);
		l9.setBounds(700,600,200,30);
		l10.setBounds(700,700,200,30);
		l101.setBounds(700,800,200,30);
		l11.setBounds(1260,300,500,300);
		
	

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
		t11.setBounds(400,800,250,30);
		t12.setBounds(900,800,250,30);
		t13.setBounds(400,900,250,30);
		t14.setBounds(900,900,250,30);

		t15.setBounds(1350,300,200,30);
		t16.setBounds(1260,330,385,20);
		t17.setBounds(1260,350,150,30);
		t18.setBounds(1470,350,170,30);
		t19.setBounds(1260,400,150,30);
		t20.setBounds(1470,400,170,30);
		t21.setBounds(1260,450,380,30);
		t22.setBounds(1260,500,380,30);
		t23.setBounds(1490,550,150,30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		t3.addActionListener(this);
		t5.addActionListener(this);		
		
		add(l1);	
		l1.add(l11);
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		l1.add(b6);
		l1.add(b7);
		l1.add(b8);
		l1.add(b9);

		l1.add(l14);
		l1.add(l13);
		l1.add(l2);
		l1.add(l3);
		l1.add(l4);
		l1.add(l5);
		l1.add(l51);
		l1.add(l52);
		l1.add(l53);
		l1.add(l6);
		l1.add(l7);
		l1.add(l8);
		l1.add(l9);
		l1.add(l10);
		l1.add(l101);
		
		
	

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
		l1.add(t13);
		l1.add(t14);

		l1.add(t15);
		l1.add(t16);
		l1.add(t17);
		l1.add(t18);
		l1.add(t19);
		l1.add(t20);
		l1.add(t21);
		l1.add(t22);
		l1.add(t23);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		
		String s4=(String)t5.getSelectedItem();
		if(s4.equals("Dental"))
		{
			t14.setText("  Rs. 350 /-");
		}
		if(s4.equals("Cardiology"))
		{
			t14.setText("  Rs. 450 /-");
		}
		if(s4.equals("Orthopadic"))
		{
			t14.setText("  Rs. 300 /-");
		}
		if(s4.equals("Gynecology"))
		{
			t14.setText("  Rs. 500 /-");
		}
		if(s4.equals("Neurology"))
		{
			t14.setText("  Rs. 450 /-");
		}
		if(s4.equals("Dermitology"))
		{
			t14.setText("  Rs. 400 /-");
		}
		if(s4.equals("E.N.T"))
		{
			t14.setText("  Rs. 550 /-");
		}
		if(s4.equals("Surgery"))
		{
			t14.setText("  Rs. 450 /-");
		}
		if(s4.equals("psychiatry"))
		{
			t14.setText("  Rs. 550 /-");
		}
		if(s4.equals("Nephrology"))
		{
			t14.setText("  Rs.500 /-");
		}

		String s1=ae.getActionCommand();
		if(s1.equals(" exit "))
		{
			new HMS10();
			this.dispose();
		}
		if(s1.equals("DELETE APPT"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				 a1=Integer.parseInt(t13.getText().trim());

				PreparedStatement ps=co.prepareStatement("delete from appt_tbl where APPT_ID=?");
				ps.setInt(1,a1);

				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Appointment Deleted successfully");
				ps.close();
				co.close();
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("VIEW  APPT"))
		{
			new HMS26();
			this.dispose();
		}
		if(s1.equals("  VIEW RECEPIT"))
		{
			
			
			t15.setText("APPOINTMENT RECEPIT");
			t16.setText("---------------------------------------------------------------");
			t17.setText(" Appt.ID: "+t13.getText());
			t18.setText("Appt.Date: "+t9.getText());
			t19.setText(" Pat.ID: "+t2.getText());
			t20.setText("Appt.Time: "+t10.getText());
			t21.setText(" Pat.Name: "+t4.getText());
			t22.setText(" Symptoms: "+t6.getText());
			t23.setText(" Fee: "+t14.getText());
			
		}
		if(s1.equals("  PRINT"))
		{
			JOptionPane.showMessageDialog(this,"Printed Successfully");
			
		}
		if(s1.equals("SEARCH DOCTOR"))
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
					t3.setText(rs.getString(2));
					t5.setSelectedItem(rs.getString(5));		//jcombobox
					t7.setText(rs.getString(10));
					t8.setSelectedItem(rs.getString(9));		//jcombobox
					t11.setText(rs.getString(4));						
			}
			else
			{
				JOptionPane.showMessageDialog(this,"No record found");
			}
				
			co.close();
			}catch(Exception e){System.out.println(e);}
				
			
		}
		if(s1.equals("SEARCH PATIENT"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
			
				Statement st=co.createStatement();
				ResultSet rs=st.executeQuery("select * from patient_tbl where PAT_ID="+t2.getText().trim());
					
				if(rs.next()==true)
				{
					
					t4.setText(rs.getString(2));
					t6.setText(rs.getString(6));
					t12.setText(rs.getString(7));									
				}
				else
				{
					JOptionPane.showMessageDialog(this,"No record found");
				}				
				co.close();
			}catch(Exception e){System.out.println(e);}
			
		}
		if(s1.equals("  SAVE"))
		{
			 a1=Integer.parseInt(t1.getText().trim());
			 a2=t3.getText().trim();
			 a3=(String)t5.getSelectedItem();
			 a4=t7.getText().trim();	
			 a5=(String)t8.getSelectedItem();	
			 a6=t11.getText().trim();
			 a7=t13.getText().trim();

			 a8=Integer.parseInt(t2.getText().trim());
			 a9=t4.getText().trim();
			 a10=t6.getText().trim();
			 a11=t9.getText().trim();
			 a12=t10.getText().trim();
			 a13=t12.getText().trim();
			 a14=t14.getText().trim();
			
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				PreparedStatement ps=co.prepareStatement("insert into appt_tbl values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");		

				ps.setInt(1,a1);
				ps.setString(2,a2);
				ps.setString(3,a3);
				ps.setString(4,a4);
				ps.setString(5,a5);
				ps.setString(6,a6);
				ps.setString(7,a7);
				ps.setInt(8,a8);
				ps.setString(9,a9);
				ps.setString(10,a10);
				ps.setString(11,a11);
				ps.setString(12,a12);
				ps.setString(13,a13);
				ps.setString(14,a14);
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Appointment Created Successfully");
				ps.close();
				co.close();
			}
		
			catch(Exception e)
			{System.out.println(e);}
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
			t13.setText("");
			t14.setText("");
			
		}
	}

	/*public static void main(String args[])
	{
		HMS12 lpg12=new HMS12();
	}*/
}
		