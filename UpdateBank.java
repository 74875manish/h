package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBank {
	

	
	
	
	public static void main(String[] args) throws Exception {
		
		String name = "Palash";
		int account_no = 101;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessFully");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "ycpait23");
		
		  System.out.println("success");
		  
		  PreparedStatement ps =   conn.prepareStatement("update emp set name=? where  account_no=? ");
		  ps.setNString(1,name);
			 ps.setInt(2, account_no);
			 
			 int i = ps.executeUpdate();
			 if(i>0)
			 {
				 System.out.println("sucesss Update");
				 
			 }
			 else
			 {
				 System.out.println("fail");
			 }
			 
			 
			}

	}









