package system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TeacherDetail extends JFrame implements ActionListener{
 
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3,bac;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Class X(%)", "Class XII(%)", "Aadhar No","","Course","Branch"};
    String y[][] = new String[60][13];
    int i=0, j=0;
    TeacherDetail(){
        super("Teacher Details");
        
        ImageIcon back1=new ImageIcon(ClassLoader.getSystemResource("system/icon/back.png"));
		Image back2=back1.getImage().getScaledInstance(47, 47, Image.SCALE_DEFAULT);
		ImageIcon back3=new ImageIcon(back2);
		bac=new JButton(back3);
		bac.setBounds(43,655,47,47);
		bac.setOpaque(false);
		bac.addActionListener(this);
		bac.setBackground(Color.white);
		add(bac);
        
        
        
        JLabel tt=new JLabel("Teacher's in Delhi University");
        tt.setBounds(437,10,459,31);
        add(tt);
        tt.setFont(new Font("serif", Font.BOLD,32));
        l1 = new JLabel("Enter Employee number to remove Teacher :");
        l1.setBounds(250,538,438,26);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(683,541,147,26);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(863, 540, 100 ,26);
        add(b1);
            
        l2 = new JLabel("Add New Teacher");
        l2.setBounds(477,603,200,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2 = new JButton("Add Teacher");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(684, 602, 147 ,26);
        add(b2);
        
        l3 = new JLabel("Update Teacher Details");
        l3.setBounds(424,653,250,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        
        b3 = new JButton("Update Teacher");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(683, 655, 150 ,26);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        try{
            conn c1  = new conn();
            String s1 = "select * from teacher";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("father");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("class10");
                y[i][j++]=rs.getString("class12");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("employee");
                y[i][j++]=rs.getString("education");
                y[i][j++]=rs.getString("depart");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.getColumnModel().getColumn(6).setPreferredWidth(100);
            t1.getColumnModel().getColumn(12).setPreferredWidth(130);
           
           
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(60,53,1249,418);
        add(sp);
        
        getContentPane().setBackground(Color.cyan);
        
        b1.addActionListener(this);
       setBounds(50,50,1366,768);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from teacher where employee = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new TeacherDetail().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddTeacher().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            new UpdateTeacher().setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==bac)
        {
        	new Dashboard().setVisible(true);
        	this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new TeacherDetail().setVisible(true);
    }
    
}