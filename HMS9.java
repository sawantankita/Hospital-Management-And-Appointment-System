import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS9 extends JFrame implements ActionListener
{
	String u1,p1;
	JTextField t1;
	JPasswordField t2;
	public HMS9()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,70);
		Font f2=new Font("Century Gothic",Font.BOLD,28);
		Font f3=new Font("Century Gothic",Font.BOLD,20);
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		ImageIcon i1=new ImageIcon("bg-9.JPG");   //bgpic
		ImageIcon i2=new ImageIcon("top1.PNG");	//bluestrip
		ImageIcon i3=new ImageIcon("usernamelogo.PNG");	//usrname logo
		ImageIcon i4=new ImageIcon("locklogo.PNG");	//lock logo
		ImageIcon i5= new ImageIcon(ClassLoader.getSystemResource("logoutlogo.PNG")); 		//loginbuttonimg
		Image i6 = i5.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);		 //loginbuttonimg
		ImageIcon i7 = new ImageIcon(i6); 				//loginbuttonimg
		ImageIcon i8=new ImageIcon("backbuttonlogo3.PNG");	//back-button
		
		JPanel j1=new JPanel();
		JLabel l1=new JLabel();	//for bg
		JLabel l2=new JLabel();	//for title
		JLabel l3=new JLabel("Hospital Management System");
		JLabel l4=new JLabel("     DOCTOR LOGIN PANEL");
		JLabel l5=new JLabel();	//for username logo
		JLabel l6=new JLabel();	//for lock logo
		JButton b1=new JButton("  Login");
		JButton b2=new JButton(" back",i8);
		 t1=new JTextField();
		 t2=new JPasswordField();		

		l3.setFont(f1);
		l4.setFont(f2);
		t1.setFont(f3);
		t2.setFont(f3);
		b1.setFont(f2);

		l3.setForeground(Color.WHITE);
		l4.setForeground(new Color(0,0,0));
		t1.setForeground(Color.WHITE);
		t2.setForeground(Color.WHITE);
		b1.setForeground(Color.WHITE);
		

		t1.setBackground(new Color(27,214,215));
		t2.setBackground(new Color(27,214,215));
		b1.setBackground(new Color(27,214,215));
		j1.setBackground(new Color(255,255,255,150));
		b2.setBackground(Color.WHITE);

		l1.setIcon(i1);
		l2.setIcon(i2);
		l5.setIcon(i3);
		l6.setIcon(i4);
		b1.setIcon(i7);
		b2.setOpaque(false);
				
		t1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		t2.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		l4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		
		l1.setBounds(0,0,1950,1000);
		l2.setBounds(0,20,1950,150);
		l3.setBounds(500,20,1500,100);
		l4.setBounds(950,350,400,80);
		l5.setBounds(1000,470,50,50);	//ulogo
		l6.setBounds(1000,580,50,50);	//locklogo
		t1.setBounds(1080,470,220,40);
		t2.setBounds(1080,580,220,40);
		b1.setBounds(1000,690,335,80);
		j1.setBounds(900,300,500,500);
		b2.setBounds(15,200,85,85);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(l1);	
		l1.add(l2);	
		l2.add(l3);		
		l1.add(l4);
		l1.add(l5);
		l1.add(l6);
		l1.add(t1);
		l1.add(t2);
		l1.add(b1);
		l1.add(j1);
		l1.add(b2);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("  Login"))
		{
			 u1=t1.getText().trim();
			 p1=t2.getText().trim();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");
				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection Created");
				
				PreparedStatement ps=co.prepareStatement("select * from doctor_tbl");						
				ResultSet rs = ps.executeQuery();
				int flg=0;
				while(rs.next())
				{
					if(u1.equals(rs.getString(11)) && p1.equals(rs.getString(12)))
					{
						JOptionPane.showMessageDialog(this,"Your Login is Successful "+u1);
						new HMS11();
						this.dispose();
						flg=0;
						break;
					}
					else
					flg=1;
				}
				if(flg==1)
				{
					JOptionPane.showMessageDialog(this,"Invalid Login !","Warning ",JOptionPane.ERROR_MESSAGE);
				}

				ps.close();
				co.close();
		
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		if(s1.equals(" back"))
		{
			new HMS1();
			this.dispose();
		}
	}
	/*public static void main(String args[])
	{
		HMS9 lpg9=new HMS9();
	}*/
}