import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS11 extends JFrame implements ActionListener
{
	public HMS11()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,35);
		Font f2=new Font("Century Gothic",Font.BOLD,20);
		Font f3=new Font("Century Gothic",Font.BOLD,70);
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon("bg-11.JPG");
		ImageIcon i2=new ImageIcon("top1.PNG");	//bluestrip  pic
		ImageIcon i3=new ImageIcon("door1.PNG");	//logout pic
		ImageIcon i4=new ImageIcon("doclogo3.PNG");   	//doc pic
		ImageIcon i5=new ImageIcon("apptlogo2.PNG");   	//appointment pic
		ImageIcon i6=new ImageIcon("pathistory.PNG");   	//doc pic
		

		
		JLabel l1=new JLabel();				//for bg img
		JLabel l2=new JLabel();				//for title img
		JLabel l3=new JLabel("Hospital Management System");
		JLabel l4=new JLabel("     DOCTOR'S PORTAL ",i4,JLabel.LEFT);
		JLabel l5=new JLabel();
		JLabel l6=new JLabel();
		

		JButton b1=new JButton("CHECK APPOINTMENTS");
		JButton b2=new JButton("PATIENT DETAILS");
		JButton b4=new JButton("exit",i3);

		l1.setIcon(i1);
		l2.setIcon(i2);
		l5.setIcon(i5);
		l6.setIcon(i6);
		
		l3.setFont(f3);
		l4.setFont(f1);
		b1.setFont(f2);
		b2.setFont(f2);

		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		
		l4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));		
		b1.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));		
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));		
		b4.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b4.setOpaque(false);		
		
		l1.setBounds(0,0,1950,1000);
		l2.setBounds(0,20,1950,150);
		l3.setBounds(500,20,1500,100);
		l4.setBounds(5,200,600,180);

		l5.setBounds(450,450,250,250);
		l6.setBounds(1150,450,250,250);
		
		b1.setBounds(450,680,250,50);
		b2.setBounds(1150,680,245,50);
		b4.setBounds(1800,200,100,100);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);

		add(l1);	
		l1.add(l2);	
		l2.add(l3);
		l1.add(l4);
		l1.add(l5);	
		l1.add(l6);
		l1.add(b1);
		l1.add(b2);
		l1.add(b4);


	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("CHECK APPOINTMENTS"))
		{
			new HMS14();
			this.dispose();
		}
		if(s1.equals("PATIENT DETAILS"))
		{
			new HMS13();
			this.dispose();
		}
		if(s1.equals("exit"))
		{
			new HMS1();
			this.dispose();
		}
		
		
	}
	/*public static void main(String args[])
	{
		HMS11 lpg11=new HMS11();
	}*/
}	