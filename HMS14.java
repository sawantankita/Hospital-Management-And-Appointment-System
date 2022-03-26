import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS14 extends JFrame implements ActionListener
{
	JLabel l1;
	JTable jt1;
	JScrollPane jsp1;
	JTextField t1;
	Font f4=new Font("Century Gothic",Font.BOLD,15);
	public HMS14()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,30);
		Font f2=new Font("Century Gothic",Font.BOLD,20);
		Font f3=new Font("Century Gothic",Font.BOLD,70);
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon("bg-14.JPG");
		ImageIcon i2=new ImageIcon("top1.PNG");	//bluestrip  pic
		ImageIcon i3=new ImageIcon("backbuttonlogo4.PNG");	
		ImageIcon i4=new ImageIcon("appt5.PNG");   	
		ImageIcon i5=new ImageIcon("magnify.PNG");   	//appointment pic
		
		l1=new JLabel();	//for bg img
		JLabel l2=new JLabel();	//for title img
		JLabel l3=new JLabel("Hospital Management System");
		JLabel l4=new JLabel("VIEW APPOINTMENT",i4,JLabel.LEFT);
		JLabel l5=new JLabel("DOCTOR ID:");
		 t1=new JTextField();
		
		JButton b1=new JButton("SEARCH",i5);
		JButton b4=new JButton("exit",i3);
		
		l1.setIcon(i1);
		l2.setIcon(i2);
					
		l3.setFont(f3);
		l4.setFont(f1);
		l5.setFont(f2);
		b1.setFont(f2);
		t1.setFont(f2);
		String cols[]={"DOC_ID","DOC_NAME","DOC_DEPARTMENT","DOC_DUTY_DAYS","DOC_DUTY_TIME","DOC_PHONE_NO","APPT_ID","PAT_ID","PAT_NAME","PAT_SYMPTOMS","APPT_DATE","APPT_TIME","PAT_PHONE_NO","APPT_FEE"};

		String rows[][]={
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""}
						};		
		jt1=new JTable(rows,cols);
		jsp1=new JScrollPane(jt1);
		jt1.setRowHeight(40);
		jt1.setFont(f4);
		jt1.setForeground(Color.WHITE);
		jt1.setBackground(new Color(27,214,215));
		jsp1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		jsp1.setBounds(50,450,1800,500);	
		
		
		jt1.getColumnModel().getColumn(0).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(6).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(7).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(1).setPreferredWidth(170);
		jt1.getColumnModel().getColumn(8).setPreferredWidth(170);
		jt1.getColumnModel().getColumn(4).setPreferredWidth(80);
		jt1.getColumnModel().getColumn(4).setPreferredWidth(100);
		jt1.getColumnModel().getColumn(13).setPreferredWidth(10);
		jt1.getColumnModel().getColumn(9).setPreferredWidth(150);	
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		t1.setForeground(Color.WHITE);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(27,214,215));
		t1.setBackground(new Color(27,214,215));
		b4.setBackground(Color.WHITE);
		
		l4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));
		t1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));		
		b1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));		
		b4.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b4.setOpaque(false);		
		
		l1.setBounds(0,0,1950,1000);
		l2.setBounds(0,20,1950,150);
		l3.setBounds(500,20,1500,100);
		l4.setBounds(5,200,500,180);
		l5.setBounds(600,250,130,50);
		t1.setBounds(750,250,200,50);
		b1.setBounds(1000,250,200,50);
		b4.setBounds(1800,200,100,100);
		

		b1.addActionListener(this);
		b4.addActionListener(this);

		add(l1);	
		l1.add(l2);	
		l2.add(l3);
		l1.add(l4);
		l1.add(l5);
		l1.add(t1);
		l1.add(b1);
		l1.add(b4);
		l1.add(jsp1);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("SEARCH"))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("Driver registered");

				Connection co=DriverManager.getConnection("jdbc:odbc:HMS_db");
				//System.out.println("Connection created");

				PreparedStatement ps=co.prepareStatement("select * from appt_tbl where DOC_ID="+t1.getText().trim());
				ResultSet rs=ps.executeQuery();
				String cols[]={"DOC_ID","DOC_NAME","DOC_DEPARTMENT","DOC_DUTY_DAYS","DOC_DUTY_TIME","DOC_PHONE_NO","APPT_ID","PAT_ID","PAT_NAME","PAT_SYMPTOMS","APPT_DATE","APPT_TIME","PAT_PHONE_NO","APPT_FEE"};

				String rows[][]={
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""},
							{"","","","","","","","","","","","","",""}
						};
		
		jt1=new JTable(rows,cols);
		jsp1=new JScrollPane(jt1);
		jt1.setRowHeight(40);
		jt1.setFont(f4);
		jt1.setForeground(Color.WHITE);
		jt1.setBackground(new Color(27,214,215));
		jsp1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215)));	
		jsp1.setBounds(50,450,1800,500);	
		
		
		jt1.getColumnModel().getColumn(0).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(6).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(7).setPreferredWidth(5);
		jt1.getColumnModel().getColumn(1).setPreferredWidth(170);
		jt1.getColumnModel().getColumn(8).setPreferredWidth(170);
		jt1.getColumnModel().getColumn(4).setPreferredWidth(80);
		jt1.getColumnModel().getColumn(4).setPreferredWidth(100);
		jt1.getColumnModel().getColumn(13).setPreferredWidth(10);
		jt1.getColumnModel().getColumn(9).setPreferredWidth(150);				
					
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
					jt1.setValueAt(""+rs.getInt(8),i,7);	//patid
					jt1.setValueAt(rs.getString(9),i,8);
					jt1.setValueAt(rs.getString(10),i,9);
					jt1.setValueAt(rs.getString(11),i,10);
					jt1.setValueAt(rs.getString(12),i,11);
					jt1.setValueAt(rs.getString(13),i,12);
					jt1.setValueAt(rs.getString(14),i,13);
					
					i++;
				}
				/*else
				{
					JOptionPane.showMessageDialog(this,"No record found");
				}*/
		
				ps.close();
				co.close();
				l1.add(jsp1);				
			}catch(Exception e){System.out.println(e);}
		}
		if(s1.equals("exit"))
		{
			new HMS11();
			this.dispose();
		}
		
		
	}
	/*public static void main(String args[])
	{
		HMS14 lpg14=new HMS14();
	}*/
}	