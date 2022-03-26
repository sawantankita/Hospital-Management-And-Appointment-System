import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS1 extends JFrame implements ActionListener
{
	public HMS1()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,50);
		Font f2=new Font("Century Gothic",Font.BOLD,20);
		Font f3=new Font("Century Gothic",Font.BOLD,70);
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon("bg1.JPG");
		ImageIcon i2=new ImageIcon("top1.PNG");	//bluestrip
		ImageIcon i3=new ImageIcon("adminpic.JPG");	//adminpic
		ImageIcon i4=new ImageIcon("drpic.JPG");	//drpic
		ImageIcon i5=new ImageIcon("receppic.JPG");	//receptionistpic
		ImageIcon i6=new ImageIcon("crossbutton.PNG");
		
		JLabel l1=new JLabel();	//for bg img
		JLabel l2=new JLabel();	//for title img
		JLabel l3=new JLabel("Hospital Management System");
		JLabel l4=new JLabel( "    Login as");
		JLabel l5=new JLabel();
		JLabel l6=new JLabel();
		JLabel l7=new JLabel();
		JButton b1=new JButton("ADMIN");
		JButton b2=new JButton("DOCTOR");
		JButton b3=new JButton("RECEPTIONIST");
		JButton b4=new JButton("exit",i6);




		l1.setIcon(i1);
		l2.setIcon(i2);
		l5.setIcon(i3);
		l6.setIcon(i4);
		l7.setIcon(i5);
	
		l3.setFont(f3);
		l4.setFont(f1);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);

		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		
		l4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),15));		
		b1.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));		
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));		
		b3.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b4.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b4.setOpaque(false);		
		
		l1.setBounds(0,0,1950,1000);
		l2.setBounds(0,20,1950,150);
		l3.setBounds(500,20,1500,100);
		l4.setBounds(800,230,400,100);

		l5.setBounds(250,450,250,250);
		l6.setBounds(850,450,250,250);
		l7.setBounds(1450,450,250,250);
		b1.setBounds(250,682,239,50);
		b2.setBounds(850,682,231,50);
		b3.setBounds(1450,682,237,50);
		b4.setBounds(10,200,80,80);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		add(l1);	
		l1.add(l2);	
		l2.add(l3);
		l1.add(l4);
		l1.add(l5);	
		l1.add(l6);
		l1.add(l7);
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);


	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("ADMIN"))
		{
			new HMS2();
			this.dispose();
		}
		if(s1.equals("DOCTOR"))
		{
			new HMS9();
			this.dispose();
		}
		if(s1.equals("RECEPTIONIST"))
		{
			new HMS8();
			this.dispose();
		}
		if(s1.equals("exit"))
		{
			//new HMS9();
			this.dispose();
		}
		
		
	}
	public static void main(String args[])
	{
		HMS1 lpg1=new HMS1();
	}
}	