import java.awt.event.* ;     
import javax.swing.* ;      
import java.awt.* ;         
import java.sql.*;         
       
	public class MainMenu extends JFrame implements ActionListener {
	    	JButton but1, but2, but3, but4, but5, but6,but7,but8,but9 ;
                 JLabel labb,label,label2,label3,label4,label4a,label5,label6,label6a,label7;
                JTextArea textarea;
                JPasswordField pwordfield;
                int pw,intt;
		
		 String url="jdbc:odbc:abc";
       		private String str1;
       		Container c;
              
	    	public MainMenu() {
              		super("ATM");
			
              	}
                
       		public void Main(){
			
                      c = getContentPane() ;
                      c.setLayout(null) ;
			c.setBackground(Color.cyan);
		
		        but1 = new JButton(">>>") ;
		        but1.setPreferredSize( new Dimension(100,30) ) ;
		        but1.setSize( but1.getPreferredSize() ) ;
		        but1.setLocation(50,50) ;
		        but1.addActionListener(this) ;
			but1.setBackground(Color.magenta);
		        c.add(but1) ;

                      but2 = new JButton(">>>") ;
                      but2.setPreferredSize( new Dimension(100,30) ) ;
                      but2.setSize( but2.getPreferredSize() ) ;
                      but2.setLocation(50,100) ;
                      but2.addActionListener(this) ;
			but2.setBackground(Color.magenta);
                      c.add(but2) ;

              		but3=new JButton(">>>");
              		but3.setPreferredSize(new Dimension(100,30));
              		but3.setSize(but3.getPreferredSize());
              		but3.addActionListener(this);
             	 	but3.setLocation(50,150);
			but3.setBackground(Color.magenta);
              		c.add(but3);

                      but4 = new JButton("<<<");
                      but4.setPreferredSize(new Dimension(100,30));
                      but4.setSize(but4.getPreferredSize());
                      but4.addActionListener(this);
                      but4.setLocation(375,50);
			but4.setBackground(Color.magenta);
                      c.add(but4);

              		but5 = new JButton("<<<");
              		but5.setPreferredSize(new Dimension(100,30));
              		but5.setSize(but5.getPreferredSize());
              		but5.setLocation(375,100);
              		but5.addActionListener(this);
			but5.setBackground(Color.magenta);
              		c.add(but5);

                      but6 = new JButton("<<<");
                      but6.setPreferredSize(new Dimension(100,30));
                      but6.setSize(but6.getPreferredSize());
                      but6.setLocation(375,150);
                      but6.addActionListener(this);
			but6.setBackground(Color.magenta);
                      but6.addActionListener(new ActionListener(){
                      
                      	public void actionPerformed(ActionEvent event){
                          if(event.getSource()==but6){
                          	try{
                                	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                    }catch(ClassNotFoundException a){
                                    	JOptionPane.showMessageDialog(
			null, url,"CLASS NOT FOUND EXCEPTION !!!",JOptionPane.INFORMATION_MESSAGE);
                                    }
                          }
                        }


                      });
                      c.add(but6);

			Icon icon = new ImageIcon("cancel.PNG");
			
   			  but7 = new JButton(icon);
              		
   			  but7 = new JButton("Cancel");
              		but7.setPreferredSize(new Dimension(100,30));
              		but7.setSize(but7.getPreferredSize());
              		but7.setLocation(200,212);
              		but7.addActionListener(this);
			
              		c.add(but7);

                      label=new JLabel("CASH WITHDRAW");
                      label.setPreferredSize(new Dimension(75,50));
                      label.setSize(label.getPreferredSize());
                      label.setLocation(160,40);
                      label.setToolTipText("to draw money,please click on the left button");
                      c.add(label);

              		label2 = new JLabel("CHECK BALANCE");
              		label2.setPreferredSize(new Dimension(85,50));
                        label2.setSize(label2.getPreferredSize());
              		label2.setLocation(280,40);
              		label2.setToolTipText("For information,please click on the left button");
              		c.add(label2);

                      label3 = new JLabel("MONEY TRANSFER");
                      label3.setPreferredSize(new Dimension(85,50));
                      label3.setSize(label3.getPreferredSize());
                      label3.setLocation(160,90);
                      label3.setToolTipText("for referring money,click on the right button");
                      c.add(label3);

              		label4 = new JLabel("CHANGE PASSWORD ");
              		label4.setPreferredSize(new Dimension(85,50));
              		label4.setSize(label4.getPreferredSize());
              		label4.setLocation(160,132);
              		label4.setToolTipText(
		"For password,dept operations,please click on the left button");
              		c.add(label4);

              		label4a = new JLabel("TRANSACTIONS");
              		label4a.setPreferredSize(new Dimension(100,50));
                        	label4a.setSize(label4a.getPreferredSize());
              		label4a.setLocation(160,148);
              		c.add(label4a);

                      label5 = new JLabel("  INVESTMENT");
                      label5.setPreferredSize(new Dimension(95,50));
                      label5.setSize(label5.getPreferredSize());
                      label5.setLocation(280,90);
                      label5.setToolTipText(
		"To buy fund,bond etc.,please click on the right button");
                      c.add(label5);

              		label6 = new JLabel("  STANDARD");
              		label6.setPreferredSize(new Dimension(75,50));
              		label6.setSize(label6.getPreferredSize());
              		label6.setLocation(280,132);
              		label6.setToolTipText("To get 10$ rapidly,please click");
              		c.add(label6);

              		label6a = new JLabel("  CASH");
              		label6a.setPreferredSize(new Dimension(75,50));
              		label6a.setSize(label6a.getPreferredSize());
              		label6a.setLocation(280,147);
              		label6a.setToolTipText("To get 10$ rapidly please click");
              		c.add(label6a);

                      setSize(500,410) ;
                      show();
	        }
              
                public void actionPerformed( ActionEvent event ){
                	if( event.getSource()==but7 )
                        	System.exit(0) ;
                        else if( event.getSource() == but1 ){
                        	new Cash();this.hide();}
                     	else if(event.getSource()== but2 ){
                          	new Transfer();this.hide();}
                     	else if(event.getSource()==but3){
                          	new CardTransactions();this.hide();}
                     	else if(event.getSource()==but4 ){
                          	new Information();this.hide();}
                     	else if(event.getSource()==but6){
                          	new StandardCash();this.hide();}
                        else if(event.getSource()==but9)
                        	System.exit(0);
                     	else if(event.getSource()==but8){
                               
                          	try{
                                	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                            }catch(ClassNotFoundException a){
                                    	JOptionPane.showMessageDialog(
			null, url,"CLASS NOT FOUND EXCEPTION !!!",
			JOptionPane.INFORMATION_MESSAGE);
                                    }

                          	try{
                              		String string = new String(pwordfield.getPassword());
					intt=Integer.parseInt(string);
                        		String run = "SELECT * FROM abc " +"WHERE password = " +intt;
                        		System.out.println(run + "SQL string executed");
                        		Connection connection = DriverManager.getConnection("jdbc:odbc:abc");
  	                     		Statement stmt = connection.createStatement();
                        		ResultSet result=stmt.executeQuery(run);
                                    while(result.next()){
                        		String name = result.getString(1);
                        		String surname = result.getString(2);
                        		int amount = result.getInt(3);
                        		int password = result.getInt(4);
                        		pw=password;

                                    }
                        		connection.close();

                                    }catch(SQLException a){
       		  	         	JOptionPane.showMessageDialog(
				null,url,"SQL EXCEPTION AT SELECT OPERATION",
				JOptionPane.INFORMATION_MESSAGE);
	                }               this.hide();
                    
                           if(pw==intt){MainMenu s=new MainMenu();s.Main();}
                   	   else if(pw!=intt){
                        	JOptionPane.showMessageDialog(
		null,"Invalid Password,Please try again",
		"EXCEPTION",JOptionPane.ERROR_MESSAGE);
                                MainMenu s=new MainMenu();s.Password();
                           }
                        }

               	}
               	public static void main(String args[]){
               		 MainMenu s=new MainMenu();
                         s.Password();
               	}
               	public void Password(){
                         c = getContentPane() ;
                         c.setLayout(new FlowLayout()) ;
                         c.setBackground(Color.lightGray);

               		 pwordfield=new JPasswordField(17);
                         c.add(pwordfield);

                         but8=new JButton("OK");
                         but8.setPreferredSize(new Dimension(90,25));
                         but8.setSize(but8.getPreferredSize());
                         but8.addActionListener(this);
                         c.add(but8);

                         but9=new JButton("CANCEL");
                         but9.setPreferredSize(new Dimension(90,25));
                         but9.setSize(but9.getPreferredSize());
                         but9.addActionListener(this);
                         c.add(but9);
                         
                         String sttr="              W E L C O M E!\n"+
                         	     "    Please enter your password:\n"+
                                     "----------------------------------------------\n";
                         JLabel jl=new JLabel(new ImageIcon("cancel.jpg"));
			  c.add(jl);  
                      
                        
                         textarea = new JTextArea(sttr,10,17);
                         c.add(new JScrollPane(textarea));
                         textarea.setBackground(Color.lightGray);
                         textarea.setEditable(false);
                         setSize(250,300) ;
                         show();
               }
       	}