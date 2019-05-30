import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class graphics extends Frame implements ActionListener{

	private static final long serialVersionUID = 543L;
  TextField textfieldName;
  TextField textfieldUserName;
  TextField textfieldEmail;
  TextField textfieldPassword;
@SuppressWarnings("deprecation")
public graphics() 
 { 
	Label l1,l2,l3,l4;
	
	l1 = new Label("Name:)");
	l2 = new Label("UserName:)");
	l3 = new Label("Email:)");
	l4 = new Label("Password:)");
	textfieldPassword = new TextField();
    l1.setBounds(50,30, 100,30);
    l2.setBounds(50,70, 100,30);
    l3.setBounds(50,110, 100,30);
    l4.setBounds(50,150, 100,30);
	textfieldName = new TextField(); 
    textfieldUserName = new TextField();
    textfieldEmail = new TextField();
    
    textfieldName.setBounds(150,30,200,30);
    textfieldEmail.setBounds(150,70,200,30);
    textfieldUserName.setBounds(150,110,200,30);
    textfieldPassword.setBounds(150,150,200,30);
   
	Button b1 = new Button("Submit");
	Button b2 = new Button("Clear");
	 b1.setBounds(150,320,80,30);
	 b2.setBounds(250,320,80,30);
	
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 add(l1);add(l2);add(l3);add(l4);add(b1);add(b2);add(textfieldName);add(textfieldEmail);add(textfieldUserName);add(textfieldPassword);
      setSize(500, 500);
      setLayout(null);
      setVisible(true);
      
      
      
     
      
 }

      @Override
     public void actionPerformed(ActionEvent e)
      {
    	  
    	textfieldName.getLocation(); 
    	  
	  }
	
 }
