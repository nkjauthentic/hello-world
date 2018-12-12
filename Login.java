import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class LoginButton extends JFrame implements ActionListener
{
	  JButton B1,B2,B3,B4;
	  Container c1;
	  LoginButton()
	  {
	   c1=this.getContentPane();
	   c1.setBackground(Color.blue);
	   c1.setLayout(null);
	   Font f=new Font("Arial",Font.BOLD,20);
	   B1=new JButton("ADMIN");
	   B1.setBounds(350,200,200,30);
	   B1.setFont(f);

	   B2=new JButton("STUDENT");
	   B2.setBounds(550,200,200,30);
	   B2.setFont(f);

	   B3=new JButton("LIBRARIAN");
	   B3.setBounds(750,200,200,30);
	   B3.setFont(f);

	   B4=new JButton("EXIT");
	   B4.setBounds(550,400,200,30);
	   B4.setFont(f);

	   c1.add(B1);
	   c1.add(B2);
	   c1.add(B3);
	   c1.add(B4);

	   B1.addActionListener(this);
	   B2.addActionListener(this);
	   B3.addActionListener(this);
	   B4.addActionListener(this);
	 }


	 public void actionPerformed(ActionEvent e1)
	  {
	  String str=e1.getActionCommand();

		if(str.equals("ADMIN"))
	  	{
	   	  Login1 a1=new Login1();
	      a1.setSize(500,500);
	      a1.setVisible(true);
	    }
	       else if(str.equals("STUDENT"))
	       {
	           	  Login1 a1=new Login1();
	              a1.setSize(500,500);
	              a1.setVisible(true);
	      }

	       else if(str.equals("LIBRARIAN"))
	       {
			   Login1 a1=new Login1();
			   a1.setSize(500,500);
			   a1.setVisible(true);
	   		}

	      if(str.equals("EXIT"))
	      {
	        this.dispose();

		  }
}

class Login1 extends JFrame implements ActionListener
{
 JLabel l1,l2;
 JTextField user;
 JPasswordField pass;
 JButton b1,b2;
 Container c;
  Login1()
  {
   c=this.getContentPane();
   c.setBackground(Color.pink);
   c.setLayout(null);

   Font f=new Font("Arial",Font.BOLD,20);

   l1=new JLabel("USER NAME:");
   l1.setBounds(50,100,150,30);
   l1.setBackground(Color.cyan);
   l1.setForeground(Color.black);
   l1.setFont(f);

   l2=new JLabel("PASSWORD:");
   l2.setBounds(50,200,200,30);
   l2.setBackground(Color.cyan);
   l2.setForeground(Color.black);
   l2.setFont(f);

   user=new JTextField(10);
   pass=new JPasswordField(10);

   user.setBounds(200,100,120,30);
   user.setFont(f);
   pass.setBounds(200,200,120,30);
   pass.setFont(f);

   b1=new JButton("LOGIN");
   b1.setBounds(100,300,100,30);
   b1.setFont(f);

   b2=new JButton("EXIT");
   b2.setBounds(250,300,100,30);
   b2.setFont(f);

   c.add(b1);
   c.add(b2);
   c.add(l1);
   c.add(l2);
   c.add(user);
   c.add(pass);
   b1.addActionListener(this);
   b2.addActionListener(this);
 }


 public void actionPerformed(ActionEvent e)
  {
  String str=e.getActionCommand();
  if(str.equals("LOGIN"))
  {
    String uid,pass1;
    uid=user.getText();
    pass1=pass.getText();
    if(uid.equals("admin") && pass1.equals("neeraj"))
     {
	  JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFULLY");
     }
     else if(uid.equals("student") && pass1.equals("neeraj"))
       {

        JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFULLY");
       }
       else if(uid.equals("librarian") && pass1.equals("neeraj"))
       {
		 JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFULLY");
	   }
	   else
       JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD!!!~");
     }

      if(str.equals("EXIT"))
      {
        this.dispose();
      }
  }
  }

}


class Login
{
   public static void main(String args[])
  {
    LoginButton btn=new LoginButton();
    btn.setTitle("LIBRARY MANAGEMENT SYSTEM");
    btn.setLocation(230,130);
    btn.setSize(500,400);
	btn.setVisible(true);
	btn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
