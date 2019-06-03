
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
	

	 FileWriter  write = new FileWriter("C:\\Users\\ADMIN\\Desktop\\Day\\Data\\Admin.json",true); 

	  Gson AcessJson = new Gson();
	   String Name, Email,UserName,Password;
	     Name=Acess.getName();
	     UserName =Acess.getUserName();
	     Email = Acess.getEmail();
	     Password = Acess.getPassword();
	  if(Name.equals("") &&  UserName.equals("") && Password.equals("") && Email.equals(""))
	  {  
		  System.out.print("nulll");
	  }
	  else {
		    String s = AcessJson.toJson(Acess);
		   
		    //System.out.println(s);
		  
	      write.write("," +"\n"+ s);
		  
	  }
	  write.flush();
	  write.close();
	 
   }
public static String readFileAsString(String fileName)throws Exception 
  { 
  String data = ""; 
  data = new String(Files.readAllBytes(Paths.get(fileName))); 
  return data; 
  } 



}
