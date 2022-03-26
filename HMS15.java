import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class HMS15 extends JFrame
{	
	JProgressBar jp;
	JLabel l1,l2,l3;
	ImageIcon i1,i2;
	public HMS15()
	{
		Font f1=new Font("Century Gothic",Font.BOLD,35);
		Font f2=new Font("Century Gothic",Font.BOLD,30);
				
		getContentPane().setBackground(new Color(166,201,218));
		setLayout(null);
		setVisible(true);
		setSize(1950,1050);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		ImageIcon i2=new ImageIcon("med1.GIF");		
		JLabel l1=new JLabel("Hospital Management And Appointment System");	//for bg img
		JLabel l2=new JLabel(i2);	//for bg img
		l3=new JLabel(".");
		jp=new JProgressBar(); 
		
		
						
		l1.setFont(f1);
		l1.setForeground(Color.WHITE);
		//l1.setBorder(BorderFactory.createLineBorder(new Color(27,214,215),6));
		l3.setForeground(new Color(166,201,218));
		l3.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));

		jp.setBorder(BorderFactory.createLineBorder(new Color(255,127,0)));
		jp.setBackground(Color.WHITE);
		jp.setForeground(new Color(255,127,0));
		jp.setFont(f2);
		jp.setStringPainted(true);	
		
			
		
		l1.setBounds(970,250,850,100);   //title
		l2.setBounds(50,250,900,500);	  //gif
		l3.setBounds(80,70,1730,820);
		jp.setBounds(1130,500,500,50);     //progressbar
		
		add(l3); 			
		add(l1);
		add(l2);	
		add(jp);
	}
	public void itterate1()
	{
	int i=0;
		while(i<=100)
		{

			jp.setValue(i);
			i=i+5;
			if(i>0 && i<20)
				jp.setString("Loading...");

			
			if(i>20 && i<89)
				jp.setString(""+i+"%");

			if(i>=99)
			{
				jp.setString("Almost Done ");	
			}
			if(i==100)
			{
				
				new HMS1();
				this.dispose();
			}
			try
			{
				Thread.sleep(500);

			}catch(Exception e){System.out.println(e);}
		}
	}
	
	public static void main(String args[])
	{
		HMS15 lpg15=new HMS15();
		lpg15.itterate1();
	}
}	