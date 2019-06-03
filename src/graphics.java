import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class graphics extends Frame implements ActionListener{

	private static final long serialVersionUID = 543L;
  TextField textfieldName;
  TextField textfieldUserName;
  TextField textfieldEmail;
  TextField textfieldPassword;
  Label l1,l2,l3,l4;  /// defined Lable here 
  Toolkit t;// =getToolkit();
  Dimension ScreenSize; //= t.getScreenSize();
  int width; //= ScreenSize.width;
  int  height;// = ScreenSize.height;
@SuppressWarnings("deprecation")
public graphics() 
 {  
   
      t =getToolkit();
	   ScreenSize = t.getScreenSize();
	  width = ScreenSize.width;
	  height = ScreenSize.height;
	
	l1 = new Label("Name");
	l2 = new Label("UserName:)");
	l3 = new Label("Email:)");
	l4 = new Label("Password:)");
	textfieldPassword = new TextField();
    l1.setBounds(width/8,height/10, width/13,height/25);
    l2.setBounds(width/8,height/6, width/13,height/25);
    l3.setBounds(width/8,height/4, width/13,height/25);
    l4.setBounds(width/8,height/3, width/13,height/25);
	textfieldName = new TextField(); 
    textfieldUserName = new TextField();
    textfieldEmail = new TextField();
    
    textfieldName.setBounds(width/4,height/10,width/4,height/20);
    textfieldEmail.setBounds(width/4,height/6,width/4,height/20);
    textfieldUserName.setBounds(width/4,height/4,width/4,height/20);
    textfieldPassword.setBounds(width/4,height/3,width/4,height/20);
   
	Button submit = new Button("Submit");
	Button cancle = new Button("Clear");
	 submit.setBounds(width/4,height/2,width/17,height/25);
	 cancle.setBounds(width/3,height/2,width/17,height/25);
	 submit.addActionListener(new ActionListener() {
		  EncLearn  Acess = new EncLearn();
		  
		@Override
		public void actionPerformed(ActionEvent e) {
			String Name=null,Email=null,UserName =null,Password =null;
			Name=textfieldName.getText().toString();
			Email=textfieldEmail.getText().toString();
	    	UserName=textfieldUserName.getText().toString();
	    	Password =textfieldPassword.getText().toString();
//	    	System.out.print(Name+"n");
//	    	System.out.print(UserName +"UN");
//	    	System.out.print(Email +"E");
//	    	System.out.print(Password+"p");
	    	Acess.setName(Name);
	    	Acess.setEmail(Email);
	    	Acess.setUserName(UserName);    	
	    	Acess.setPassword(Password);
			
	    	try {
	    		new ACtionStart (Acess);
	    	} catch (IOException e1) {
	    		
	    		e1.printStackTrace();
	    	}  
				
	    	 textfieldName.setText(null);
	         textfieldEmail.setText(null);
	         textfieldUserName.setText(null);
	         textfieldPassword.setText(null);
		}
		
	 
	 });
	 
	 cancle.addActionListener(this);
	 add(l1);add(l2);add(l3);add(l4);add(submit);add(cancle);add(textfieldName);add(textfieldEmail);add(textfieldUserName);add(textfieldPassword);
	
      setSize(width, height);
      setLayout(null);
      setVisible(true);
   }

      @Override
     public void actionPerformed(ActionEvent e)
      {  
        textfieldName.setText(null);
        textfieldEmail.setText(null);
        textfieldUserName.setText(null);
        textfieldPassword.setText(null);
    
	  }
	
 }
