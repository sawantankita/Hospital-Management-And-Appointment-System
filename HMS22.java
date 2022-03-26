import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS22 extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JTable jt1;
	JScrollPane jsp1;
	JLabel l1;
	Font f4=new Font("Century Gothic",Font.BOLD,15);

	public HMS22()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,20);
		Font f2=new Font("Century Gothic",Font.BOLD,28);
		Font f3=new Font("Century Gothic",Font.BOLD,18);
		
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon i1=new ImageIcon("bg5.JPG");   		//bg pic
		ImageIcon i2=new ImageIcon("adddoclogo.PNG");   	//add pic
		ImageIcon i3=new ImageIcon("deletedoclogo.PNG");   	//delete pic
		ImageIcon i4=new ImageIcon("updatedoclogo.PNG");   	//updat epic
		ImageIcon i5=new ImageIcon("viewdoctorlogo.PNG");   	//view pic
		ImageIcon i6=new ImageIcon("homelogo2.PNG");   	//whitehome pic, for blue pic use homologo.png
		ImageIcon i7=new ImageIcon("view only.PNG");   	//clear pic
		ImageIcon i8=new ImageIcon("db view.PNG");   	//search doc pic
		ImageIcon i9=new ImageIcon("doclogo3.PNG");   	//doc pic
		ImageIcon i10=new ImageIcon("clearlogo3.PNG"); 
		ImageIcon i11=new ImageIcon("appt7.PNG");  

		 l1=new JLabel();				//for bg
		 b1=new JButton("  ADD DOCTOR",i2);
		 b2=new JButton("  DELETE DOCTOR",i3);
		 b3=new JButton("  UPDATE DOCTOR",i4);
		 b4=new JButton("  VIEW DOCTOR",i5);
		 b5=new JButton("   HOME",i6);
		 b6=new JButton("  SEARCH",i7);
		 b7=new JButton("  VIEW ALL",i8);
		 b8=new JButton("  CLEAR",i10);
		 b9=new JButton("  VIEW APPT",i11);
				
		JLabel l2=new JLabel( "   VIEW DOCTOR : ",i9,JLabel.LEFT);
		JLabel l3=new JLabel ("DOCTOR ID : ");
		 t1=new JTextField(10);

		String cols[]={"DOCTOR_ID","NAME","AGE","PHONE_NO","DEPARTMENT","QUALIFICATION","ADDRESS","JOINING_DATE","DUTY_TIME","DUTY_DAYS","USERNAME","PASSWORD"}; 	//match spells with dB
		String rows[][]={
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""}
						};
		
		jt1=new JTable(rows,cols);
		jsp1=new JScrollPane(jt1);
		jt1.setRowHeight(40);
		jt1.getColumnModel().getColumn(0).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(1).setPreferredWidth(150);
		jt1.getColumnModel().getColumn(2).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(6).setPreferredWidth(200);
		jt1.getColumnModel().getColumn(7).setPreferredWidth(50);
					
		l1.setIcon(i1);
		l2.setFont(f2);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		b5.setFont(f2);
		b6.setFont(f3);
		b7.setFont(f3);
		b8.setFont(f3);
		b9.setFont(f3);
		l3.setFont(f2);
		t1.setFont(f3);
		jt1.setFont(f4);
				
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b9.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		t1.setForeground(Color.WHITE);
		jt1.setForeground(Color.WHITE);
		
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
		jt1.setBackground(new Color(27,214,215));

		b1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b3.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b6.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b7.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b8.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b9.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		l2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));
		t1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		jsp1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));			
		
		l1.setBounds(0,0,1950,1000);
		b1.setBounds(5,5,350,80);
		b2.setBounds(380,5,350,80);
		b3.setBounds(780,5,350,80);
		b4.setBounds(1180,5,350,80);
		b5.setBounds(1550,5,350,80);
		b6.setBounds(800,300,200,50);
		b7.setBounds(1400,300,200,50);
		b8.setBounds(1100,300,200,50);
		b9.setBounds(1700,300,200,50);
		
		
		l2.setBounds(5,100,500,180);
		l3.setBounds(200,310,250,30);
		t1.setBounds(400,300,280,50);
		t1.setBounds(400,300,280,50);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);	
		b8.addActionListener(this);	
		b9.addActionListener(this);	
		jsp1.setBounds(100,400,1700,500);		
		
		add(l1);	
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		l1.add(l2);
		l1.add(l3);

		l1.add(t1);
		l1.add(b6);
		l1.add(b7);
		l1.add(b8);
		l1.add(b9);
		l1.add(jsp1);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		
		String s1=ae.getActionCommand();
		if(s1.equals("  ADD DOCTOR"))
		{
			new HMS21();
			this.dispose();
		}
		if(s1.equals("  DELETE DOCTOR"))
		{
			new HMS21();
			this.dispose();
		}
		if(s1.equals("  UPDATE DOCTOR"))
		{
			new HMS21();
			this.dispose();
		}
		if(s1.equals("  VIEW DOCTOR"))
		{
			new HMS21();
			this.dispose();
		}
		if(s1.equals("   HOME"))
		{
			new HMS21();
			this.dispose();
		}
		if(s1.equals("  VIEW APPT"))
		{
			new HMS25();
			this.dispose();
		}
		if(s1.equals("  SEARCH"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");

				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection created");

				PreparedStatement ps=co.prepareStatement("select * from doctor_tbl where DOC_ID="+t1.getText().trim());
		
				ResultSet rs=ps.executeQuery();
				String cols[]={"DOCTOR_ID","NAME","AGE","PHONE_NO","DEPARTMENT","QUALIFICATION","ADDRESS","JOINING_DATE","DUTY_TIME","DUTY_DAYS","USERNAME","PASSWORD"}; 
				String rows[][]={
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""},
							{"","","","","","","","","","","",""}
						};

					
				jt1=new JTable(rows,cols);
				jsp1=new JScrollPane(jt1);
				jt1.setRowHeight(40);
				jt1.getColumnModel().getColumn(0).setPreferredWidth(5);
				jt1.getColumnModel().getColumn(1).setPreferredWidth(150);
				jt1.getColumnModel().getColumn(2).setPreferredWidth(5);
				jt1.getColumnModel().getColumn(6).setPreferredWidth(200);
				jt1.getColumnModel().getColumn(7).setPreferredWidth(50);
				jsp1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));			
					
					
					jt1.setFont(f4);
					jt1.setForeground(Color.WHITE);
					jt1.setBackground(new Color(27,214,215));
					jsp1.setBounds(100,400,1700,500);	
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
					jt1.setValueAt(rs.getString(10),i,9);
					jt1.setValueAt(rs.getString(11),i,10);
					jt1.setValueAt(rs.getString(12),i,11);
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
			
		
		if(s1.equals("  VIEW ALL"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");

				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection created");
		
				PreparedStatement ps=co.prepareStatement("select * from doctor_tbl");
		
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
					jt1.setValueAt(rs.getString(10),i,9);
					jt1.setValueAt(rs.getString(11),i,10);
					jt1.setValueAt(rs.getString(12),i,11);
					i++;
				}
		
				ps.close();
				co.close();
			
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("  CLEAR"))
		{
			t1.setText("");
			
		}
	}

	/*public static void main(String args[])
	{
		HMS22 lpg22=new HMS22();
	}*/
}
		