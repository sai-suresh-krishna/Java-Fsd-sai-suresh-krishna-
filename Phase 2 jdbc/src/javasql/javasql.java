package javasql;
import java.sql.*;
import java.util.Scanner;
public class javasql {
	public static void main (String args[]) {
        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	System.out.println("done succesfully");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafsd","root","Lakshmisai@2001");
        System.out.println("connected");
        Statement stmt=con.createStatement();
        System.out.println("its ready");
        Scanner obj=new Scanner(System.in);
        //int res=stmt.executeUpdate("insert into employee values(4,'navya',20000)");                //insert operation
        //if(res>0) {
        //	System.out.println("successfull");
        //}
        
        //PreparedStatement pstmt= con.prepareStatement("insert into employee value(?,?,?)");
       //System.out.println("enter the id");                                                          //user defined inserting
       //int id=obj.nextInt();
       //pstmt.setInt(1,id);
       //System.out.println("enter the name");
      // String name=obj.next();
      // pstmt.setString(2, name);
       //System.out.println("enter the salary");
       //float Salary=obj.nextFloat();
       //pstmt.setFloat(3,Salary);
      // int res=pstmt.executeUpdate();
      // if(res>0) {
    	   //System.out.println("updated successfully");
    	   
      // }
       // PreparedStatement pstmt= con.prepareStatement("delete from employee where id = ?");
       // System.out.println("enter the id to delete the record");                                      //user defined deleting 
       // int id =obj.nextInt();
       // pstmt.setInt(1, id);
       // int res=pstmt.executeUpdate();
       // if(res>0) {
        //     System.out.println("record deleted");
       // }else {
        //	System.out.println("record not present");
        	
        //}
        PreparedStatement pstmt= con.prepareStatement("update employee set salary =? where id =?");
        System.out.println("enter the id to Update the salary");
        int id =obj.nextInt();
        pstmt.setInt(2, id);
        System.out.println("enter the salary");
        Float Salary =obj.nextFloat();
        pstmt.setFloat(1, Salary);
        int res=pstmt.executeUpdate();
        if(res>0) {
             System.out.println("salary updated");
        }else {
        	System.out.println("record not present");
        	
        }
       
        // int res =stmt.executeUpdate("delete from employee where id = 4");
       // if(res>0) {                                                                                //delete operation
        //	System.out.println("deleted");
        	
        //}else 
        
        
        	//System.out.println("not present");
        //int res =stmt.executeUpdate("update  employee set salary = 40000 where id = 3");
        // if(res>0) {                                                                                //delete operation
             //System.out.println("Updated");
         	
         //}else {
         	//System.out.println("not present");
       
       // }
        
        ResultSet rs = stmt.executeQuery("select * from employee");
        while(rs.next()) {
        	System.out.println("id is "+rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
        }
        stmt.close();
        con.close();
        
	}catch (Exception e) {
        	System.out.println(e);
        }
	
}
}