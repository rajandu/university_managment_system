package system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener{
	
	Welcome()
	{
		JLabel t1 = new JLabel("Project By :-");
		t1.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t1.setBounds(114,508,127,25);
		add(t1);
		
		// Rajan Kumar
		JLabel t2 = new JLabel("Rajan Kumar");
		t2.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t2.setBounds(114,547,166,25);
		add(t2);
		
		// Harsh Kumar
		JLabel t4 = new JLabel("Harsh Kumar");
		t4.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t4.setBounds(114,586,163,20);
		add(t4);
		
		// Dheeraj Kumar
		JLabel t3 = new JLabel("Dheeraj Sonekar");
		t3.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t3.setBounds(114,622,228,25);
		add(t3);
		
		// Sachin 
		JLabel t6 = new JLabel("Sachin Kumar");
		t6.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t6.setBounds(114,661,163,18);
		add(t6);
		
		
		// Tarik
		JLabel t5 = new JLabel("Tarik Aehmad Mashuk");
		t5.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t5.setBounds(114,700,294,18);
		add(t5);
		
		
		// Image 
		ImageIcon wel=new ImageIcon(ClassLoader.getSystemResource("system/icon/welcome.png"));
		Image wel1=wel.getImage().getScaledInstance(711, 242, Image.SCALE_DEFAULT);
		ImageIcon wel2=new ImageIcon(wel1);
		JLabel welc=new JLabel(wel2);
		welc.setBounds(303,124,711,242);
		add(welc);
		
		// Mentor by
		JLabel t7 = new JLabel("Mentored by :-");
		t7.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t7.setBounds(1055,612,166,24);
		add(t7);
		
		// Anjani sir
		JLabel t8 = new JLabel("Anjani Kumar Verma");
		t8.setFont(new Font("Comfortaa", Font.ITALIC,22));
		t8.setForeground(Color.DARK_GRAY);
		t8.setBounds(986,647,302,41);
		add(t8);
		
		JButton btn= new JButton("Enter");
		btn.setFont(new Font("Comfortaa",Font.BOLD,22));
		btn.setBounds(608,645,111,35);
		btn.setBackground(Color.pink);
		btn.setForeground(Color.black);
		btn.addActionListener(this);
		add(btn);
		
		
		
		setBounds(50,50,1366,768);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		new Login().setVisible(true);
		this.setVisible(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Welcome().setVisible(true);

	}

}
