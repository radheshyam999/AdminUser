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
	//Frame frame1 ,frame2;
	
  TextField textfieldName, textfieldUserName, textfieldEmail, textfieldPassword,textfieldUserNameLogin,textfieldPasswordLogin;
  Label l1,l2,l3,l4,optionLoginL1,optionCreatL2,LoginNameOrEmail,LoginPassword;  /// defined Lable here 
  Toolkit t;// =getToolkit();
  Dimension ScreenSize; //= t.getScreenSize();
  int width,  height;// = ScreenSize.height;
  Button submit, cancle,login,cancleLogin,optionLogin,optionCreatAccount;
@SuppressWarnings("deprecation")
public graphics() 
 {  
//     frame1 = new Frame();
//     frame2 = new Frame();
      t =getToolkit();
	   ScreenSize = t.getScreenSize();
	  width = ScreenSize.width;
	  height = ScreenSize.height;
	 
	l1 = new Label("Name");
	l2 = new Label("UserName:)");
	l3 = new Label("Email:)");
	l4 = new Label("Password:)");
	LoginNameOrEmail = new Label("UserName/ Email");
	LoginPassword = new Label("Password");
	optionLoginL1 = new Label("DO you have account so pleas login:");
	optionCreatL2 = new Label("DO,nt you have account :");
	textfieldPassword = new TextField();
    l1.setBounds(width/8,height/10, width/13,height/25);
    l2.setBounds(width/8,height/6, width/13,height/25);
    l3.setBounds(width/8,height/4, width/13,height/25);
    l4.setBounds(width/8,height/3, width/13,height/25);
    optionLoginL1.setBounds(40, 600, width/7, height/20);
    optionCreatL2.setBounds(40, 600, width/7, height/20);
    LoginNameOrEmail.setBounds(width/8,height/10, width/13,height/25);
    LoginPassword .setBounds(width/8,height/6, width/13,height/25);
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
	 optionCreatAccount = new Button("create"); // option to create account 
	 
	 submit.setBounds(width/5,height/2,width/17,height/25);
	 cancle.setBounds(width/3,height/2,width/17,height/25);
	 optionLogin.setBounds(270, 600, width/17, height/25);
	 login.setBounds(width/5,height/2,width/17,height/25);
	 cancleLogin.setBounds(width/3,height/2,width/17,height/25);
	 optionCreatAccount.setBounds(270, 600, width/17, height/25);
	 
	 optionLogin.addActionListener(new ActionListener() {
		 /**
		  *  optionLogin is Button it  for if  user have Account so  can Login by   clicking Login button
		  *  it will hide   some which are  set Visible false 
		  * 
		  * 
		  * 
		  * */
		 
		 
		 
		   @Override
		     public void actionPerformed(ActionEvent e)
		      {  
		            
			   textfieldName.setVisible(false);
			   textfieldUserName.setVisible(false);
			   textfieldEmail.setVisible(false);
			   textfieldPassword.setVisible(false);
			   submit.setVisible(false);
			   cancle.setVisible(false);
			   optionLogin.setVisible(false);
			   l1.setVisible(false);
			   l2.setVisible(false);
			   l3.setVisible(false);
			   l4.setVisible(false);
			   optionCreatAccount.setVisible(true);
			   optionLoginL1.setVisible(false);
      
		            
		           
		            add(textfieldUserNameLogin);add(textfieldPasswordLogin);
		            add(login); add(optionCreatL2);
		            add(optionCreatAccount);
		            add(cancleLogin);
		            add(LoginNameOrEmail);
		            add(LoginPassword);
		            
			  
		      }  
		   });
	 optionCreatAccount.addActionListener(new ActionListener(){
		  
		 /***
		  *   optionSubmit  getting option if user don't have Account
		  *   so  will get option  to go on  his  create  Account  
		  * 
		  * 
		  * 
		  * 
		  * 
		  * 
		  */
		 
		 
		 @Override
			public void actionPerformed(ActionEvent e) {
			    optionLoginL1.setVisible(false);
			    textfieldUserNameLogin.setVisible(false);
			    textfieldPasswordLogin.setVisible(false);

			    login.setVisible(false);
			    optionCreatL2.setVisible(false);
			    optionCreatAccount.setVisible(false);
			    cancleLogin.setVisible(false);
			    LoginNameOrEmail.setVisible(false);
			    LoginPassword.setVisible(false);
			    
			    /***
			     *  this all   set to visible 
			     * 
			     * 
			     * 
			     */
			    
			    
			    
			      textfieldName.setVisible(true);
				   textfieldUserName.setVisible(true);
				   textfieldEmail.setVisible(true);
				   textfieldPassword.setVisible(true);
				   submit.setVisible(true);
				   cancle.setVisible(true);
				   optionLogin.setVisible(true);
				   l1.setVisible(true);
				   l2.setVisible(true);
				   l3.setVisible(true);
				   l4.setVisible(true);
				   optionCreatAccount.setVisible(true);
				   optionLoginL1.setVisible(false);
				   //add();add();add();add();add();
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
	add(optionLogin);  add(optionLoginL1); add(l1);add(l2);add(l3);add(l4);add(submit);add(cancle);add(textfieldName);add(textfieldEmail);add(textfieldUserName);add(textfieldPassword);
	
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
