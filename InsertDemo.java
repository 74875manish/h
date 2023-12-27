package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded sucessFully");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "ycpait23");
		
		  System.out.println("success");
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter your name ");
		  String name =   sc.nextLine();
		  
		  System.out.println("Enter your account no");
		  int account_no =  sc.nextInt();
		  
		  System.out.println("Enter your Ammount ");
		   float amount  = sc.nextFloat();
		   
		   System.err.println("Enter your withdraw amount");
		   float withdraw = sc.nextFloat();
		   
		 System.out.println("enter your deposit amount");
		 float deposit = sc.nextFloat();
		 
		 
		 PreparedStatement ps =   conn.prepareStatement("insert into emp values(?,?,?,?,?)");
		 ps.setNString(1, name);
		 ps.setFloat(2, account_no);
		 ps.setFloat(3, amount);
		 ps.setFloat(4, withdraw);
		 ps.setFloat(5, deposit);
		 
		 int i = ps.executeUpdate();
		 if(i>0) {
			 System.out.println("sucessfull enter");
			 
		 }
		 else {
			 System.out.println("Not eneter");
		 }
	   
	}
}













































































