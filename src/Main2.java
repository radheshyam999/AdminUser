import java.io.IOException;
public class Main2
 {
    	public static void main(String... args)
	       {  graphics ac  = new graphics();
		     Main2 AcessMethod = new Main2();
		       AcessMethod.show();
			   AcessMethod = null;
	       }
	   void show()
	      {
               ACtionStart  Acess= new ACtionStart();
		       try {
				      Acess.WriteDataintojsonfile();
				      //Acess.FileWriterjson();
			       }     
		       catch (IOException e)
		        {
				
				  e.printStackTrace();
			    }
		     Acess =null;
		    
	      }
	

}

