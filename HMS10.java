import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS10 extends JFrame implements ActionListener
{
	public HMS10()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,30);
		Font f2=new Font("Century Gothic",Font.BOLD,20);
		Font f3=new Font("Century Gothic",Font.BOLD,70);
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon("bg-10.JPG");
		ImageIcon i2=new ImageIcon("top1.PNG");	//bluestrip  pic
		ImageIcon i3=new ImageIcon("door1.PNG");	//logout pic
		ImageIcon i4=new ImageIcon("recep3.PNG");   	//doc pic
		ImageIcon i5=new ImageIcon("apptlogo.PNG");   	//appointment pic
		ImageIcon i6=new ImageIcon("docinfo1.PNG");   	//doc pic
		ImageIcon i7=new ImageIcon("patinfo.PNG");   	//pat pic

		
		JLabel l1=new JLabel();	//for bg img
		JLabel l2=new JLabel();	//for title img
		JLabel l3=new JLabel("Hospital Management System");
		JLabel l4=new JLabel("RECEPTIONIST PORTAL ",i4,JLabel.LEFT);
		JLabel l5=new JLabel();
		JLabel l6=new JLabel();
		JLabel l7=new JLabel();

		JButton b1=new JButton("CREATE APPOINTMENT");
		JButton b2=new JButton("DOCTOR DETAILS");
		JButton b3=new JButton("PATIENT DETAILS");
		JButton b4=new JButton("exit",i3);

		l1.setIcon(i1);
		l2.setIcon(i2);
		l5.setIcon(i5);
		l6.setIcon(i6);
		l7.setIcon(i7);
		
	
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
		
		l4.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));		
		b1.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));		
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));		
		b3.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b4.setBorder(BorderFactory.createLineBorder(Color.WHITE,0));
		b4.setOpaque(false);		
		
		l1.setBounds(0,0,1950,1000);
		l2.setBounds(0,20,1950,150);
		l3.setBounds(500,20,1500,100);
		l4.setBounds(5,200,600,180);

		l5.setBounds(250,450,250,250);
		l6.setBounds(850,450,250,250);
		l7.setBounds(1450,450,280,250);
		
		b1.setBounds(250,690,250,50);
		b2.setBounds(850,690,245,50);
		b3.setBounds(1450,690,280,50);
		b4.setBounds(1800,200,100,100);

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
		if(s1.equals("DOCTOR DETAILS"))
		{
			new HMS21();
			this.dispose();
		}
		if(s1.equals("CREATE APPOINTMENT"))
		{
			new HMS12();
			this.dispose();
		}
		if(s1.equals("PATIENT DETAILS"))
		{
			new HMS23();
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
		HMS10 lpg10=new HMS10();
	}*/
}	