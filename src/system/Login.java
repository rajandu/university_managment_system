package system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
	
	JButton log, cancel;
	JTextField user, pass;
	Login()
	{
		super("Authentication Page");
		
		// Login page background image 
		ImageIcon login_bg1=new ImageIcon(ClassLoader.getSystemResource("system/icon/login.jpg"));
		Image login_bg2=login_bg1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		ImageIcon login_bg3=new ImageIcon(login_bg2);
		JLabel login_bg=new JLabel(login_bg3);
		login_bg.setBounds(0,0,1366,768);
		add(login_bg);
		
		JLabel username=new JLabel("Username");
		username.setBounds(480,288,165,36);
		username.setForeground(Color.white);
		username.setFont(new Font("Comfortaa",Font.ITALIC,30));
		login_bg.add(username);
		
		// Password
		JLabel password=new JLabel("Password");
		password.setBounds(480,377,165,36);
		password.setForeground(Color.white);
		password.setFont(new Font("Comfortaa",Font.ITALIC,30));
		login_bg.add(password);
		
		// JTestField Username
		user=new JTextField();
		user.setFont(new Font("Comfortaa",Font.ITALIC,30));
		user.setBounds(703,286,265,40);
		login_bg.add(user);
		
		// JTextField Password
		pass=new JTextField();
		pass.setFont(new Font("Comfortaa",Font.ITALIC,30));
		pass.setBounds(703,372,265,40);
		login_bg.add(pass);
		
		//Login Button
		log=new JButton("Login");
		log.setBounds(483,513,219,53);
		log.setBackground(Color.pink);
		log.setFont(new Font("Comfortaa",Font.ITALIC,30));
		log.setFont(new Font("Comfortaa",Font.ITALIC,30));
		log.addActionListener(this);
		login_bg.add(log);
		
		// Cancel Button
		cancel=new JButton("Cancel");
		cancel.setBounds(772,513,219,53);
		cancel.setBackground(Color.pink);
		cancel.setFont(new Font("Comfortaa",Font.ITALIC,30));
		cancel.setFont(new Font("Comfortaa",Font.ITALIC,30));
		cancel.addActionListener(this);
		login_bg.add(cancel);
				
		ImageIcon login_man1=new ImageIcon(ClassLoader.getSystemResource("system/icon/login_man.png"));
		Image login_man2=login_man1.getImage().getScaledInstance(141, 141, Image.SCALE_DEFAULT);
		ImageIcon login_man3=new ImageIcon(login_man2);
		JLabel login_man=new JLabel(login_man3);
		login_man.setBounds(647,76,141, 141);
		login_bg.add(login_man);
		
		
		
		setBounds(50,50,1366,768);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==log)
		{
			String username=user.getText();
			String password=pass.getText();
			conn c = new conn();
			String str="Select * from login where username = '"+username+"' and password = '"+password+"'";
			try
			{
				ResultSet rs = c.s.executeQuery(str);
				if(rs.next())
				{
					new Dashboard().setVisible(true);
					this.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username and password");
					
				}
			}
			catch(Exception e)
			{
				
			}
		}
		else if(ae.getSource()==cancel)
		{
			 new Welcome().setVisible(true);
			 this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login().setVisible(true);

	}

}
