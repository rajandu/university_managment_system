
package system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener{
    
    JLabel l1;
    JButton b1,b2;
    Choice c2,fh,sh;
    static String date=new java.util.Date().toString();;
    
    StudentAttendance(){
       
    	super(date);
        setLayout(new GridLayout(4,2,50,50));
        c2 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                c2.add(rs.getString("roll"));
            }
      
      
       }catch(Exception e){ }
       
        add(new JLabel("          Select Roll Number"));
        add(c2);
      
        l1 = new JLabel("         Attendance");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
       
        add(l1);
        add(fh);
        
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setBounds(304,250,468,285);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        String qry = "insert into student_attendence values("+ id +",'"+dt+"','"+f+"')";
       
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String s[]){
        new StudentAttendance().setVisible(true);;
    }
}
