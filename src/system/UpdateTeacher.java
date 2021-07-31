
package system;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateTeacher extends JFrame implements ActionListener{

	JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	JTextField  l1,l2,l3,l4,l5,l7,l8,l9,l10,l11,l12,l15;
	JButton sub,can,upd,bac;
	JComboBox l13,l6;

    UpdateTeacher(){
    	ImageIcon teach1=new ImageIcon(ClassLoader.getSystemResource("system/icon/teacher.png"));
		Image teach2=teach1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		ImageIcon teach3=new ImageIcon(teach2);
		JLabel teach=new JLabel(teach3);
		teach.setBounds(0,0,1366,768);
		add(teach);
		
		//back 
		
		//
		t15 = new JLabel("Enter the Employee Id to Update the teacher Details");
		t15.setBounds(120,131,622,33);
		t15.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t15.setForeground(Color.white);
		teach.add(t15);
		
		// Name
		t1 = new JLabel("Name");
		t1.setBounds(181,222,83,23);
		t1.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t1.setForeground(Color.white);
		teach.add(t1);
		
		//Age
		t2 = new JLabel("Age");
		t2.setBounds(181,271,83,30);
		t2.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t2.setForeground(Color.white);
		teach.add(t2);
		
		t3 = new JLabel("Address");
		t3.setBounds(181,321,104,26);
		t3.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t3.setForeground(Color.white);
		teach.add(t3);
		
		t4 = new JLabel("Email");
		t4.setBounds(181,370,83,25);
		t4.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t4.setForeground(Color.white);
		teach.add(t4);
		
		t5 = new JLabel("Class 12");
		t5.setBounds(181,419,114,25);
		t5.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t5.setForeground(Color.white);
		teach.add(t5);
		
		t6 = new JLabel("Education");
		t6.setBounds(181,469,128,24);
		t6.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t6.setForeground(Color.white);
		teach.add(t6);
		
		t7 = new JLabel("Fathers Name");
		t7.setBounds(722,224,165,25);
		t7.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t7.setForeground(Color.white);
		teach.add(t7);
		
		t8 = new JLabel("DOB");
		t8.setBounds(722,272,83,25);
		t8.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t8.setForeground(Color.white);
		teach.add(t8);
		
		t9 = new JLabel("Phone");
		t9.setBounds(722,321,83,25);
		t9.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t9.setForeground(Color.white);
		teach.add(t9);
		
		t10 = new JLabel("Class 10");
		t10.setBounds(722,371,102,25);
		t10.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t10.setForeground(Color.white);
		teach.add(t10);
		t11 = new JLabel("Aadhar");
		t11.setBounds(722,420,123,25);
		t11.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t11.setForeground(Color.white);
		teach.add(t11);
		
		t12 = new JLabel("Department");
		t12.setBounds(722,469,158,30);
		t12.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t12.setForeground(Color.white);
		teach.add(t12);
		
		t13 = new JLabel("Employee Id");
		t13.setBounds(722,521,159,30);
		t13.setFont(new Font("Myriad Pro",Font.PLAIN,25));
		t13.setForeground(Color.white);
		teach.add(t13);
		
		t14= new JLabel("Enter the Teacher Details");
		t14.setBounds(376,66,557,39);
		t14.setFont(new Font("Myriad Pro",Font.PLAIN,45));
		t14.setForeground(Color.white);
		teach.add(t14);
		
		//Button
		sub = new JButton("Submit");
		sub.setBounds(398,620,170,39);
		// next 3 line of code is to make the button transparent
		sub.setOpaque(false);
		sub.setContentAreaFilled(false);
		sub.setBorderPainted(false);
		sub.setFocusable(false); // it will disappear the boarder when focused
		sub.setFont(new Font("Myriad Pro", Font.PLAIN,25));
		sub.setForeground(Color.white);
		sub.addActionListener(this);
		teach.add(sub);
		
		can = new JButton("Cancel");
		can.setBounds(778,620,170,39);
		can.setOpaque(false);
		can.setContentAreaFilled(false);
		can.setBorderPainted(false);
		can.setFocusable(false);
		can.setFont(new Font("Myriad Pro", Font.PLAIN,25));
		can.setForeground(Color.white);
		can.addActionListener(this);
		teach.add(can);
		
		upd = new JButton("Update");
		upd.setBounds(950,131,161,33);
		upd.setOpaque(false);
		upd.setContentAreaFilled(false);
		upd.setBorderPainted(false);
		upd.setFocusable(false);
		upd.setFont(new Font("Myriad Pro", Font.PLAIN,25));
		upd.setForeground(Color.white);
		upd.addActionListener(this);
		teach.add(upd);
		
		
		
		
		
		
		l1 = new JTextField();
		l1.setBounds(342,222,265,25);
		l1.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l1.setForeground(Color.black);
		teach.add(l1);
		
		//Age
		l2 = new JTextField();
		l2.setBounds(342,270,265,28);
		l2.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l2.setForeground(Color.black);
		teach.add(l2);
		
		l3 = new JTextField();
		l3.setBounds(342,321,265,25);
		l3.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l3.setForeground(Color.black);
		teach.add(l3);
		
		l4 = new JTextField();
		l4.setBounds(342,370,265,28);
		l4.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l4.setForeground(Color.black);
		teach.add(l4);
		
		l5 = new JTextField();
		l5.setBounds(342,417,265,25);
		l5.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l5.setForeground(Color.black);
		teach.add(l5);
		
		String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
		l6 = new JComboBox(course);
		l6.setBounds(342,470,265,25);
		l6.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l6.setForeground(Color.black);
		teach.add(l6);
		
		l7 = new JTextField();
		l7.setBounds(914,223,265,28);
		l7.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l7.setForeground(Color.black);
		teach.add(l7);
		
		l8 = new JTextField();
		l8.setBounds(914,272,265,25);
		l8.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l8.setForeground(Color.black);
		teach.add(l8);
		
		l9 = new JTextField();
		l9.setBounds(914,323,265,25);
		l9.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l9.setForeground(Color.black);
		teach.add(l9);
		
		l10 = new JTextField();
		l10.setBounds(914,371,265,25);
		l10.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l10.setForeground(Color.black);
		teach.add(l10);
		
		l11 = new JTextField();
		l11.setBounds(914,419,265,25);
		l11.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l11.setForeground(Color.black);
		teach.add(l11);
		
		l12 = new JTextField();
		l12.setBounds(914,521,265,25);
		l12.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l12.setForeground(Color.black);
		teach.add(l12);
		
		String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
		l13 = new JComboBox(branch);
		l13.setBounds(914,472,265,25);
		l13.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l13.setForeground(Color.black);
		teach.add(l13);
		
		l15 = new JTextField();
		l15.setBounds(719,135,235,30);
		l15.setFont(new Font("Myriad Pro",Font.PLAIN,20));
		l15.setForeground(Color.black);
		teach.add(l15);

		
		
		
		
		setBounds(50,50,1366,768);
		setLayout(null);
		setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==sub){
            try{
                conn con = new conn();
                String str = "update teacher set name='"+l1.getText()+"',age='"+l2.getText()+"',address='"+l3.getText()+"',email='"+l4.getText()+"',class12='"+l5.getText()+"',education='"+(String)l6.getSelectedItem()+"',father='"+l7.getText()+"', dob='"+l8.getText()+"',phone='"+l9.getText()+"',class10='"+l10.getText()+"',aadhar='"+l11.getText()+"',depart='"+(String)l13.getSelectedItem()+"', employee = '"+l12.getText()+"' where employee='"+l15.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                setVisible(false);
                new TeacherDetail().setVisible(true);
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==can){
            setVisible(false);
            new Dashboard().setVisible(true);
        }
        if(ae.getSource() == upd){
            try{
                conn con = new conn();
                String str = "select * from teacher where employee = '"+l15.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    setVisible(true);
             

                    l1.setText(rs.getString(1));
                    l2.setText(rs.getString(2));
                    l3.setText(rs.getString(3));
                    l4.setText(rs.getString(4));
                    l5.setText(rs.getString(5));
                    l6.setSelectedItem(rs.getString(6));
                    l7.setText(rs.getString(7));
                    l8.setText(rs.getString(8));
                    l9.setText(rs.getString(9));
                    l10.setText(rs.getString(10));
                    l11.setText(rs.getString(11));
                    l12.setText(rs.getString(13));
                    l13.setSelectedItem(rs.getString(12));
                }

                
            }catch(Exception ex){}
        
            setBounds(50,50,1366,768);
            setVisible(true);
            
        }
    }

    public static void main(String[] arg){
        new UpdateTeacher().setVisible(true);
    }
}


