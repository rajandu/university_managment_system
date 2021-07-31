package system;
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

public class Studentattendancedetail extends JFrame implements ActionListener{
	

    JTable j1;
    JButton b1;
    String h[]={"Roll Number","Date Time","Attendance"};
    String d[][]=new String[35][3];  
    int i=0,j=0;
    
    Studentattendancedetail(){
        super("Students Attendence Details");
        getContentPane().setBackground(Color.cyan);
        setBounds(229,120,938,520);

        try{
            String q="select * from student_attendence";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("roll");
                d[i][j++]=rs.getString("date");
                d[i][j++]=rs.getString("attendence");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);                                                                                                                                                                                                                                                                                                                                                                                                                
        
        b1.addActionListener(this);
        
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }

	public static void main(String[] args) {
		
		
		new Studentattendancedetail().setVisible(true);

	}

}
