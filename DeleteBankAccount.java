package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBankAccount {
	
	public static void main(String[] args) throws Exception {
		
		int account_no=101;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessFully");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "ycpait23");
		System.out.println("success");
		
		PreparedStatement ps =    conn.prepareStatement("delete from emp where account_no=?");
	    ps.setInt(1,account_no);
	  int i=  ps.executeUpdate();
	  if(i>0) {
		  System.out.println("Deletion sucessfull");
	  }
	    
	  else
	  {
		  System.out.println("Not delete");
	  }
		
	}

}
