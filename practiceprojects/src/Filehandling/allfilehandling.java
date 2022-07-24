package Filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class allfilehandling {
	


	
	 public static void main(String[] args) throws IOException
	 {

           // creating a file            

	     try {
	         File Obj = new File("file handling practice project non assisted.txt");     
	         if (Obj.createNewFile()) {
	             System.out.println("File created: "
	                                + Obj.getName());
	         }
	         else {
	             System.out.println("File already exists.");
	         }
	     }
	     catch (IOException e) {
	         System.out.println("An error has occurred.");
	         e.printStackTrace();
	     }
	 
	


try {
    FileWriter Writer
        = new FileWriter("file handling practice project non assisted.txt");     

//writing a string in the above created file
    
    Writer.write("Iam suresh ");
        
    Writer.close();
    System.out.println("Successfully written.");
}
catch (IOException e) {
    System.out.println("An error has occurred.");
    e.printStackTrace();
}

//Reading the above created file

try {                                                                   
    File Obj = new File("file handling practice project non assisted.txt");                               
    Scanner Reader = new Scanner(Obj);                   
    while (Reader.hasNextLine()) {
        String data = Reader.nextLine();
        System.out.println("Reading the file before  appending ");
        System.out.println(data);
    }
    Reader.close();
}
catch (FileNotFoundException e) {
    System.out.println("error has occurred.");
    e.printStackTrace();
}

String textToAppend = " Iam learning java programing";  //appending a string to the existing file
String fileName = "file handling practice project non assisted.txt";

try(FileWriter fw = new FileWriter(fileName, true);
BufferedWriter writer = new BufferedWriter(fw);) {

  writer.write(textToAppend);
}  

//reading the file after appending


try {
    File Obj = new File("file handling practice project non assisted.txt");           
    Scanner Reader = new Scanner(Obj);
    while (Reader.hasNextLine()) {
        String data = Reader.nextLine();
        System.out.println("Reading the file after  appending");
        System.out.println(data);
    }
    Reader.close();
}
catch (FileNotFoundException e) {
    System.out.println("error has occurred.");
    e.printStackTrace();
}

}  
}




