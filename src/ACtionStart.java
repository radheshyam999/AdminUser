
import com.google.gson.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ACtionStart 
{
	ACtionStart(EncLearn Acess) throws IOException
   {   
	
//	  char game[] = {};
	 FileWriter  write = new FileWriter("C:\\Users\\ADMIN\\Desktop\\Day\\Data\\Admin.json",true); 
//	FileReader reading = new FileReader("C:\\Users\\ADMIN\\Desktop\\Day\\Data\\Admin.json");
	 
 
//	  String Name,Email,UserName,Password; 
//	  
//      Scanner TakeInput = new Scanner(System.in);
//      
//	  System.out.println("Pleas Enter Your Name ");
//	  
//	  Name = TakeInput.nextLine();
//	  
//	  System.out.println("Pleas Enter Your Email ");
//	  
//	  Email = TakeInput.nextLine();
//	  
//	  System.out.println("Pleas Enter Your UserName ");
//	  
//	  UserName = TakeInput.nextLine(); 
//	  
//	  System.out.println("Pleas Enter Your Password ");
//	  
//	  Password = TakeInput.nextLine();
	  
	  //EncLearn  Acess = new EncLearn();
	  
//	  Acess.setName(Name);
//	  
//	  Acess.setUserName(UserName);
//	  
//	  Acess.setEmail(Email);
//	  
//	  Acess.setPassword(Password);
	  Gson AcessJson = new Gson();
	  String s = AcessJson.toJson(Acess);
      write.write("," +"\n"+ s);
	  write.flush();
	  write.close();
	 // System.out.println(s);
	  
	  //Acess = null;
	  
	  //AcessJson = null;
	  
//	  TakeInput.close();
   }
public static String readFileAsString(String fileName)throws Exception 
  { 
  String data = ""; 
  data = new String(Files.readAllBytes(Paths.get(fileName))); 
  return data; 
  } 



}
