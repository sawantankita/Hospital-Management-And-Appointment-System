import java.sql.*;
import java.io.*;
import java.sql.Types;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS23 extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t5,t6,t7,t8;
	JComboBox t4;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTable jt1;
	JLabel l1;
	JScrollPane jsp1;
	int a1;
	String a2,a3,a4,a5,a6,a7,a8,a9;
	Font f4=new Font("Century Gothic",Font.BOLD,15);
	public HMS23()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,20);
		Font f2=new Font("Century Gothic",Font.BOLD,28);
		Font f3=new Font("Century Gothic",Font.BOLD,18);
		
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon i1=new ImageIcon("bg6.JPG");   		//bg pic
		ImageIcon i2=new ImageIcon("adddoclogo.PNG");   	//add pic
		ImageIcon i3=new ImageIcon("deletedoclogo.PNG");   	//delete pic
		ImageIcon i4=new ImageIcon("updatedoclogo.PNG");   	//updat epic
		ImageIcon i5=new ImageIcon("viewdoctorlogo.PNG");   	//view pic
		ImageIcon i6=new ImageIcon("homelogo2.PNG");   	//whitehome pic, for blue pic use homologo.png
		ImageIcon i7=new ImageIcon("clearlogo4.PNG");   	//clear pic
		ImageIcon i8=new ImageIcon("searchpatientlogo.PNG");   	//search doc pic
		ImageIcon i9=new ImageIcon("patientlogo1.PNG");   	//doc pic
		ImageIcon i10=new ImageIcon("db view.PNG");   

		  l1=new JLabel();				//for bg
		 b1=new JButton("  ADD PATIENT",i2);
		 b2=new JButton("  DELETE PATIENT",i3);
		 b3=new JButton("  UPDATE PATIENT",i4);
		 b4=new JButton("  VIEW PATIENT",i5);
		 b5=new JButton("   HOME",i6);
		 b6=new JButton("  CLEAR",i7);
		 b7=new JButton("  SEARCH PATIENT",i8);
		 b8=new JButton("VIEW ALL",i10);


		JLabel l2=new JLabel ("Patient ID:");	
		JLabel l3=new JLabel ("Name:");		
		JLabel l4=new JLabel ("Age:");		
		JLabel l5=new JLabel("Gender:");		
		JLabel l6=new JLabel("Date:");
		JLabel l7=new JLabel ("Symptoms:");		
		JLabel l8=new JLabel ("Phone No:");		
		JLabel l9=new JLabel ("Address:");		
		JLabel l10=new JLabel("PATIENT DETAILS: ",i9,JLabel.LEFT);
		
		String s2[]={"Male","Female","Other"};
		 t4=new JComboBox(s2);

		 t1=new JTextField(10);
		 t2=new JTextField(10);			
		 t3=new JTextField(10);		
		 t5=new JTextField(10);		
		 t6=new JTextField(10);		
		 t7=new JTextField(10);	
		 t8=new JTextField(10);	
		String cols[]={"PATIENT_ID","NAME","AGE","GENDER","DATE","SYMPTOMS","PHONE_NO","ADDRESS","MEDICINES"}; 	//match spells with dB
		String rows[][]={
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""}
						};
		
		jt1=new JTable(rows,cols);
		jsp1=new JScrollPane(jt1);
		jt1.setRowHeight(30);
		jt1.getColumnModel().getColumn(0).setPreferredWidth(3);
		jt1.getColumnModel().getColumn(1).setPreferredWidth(150);
		jt1.getColumnModel().getColumn(2).setPreferredWidth(3);
		jt1.getColumnModel().getColumn(3).setPreferredWidth(20);
		jt1.getColumnModel().getColumn(4).setPreferredWidth(20);
		jt1.getColumnModel().getColumn(5).setPreferredWidth(200);
		jt1.getColumnModel().getColumn(6).setPreferredWidth(30);
		jt1.getColumnModel().getColumn(7).setPreferredWidth(200);
		jt1.getColumnModel().getColumn(8).setPreferredWidth(200);

				
		l1.setIcon(i1);
		l10.setFont(f2);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		b5.setFont(f2);
		b6.setFont(f3);
		b7.setFont(f3);
		b8.setFont(f3);

		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);		
		

		t1.setFont(f3);
		t2.setFont(f3);
		t3.setFont(f3);
		t4.setFont(f3);
		t5.setFont(f3);
		t6.setFont(f3);
		t7.setFont(f3);
		t8.setFont(f3);
		jt1.setFont(f4);
				
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);

		l10.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		l6.setForeground(Color.WHITE);
		l7.setForeground(Color.WHITE);
		l8.setForeground(Color.WHITE);
		l9.setForeground(Color.WHITE);
		l10.setForeground(Color.WHITE);
		

		t1.setForeground(Color.WHITE);
		t2.setForeground(Color.WHITE);
		t3.setForeground(Color.WHITE);
		t4.setForeground(Color.WHITE);
		t5.setForeground(Color.WHITE);
		t6.setForeground(Color.WHITE);
		t7.setForeground(Color.WHITE);
		t8.setForeground(Color.WHITE);
		jt1.setForeground(Color.WHITE);
		
		b1.setBackground(new Color(27,214,215));
		b2.setBackground(new Color(27,214,215));
		b3.setBackground(new Color(27,214,215));
		b4.setBackground(new Color(27,214,215));
		b5.setBackground(new Color(27,214,215));
		b6.setBackground(new Color(27,214,215));
		b8.setBackground(new Color(27,214,215));
		b7.setBackground(new Color(27,214,215));
		t1.setBackground(new Color(27,214,215));
		t2.setBackground(new Color(27,214,215));
		t3.setBackground(new Color(27,214,215));
		t4.setBackground(new Color(27,214,215));
		t5.setBackground(new Color(27,214,215));
		t6.setBackground(new Color(27,214,215));
		t7.setBackground(new Color(27,214,215));
		t8.setBackground(new Color(27,214,215));
		jt1.setBackground(new Color(27,214,215));
				

		b1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b3.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b6.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b7.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b8.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		l10.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));

		t1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t3.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t5.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t6.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		t7.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t8.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		jsp1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		
		l1.setBounds(0,0,1950,1000);
		b1.setBounds(5,5,350,80);
		b2.setBounds(380,5,350,80);
		b3.setBounds(780,5,350,80);
		b4.setBounds(1180,5,350,80);
		b5.setBounds(1550,5,350,80);
		b6.setBounds(1530,300,150,50);
		b7.setBounds(1130,500,250,50);
		b8.setBounds(1460,500,220,50);


		
		l10.setBounds(5,100,500,180);
		l2.setBounds(200,300,150,30);
		l3.setBounds(700,300,150,30);
		l4.setBounds(1130,300,150,30);
		l5.setBounds(200,400,150,30);
		l6.setBounds(700,400,150,30);
		l7.setBounds(1130,400,150,30);
		l8.setBounds(200,500,150,30);
		l9.setBounds(700,500,150,30);
		

		t1.setBounds(350,300,250,30);
		t2.setBounds(800,300,250,30);
		t3.setBounds(1230,300,250,30);
		t4.setBounds(350,400,250,30);
		t5.setBounds(800,400,250,30);
		t6.setBounds(1280,400,400,30);
		t7.setBounds(350,500,250,30);
		t8.setBounds(800,500,250,30);
		jsp1.setBounds(200,600,1500,350);			

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		t3.addActionListener(this);	
		
		add(l1);	
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		l1.add(l10);
		l1.add(l2);
		l1.add(l3);
		l1.add(l4);
		l1.add(l5);
		l1.add(l6);
		l1.add(l7);
		l1.add(l8);
		l1.add(l9);
		l1.add(l10);

		l1.add(t1);
		l1.add(t2);
		l1.add(t3);
		l1.add(t4);
		l1.add(t5);
		l1.add(t6);
		l1.add(t7);
		l1.add(t8);
		l1.add(b6);
		l1.add(b7);
		l1.add(b8);
		l1.add(jsp1);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("  ADD PATIENT"))
		{
			 a1=Integer.parseInt(t1.getText().trim());
			 a2=t2.getText().trim();
			 a3=t3.getText().trim();
			 a4=(String)t4.getSelectedItem();
			 a5=t5.getText().trim();	
			 a6=t6.getText().trim();
			 a7=t7.getText().trim();
			 a8=t8.getText().trim();
			 a9="";
			

			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				PreparedStatement ps=co.prepareStatement("insert into patient_tbl values(?,?,?,?,?,?,?,?,?)");		

				ps.setInt(1,a1);
				ps.setString(2,a2);
				ps.setString(3,a3);
				ps.setString(4,a4);
				ps.setString(5,a5);
				ps.setString(6,a6);
				ps.setString(7,a7);
				ps.setString(8,a8);
				ps.setString(9,a9);
				
				
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Patient added successfully");
				ps.close();
				co.close();
			}
		
			catch(Exception e)
			{System.out.println(e);}
		}
		if(s1.equals("  DELETE PATIENT"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				 a1=Integer.parseInt(t1.getText().trim());

				PreparedStatement ps=co.prepareStatement("delete from patient_tbl where PAT_ID=?");
				ps.setInt(1,a1);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Patient Deleted successfully");
				
				ps.close();
				co.close();
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("  UPDATE PATIENT"))
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
				 a4=(String)t4.getSelectedItem();
				 a5=t5.getText().trim();	
				 a6=t6.getText().trim();
				 a7=t7.getText().trim();
				 a8=t8.getText().trim();
				 a9="";				

				PreparedStatement ps=co.prepareStatement("update patient_tbl set  PAT_NAME=?,PAT_AGE=?,PAT_GENDER=?,PAT_DATE=?,PAT_SYMPTOMS=?,PAT_PHONE_NO=?,PAT_ADDRESS =?,PAT_MEDICINES=? where PAT_ID=?");
				
				ps.setString(1,a2);
				ps.setString(2,a3);
				ps.setString(3,a4);
				ps.setString(4,a5);
				ps.setString(5,a6);
				ps.setString(6,a7);
				ps.setString(7,a8);
				ps.setString(8,a9);
				ps.setInt(9,a1);
				
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Updated successfully");
				ps.close();
				co.close();
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("  VIEW PATIENT"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");

				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection created");

				PreparedStatement ps=co.prepareStatement("select * from patient_tbl where PAT_ID="+t1.getText().trim());
				ResultSet rs=ps.executeQuery();
				String cols[]={"PATIENT_ID","NAME","AGE","GENDER","DATE","SYMPTOMS","PHONE_NO","ADDRESS","MEDICINES"}; 
				String rows[][]={
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""}
						};

					
				jt1=new JTable(rows,cols);
				jsp1=new JScrollPane(jt1);
				jt1.setRowHeight(30);
				jt1.getColumnModel().getColumn(0).setPreferredWidth(3);
				jt1.getColumnModel().getColumn(1).setPreferredWidth(150);
				jt1.getColumnModel().getColumn(2).setPreferredWidth(3);
				jt1.getColumnModel().getColumn(3).setPreferredWidth(20);
				jt1.getColumnModel().getColumn(4).setPreferredWidth(20);
				jt1.getColumnModel().getColumn(5).setPreferredWidth(200);
				jt1.getColumnModel().getColumn(6).setPreferredWidth(30);
				jt1.getColumnModel().getColumn(7).setPreferredWidth(200);
				jt1.getColumnModel().getColumn(8).setPreferredWidth(200);
					
				jt1.setFont(f4);
				jt1.setForeground(Color.WHITE);
				jt1.setBackground(new Color(27,214,215));
				jsp1.setBounds(200,600,1500,350);			

				int i=0;
				if(rs.next()==true)
				{
					jt1.setValueAt(""+rs.getInt(1),i,0);
					jt1.setValueAt(rs.getString(2),i,1);
					jt1.setValueAt(rs.getString(3),i,2);
					jt1.setValueAt(rs.getString(4),i,3);
					jt1.setValueAt(rs.getString(5),i,4);
					jt1.setValueAt(rs.getString(6),i,5);
					jt1.setValueAt(rs.getString(7),i,6);
					jt1.setValueAt(rs.getString(8),i,7);
					jt1.setValueAt(rs.getString(9),i,8);					
					i++;
				}
				else
				{
					JOptionPane.showMessageDialog(this,"No record found");
				}
		
				ps.close();
				co.close();
				l1.add(jsp1);
			}catch(Exception e){System.out.println(e);}
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
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			
			
		}
		if(s1.equals("  SEARCH PATIENT"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
			
				Statement st=co.createStatement();
				ResultSet rs=st.executeQuery("select * from patient_tbl where PAT_ID="+t1.getText().trim());
					

				if(rs.next()==true)
				{
					t2.setText(rs.getString(2));	//setText method only show string value not integer
					t3.setText(rs.getString(3));
					t4.setSelectedItem(rs.getString(4));	 //jcombobox
					t5.setText(rs.getString(5));	
					t6.setText(rs.getString(6));
					t7.setText(rs.getString(7));
					t8.setText(rs.getString(8));	
					//t9.setText(rs.getString(9));	
													
				}
				else
				{
					JOptionPane.showMessageDialog(this,"No record found");
				}				
				co.close();
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("VIEW ALL"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");

				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection created");
		
				PreparedStatement ps=co.prepareStatement("select * from patient_tbl ");
		
				ResultSet rs=ps.executeQuery();
				int i=0;


				while(rs.next())
				{
					jt1.setValueAt(""+rs.getInt(1),i,0);
					jt1.setValueAt(rs.getString(2),i,1);
					jt1.setValueAt(rs.getString(3),i,2);
					jt1.setValueAt(rs.getString(4),i,3);
					jt1.setValueAt(rs.getString(5),i,4);
					jt1.setValueAt(rs.getString(6),i,5);
					jt1.setValueAt(rs.getString(7),i,6);
					jt1.setValueAt(rs.getString(8),i,7);
					jt1.setValueAt(rs.getString(9),i,8);
					
					
					i++;
				}
		
				ps.close();
				co.close();
			
			}catch(Exception e){System.out.println(e);}
		}
	}

	/*public static void main(String args[])
	{
		HMS23 lpg23=new HMS23();
	}*/
}
		