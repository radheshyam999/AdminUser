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
	Frame frame1 ,frame2;
	
  TextField textfieldName, textfieldUserName, textfieldEmail, textfieldPassword,textfieldUserNameLogin,textfieldPasswordLogin;
  Label l1,l2,l3,l4,optionlaout;  /// defined Lable here 
  Toolkit t;// =getToolkit();
  Dimension ScreenSize; //= t.getScreenSize();
  int width,  height;// = ScreenSize.height;
  Button submit, cancle,login,cancleLogin,optionLogin,optionSubmit;
@SuppressWarnings("deprecation")
public graphics() 
 {  
     frame1 = new Frame();
     frame2 = new Frame();
      t =getToolkit();
	   ScreenSize = t.getScreenSize();
	  width = ScreenSize.width;
	  height = ScreenSize.height;
	
	l1 = new Label("Name");
	l2 = new Label("UserName:)");
	l3 = new Label("Email:)");
	l4 = new Label("Password:)");
	optionlaout = new Label("Are You Admin so pleas login here :");
	textfieldPassword = new TextField();
    l1.setBounds(width/8,height/10, width/13,height/25);
    l2.setBounds(width/8,height/6, width/13,height/25);
    l3.setBounds(width/8,height/4, width/13,height/25);
    l4.setBounds(width/8,height/3, width/13,height/25);
    optionlaout.setBounds(40, 600, width/7, height/20);
	textfieldName = new TextField(); 
    textfieldUserName = new TextField();
    textfieldEmail = new TextField();
    textfieldUserNameLogin = new TextField();
    textfieldPasswordLogin = new TextField();
    // thes for  sign up 
    textfieldName.setBounds(width/4,height/10,width/4,height/20);
    textfieldEmail.setBounds(width/4,height/6,width/4,height/20);
    textfieldUserName.setBounds(width/4,height/4,width/4,height/20);
    textfieldPassword.setBounds(width/4,height/3,width/4,height/20);
    
    /*these for login */
    textfieldUserNameLogin.setBounds(width/4,height/10,width/4,height/20);
    textfieldPasswordLogin.setBounds(width/4,height/6,width/4,height/20);
    //
	 submit = new Button("Submit");
	   login =new Button("Login");
	   cancleLogin=new Button("cancle");
	 cancle = new Button("Clear");
	 optionLogin = new Button("Login");
	 optionSubmit = new Button("creat");
	 
	 submit.setBounds(width/5,height/2,width/17,height/25);
	 cancle.setBounds(width/3,height/2,width/17,height/25);
	 optionLogin.setBounds(270, 600, width/17, height/25);
	 optionLogin.addActionListener(new ActionListener() {
		   @Override
		     public void actionPerformed(ActionEvent e)
		      {  
		            frame1.setVisible(false); 
		            
		            frame2.setLayout(null);
		            frame2.setSize(width, height);
		            frame2.setVisible(true);
		            
		            
		           
		            frame2.add(textfieldUserNameLogin);frame2.add(textfieldPasswordLogin);
		            frame2.add(login);
		            frame2.add(optionSubmit);
		            frame2.add(cancleLogin);
		            frame2.add();
			  
		      }  
		   });
	   
	 submit.addActionListener(new ActionListener() {
		  EncLearn  Acess = new EncLearn();
		  
		@Override
		public void actionPerformed(ActionEvent e) {
			String Name=null,Email=null,UserName =null,Password =null;
			Name=textfieldName.getText().toString();
			Email=textfieldEmail.getText().toString();
	    	UserName=textfieldUserName.getText().toString();
	    	Password =textfieldPassword.getText().toString();

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
	frame1.add(optionLogin);  frame1.add(optionlaout); frame1.add(l1);frame1.add(l2);frame1.add(l3);frame1.add(l4);frame1.add(submit);frame1.add(cancle);frame1.add(textfieldName);frame1.add(textfieldEmail);frame1.add(textfieldUserName);frame1.add(textfieldPassword);
	
      frame1.setSize(width, height);
      frame1.setLayout(null);
      frame1.setVisible(true);
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
