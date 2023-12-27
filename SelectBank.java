package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectBank {
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessFully");
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "ycpait23");
		System.out.println("success");
		
		 PreparedStatement ps =  conn.prepareStatement("select * from emp" );

		  ResultSet rs = ps.executeQuery();
		  
		  while(rs.next())
		  {
		   String name1=rs.getString("name");
		   System.out.print("Name :" +name1);
		   
		   String account_no=rs.getString("account_no");
		   System.out.println(" Account Number :" +account_no);

		
		  }

}
}
