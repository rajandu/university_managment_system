package system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dashboard extends JFrame implements ActionListener {
	
	Dashboard()
	{
		super("Dashboard");
		JMenuBar mb = new JMenuBar();
		mb.setBounds(0,0,1366,37);
		mb.setOpaque(false);
		add(mb);
		
		//Master Menu
		JMenu m1 = new JMenu("Master");
		m1.setBounds(0,0,101,37);
		m1.setFont(new Font("Comfortaa",Font.ITALIC,18));
		mb.add(m1);
		
		//Details Menu
		JMenu m2 = new JMenu("Details");
		m2.setFont(new Font("Comfortaa",Font.ITALIC,18));
		m2.setBounds(101,0,101,37);
		mb.add(m2);
		
		//Atendence Menu
		JMenu m3 = new JMenu("Attendance");
		m3.setFont(new Font("Comfortaa",Font.ITALIC,18));
		m3.setBounds(203,0,101,37);
		mb.add(m3);
		
		// Examination menu
		JMenu m4 = new JMenu("Attendance Details");
		m4.setFont(new Font("Comfortaa",Font.ITALIC,18));
		m4.setBounds(347,0,200,37);
		mb.add(m4);
		
		// Update Detials
		JMenu m5 = new JMenu("Update Details");
		m5.setFont(new Font("Comfortaa",Font.ITALIC,18));
		m5.setBounds(497,0,170,37);
		mb.add(m5);
		
		// Fees Details
		JMenu m6 = new JMenu("Fees Details");
		m6.setFont(new Font("Comfortaa",Font.ITALIC,18));
		m6.setBounds(668,0,141,37);
		mb.add(m6);
		
		// About
		JMenu m7 = new JMenu("About");
		m7.setFont(new Font("Comfortaa",Font.ITALIC,18));
		m7.setBounds(808,0,90,37);
		mb.add(m7);
		
		// Cic Image
		ImageIcon cic1=new ImageIcon(ClassLoader.getSystemResource("system/icon/1.jpg"));
		Image cic2=cic1.getImage().getScaledInstance(1366, 731, Image.SCALE_DEFAULT);
		ImageIcon cic3=new ImageIcon(cic2);
		JLabel cic=new JLabel(cic3);
		cic.setBounds(0,37,1366,731);
		add(cic);
		
		
		

		// Cic Logo
		ImageIcon ciclogo1=new ImageIcon(ClassLoader.getSystemResource("system/icon/du_logo.jpg"));
		Image ciclogo2=ciclogo1.getImage().getScaledInstance(270, 100, Image.SCALE_DEFAULT);
		ImageIcon ciclogo3=new ImageIcon(ciclogo2);
		JLabel ciclogo=new JLabel(ciclogo3);
		ciclogo.setBounds(1064,20,270,100);
		cic.add(ciclogo);
		
		
		JMenuItem it1=new JMenuItem("New Faculty");
		it1.setFont(new Font("Comfortaa",Font.PLAIN,14));
		it1.addActionListener(this);
		m1.add(it1);
		
		JMenuItem it2=new JMenuItem("New Student");
		m1.add(it2);
		it2.addActionListener(this);
		it2.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it3=new JMenuItem("Teachers Details");
		m2.add(it3);
		it3.addActionListener(this);
		it3.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it4=new JMenuItem("Student Details");
		m2.add(it4);
		it4.addActionListener(this);
		it4.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it5=new JMenuItem("Students Attendence");
		m3.add(it5);
		it5.addActionListener(this);
		it5.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it6=new JMenuItem("Teacher Attendence");
		m3.add(it6);
		it6.addActionListener(this);
		it6.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it7=new JMenuItem("Update Student");
		m5.add(it7);
		it7.addActionListener(this);
		it7.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it8=new JMenuItem("Update Teacher");
		m5.add(it8);
		it8.addActionListener(this);
		it8.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it9=new JMenuItem("Students Attendence Detail");
		m4.add(it9);
		it9.addActionListener(this);
		it9.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it10=new JMenuItem("Teacher Attendence Detail");
		m4.add(it10);
		it10.addActionListener(this);
		it10.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it11=new JMenuItem("Fee Structure");
		m6.add(it11);
		it11.addActionListener(this);
		it11.setFont(new Font("Comfortaa",Font.PLAIN,14));
		
		JMenuItem it12=new JMenuItem("Student Fee Form");
		m6.add(it12);
		it12.addActionListener(this);
		it12.setFont(new Font("Comfortaa",Font.PLAIN,14));
	
		
		
		setBounds(50,50,1366,768);
		setLayout(null);
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae)
	{
		String msg = ae.getActionCommand();
		if(msg.equals("New Faculty"))
		{
			new AddTeacher().setVisible(true);
			this.setVisible(false);
		}
		
		else if(msg.equals("New Student"))
		{
			new AddStudent().setVisible(true);
			this.setVisible(false);
		}
		else if(msg.equals("Student Details"))
		{
			new StudentDetail().setVisible(true);
			this.setVisible(false);
		}
		else if(msg.equals("Teachers Details"))
		{
			new TeacherDetail().setVisible(true);
			this.setVisible(false);
		}
		else if(msg.equals("Update Student"))
		{
			new UpdateStudent().setVisible(true);
			this.setVisible(false);
		}
		else if(msg.equals("Update Teacher"))
		{
			new UpdateTeacher().setVisible(true);
			this.setVisible(false);
		}
		else if(msg.equals("Students Attendence"))
		{
			new StudentAttendance().setVisible(true);
			
		}
		else if(msg.equals("Teacher Attendence"))
		{
			new TeacherAttendance().setVisible(true);
			
		}
		else if (msg.equals("Teacher Attendence Detail"))
		{
			new Teacherattendancedetail().setVisible(true);
		}
		else if(msg.equals(("Students Attendence Detail")))
		{
			new Studentattendancedetail().setVisible(true);
		}
		else if(msg.equals("Fee Structure"))
		{
			new Fee_structure().setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Dashboard().setVisible(true);

	}

}
