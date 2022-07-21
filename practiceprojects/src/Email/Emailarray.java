
	package Email; 
	import java.util.Scanner; 
	public class Emailarray { 
	 
	 public static void main(String[] args) 
	 { 
	 String[] EmailStringArray = new String[11]; 
	 EmailStringArray[0]= "chandu@gmail.com"; 
	 EmailStringArray[1]= "krishna@gmail.com"; 
	 EmailStringArray[2]= "mounika@gmail.com"; 
	 EmailStringArray[3]= "sujitha@gmail.com"; 
	 EmailStringArray[4]= "sai127@gmail.com"; 
	 EmailStringArray[5]= "kishore356@gmail.com"; 
	 EmailStringArray[6]= "saatvik12@gmail.com"; 
	 EmailStringArray[7]= "ravikiran@gmail.com"; 
	 EmailStringArray[8]= "Saanvi@gmail.com"; 
	 EmailStringArray[9]= "Aadya@gmail.com"; 
	 EmailStringArray[10]= "Diya.ch@gmail.com"; 
	 
	 
	 boolean found = false; 
	 int indexvalue = 0; 
	 
	 Scanner Email=new Scanner(System.in); 
	 System.out.println("Enter the Email ID:"); 
	 String a= Email.nextLine(); 
	 for (int i = 0; i <EmailStringArray.length; i++) { 
	 if(a.equals(EmailStringArray[i])) { 
	 indexvalue = i; found = true; 
	 } 
	 } 
	 if(found) 
	 System.out.println("The Email Id " +a +" is found at the index value of" +indexvalue); 
	 else
	 System.out.println("The email ID " +a +" was not found in the given array"); 
	 
	 } 
	 

}
