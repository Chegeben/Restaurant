package cyber;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import javax.swing.table.DefaultTableModel;



public class CyberManagement {
	
   

	private JFrame frame = new JFrame();
	CardLayout cR = new CardLayout();
	CardLayout cR2 = new CardLayout();
	CardLayout cR3 = new CardLayout();
	private JPanel MainPanel = new JPanel();
	private JPanel credentials = new JPanel();
	private JRadioButton login = new JRadioButton("Login");
	private JRadioButton signup = new JRadioButton("Signin");
	ButtonGroup logsig = new ButtonGroup();
	private JLabel recently = new JLabel("Recent user......");
	private JTextField recentUser = new JTextField();
	
	private JPanel GetIn = new JPanel();
	private JPanel loginPage = new JPanel();
	private JPanel signPage = new JPanel();
	private JPanel loginsignup = new JPanel();
	
	private JPanel previousWork = new JPanel();
	
	private JTextPane image = new JTextPane();
	private JTextField imageText = new JTextField();
	private JButton imageUpload = new JButton("Upload");
	JFileChooser chooser = new JFileChooser();
	 File f ;
	private JLabel signUP = new JLabel("Signup Page...");
	private JLabel signUPMessage = new JLabel("Signup Page...");
	private JLabel fName = new JLabel("First Name");
	private JLabel sName = new JLabel("Second Name");
	private JLabel username = new JLabel("Username");
	private JLabel userid = new JLabel("UserID");
	private JLabel email = new JLabel("Email");
	private JLabel password = new JLabel("Password");
	private JLabel reenter = new JLabel("Re-Enter");
	
	
	private JLabel emailLogin = new JLabel("Email");
	private JLabel passwordLogin = new JLabel("Password");
	
	private JTextField FirstName = new JTextField();
	private JTextField SecondName = new JTextField();
	private JTextField Username = new JTextField();
	private JTextField user = new JTextField();
	private JTextField Email = new JTextField();
	private JPasswordField fPassword = new JPasswordField();
	private JPasswordField fPasswordReenter = new JPasswordField();
	
	private JButton submitCreditials = new JButton("Submit");
	private JButton clearCreditials = new JButton("Clear");
	
	private JTextField EmailLogin = new JTextField();
	private JPasswordField PasswordLoginEntry = new JPasswordField();
	private JLabel LoginPageWelcome = new JLabel("Login page...");
	
	private JPanel MainBar = new JPanel();
	private JPanel ChoiceBar = new JPanel();
	private JPanel ScreenBar = new JPanel();
	private JPanel ExtraBar = new JPanel();
	
	private JButton staffBtn = new JButton("STAFF");
	private JButton customerBtn = new JButton("CUSTOMER");
	private JButton orderBtn = new JButton("ORDER");
	private JButton bookingBtn = new JButton("BOOKING");
	private JButton roomsBtn = new JButton("ROOMS");
	private JButton paymentsBtn = new JButton("PAYMENTS");
	private JButton servicesBtn = new JButton("SERVICES");
	private JButton healthBtn = new JButton("HEALTH");
	private JButton programsBtn = new JButton("PROGRAMS");
	private JButton reportsBtn = new JButton("REPORTS/MESSAGES");
	
	
	private JRadioButton MaxScreen= new JRadioButton("L");
	private JRadioButton MinScreen = new JRadioButton("S");
	ButtonGroup MainScreen = new ButtonGroup();
	
	
	
	
	// staff
	private JPanel Staff = new JPanel();
	private JPanel StaffChoice = new JPanel();
	private JPanel StaffActivities = new JPanel();
	
	private JButton employee = new JButton("Employee");
	private JButton yourPage = new JButton("Your Page");
	private JButton fired = new JButton("Fired");
	private JButton retired = new JButton("Retired");
	private JButton outOfContract = new JButton("Out Of Contract");
	private JButton renewedContract = new JButton("Renewal");
	private JLabel staffActivity = new JLabel("Activities");
	private JLabel staffActivity1 = new JLabel("Activities");
	private JLabel staffActivity2 = new JLabel("Activities");
	private JLabel staffActivity3 = new JLabel("Activities");
	private JLabel staffActivity4 = new JLabel("Activities");
	private JLabel staffActivity5 = new JLabel("Activities");
	private JLabel staffActivity6 = new JLabel("Activities");
	private JLabel staffActivity7 = new JLabel("Activities");
	private JLabel staffActivity8 = new JLabel("Activities");
	//private JButton  = new JButton("SERVICES");
	
	
	// Customer
	
	private JPanel Customer = new JPanel();
	private JPanel CustomerChoice = new JPanel();
	private JPanel CustomerActivities = new JPanel();
	
	private JButton CustomerNew = new JButton("New");
	private JButton CustomerRecords = new JButton("Records");
	private JButton CustomerMatching = new JButton("Matching");
	
	
	
	private JPanel CustomerNewInfo = new JPanel();
	private JPanel CustomerNewInfoCredentials = new JPanel();
	private JPanel CustomerRecordsInfo = new JPanel();
	private JPanel CustomerMatchingInfo = new JPanel();
	
	private JButton CustomerNewInfoBtn = new JButton("Entries...");
	private JButton CustomerRecordsInfoBtn = new JButton("Already");
	private JButton CustomerMatchingInfoBtn = new JButton("MoreThanTwice");
	
	private JButton Customeradd = new JButton("ADD");
	private JButton CustomerClear = new JButton("CLEAR");
	
	private JLabel NameCustomer = new JLabel("Full name");
	private JLabel check_inCustomer = new JLabel("check_in");
	private JLabel check_outCustomer = new JLabel("check_out");
	private JLabel locationCustomer = new JLabel("Location");
	private JLabel phoneCustomer = new JLabel("phone");
	private JLabel emailCustomer = new JLabel("Email");
	private JLabel GenderCustomer = new JLabel("Gender");
	
	private JTextField NameCustomerText  = new JTextField();
	private JTextField locationCustomerText = new JTextField();
	private JTextField phoneCustomerText = new JTextField();
	private JTextField emailCustomerText = new JTextField();
	private JTextField GenderCustomerText = new JTextField();
	
	private JRadioButton jRGenderM = new JRadioButton("Male");
	private JRadioButton jRGenderF = new JRadioButton("Female");
	private JRadioButton jRGenderO = new JRadioButton("Others");
	
	 ButtonGroup bGCustomer = new ButtonGroup();
	
	private com.toedter.calendar.JDateChooser date_checkInText = new com.toedter.calendar.JDateChooser () ;
    private com.toedter.calendar.JDateChooser date_checkOutText = new com.toedter.calendar.JDateChooser () ;
	
	
    private JPanel CustomerRecordsPaneMain = new JPanel();
    private JPanel CustomerRecordsPaneMainTable = new JPanel();
    private JPanel CustomerRecordsPaneMainObjects = new JPanel();
	DefaultTableModel modelCustomer = new DefaultTableModel();
	JTable tableCustomerRecords = new JTable();
	JScrollPane jPtableCustomerRecords = new JScrollPane();
	
	String [] columnCustomer = {
			"Number","Full Name","Check In", "Check Out", "Location","Phone", "Email"
	};
	
	CardLayout cRCustomer = new CardLayout();
	
	
	
	//
	
	//
	
	private JPanel Order = new JPanel();
	private JPanel OrderChoice = new JPanel();
	private JPanel OrderActivities = new JPanel();
	
	private JButton Orderorder = new JButton("Order");
	private JButton Orderorders = new JButton("Orders");
	private JButton Ordercancel = new JButton("Cancel");
	private JButton Ordercancelled = new JButton("Cancelled");
	private JButton Orderdelivered = new JButton("Delivered");
	
	//
	
	//data for the booking Panel
	
	
		
		
		CardLayout crBooking = new CardLayout();
		
		
		
	private JPanel Booking = new JPanel();
	private JPanel BookingChoice = new JPanel();
	private JPanel BookingActivities = new JPanel();
	private JPanel MainBooking = new JPanel();
	private JPanel BookingDetails = new JPanel();
	private JPanel BookingAvailable = new JPanel();
	private JPanel BookingBooked = new JPanel();
	private JPanel BookingStatistics = new JPanel();
	private JPanel BookingSoon = new JPanel();
	
	private JButton BookingbookRoom = new JButton("Booking");
	private JButton Bookingavailable = new JButton("Available Bookings");
	private JButton Bookingbooked = new JButton("Booked");
	private JButton Bookingstatistics = new JButton("Statistics");
	private JButton Bookingexiting = new JButton("Soon");
	
	//data for the booking Panel: Closing
	
	
	//
	
	private JPanel Rooms = new JPanel();
	private JPanel RoomsChoice = new JPanel();
	private JPanel RoomsActivities = new JPanel();
	private JPanel RoomCategories = new JPanel();
	private JPanel RoomCategories1 = new JPanel();
	private JPanel RoomCategories2 = new JPanel();
	
	private JButton Roomsadd = new JButton("Rooms");
	private JButton Roomsavailable = new JButton("Available Room");
	
	//
	
	
	
	//

	
	private JPanel Payment = new JPanel();
	private JPanel PaymentChoice = new JPanel();
	private JPanel PaymentActivities = new JPanel();
	
	private JButton Paymentpay = new JButton("Pay");
	private JButton Paymentpayments = new JButton("Payments");
	private JButton Paymentdebts = new JButton("Debt");
	private JButton Paymentpendings = new JButton("Pending");
	private JButton Paymentcancelled = new JButton("Cancelled");
	
	//
	

	
	
	//
	
	private JPanel Heath = new JPanel();
	private JPanel HeathChoice = new JPanel();
	private JPanel HeathActivities = new JPanel();
	
	private JButton Healthguidelines = new JButton("Guideline");
	private JButton Heathwaste = new JButton("Dustbin");
	private JButton Heathachievement = new JButton("Achievement");
	
	//
	
	
	
	//
	
	private JPanel Programs = new JPanel();
	private JPanel ProgramsChoice = new JPanel();
	private JPanel ProgramsActivities = new JPanel();
	
	private JButton ProgramDay = new JButton("Day Activities");
	private JButton ProgramsUpdate = new JButton("Updates");
	private JButton ProgramsMeeting = new JButton("Meetings");
	private JButton ProgramsCancelled = new JButton("Cancelled");
	
	
	//
	
	
	
	//
	
	private JPanel  Reports  = new JPanel();
	private JPanel  ReportsChoice = new JPanel();
	private JPanel  ReportsActivities = new JPanel();
	
	private JButton ReportsSubmission = new JButton("Submission");
	private JButton ReportsOutcomes = new JButton("Outcomes");
	private JButton ReportsRequirements = new JButton("Requirements");
	
	
	//
	
	
	//
	private JPanel OwnerPage = new JPanel();
	private JPanel PresidentPage = new JPanel();
	private JPanel VicePresidentPage  = new JPanel();
	private JPanel SecretaryPage  = new JPanel();
	private JPanel TreasurePage = new JPanel();
	private JPanel HKitchenPage  = new JPanel();
	private JPanel HHygienePage = new JPanel();
	private JPanel HStorePage  = new JPanel();
	private JPanel CashierPage  = new JPanel();
	private JPanel OrderPage  = new JPanel();
	
	
	private JLabel userID = new JLabel("UserID");
	private JLabel passwordG = new JLabel("Password");
	private JLabel numPlate = new JLabel("Number Plate");
	private JLabel dateG = new JLabel("Date of entry");
	private JLabel timeG = new JLabel("Time of entry");
	private JLabel NoGuestsG = new JLabel("Number of guests");
	private JLabel carCardG = new JLabel("Car card");
	
	private JTextField userIDT = new JTextField();
	private JPasswordField passwordGT = new JPasswordField();
	private JTextField numPlateT = new JTextField();
	private com.toedter.calendar.JDateChooser date_checkIn = new com.toedter.calendar.JDateChooser () ;
    private com.toedter.calendar.JDateChooser date_checkOut = new com.toedter.calendar.JDateChooser () ;
	private JTextField NoGuestsT = new JTextField();
	private JTextField  carCardT = new JTextField();
	private JButton submitG = new JButton("Submit");
	private JButton clearG = new JButton("Clear");
	private JButton loginBtn = new JButton("login");
	private JButton Clearlogin = new JButton("CLEAR");
	
	
	
	
	
	
	
	//
	
	//STAFF
	//
	
	
	
	private JPanel employeeMainBar = new JPanel();
	private JPanel searchBar = new JPanel();
	private JTextField  searchBarCurrent = new JTextField();
	private JTextField  searchBarUser = new JTextField();
	
	private JPanel employeeBar = new JPanel();
	
	
	private JPanel employeeDetailPane = new JPanel();
	private JTextArea employeeDetail = new JTextArea();
	private JPanel employeePositionPane = new JPanel();
	private JTextArea employeePosition = new JTextArea();
	private JPanel employeeActivitiesPane = new JPanel();
	private JPanel employeeActivitiesPaneAssigned = new JPanel();
	private JPanel employeeActivitiesPaneAssign = new JPanel();
	DefaultTableModel employeemodelAssigned = new DefaultTableModel();
	DefaultTableModel employeemodel = new DefaultTableModel();
	
	//JScrollPane jPEmployee = new JScrollPane();
	
	private JButton enteringButton = new JButton("");
	
	
	String [] columnEmployee = {
			"Firstname","Secondname", "Username", "User ID", "Email"
	};
	
	
	DefaultTableModel modelEmployee = new DefaultTableModel();
	JTable tableEmployee = new JTable();
	JScrollPane jPtableEmployee = new JScrollPane();
	
	//
	
	
	
	
	// EmployeeTable
	
	
	
	private JLabel ASSIGN = new JLabel("Assigned actvivities..");
	private JTextField ASSIGNNames  = new JTextField();
	private JTextField ASSIGNNames2   = new JTextField();
	private JLabel ASSIGNJobID = new JLabel("Job ID");
	private JTextField JobID   = new JTextField();
	
	private JTextField ASSIGNUserID = new JTextField();
	private JTextPane ASSIGNImage = new JTextPane();
	private JTextArea  ASSIGNWork = new JTextArea(TA_ROWS,TA_COLS);
	private JButton ASSIGNAdd = new JButton("ADD");
	private JButton ASSIGNClear = new JButton("CLEAR");
	
	private com.toedter.calendar.JDateChooser JobIDDate = new com.toedter.calendar.JDateChooser () ;
	
	
	//
	
	
	
	//EMPLOYEE ASSIGNMENTS SHOWN
	
	private JTextField DateOfWork = new JTextField();
	private JTextArea WorkShow = new JTextArea();
	JScrollPane jPWorkShow = new JScrollPane();
	
	
	
	//
	
	
	private JButton ASSIGNFIRE = new JButton("FIRE");
	private JButton ASSIGNRETIRE = new JButton("RETIRE");
	private JButton ASSIGNCONTRACT = new JButton("RENEW CONTRACT");
	
	private JTextField ASSIGNFNM = new JTextField();
	private JTextField ASSIGNSNM = new JTextField();
	private JTextField ASSIGNUSER = new JTextField();
	private JTextField ASSIGNUSERID = new JTextField();
	private JTextField ASSIGNEMAIL = new JTextField();
	
	
	
	
	PreparedStatement pT;
	Statement pTT;
	ResultSet rT;
	Connection conn;
	
	
	
	String UserIDsearchBarCurrent;
	
	
	
	
	
	private void displayToRoomTextField(int row)
    {
       
	
        ASSIGNNames.setText(tableEmployee.getModel().getValueAt(row, 0)+"");
        ASSIGNUserID.setText(tableEmployee.getModel().getValueAt(row, 1)+"");
        
        
        ASSIGNImage.setText(tableEmployee.getModel().getValueAt(row, 3)+"");
        searchBarCurrent.setText(tableEmployee.getModel().getValueAt(row, 3)+""); 
        
        ASSIGNFNM.setText(tableEmployee.getModel().getValueAt(row, 0)+""); 
        ASSIGNSNM.setText(tableEmployee.getModel().getValueAt(row, 1)+"");
        ASSIGNUSER.setText(tableEmployee.getModel().getValueAt(row, 2)+"");
        ASSIGNUSERID.setText(tableEmployee.getModel().getValueAt(row, 3)+"");
        ASSIGNEMAIL.setText(tableEmployee.getModel().getValueAt(row, 4)+"");
        
        
        
        
    }
	
	private JTextField ASSIGNUserIDWork = new JTextField();
	String numberWorks;
	String numberWorksUser;
	private void displayWorkOfSelectedID(int rowWork) {
		
		searchBarUser.setText(tableEmployee.getModel().getValueAt(rowWork, 3)+"");
	}
	
	private static final int TA_ROWS = 3;
	private static final int TA_COLS = 5;
	
	DefaultTableModel modelEmployeeWork = new DefaultTableModel();
	JTable tableEmployeeWork = new JTable();
	JScrollPane jPtableEmployeeWork = new JScrollPane();
	
	private JTextArea jPtableEmployeeWorkContent= new JTextArea();
	
	private JTextArea jPtableEmployeeShowWorkContent= new JTextArea();
	
	
	String [] columnEmployeeWork = {
			"JOB CODE", "TIME OF ASSIGN", "Work"
	};
	
	
	private JButton requeEmployeeWork = new JButton();
	private JLabel   WorkHeading = new JLabel ();
	
	
	private void displayWork(int rowWorkCode)
    {
       
	
		jPtableEmployeeShowWorkContent.setText(tableEmployeeWork .getModel().getValueAt(rowWorkCode, 2)+"");
		
		DateOfWork.setText(tableEmployeeWork .getModel().getValueAt(rowWorkCode, 0)+"");
       
        
        
        
        
    }
	
	
	private JPanel EmployeeFIRE = new JPanel();
	private JPanel EmployeeFIREDTABLE = new JPanel();
	private JPanel EmployeeFIREREASON = new JPanel();
	private JPanel STAFFMAINPANE = new JPanel();
	
	String [] columnEmployeeFIRE = {
			"Firstname","Secondname", "Username", "User ID", "Email"
	};
	DefaultTableModel modelFIRE = new DefaultTableModel();
	JTable tableFIRE = new JTable();
	JScrollPane jPtableFIRE = new JScrollPane();
	private JTextArea Reasonfiring = new JTextArea();
	private JButton FIRE = new JButton("FIRE");
	private JTextField  FireUserID = new JTextField();
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Click");
	//private JMenuItem menuItem = new JMenu("New");
	private JMenuItem menuItem = new JMenuItem("New");
	private JMenuItem menuItemFind = new JMenuItem("Find");
	private JMenuItem menuItemReview = new JMenuItem("Peview");
	
	private JTextField  FireUserIDGet = new JTextField();
	
	private void showFired(int rowFire) {
		
		FireUserIDGet.setText(tableFIRE .getModel().getValueAt(rowFire, 3)+"");
		FireUserID.setText(tableFIRE .getModel().getValueAt(rowFire, 3)+""); 
	}
	
	
	
	private JPanel CustomerPanel = new JPanel();
	private JPanel CustomerNewPanel = new JPanel();
	private JPanel CustomerRecordsPanel = new JPanel();
	private JPanel CustomerMatchingPanel = new JPanel();
	
	
	
	
	
	
	private void fire() {
		 String fnme2 = "";
	      String snme2 = "" ;
	  	  String usnme2 = "";
	   	  String uside2  = "";
	  	  String eme2  = "";
	  	  String imge2  = "";
	  
	      
	      try {
	      	
	      	
	      	
	      	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
	      	String query2 = "SELECT * FROM fired"; 
	      	
	      	pT = conn.prepareStatement(query2);
	          rT = pT.executeQuery();
	          
	          
	          while (rT.next()) {
	          	
	          	fnme2 = rT.getString("fname");
	          	snme2  = rT.getString("sname");
	          	usnme2 = rT.getString("username");
	          	uside2 = rT.getString("userID");
	          	eme2  = rT.getString("email");
	          	//imge2  = rT.getString("image");
	          	 
	          	modelFIRE.addRow(new Object[] {fnme2 , snme2, usnme2, uside2, eme2 });
	          	 
	          	
	          	
	          }
	          
	      	
	      }catch(Exception ex) {
	      	
	      	
	      	
	      }
	      
	}
	
	
	
	//Long difference_date =  startDay.getTime() - endDay.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	
	Date startDay = new Date();
	Date endDay = new Date();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CyberManagement window = new CyberManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	

	
	public CyberManagement() {
		initialize();
		
		date_checkIn.setDate(new Date());
		JobIDDate.setDate(new Date());
		
		
	}
	
	
      public void employeeData() {
		
		
		String fnme = "";
        String snme = "" ;
    	String usnme = "";
    	String uside  = "";
    	String eme  = "";
    	String imge  = "";
    	
    	
		 try {
	        	
			 
		    
	        	
	        	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
	        	String query2 = "SELECT * FROM  signin"; 
	        	
	        	pT = conn.prepareStatement(query2);
	            rT = pT.executeQuery();
	            
	            
	            while (rT.next()) {
	            	
	            	fnme = rT.getString("fname");
	            	snme  = rT.getString("sname");
	            	usnme = rT.getString("username");
	            	uside = rT.getString("userID");
	            	eme  = rT.getString("email");
	            	imge  = rT.getString("image");
	            	 
	            	modelEmployee.addRow(new Object[] {fnme , snme,usnme, uside, eme ,imge});
	            	 
	            	
	            	
	            }
	            
	        	
	        }catch(Exception ex) {
	        	
	        	
	        	
	        }
	}

      
      public void employeeWork() {
    	  
    	  
    	  
    	  String DateWork = "";
    	  String workGiven = "";
    	  numberWorksUser =  searchBarUser.getText() ;
    	  String jobCodeW = "";
    	  int c ;
    	  
    	  try {
			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
			String query = " SELECT * FROM tasks where userID = '"+ numberWorksUser + "' " ;
			pT = conn.prepareStatement(query);
            rT = pT.executeQuery();
            while (rT.next()) {
            	
            	DateWork = rT.getString("work");
            	 workGiven  = rT.getString("date");
            	 numberWorks = rT.getString("id");
            	 jobCodeW = rT.getString("jobCode");
            	 
            	// c = rT.getInt("count(*)");
            	 
            	 
            	 modelEmployeeWork.addRow(new Object[] { jobCodeW, workGiven, DateWork 
            			 
            	 });
            	 
            	 
            }
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	  
    	  
    	  
      }
	
      private void fireEmployee() {
    	  
    	  
    	  
          
          String fnme2 = "";
          String snme2 = "" ;
      	  String usnme2 = "";
       	  String uside2  = "";
      	  String eme2  = "";
      	  String imge2  = "";
      
          
          try {
          	
          	
          	
          	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
          	String query2 = "SELECT * FROM fired"; 
          	
          	pT = conn.prepareStatement(query2);
              rT = pT.executeQuery();
              
              
              while (rT.next()) {
              	
              	fnme2 = rT.getString("fname");
              	snme2  = rT.getString("sname");
              	usnme2 = rT.getString("username");
              	uside2 = rT.getString("userID");
              	eme2  = rT.getString("email");
              	//imge2  = rT.getString("image");
              	 
              	modelFIRE.addRow(new Object[] {fnme2 , snme2, usnme2, uside2, eme2 });
              	 
              	
              	
              }
              
          	
          }catch(Exception ex) {
          	
          	
          	
          }
          
    	  
      }
      
      
      private void LoadFiredEmployee() {
    	  
    	  
    	  String USER = FireUserIDGet.getText();
			String REASON = Reasonfiring.getText();
			
			
			if(REASON.equals("")) {
				JOptionPane.showConfirmDialog(null, "Kindly add reason as to why you are firing: ",  FireUserIDGet.getText() ,0 );
			}
			try {
				conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
				String query = "INSERT INTO `restaurant`.`firedreason`(`userID`,`reason`) VALUES(?,?)";
				pT = conn.prepareStatement(query);
				pT.setString(1, USER);
				pT.setString(2, REASON);
				pT.execute();
				
				JOptionPane.showConfirmDialog(null, "OFFICIALLY OUT OF THE COMPANY: ",  USER ,0 );
			} catch (SQLException e1) {
				
				JOptionPane.showConfirmDialog(null, "NOT OUT OF THE COMPANY: ", USER ,0 );
				e1.printStackTrace();
			}
			
		
  	
      };
      
      private void employeeFiringNow() {
  		
 		 try {
 		    	
 		    	String USERIDFIRE =  FireUserIDGet.getText();
 				conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
 				String queryD = " DELETE FROM `restaurant`.`signin` WHERE userID = '"+ USERIDFIRE + "'";
 				
 				pT = conn.prepareStatement(queryD);
 				 rT = pT.executeQuery();
 			} catch (SQLException e1) {
 				
 				e1.printStackTrace();
 			}
 		    
 		    
 	};
 	
 	
 	private void customerRecordsWindow() {
 		 String fnmCustomer = "";
	        String chcinCustomer = "" ;
	    	String chcoutCustomer = "";
	    	String locCustomer  = "";
	    	String NumberCustomer  = "";
	    	String phnCustomer  = "";
	    	String emaCustomer  = "";
	    	
	    	
			 try {
		        	
				 
			    
		        	
		        	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
		        	String query10 = "SELECT * FROM restaurant.customer"; 
		        	
		        	pT = conn.prepareStatement(query10);
		            rT = pT.executeQuery();
		            
		            
		            while (rT.next()) {
		            	 NumberCustomer  = rT.getString("idcustomer");
		            	fnmCustomer = rT.getString("name");
		            	chcinCustomer  = rT.getString("checkIN");
		            	 chcoutCustomer = rT.getString("checkOUT");
		            	 locCustomer = rT.getString("location");
		            	
		            	 phnCustomer  = rT.getString("phone");
		            	 emaCustomer  = rT.getString("email");
		            	 
		            	modelCustomer.addRow(new Object[] {NumberCustomer , fnmCustomer,chcinCustomer ,chcoutCustomer, locCustomer ,phnCustomer,emaCustomer});
		            	 
		            	
		            	
		            }
		            
		        	
		        }catch(Exception ex) {
		        	
		        }
		
	;

 	}
 	
      
	private void initialize() {
		
		
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1250, 700);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel = new JPanel();
		frame.add(MainPanel);
		MainPanel.setLayout(cR);
		MainPanel.add(credentials);
		setContentPane(MainPanel);
		
		//MainPanel.add(GetIn);
		GetIn.add(signPage);
		GetIn.add(loginPage);
		
		
		
		 imageUpload.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e) {
			
				 
				 imageText.setText("");
				 image.setText("");
			 
	         chooser = new JFileChooser();
	        chooser.showOpenDialog(null);
	         f = chooser.getSelectedFile();
	        String filename = f.getAbsolutePath();
	        imageText.setText(filename);
	        try {
	            ImageIcon ii=new ImageIcon(scaleImage (200, 200, ImageIO.read(new File(f.getAbsolutePath()))));//get the image from file chooser and scale it to match JLabel size
	             image.insertIcon(ii);
	             
	             
	             
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }

			private BufferedImage scaleImage(int w , int h, BufferedImage img) {
				
				     
				     BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
			        Graphics2D g2d = (Graphics2D) bi.createGraphics();
			        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
			        g2d.drawImage(img, 0, 0, w, h, null);
			        g2d.dispose();
			        g2d.rotate(3);
			        return bi;
				
			}});

		 image.setAlignmentY(SwingConstants.TOP);
		 image.setFocusable(true);
		 image.setAlignmentY(2);
		 signUP.setPreferredSize(new Dimension(500,30));
		 signUPMessage.setPreferredSize(new Dimension(500,30));
		 signUPMessage.setBackground(Color.BLACK);
		image.setPreferredSize(new Dimension(200,200));
		imageText.setPreferredSize(new Dimension(300,20));
		imageText.setEditable(false);
		imageUpload.setPreferredSize(new Dimension(100,50));

		image.setText("Upload Your Image Here");
		image.setBackground(Color.RED);
		imageText.setBackground(Color.LIGHT_GRAY);
		imageUpload.setBackground(Color.MAGENTA);
		FirstName.setPreferredSize(new Dimension(300,30));
		SecondName.setPreferredSize(new Dimension(300,30));
		Username.setPreferredSize(new Dimension(300,30));
		user.setPreferredSize(new Dimension(300,30));
		Email.setPreferredSize(new Dimension(300,30));
		fPassword.setPreferredSize(new Dimension(300,30));
		fPasswordReenter.setPreferredSize(new Dimension(300,30));
		fName.setPreferredSize(new Dimension(100,30));
		sName.setPreferredSize(new Dimension(100,30));
		username.setPreferredSize(new Dimension(100,30));
		userid.setPreferredSize(new Dimension(100,30));
		email.setPreferredSize(new Dimension(100,30));
		password.setPreferredSize(new Dimension(100,30));
		reenter.setPreferredSize(new Dimension(100,30));
		submitCreditials.setPreferredSize(new Dimension(100,20));
		submitCreditials.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				String img =image.getText();
				
				String fnm = FirstName.getText();
				String snm =SecondName.getText();
				String usnm =Username.getText();
				String usID = user.getText();
				String em = Email.getText();
				String passw = fPassword.getPassword().toString();
				String renterpass = fPasswordReenter.getPassword().toString();
				
				
				String plaintext = "your text here";
				MessageDigest m;
				MessageDigest m2;
				try {
					m = MessageDigest.getInstance("MD5");
					m2 = MessageDigest.getInstance("MD5");
				
				m.reset();
				m.update(passw.getBytes());
				m2.update(renterpass.getBytes());
				byte[] digest = m.digest();
				byte[] digest2 = m2.digest();
				BigInteger bigInt = new BigInteger(1,digest);
				BigInteger bigInt2 = new BigInteger(1,digest2);
				String hashtext = bigInt.toString(16);
				String hashtext2 = bigInt2.toString(16);
				// Now we need to zero pad it if you actually want the full 32 chars.
				while(hashtext.length() < 32 ){
				  hashtext = "0"+hashtext;
				}
				while(hashtext2.length() < 32 ){
					  hashtext2 = "0"+hashtext;
					}
				} catch (NoSuchAlgorithmException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				String query = "INSERT INTO `restaurant`.`signin`(`fname`,`sname`,`username`,`userID`,`email`,`password`,`reneter`,`image`)VALUES(?,?,?,?,?,?,?,?)";
				try {
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					pT= conn.prepareStatement(query);
					
					pT.setString(1, fnm);
					pT.setString(2, snm);
					pT.setString(3, usnm);
					pT.setString(4, usID);
					pT.setString(5, em);
					pT.setString(6, passw);
					pT.setString(7, renterpass);
					pT.setString(8, img);
					pT.execute();
					JOptionPane.showMessageDialog(null, "Employee entered");
					modelEmployee.setRowCount(0);
					employeeData();
					 
					 
					 
				} catch (SQLException e1) {
					
					JOptionPane.showMessageDialog(null, "No entry.. try again");
					e1.printStackTrace();
				}
			    
			    //  employeeDetailPane.add(jPtableEmployee);
				
				
			
				
				credentials.hide();
				loginsignup.setVisible(false);
				MainBar.setPreferredSize(new Dimension(1580,830));
				ChoiceBar.setPreferredSize(new Dimension(200,830));
				ScreenBar.setPreferredSize(new Dimension(1350,830));
				StaffChoice.setPreferredSize(new Dimension(900,80));
				StaffActivities.setPreferredSize(new Dimension(1330,745));
				StaffChoice.setAlignmentX(SwingConstants.CENTER);
				
				CustomerChoice.setPreferredSize(new Dimension(900,80));
				CustomerActivities.setPreferredSize(new Dimension(1330,745));
				
				
				OrderChoice.setPreferredSize(new Dimension(900,80));
				OrderActivities.setPreferredSize(new Dimension(1330,745));
				
				BookingChoice.setPreferredSize(new Dimension(900,80));
				BookingActivities.setPreferredSize(new Dimension(1330,745));
				
				RoomsChoice.setPreferredSize(new Dimension(900,80));
				RoomsActivities.setPreferredSize(new Dimension(1330,745));
				
				PaymentChoice.setPreferredSize(new Dimension(900,80));
				PaymentActivities.setPreferredSize(new Dimension(1330,745));
				
				HeathChoice.setPreferredSize(new Dimension(900,80));
				HeathActivities.setPreferredSize(new Dimension(1330,745));
				
				ProgramsChoice.setPreferredSize(new Dimension(900,80));
				ProgramsActivities.setPreferredSize(new Dimension(1330,745));
				
				ReportsChoice.setPreferredSize(new Dimension(900,80));
				ReportsActivities.setPreferredSize(new Dimension(1330,745));
				
				
				
					
					//employeeBar= new JPanel();
					
				employeeMainBar.setPreferredSize(new Dimension(1330,745));
				
				searchBar.setPreferredSize(new Dimension(1000,50));
				searchBarCurrent.setPreferredSize(new Dimension(400,30));
				searchBarUser.setPreferredSize(new Dimension(400,30));
				employeeBar.setPreferredSize(new Dimension(1320,660));
				employeeDetailPane.setPreferredSize(new Dimension(660,630));
				employeeDetailPane.add(jPtableEmployee);
				jPtableEmployee .setPreferredSize(new Dimension(660,630));
				jPtableEmployee .setBackground(Color.CYAN);
				employeePositionPane.setPreferredSize(new Dimension(330,630));
				employeePosition.setPreferredSize(new Dimension(330,630));
				employeeActivitiesPane.setPreferredSize(new Dimension(630,630));
				employeeActivitiesPaneAssigned.setPreferredSize(new Dimension(310,630));
				employeeActivitiesPaneAssign.setPreferredSize(new Dimension(310,630));
				//jPEmployee.setPreferredSize(new Dimension(1325,660));
			}
			
		});
		
		
		
		 
       
		
		 modelEmployee.setColumnIdentifiers(columnEmployee);
		 tableEmployee.setPreferredSize(new Dimension(800,550));
		 tableEmployee.setBackground(Color.CYAN);
	        
	       
		 tableEmployee.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		 tableEmployee.setFillsViewportHeight(true);
	       
	        
		 
		// 
		 
		    String fnme = "";
	        String snme = "" ;
	    	String usnme = "";
	    	String uside  = "";
	    	String eme  = "";
	    	String imge  = "";
	    
	    	
	        
	        try {
	        	
	        	
	        	
	        	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
	        	String query2 = "SELECT * FROM signin;"; 
	        	
	        	pT = conn.prepareStatement(query2);
	            rT = pT.executeQuery();
	            
	            
	            while (rT.next()) {
	            	
	            	fnme = rT.getString("fname");
	            	snme  = rT.getString("sname");
	            	usnme = rT.getString("username");
	            	uside = rT.getString("userID");
	            	eme  = rT.getString("email");
	            	imge  = rT.getString("image");
	            	 
	            	modelEmployee.addRow(new Object[] {fnme , snme, usnme, uside, eme });
	            	 
	            	
	            	
	            }
	            
	        	
	        }catch(Exception ex) {
	        	
	        	
	        	
	        }
	        
	        tableEmployee.setModel(modelEmployee);
	         jPtableEmployee  = new JScrollPane(tableEmployee);
	        jPtableEmployee .setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        jPtableEmployee.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        jPtableEmployee.setPreferredSize(new Dimension(800,550));
	        
		clearCreditials.setPreferredSize(new Dimension(100,20));
		clearCreditials.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				credentials.show();
			}
			
		});
		FirstName.addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	FirstName.transferFocus();
			        }}});
		SecondName.addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	SecondName.transferFocus();
			        }}});
		
		Username.addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	Username.transferFocus();
			        }}});
		user.addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	user.transferFocus();
			        }}});
		fPassword .addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	fPassword.transferFocus();
			        }}});
		fPasswordReenter.addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	fPasswordReenter.transferFocus();
			        }}});
		
		submitCreditials.addKeyListener(new KeyAdapter() {
			 public void keyReleased(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	submitCreditials.doClick();
			        }}});
		
		signUP.setLayout(new FlowLayout(FlowLayout.CENTER));
		signUP.setHorizontalAlignment(SwingConstants.CENTER);
		signUP.setVerticalAlignment(SwingConstants.CENTER);
		//signUP.setForeground(Color.GREEN);
		
		signPage.add(signUP);
		signPage.add(image);
		signPage.add(imageText);
		signPage.add(imageUpload);
		signPage.add(fName);
		signPage.add(FirstName);
		signPage.add(sName);
		signPage.add(SecondName);
		
		signPage.add(username);
		signPage.add(Username);
		signPage.add(userid);
		signPage.add(user);
		
		signPage.add(email);
		signPage.add(Email);
		signPage.add(password);
		signPage.add(fPassword);
		signPage.add(reenter);
		signPage.add(fPasswordReenter);
		signPage.add(submitCreditials);
		signPage.add(clearCreditials);
		
		signPage.setLayout(new FlowLayout(FlowLayout.LEFT));
		signPage.hide();
		
		
		
		emailLogin.setPreferredSize(new Dimension(100,20));
		passwordLogin.setPreferredSize(new Dimension(100,20));
		EmailLogin.setPreferredSize(new Dimension(300,30));
		PasswordLoginEntry.setPreferredSize(new Dimension(300,30));
		LoginPageWelcome.setPreferredSize(new Dimension(500,30));
		loginBtn.setPreferredSize(new Dimension(100,20));
		loginBtn.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn.setHorizontalAlignment(SwingConstants.CENTER);
		Clearlogin.setPreferredSize(new Dimension(100,20));
		Clearlogin.setVerticalAlignment(SwingConstants.CENTER);
		Clearlogin.setVerticalAlignment(SwingConstants.CENTER);
		LoginPageWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		LoginPageWelcome.setVerticalAlignment(SwingConstants.CENTER);
		LoginPageWelcome.setBackground(Color.GREEN);
		loginPage.add(LoginPageWelcome);
		loginPage.add(emailLogin);
		loginPage.add(EmailLogin);
		loginPage.add(passwordLogin);
		loginPage.add(PasswordLoginEntry);
		loginPage.add(loginBtn);
		loginPage.add(Clearlogin);
		loginPage.setLayout(new FlowLayout(FlowLayout.LEFT));
		MainPanel.add(previousWork);
		MainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		// ButtonGroup
		
		logsig.add(login);
		logsig.add(signup);
		login.setSelected(true);
		
		ActionListener channgeList = new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				AbstractButton aB = (AbstractButton) e.getSource();
				if(login.isSelected()) {
					loginPage.show();
					signPage.hide();
				}
				else if(signup.isSelected()) {
					
					loginPage.hide();
					signPage.show();
				}
			
			}};
			
			login.addActionListener(channgeList);
			signup.addActionListener(channgeList);
		
		
		
		
		recently.setPreferredSize(new Dimension(1500,30));
		recentUser.setPreferredSize(new Dimension(500,20));
		recentUser.setEditable(false);
		recentUser.setFont(new Font("calbri",12, 0));
		credentials.add(signup);
		credentials.add(login);
		credentials.add(recently);
		credentials.add(recentUser);
		signPage.setPreferredSize(new Dimension(450,700));
		loginPage.setPreferredSize(new Dimension(450,700));
		
		
		
		
		//MAIN BAR, CHOICE BAR, SCREEN BAR
		
		staffBtn.setPreferredSize(new Dimension(200,60));
		staffBtn.setBackground(Color.BLUE);
		customerBtn.setPreferredSize(new Dimension(200,60));
		customerBtn.setBackground(Color.BLUE);
		bookingBtn.setPreferredSize(new Dimension(200,60));
		bookingBtn.setBackground(Color.BLUE);
		roomsBtn.setPreferredSize(new Dimension(200,60));
		roomsBtn.setBackground(Color.BLUE);
		paymentsBtn.setPreferredSize(new Dimension(200,60));
		paymentsBtn.setBackground(Color.BLUE);
		servicesBtn.setPreferredSize(new Dimension(200,60));
		servicesBtn.setBackground(Color.BLUE);
		healthBtn.setPreferredSize(new Dimension(200,60));
		healthBtn.setBackground(Color.BLUE);
		programsBtn.setPreferredSize(new Dimension(200,60));
		programsBtn.setBackground(Color.BLUE);
		reportsBtn.setPreferredSize(new Dimension(200,60));
		reportsBtn.setBackground(Color.BLUE);
		
		MaxScreen.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				MaxScreen.setBackground(Color.RED);
				MinScreen.setBackground(Color.WHITE);
				credentials.hide();
				loginsignup.setVisible(false);
				MainBar.setPreferredSize(new Dimension(1580,830));
				ChoiceBar.setPreferredSize(new Dimension(200,830));
				ScreenBar.setPreferredSize(new Dimension(1350,830));
				StaffChoice.setPreferredSize(new Dimension(900,80));
				StaffActivities.setPreferredSize(new Dimension(1330,745));
				StaffChoice.setAlignmentX(SwingConstants.CENTER);
				
				CustomerChoice.setPreferredSize(new Dimension(900,80));
				CustomerActivities.setPreferredSize(new Dimension(1330,745));
				
				
				OrderChoice.setPreferredSize(new Dimension(900,80));
				OrderActivities.setPreferredSize(new Dimension(1330,745));
				
				BookingChoice.setPreferredSize(new Dimension(900,80));
				BookingActivities.setPreferredSize(new Dimension(1330,745));
				MainBooking.setPreferredSize(new Dimension(1330,745));
				BookingDetails.setPreferredSize(new Dimension(1330,745));
				BookingBooked.setPreferredSize(new Dimension(1330,745));
				BookingStatistics.setPreferredSize(new Dimension(1330,745));
				BookingAvailable.setPreferredSize(new Dimension(1330,745));
				BookingSoon.setPreferredSize(new Dimension(1330,745));
				
				RoomsChoice.setPreferredSize(new Dimension(900,80));
				RoomsActivities.setPreferredSize(new Dimension(1330,745));
				
				PaymentChoice.setPreferredSize(new Dimension(900,80));
				PaymentActivities.setPreferredSize(new Dimension(1330,745));
				
				HeathChoice.setPreferredSize(new Dimension(900,80));
				HeathActivities.setPreferredSize(new Dimension(1330,745));
				
				ProgramsChoice.setPreferredSize(new Dimension(900,80));
				ProgramsActivities.setPreferredSize(new Dimension(1330,745));
				
				ReportsChoice.setPreferredSize(new Dimension(900,80));
				ReportsActivities.setPreferredSize(new Dimension(1330,745));
				
				jPtableEmployee .setPreferredSize(new Dimension(660,630));
				 tableEmployee.setPreferredSize(new Dimension(660,630));
					
					//employeeBar= new JPanel();
					
				employeeMainBar.setPreferredSize(new Dimension(1330,745));
				
				searchBar.setPreferredSize(new Dimension(1000,50));
				searchBarCurrent.setPreferredSize(new Dimension(400,30));
				searchBarUser.setPreferredSize(new Dimension(400,30));
				employeeBar.setPreferredSize(new Dimension(1320,660));
				employeeDetailPane.setPreferredSize(new Dimension(660,630));
				employeeDetail.setPreferredSize(new Dimension(660,630));
				employeeDetailPane.add(jPtableEmployee);
				employeePositionPane.setPreferredSize(new Dimension(330,630));
				employeePosition.setPreferredSize(new Dimension(330,630));
				employeeActivitiesPane.setPreferredSize(new Dimension(630,630));
				employeeActivitiesPaneAssigned.setPreferredSize(new Dimension(310,630));
				employeeActivitiesPaneAssign.setPreferredSize(new Dimension(310,630));
				//jPEmployee.setPreferredSize(new Dimension(1325,660));
				ChoiceBar.add(date_checkIn);
				date_checkIn.setPreferredSize(new Dimension(150,20));
				date_checkIn.setForeground(Color.ORANGE);
				
				tableEmployeeWork.setPreferredSize(new Dimension(310,300));
				jPtableEmployeeWork.setPreferredSize(new Dimension(310,300));
				jPtableEmployeeWorkContent.setPreferredSize(new Dimension(310,200));
				jPtableEmployeeWorkContent.setBackground(Color.LIGHT_GRAY);
				
				
				EmployeeFIRE.setPreferredSize(new Dimension(1320,660));
				EmployeeFIREDTABLE.setPreferredSize(new Dimension(660,650));
				EmployeeFIREREASON.setPreferredSize(new Dimension(660,650));
				Reasonfiring.setPreferredSize(new Dimension(600,500));
				jPtableFIRE.setPreferredSize(new Dimension(660,630));
				jPtableFIRE.setBackground(Color.RED);
				FireUserID.setPreferredSize(new Dimension(300,20));
				EmployeeFIREREASON.setBackground(Color.WHITE);
				// menu.setPreferredSize(new Dimension(100,30));
			      menuItem.setPreferredSize(new Dimension(80,30));
			      menuItemFind.setPreferredSize(new Dimension(80,30));
			      menuItemReview.setPreferredSize(new Dimension(80,30));
			    //  menu.setBackground(Color.WHITE);
			      menuItem.setBackground(Color.WHITE);
			      menuItem.setForeground(Color.YELLOW);
			      menuItemFind.setBackground(Color.WHITE);
			      menuItemFind.setForeground(Color.CYAN);
			      menuItemReview.setBackground(Color.WHITE);
			      menuItemReview.setForeground(Color.ORANGE);
			      
			      CustomerNewInfo.setPreferredSize(new Dimension(1320,660));
			      CustomerNewInfoCredentials.setPreferredSize(new Dimension(1320,630));
			      CustomerRecordsInfo.setPreferredSize(new Dimension(1320,630));
			      
			      CustomerNewInfo.setBackground(Color.WHITE);
			      CustomerNewInfoCredentials.setBackground(Color.WHITE);
			      CustomerRecordsInfo.setBackground(Color.green);
			      
			      
			      NameCustomer.setPreferredSize(new Dimension(500,30));
					NameCustomerText.setPreferredSize(new Dimension(500,30));
					check_inCustomer.setPreferredSize(new Dimension(500,30));
					date_checkInText.setPreferredSize(new Dimension(500,30));
					check_outCustomer.setPreferredSize(new Dimension(500,30));
					date_checkOutText.setPreferredSize(new Dimension(500,30));
					locationCustomer.setPreferredSize(new Dimension(500,30));
					locationCustomerText.setPreferredSize(new Dimension(500,30));
					phoneCustomer.setPreferredSize(new Dimension(500,30));
					phoneCustomerText.setPreferredSize(new Dimension(500,30));
					emailCustomer.setPreferredSize(new Dimension(500,30));
					emailCustomerText.setPreferredSize(new Dimension(500,30));
					GenderCustomer.setPreferredSize(new Dimension(500,30));
					GenderCustomerText.setPreferredSize(new Dimension(500,30));
					jRGenderM.setPreferredSize(new Dimension(165,30));
					 jRGenderF.setPreferredSize(new Dimension(165,30));
					 jRGenderO.setPreferredSize(new Dimension(165,30));
					 
					 Customeradd.setPreferredSize(new Dimension(350,20));
					CustomerClear.setPreferredSize(new Dimension(350,20));
					
					CustomerRecordsPaneMain.setPreferredSize(new Dimension(1320,660));
					 CustomerRecordsPaneMainTable.setPreferredSize(new Dimension(1320,600));
					 CustomerRecordsPaneMainObjects.setPreferredSize(new Dimension(1320,60));
					 tableCustomerRecords .setPreferredSize(new Dimension(1320,600));
					 jPtableCustomerRecords.setPreferredSize(new Dimension(1320,600));
			        	
				
			}
			
		});
		
           MinScreen.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				MaxScreen.setBackground(Color.WHITE);
				MinScreen.setBackground(Color.RED);
				credentials.show();
				loginsignup.setVisible(true);
				MainBar.setPreferredSize(new Dimension(1100,720));
				ChoiceBar.setPreferredSize(new Dimension(200,690));
				ChoiceBar.setBorder(new LineBorder(Color.MAGENTA, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
				ScreenBar.setPreferredSize(new Dimension(880,690));
				StaffChoice.setPreferredSize(new Dimension(860,80));
				StaffActivities.setPreferredSize(new Dimension(860,600));
				StaffChoice.setAlignmentX(SwingConstants.CENTER);
				
				CustomerChoice.setPreferredSize(new Dimension(860,80));
				CustomerActivities.setPreferredSize(new Dimension(860,600));
				
				
				OrderChoice.setPreferredSize(new Dimension(860,80));
				OrderActivities.setPreferredSize(new Dimension(860,600));
				
				BookingChoice.setPreferredSize(new Dimension(860,80));
				BookingActivities.setPreferredSize(new Dimension(860,600));
				MainBooking.setPreferredSize(new Dimension(860,600));
				BookingDetails.setPreferredSize(new Dimension(850,600));
				BookingBooked.setPreferredSize(new Dimension(850,600));
				BookingStatistics.setPreferredSize(new Dimension(850,600));
				BookingAvailable.setPreferredSize(new Dimension(850,600));
				BookingSoon.setPreferredSize(new Dimension(850,600));
				
				RoomsChoice.setPreferredSize(new Dimension(860,80));
				RoomsActivities.setPreferredSize(new Dimension(860,600));
				
				PaymentChoice.setPreferredSize(new Dimension(860,80));
				PaymentActivities.setPreferredSize(new Dimension(860,600));
				
				HeathChoice.setPreferredSize(new Dimension(860,80));
				HeathActivities.setPreferredSize(new Dimension(860,600));
				
				ProgramsChoice.setPreferredSize(new Dimension(860,80));
				ProgramsActivities.setPreferredSize(new Dimension(860,600));
				
				ReportsChoice.setPreferredSize(new Dimension(860,80));
				ReportsActivities.setPreferredSize(new Dimension(860,600));
				
				
				
					
					//employeeBar= new JPanel();
					
				searchBar.setPreferredSize(new Dimension(600,30));
				searchBar.setBackground(Color.LIGHT_GRAY);
				searchBarCurrent.setPreferredSize(new Dimension(200,20));
				searchBarUser.setPreferredSize(new Dimension(200,20));
				employeeBar.setPreferredSize(new Dimension(860,550));
				
				employeeDetailPane.setPreferredSize(new Dimension(860,550));
				employeeDetailPane.setBackground(Color.GREEN);
				jPtableEmployee.setPreferredSize(new Dimension(860,550));
				employeeDetailPane.add(jPtableEmployee);
				jPtableEmployee.setBackground(Color.CYAN);
				employeePositionPane.add(employeePosition);
				employeePositionPane.setBackground(Color.RED);
				employeeActivitiesPane.add(employeeActivitiesPaneAssigned);
				employeeActivitiesPane.add(employeeActivitiesPaneAssign);
				
				employeePositionPane.setPreferredSize(new Dimension(0,0));
				employeePosition.setPreferredSize(new Dimension(0,0));
				employeeActivitiesPane.setPreferredSize(new Dimension(0,0));
				employeeActivitiesPane.setBackground(Color.YELLOW);
				employeeActivitiesPaneAssigned.setPreferredSize(new Dimension(0,0));
				employeeActivitiesPaneAssigned.setBackground(Color.WHITE);
				employeeActivitiesPaneAssign.setPreferredSize(new Dimension(0,0));
				employeeActivitiesPaneAssign.setBackground(Color.LIGHT_GRAY);
				
				EmployeeFIRE.setPreferredSize(new Dimension(860,550));
				EmployeeFIREDTABLE.setPreferredSize(new Dimension(860,550));
				EmployeeFIREREASON.setPreferredSize(new Dimension(0,0));
				FireUserID.setPreferredSize(new Dimension(0,0));
				jPtableFIRE.setPreferredSize(new Dimension(860,550));
				jPtableFIRE.setBackground(Color.RED);
				
				 CustomerRecordsPaneMain.setPreferredSize(new Dimension(860,550));
				 CustomerRecordsPaneMainTable.setPreferredSize(new Dimension(860,550));
				 CustomerRecordsPaneMainObjects.setPreferredSize(new Dimension(0,0));
				
				
				
				
			  	/* StaffActivities.add(employeeMainBar);
				jPEmployee = new JScrollPane(employeeBar, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				jPEmployee.getViewport().getView().setBackground(Color.WHITE);
				jPEmployee.getViewport().getView().setForeground(Color.WHITE);
				employeeMainBar.add(jPEmployee);
				*/
				
				
				
				
				//jPEmployee.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				//jPEmployee.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
				
				
				
				//jPEmployee.setPreferredSize(new Dimension(850,550));
				
				
				CustomerNewInfo.setPreferredSize(new Dimension(860,550));
			      CustomerNewInfoCredentials.setPreferredSize(new Dimension(860,550));
			      CustomerRecordsInfo.setPreferredSize(new Dimension(860,550));
			      
			      CustomerNewInfo.setBackground(Color.WHITE);
			      CustomerNewInfoCredentials.setBackground(Color.red);
			      CustomerRecordsInfo.setBackground(Color.green);
			      
			      NameCustomer.setPreferredSize(new Dimension(300,30));
					NameCustomerText.setPreferredSize(new Dimension(300,30));
					check_inCustomer.setPreferredSize(new Dimension(300,30));
					date_checkInText.setPreferredSize(new Dimension(300,30));
					check_outCustomer.setPreferredSize(new Dimension(300,30));
					date_checkOutText.setPreferredSize(new Dimension(300,30));
					locationCustomer.setPreferredSize(new Dimension(300,30));
					locationCustomerText.setPreferredSize(new Dimension(300,30));
					phoneCustomer.setPreferredSize(new Dimension(300,30));
					phoneCustomerText.setPreferredSize(new Dimension(300,30));
					emailCustomer.setPreferredSize(new Dimension(300,30));
					emailCustomerText.setPreferredSize(new Dimension(300,30));
					GenderCustomer.setPreferredSize(new Dimension(300,30));
					GenderCustomerText.setPreferredSize(new Dimension(300,30));
				
					 CustomerNewInfoCredentials.setBackground(Color.WHITE);
					 
					 jRGenderM.setPreferredSize(new Dimension(100,30));
					 jRGenderF.setPreferredSize(new Dimension(100,30));
					 jRGenderO.setPreferredSize(new Dimension(100,30));
					 
					 Customeradd.setPreferredSize(new Dimension(250,20));
					CustomerClear.setPreferredSize(new Dimension(250,20));
					
					CustomerRecordsPaneMain.setPreferredSize(new Dimension(850,550));
					 CustomerRecordsPaneMainTable.setPreferredSize(new Dimension(850,550));
					 CustomerRecordsPaneMainObjects.setPreferredSize(new Dimension(0,0));
					 tableCustomerRecords .setPreferredSize(new Dimension(850,520));
					 jPtableCustomerRecords.setPreferredSize(new Dimension(850,520));
			        	
			}});
		
		
		ChoiceBar.add(staffBtn);
		ChoiceBar.add(customerBtn);
		ChoiceBar.add(bookingBtn);
		ChoiceBar.add(roomsBtn);
		ChoiceBar.add(paymentsBtn);
		ChoiceBar.add(servicesBtn);
		ChoiceBar.add(healthBtn);
		ChoiceBar.add(programsBtn);
		ChoiceBar.add(reportsBtn);
		ChoiceBar.add(MaxScreen);
		ChoiceBar.add(MinScreen);
		
		
		
		ChoiceBar.setPreferredSize(new Dimension(200,690));
		ChoiceBar.setBorder(new LineBorder(Color.MAGENTA, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
		ScreenBar.setPreferredSize(new Dimension(880,690));
		
		ScreenBar.setBorder(new LineBorder(Color.ORANGE, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
		ChoiceBar.setBackground(Color.ORANGE);
		ScreenBar.setBackground(Color.ORANGE);
		MainBar.setBackground(Color.ORANGE);
		
		MinScreen.setBackground(Color.RED);
		MaxScreen.setVerticalAlignment(SwingConstants.TOP);
		
		
		MainBar.add(ChoiceBar);
		MainBar.add(ScreenBar);
		
		MainBar.setPreferredSize(new Dimension(1100,720));
		MainBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		//MainBar.add(ExtraBar);
		
		//
		
		
		
		
		
		
		
		loginsignup.add(signPage);
		loginsignup.add(loginPage);
		MainPanel.add(loginsignup);
		loginsignup.setBackground(Color.YELLOW);
		MainPanel.setBackground(Color.ORANGE);
		credentials.setBackground(Color.CYAN);
		GetIn.setBackground(Color.GRAY);
		previousWork.setBackground(Color.BLUE);
		credentials.setPreferredSize(new Dimension(1600,100));
		GetIn.setPreferredSize(new Dimension(200,300));
		MainPanel.setPreferredSize(new Dimension(1800,1000));
		previousWork.setPreferredSize(new Dimension(200,300));
		signPage.setBackground(Color.GREEN);
		loginPage.setBackground(Color.WHITE);
		
		MainPanel.add(MainBar);
		MainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		//Staff Page- 
		
		//STAFF CHOICE
		
		
		
		MainScreen.add(MaxScreen);
		MainScreen.add(MinScreen);
		
		ScreenBar.setLayout(cR2);
		
		staffActivity.setPreferredSize(new Dimension(800,30));
		employee.setPreferredSize(new Dimension(130,30));
		employee.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				//employeeDetailPane.show();
				cR3.show(STAFFMAINPANE, "1");
				
			}
			
		});
		yourPage.setPreferredSize(new Dimension(130,30));
		fired.setPreferredSize(new Dimension(130,30));
		retired.setPreferredSize(new Dimension(130,30));
		outOfContract.setPreferredSize(new Dimension(130,30));
		renewedContract.setPreferredSize(new Dimension(130,30));
		
		staffActivity.setBackground(Color.WHITE);
		employee.setBackground(Color.PINK);
		employee.setBorder((BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.BLUE)));
		yourPage.setBackground(Color.PINK);
		yourPage.setBorder((BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.BLUE)));
		fired.setBackground(Color.PINK);
		fired.setBorder((BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.BLUE)));
		retired.setBackground(Color.PINK);
		retired.setBorder((BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.BLUE)));
		outOfContract.setBackground(Color.PINK);
		outOfContract.setBorder((BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.BLUE)));
		renewedContract.setBackground(Color.PINK);
		renewedContract.setBorder((BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.BLUE)));
		
		StaffChoice.add(staffActivity);
		StaffChoice.add(employee);
		StaffChoice.add(yourPage);
		StaffChoice.add(fired);
		StaffChoice.add(retired);
		StaffChoice.add(outOfContract);
		StaffChoice.add(renewedContract);
		StaffChoice.setBorder(new LineBorder(Color.WHITE, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
		
		
		StaffChoice.setPreferredSize(new Dimension(860,80));
		StaffActivities.setPreferredSize(new Dimension(860,600));
		StaffActivities.setBackground(Color.WHITE);
		StaffActivities.setBorder(new LineBorder(Color.WHITE, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));
		StaffChoice.setBackground(Color.WHITE);
		
		//StaffActivities.add(loginPage);
		Staff.add(StaffChoice);
		Staff.add(StaffActivities);
		Staff.setPreferredSize(new Dimension(870,700));
		Staff.setLayout(new FlowLayout(FlowLayout.LEFT));
		Staff.setBackground(Color.WHITE);
		Staff.setBorder(new LineBorder(Color.BLUE, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
		
		
		
		staffActivity1.setPreferredSize(new Dimension(850,30));
		Customer.setPreferredSize(new Dimension(870,700));
		Order.setPreferredSize(new Dimension(870,700));
		Rooms.setPreferredSize(new Dimension(870,700));
		Payment.setPreferredSize(new Dimension(870,700));
		Heath.setPreferredSize(new Dimension(870,700));
		Programs.setPreferredSize(new Dimension(870,700));
		Reports.setPreferredSize(new Dimension(870,700));
		
		
		CustomerChoice.add(staffActivity1);
		CustomerChoice.add(CustomerNew);
		CustomerChoice.add(CustomerRecords);
		
		
		
		CustomerChoice.add(CustomerMatching);
		CustomerChoice.setBackground(Color.WHITE);
		Customer.setPreferredSize(new Dimension(1000,700));
		Customer.setLayout(new FlowLayout(FlowLayout.LEFT));
		Customer.setBackground(Color.WHITE);
		Customer.setBorder(new LineBorder(Color.CYAN, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
		
		Customer.add(CustomerChoice);
		Customer.add(CustomerActivities);
		CustomerChoice.setPreferredSize(new Dimension(860,80));
		CustomerActivities.setPreferredSize(new Dimension(850,580));
		CustomerActivities.setBackground(Color.WHITE);
		CustomerActivities.add(jPtableEmployee);
		
		CustomerActivities.add(CustomerNewInfo);
		CustomerChoice.setBackground(Color.WHITE);
		CustomerNewInfo.setPreferredSize(new Dimension(850,580));
		CustomerNewInfoCredentials.setPreferredSize(new Dimension(850,580));
		
		Customeradd.setPreferredSize(new Dimension(250,20));
		CustomerClear.setPreferredSize(new Dimension(250,20));
		Customeradd.setBackground(Color.GREEN);
		CustomerClear.setBackground(Color.RED);
		
		
		
		
		 
		CustomerNewInfo.add(CustomerNewInfoCredentials);
		CustomerNewInfo.add( CustomerRecordsPaneMain);
		CustomerNewInfo.setLayout(new FlowLayout(FlowLayout.LEFT));
		CustomerNewInfoCredentials.setLayout(new FlowLayout(FlowLayout.LEFT));
		CustomerNewInfoCredentials.add(NameCustomer);
		CustomerNewInfoCredentials.add(NameCustomerText);
		CustomerNewInfoCredentials.add(check_inCustomer);
		CustomerNewInfoCredentials.add(date_checkInText);
		CustomerNewInfoCredentials.add(check_outCustomer);
		CustomerNewInfoCredentials.add(date_checkOutText);
		CustomerNewInfoCredentials.add(locationCustomer);
		CustomerNewInfoCredentials.add(locationCustomerText);
		CustomerNewInfoCredentials.add(phoneCustomer);
		CustomerNewInfoCredentials.add(phoneCustomerText);
		CustomerNewInfoCredentials.add(emailCustomer);
		CustomerNewInfoCredentials.add(emailCustomerText);
		CustomerNewInfoCredentials.add(GenderCustomer);
		CustomerNewInfoCredentials.add(jRGenderM);
		CustomerNewInfoCredentials.add(jRGenderF);
		CustomerNewInfoCredentials.add(jRGenderO);
		CustomerNewInfoCredentials.add(Customeradd)	;
		CustomerNewInfoCredentials.add(CustomerClear)	;
		 
		 bGCustomer.add(jRGenderM); 
		 bGCustomer.add(jRGenderF); 
		 bGCustomer.add(jRGenderO);
		
		 jRGenderM.setPreferredSize(new Dimension(100,30));
		// jRGenderM.setBounds(120, 30, 120, 50);
		 jRGenderF.setPreferredSize(new Dimension(100,30));
		 jRGenderO.setPreferredSize(new Dimension(100,30));
		NameCustomer.setPreferredSize(new Dimension(300,30));
		NameCustomerText.setPreferredSize(new Dimension(300,30));
		check_inCustomer.setPreferredSize(new Dimension(300,30));
		date_checkInText.setPreferredSize(new Dimension(300,30));
		check_outCustomer.setPreferredSize(new Dimension(300,30));
		date_checkOutText.setPreferredSize(new Dimension(300,30));
		locationCustomer.setPreferredSize(new Dimension(300,30));
		locationCustomerText.setPreferredSize(new Dimension(300,30));
		phoneCustomer.setPreferredSize(new Dimension(300,30));
		phoneCustomerText.setPreferredSize(new Dimension(300,30));
		emailCustomer.setPreferredSize(new Dimension(300,30));
		emailCustomerText.setPreferredSize(new Dimension(300,30));
		GenderCustomer.setPreferredSize(new Dimension(300,30));
		GenderCustomerText.setPreferredSize(new Dimension(300,30));
		 CustomerNewInfoCredentials.setBackground(Color.WHITE);
		 
		 
		 
		 
		 
		 Customeradd.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent e) {
					
					
					
					try {
						Date startDay = sdf.parse(date_checkInText.getDate().toLocaleString());
						
						Date endDay =  sdf.parse(date_checkOutText.getDate().toLocaleString());
						
						Long diffTime = Math.abs(startDay.getTime() - endDay.getTime());
						Long diff = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
						assertEquals(6,diff);
						
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
					
					
					String fullnm =NameCustomerText.getText();
					
					String chcin = date_checkInText.getDate().toLocaleString();
					String chcout =date_checkOutText.getDate().toLocaleString();
					String loc =locationCustomerText.getText();
					String phne = phoneCustomerText.getText();
					String em = emailCustomerText.getText();
					String gen = bGCustomer.getSelection().getActionCommand();
					
					if(jRGenderM.isSelected()) {
						 return;
					}
					else if(jRGenderF.isSelected()) {
						 return;
					}
					else if(jRGenderM.isSelected()) {
						 return;
					}
					
					
					
					
					
					
					
					String query = "INSERT INTO  `restaurant`.`customer`(`name`,`checkIN`,`checkOUT`,`location`,`phone`,`email`,`gen`)VALUES(?,?,?,?,?,?,?)";
					try {
						conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
						pT= conn.prepareStatement(query);
						
						pT.setString(1, fullnm);
						pT.setString(2, chcin);
						pT.setString(3, chcout);
						pT.setString(4, loc);
						pT.setString(5, phne);
						pT.setString(6, em);
						pT.setString(7, gen);
						
						pT.execute();
						JOptionPane.showMessageDialog(null, "new customer added");
						modelCustomer.setRowCount(0);
						customerRecordsWindow();
						
						NameCustomerText.setText("");
						date_checkInText.cleanup();
						date_checkOutText.cleanup();
						locationCustomerText.setText("");
						phoneCustomerText.setText("");
						emailCustomerText.setText("");
						bGCustomer.clearSelection();
						 
						 
						 
					} catch (SQLException e1) {
						
						JOptionPane.showMessageDialog(null, "No entry.. try again");
						e1.printStackTrace();
					}}

				private void assertEquals(int i, Long diff) {
					// TODO Auto-generated method stub
					
				}}
				)
				    ;
		 
		 
		 String fnmCustomer = "";
	        String chcinCustomer = "" ;
	    	String chcoutCustomer = "";
	    	String locCustomer  = "";
	    	String NumberCustomer  = "";
	    	String phnCustomer  = "";
	    	String emaCustomer  = "";
	    	
	    	/*
	    	
			 try {
		        	
				 
			    
		        	
		        	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
		        	String query10 = "SELECT * FROM restaurant.customer"; 
		        	
		        	pT = conn.prepareStatement(query10);
		            rT = pT.executeQuery();
		            
		            
		            while (rT.next()) {
		            	 NumberCustomer  = rT.getString("idcustomer");
		            	fnmCustomer = rT.getString("name");
		            	chcinCustomer  = rT.getString("checkIN");
		            	 chcoutCustomer = rT.getString("checkOUT");
		            	 locCustomer = rT.getString("location");
		            	
		            	 phnCustomer  = rT.getString("phone");
		            	 emaCustomer  = rT.getString("email");
		            	 
		            	modelCustomer.addRow(new Object[] {NumberCustomer , fnmCustomer,chcinCustomer ,chcoutCustomer, locCustomer ,phnCustomer,emaCustomer});
		            	 
		            	
		            	
		            }
		            
		        	
		        }catch(Exception ex) {
		        	
		        }
			 
			 */
			 tableCustomerRecords .setPreferredSize(new Dimension(860,550));
			 jPtableCustomerRecords.setPreferredSize(new Dimension(860,550));
			 jPtableCustomerRecords.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			 jPtableCustomerRecords.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			 /*
				jPtableEmployeeShowWorkContent.setPreferredSize(new Dimension(300,280));
				jPtableEmployeeShowWorkContent.setBackground(Color.WHITE);
				jPtableEmployeeShowWorkContent.setForeground(Color.ORANGE);
				jPtableEmployeeShowWorkContent.setFont(new java.awt.Font("Serif", 0, 18));
				
				*/
				
				tableCustomerRecords .setModel(modelCustomer);
				
				
				 jPtableCustomerRecords   = new JScrollPane(tableCustomerRecords);
				 CustomerRecordsPaneMainTable.add(jPtableCustomerRecords);
				 CustomerRecordsPaneMain.add( CustomerRecordsPaneMainTable);
				 CustomerRecordsPaneMain.add(  CustomerRecordsPaneMainObjects);
				 
				 
				 CustomerRecordsPaneMain.setPreferredSize(new Dimension(860,550));
				 CustomerRecordsPaneMainTable.setPreferredSize(new Dimension(860,550));
				 CustomerRecordsPaneMainObjects.setPreferredSize(new Dimension(0,0));
				 
		        	
		 
		 
		 CustomerClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 NameCustomerText.setText("");
					date_checkInText.cleanup();
					date_checkOutText.cleanup();
					locationCustomerText.setText("");
					phoneCustomerText.setText("");
					emailCustomerText.setText("");
					bGCustomer.clearSelection();
				
				
			}
			 
			 
		 });
		 
		 
		 
		 CustomerNew.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent e) {
					
					cRCustomer.show(CustomerNewInfo, "1");
					
				}});
		 
		 tableCustomerRecords .setPreferredSize(new Dimension(820,550));
		 jPtableCustomerRecords.setPreferredSize(new Dimension(820,550));
		 
		 CustomerRecords.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent e) {
					
					modelCustomer.setRowCount(0);
					//customerRecordsWindow();
					
					//CustomerRecordsPaneMain.setPreferredSize(new Dimension(850,550));
					 //CustomerRecordsPaneMainTable.setPreferredSize(new Dimension(850,550));
					// CustomerRecordsPaneMainObjects.setPreferredSize(new Dimension(0,0));
					// tableCustomerRecords .setPreferredSize(new Dimension(820,550));
					 //jPtableCustomerRecords.setPreferredSize(new Dimension(820,550));
					cRCustomer.show(CustomerNewInfo, "2");
					
					
					 String fnmCustomer = "";
				        String chcinCustomer = "" ;
				    	String chcoutCustomer = "";
				    	String locCustomer  = "";
				    	String NumberCustomer  = "";
				    	String phnCustomer  = "";
				    	String emaCustomer  = "";
				    	
				    	
						 try {
					        	  	
					        	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					        	String query10 = "SELECT * FROM restaurant.customer"; 
					        	
					        	pT = conn.prepareStatement(query10);
					            rT = pT.executeQuery();
					            
					            
					            while (rT.next()) {
					            	 NumberCustomer  = rT.getString("idcustomer");
					            	fnmCustomer = rT.getString("name");
					            	chcinCustomer  = rT.getString("checkIN");
					            	 chcoutCustomer = rT.getString("checkOUT");
					            	 locCustomer = rT.getString("location");
					            	
					            	 phnCustomer  = rT.getString("phone");
					            	 emaCustomer  = rT.getString("email");
					            	 
					            	modelCustomer.addRow(new Object[] {NumberCustomer , fnmCustomer,chcinCustomer ,chcoutCustomer, locCustomer ,phnCustomer,emaCustomer});
					            	 
					            	
					            	
					            }
					            
					        	
					        }catch(Exception ex) {
					        	
					        }
					
				}});
		 
		 CustomerNewInfo.setLayout(cRCustomer);
		 modelCustomer.setColumnIdentifiers(columnCustomer);
		 
		
		//CustomerNewInfo
		
		
		

		
		// TABLE MODEL
		
		
		
		
		
		
		staffActivity2.setPreferredSize(new Dimension(850,30));
		Order.add(OrderChoice);
		Order.add(OrderActivities);
		
		OrderChoice.setBackground(Color.WHITE);
		OrderChoice.add(staffActivity2);
		OrderChoice.add(Orderorder);
		OrderChoice.add(Orderorders);
		OrderChoice.add(Orderdelivered);
		OrderChoice.add(Ordercancel);
		OrderChoice.add(Ordercancelled);
		Order.setPreferredSize(new Dimension(870,700));
		Order.setLayout(new FlowLayout(FlowLayout.LEFT));
		Order.setBackground(Color.WHITE);
		Order.setBorder(new LineBorder(Color.WHITE, 0, LineBorder.createBlackLineBorder().isBorderOpaque()));	
		OrderChoice.setPreferredSize(new Dimension(860,80));
		OrderActivities.setPreferredSize(new Dimension(860,600));
		OrderActivities.setBackground(Color.WHITE);
		
		BookingChoice.setBackground(Color.WHITE);
		staffActivity3.setPreferredSize(new Dimension(850,30));
		Booking.add(BookingChoice);
		Booking.add(BookingActivities);
		BookingActivities.add(MainBooking);
		BookingChoice.add(staffActivity3);
		BookingChoice.add(BookingbookRoom);
		BookingChoice.add(Bookingavailable);
		BookingChoice.add(Bookingbooked);
		BookingChoice.add(Bookingexiting);
		BookingChoice.add(Bookingstatistics);
		
		MainBooking.add(BookingDetails);
		MainBooking.add(BookingAvailable);
		MainBooking.add(BookingBooked);
		MainBooking.add(BookingStatistics);
		MainBooking.add(BookingSoon);
		
		Booking.setPreferredSize(new Dimension(870,700));
		Booking.setLayout(new FlowLayout(FlowLayout.LEFT));
		Booking.setBackground(Color.WHITE);
		Booking.setBorder(new LineBorder(Color.DARK_GRAY, -1, LineBorder.createBlackLineBorder().isBorderOpaque()));
		BookingChoice.setPreferredSize(new Dimension(860,80));
		BookingActivities.setPreferredSize(new Dimension(860,600));
		
		BookingDetails.setPreferredSize(new Dimension(850,600));
		BookingBooked.setPreferredSize(new Dimension(850,600));
		BookingStatistics.setPreferredSize(new Dimension(850,600));
		BookingAvailable.setPreferredSize(new Dimension(850,600));
		BookingSoon.setPreferredSize(new Dimension(850,600));
		BookingActivities.setBackground(Color.GREEN);
		
		
		staffActivity4.setPreferredSize(new Dimension(850,30));
		Rooms.add(RoomsChoice);
		Rooms.add(RoomsActivities);
		
		RoomsChoice.setBackground(Color.WHITE);
		RoomsChoice.add(staffActivity4);
		RoomsChoice.add(Roomsadd);
		RoomsChoice.add(Roomsavailable);
		Rooms.setPreferredSize(new Dimension(870,700));
		Rooms.setLayout(new FlowLayout(FlowLayout.LEFT));
		Rooms.setBackground(Color.WHITE);
		Rooms.setBorder(new LineBorder(Color.GREEN, 1, LineBorder.createBlackLineBorder().isBorderOpaque()));
		RoomsChoice.setPreferredSize(new Dimension(860,80));
		RoomsActivities.setPreferredSize(new Dimension(860,600));
		RoomsActivities.setBackground(Color.BLACK);
		
		
		
		staffActivity5.setPreferredSize(new Dimension(850,30));
		Payment.add(PaymentChoice);
		Payment.add(PaymentActivities);
		
		PaymentChoice.setBackground(Color.WHITE);
		PaymentChoice.add(staffActivity5);
		PaymentChoice.add(Paymentpay);
		PaymentChoice.add(Paymentpayments);
		PaymentChoice.add(Paymentpendings);
		PaymentChoice.add(Paymentdebts);
		PaymentChoice.add(Paymentcancelled);
		Payment.setPreferredSize(new Dimension(870,700));
		Payment.setLayout(new FlowLayout(FlowLayout.LEFT));
		Payment.setBackground(Color.WHITE);
		Payment.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, LineBorder.createBlackLineBorder().isBorderOpaque()));
		PaymentChoice.setPreferredSize(new Dimension(860,80));
		PaymentActivities.setPreferredSize(new Dimension(860,600));
		PaymentActivities.setBackground(Color.BLACK);
		
		
		staffActivity6.setPreferredSize(new Dimension(850,30));
		Heath.add(HeathChoice);
		Heath.add(HeathActivities);
		
		
		HeathChoice.setBackground(Color.WHITE);
		HeathChoice.add(staffActivity6);
		HeathChoice.add(Heathwaste);
		HeathChoice.add(Heathachievement);
		Heath.setPreferredSize(new Dimension(870,700));
		Heath.setLayout(new FlowLayout(FlowLayout.LEFT));
		Heath.setBackground(Color.WHITE);
		Heath.setBorder(new LineBorder(Color.MAGENTA, 1, LineBorder.createBlackLineBorder().isBorderOpaque()));
		HeathChoice.setPreferredSize(new Dimension(860,80));
		HeathActivities.setPreferredSize(new Dimension(860,600));
		HeathActivities.setBackground(Color.BLACK);
		
		
		
		staffActivity7.setPreferredSize(new Dimension(850,30));
		Programs.add(ProgramsChoice);
		Programs.add(ProgramsActivities);
		
		
		ProgramsChoice.setBackground(Color.WHITE);
		ProgramsChoice.add(staffActivity7);
		ProgramsChoice.add(ProgramDay);
		ProgramsChoice.add(ProgramsUpdate);
		ProgramsChoice.add(ProgramsMeeting);
		ProgramsChoice.add(ProgramsCancelled);
		Programs.setPreferredSize(new Dimension(870,700));
		Programs.setLayout(new FlowLayout(FlowLayout.LEFT));
		Programs.setBackground(Color.WHITE);
		Programs.setBorder(new LineBorder(Color.RED, 1, LineBorder.createBlackLineBorder().isBorderOpaque()));
		
		ProgramsChoice.setPreferredSize(new Dimension(860,80));
		ProgramsActivities.setPreferredSize(new Dimension(860,600));
		ProgramsActivities.setBackground(Color.BLACK);
		
		
		staffActivity8.setPreferredSize(new Dimension(850,30));
		Reports.add(ReportsChoice);
		Reports.add(ReportsActivities);
		
		ReportsChoice.setBackground(Color.WHITE);
		ReportsChoice.add(staffActivity8);
		ReportsChoice.add(ReportsSubmission);
		ReportsChoice.add(ReportsOutcomes);
		ReportsChoice.add(ReportsRequirements);
		Reports.setPreferredSize(new Dimension(870,700));
		Reports.setLayout(new FlowLayout(FlowLayout.LEFT));
		Reports.setBackground(Color.WHITE);
		Reports.setBorder(new LineBorder(Color.ORANGE, 1, LineBorder.createBlackLineBorder().isBorderOpaque()));
		ReportsChoice.setPreferredSize(new Dimension(860,80));
		ReportsActivities.setPreferredSize(new Dimension(860,600));
		ReportsActivities.setBackground(Color.BLACK);
		
		
		ScreenBar.add(Staff);
		ScreenBar.add(Customer);
		ScreenBar.add(Order);
		ScreenBar.add(Booking);
		ScreenBar.add(Rooms);
		ScreenBar.add(Payment);
		ScreenBar.add(Heath);
		ScreenBar.add(Programs);
		ScreenBar.add(Reports);
		
		
		
		
		// EmployeeBar
		
		
			
		
		
		employeeMainBar.setBackground(Color.WHITE);
		employeeMainBar.setPreferredSize(new Dimension(860,600));
		employeeMainBar.add(searchBar);
		employeeMainBar.add(employeeBar);
		employeeBar.add(employeeDetailPane);
		
		employeeBar.add(employeeActivitiesPane);
		
		
			
			 
		
		
		searchBar.setPreferredSize(new Dimension(600,30));
		searchBar.setBackground(Color.WHITE);
		searchBar.add(searchBarCurrent);
		searchBarCurrent.setPreferredSize(new Dimension(200,20));
		searchBarCurrent.setBackground(Color.LIGHT_GRAY);
		searchBarUser.setPreferredSize(new Dimension(200,20));
		searchBarUser.setBackground(Color.LIGHT_GRAY);
		searchBar.add(searchBarUser);
		employeeBar.setPreferredSize(new Dimension(860,600));
		
		employeeDetailPane.setPreferredSize(new Dimension(860,550));
		employeeDetailPane.setBackground(Color.GREEN);
		jPtableEmployee .setPreferredSize(new Dimension(860,550));
		employeeDetailPane.add(jPtableEmployee);
		employeePositionPane.add(employeePosition);
		employeePositionPane.setBackground(Color.RED);
		employeeActivitiesPane.add(employeeActivitiesPaneAssigned);
		employeeActivitiesPane.add(employeeActivitiesPaneAssign);
		
		employeePositionPane.setPreferredSize(new Dimension(0,0));
		employeePosition.setPreferredSize(new Dimension(0,0));
		employeeActivitiesPane.setPreferredSize(new Dimension(0,0));
		employeeActivitiesPane.setBackground(Color.YELLOW);
		employeeActivitiesPaneAssigned.setPreferredSize(new Dimension(0,0));
		employeeActivitiesPaneAssigned.setBackground(Color.WHITE);
		employeeActivitiesPaneAssign.setPreferredSize(new Dimension(0,0));
		employeeActivitiesPaneAssign.setBackground(Color.LIGHT_GRAY);
		
		StaffActivities.add(employeeMainBar);
		//jPEmployee = new JScrollPane(employeeBar, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//jPEmployee.getViewport().getView().setBackground(Color.WHITE);
		//jPEmployee.getViewport().getView().setForeground(Color.WHITE);
		//employeeMainBar.add(jPEmployee);
		
		
		
		
		
		//jPEmployee.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//jPEmployee.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		
		
		//jPEmployee.setPreferredSize(new Dimension(850,550));
		//jPEmployee.getPreferredSize();
		
		
		
		//EMPLOYEE TABLE CLICK
		
		
		 
		
		 tableEmployee.addMouseListener(new MouseAdapter (){
				
				public void mouseClicked(MouseEvent e) {
					
					
					DateOfWork.setText("");
					 int row = tableEmployee.getSelectedRow();
					 int rowWork = tableEmployee.getSelectedRow();
					 
						modelEmployeeWork.setRowCount(0); 
					 //  employeeWork();
				        displayToRoomTextField(row);
				        displayWorkOfSelectedID(rowWork);
				       // requeEmployeeWork.doClick();
				        
				        
				        
				     
				        
				}	  
				
				
			});
		 
		 
		/* tableEmployee.addMouseListener(new MouseAdapter (){
			 
			 public void  mouseClicked(MouseEvent e) {
				 
				 
				 int c = 5 ;
		     	  String dateWork = "";
		   	  String workGiven = "";
		   	  numberWorksUser =  searchBarUser.getText() ;
		   	  String jobCodeW = "";
		   	
		     	  
		     	  try {
		  			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
		  			String query = " SELECT * FROM tasks where userID = '"+ numberWorksUser + "'" ;
		  			pT = conn.prepareStatement(query);
		             rT = pT.executeQuery();
		             while (rT.next()) {
		             	
		          	   dateWork = rT.getString("work");
		            	 workGiven  = rT.getString("date");
		            	 numberWorks = rT.getString("id");
		            	 jobCodeW = rT.getString("jobCode");
		             	 //c = rT.getInt("count(*)");
		            	 
		             	 
		             	 modelEmployeeWork.addRow(new Object[] { jobCodeW, workGiven
		             	 
		             	 
		             		
		             	 }); 
		             	 
		             }
		  			
		  		} catch (SQLException et) {
		  			
		  			et.printStackTrace();
		  		}
	        	
	       

			 }
		 });
		*/
		employeeActivitiesPaneAssign.add(ASSIGN);
	//	employeeActivitiesPaneAssign.add(ASSIGNImage);
		employeeActivitiesPaneAssign.add(ASSIGNNames);
		employeeActivitiesPaneAssign.add(ASSIGNUserID);
		
		employeeActivitiesPaneAssign.add(ASSIGNJobID);
		employeeActivitiesPaneAssign.add(JobID);
		employeeActivitiesPaneAssign.add(JobIDDate);
		employeeActivitiesPaneAssign.add(ASSIGNWork);
		employeeActivitiesPaneAssign.add(ASSIGNAdd);
		employeeActivitiesPaneAssign.add(ASSIGNClear);
		employeeActivitiesPaneAssign.add(date_checkIn);
		
		employeeActivitiesPaneAssign.add(ASSIGNFIRE);
		employeeActivitiesPaneAssign.add(ASSIGNRETIRE);
		employeeActivitiesPaneAssign.add(ASSIGNCONTRACT);
		
		
		
		JobID.setPreferredSize(new Dimension(100,20));
		JobID.setBackground(Color.GREEN);
		JobIDDate.setPreferredSize(new Dimension(100,20));
		ASSIGNJobID.setPreferredSize(new Dimension(80,20));
		ASSIGN.setPreferredSize(new Dimension(200,30));
		ASSIGNImage.setPreferredSize(new Dimension(100,100));
		ASSIGNNames.setPreferredSize(new Dimension(150,20));
		ASSIGNUserID.setPreferredSize(new Dimension(150,20));
		ASSIGNWork.setPreferredSize(new Dimension(300,350));
		ASSIGNAdd.setPreferredSize(new Dimension(100,20));
		ASSIGNAdd.setBackground(Color.GREEN);
		ASSIGNClear.setBackground(Color.RED);
		ASSIGNClear.setPreferredSize(new Dimension(100,20));
		ASSIGNFIRE.setPreferredSize(new Dimension(100,20));
		ASSIGNRETIRE.setPreferredSize(new Dimension(100,20));
		ASSIGNCONTRACT.setPreferredSize(new Dimension(100,20));
		
		searchBarCurrent.setText("");
		searchBarCurrent.setHorizontalAlignment(SwingConstants.CENTER);
		
		// UserIDsearchBarCurrent  = searchBarCurrent.getText().toString();
		//String UserIDsearchBarCurrent;
		 searchBarCurrent.addKeyListener(new KeyAdapter(){
				
	    	   public void keyTyped(KeyEvent evt) {
					
	    		   int rowWork = tableEmployee.getSelectedRow();
	    		   displayWorkOfSelectedID(rowWork);
	    		   
				}
				
			
			
			
		});
	
		
		
		
		/*date_checkIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                propertyChange(evt);
            }
        });*/
		
	//	searchBarCurrent.setCheckInDateTime(date_checkIn.getDate().getTime() / 1000);
		
		
		//
		
		
		//
		
		ASSIGNAdd.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				String ASSIGNFirstName = ASSIGNNames.getText();
				String ASSIGnSecondName = ASSIGNNames.getText();
				String ASSIGNUserID = searchBarCurrent.getText();
				String ASSIGNJobID =JobID.getText();
				String ASSIGNDate = JobIDDate.getDate().toLocaleString();
				String ASSIGNWorkContent = ASSIGNWork.getText();
				
				
				
				String query3 = "INSERT INTO `restaurant`.`tasks`(`fname`,`sname`,`userID`,`jobCode`,`date`,`work`)VALUES(?,?,?,?,?,?)";
				
				
			
				try {
					
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					pT= conn.prepareStatement(query3);
					
					pT.setString(1, ASSIGNFirstName );
					pT.setString(2,ASSIGnSecondName);
					pT.setString(3,  ASSIGNUserID);
					pT.setString(4, ASSIGNJobID);
					pT.setString(5, ASSIGNDate);
					pT.setString(6, ASSIGNWorkContent);
					
					pT.execute();
					modelEmployeeWork.setRowCount(0);
					employeeWork();
					
					ASSIGNWork.setText("");
					
					JOptionPane.showMessageDialog(null, ASSIGNNames.getText(), "Given work", 0);
				
				} catch (SQLException e1) {
					
					JOptionPane.showMessageDialog(null, "Not Added");
					
					e1.printStackTrace();
				}
				
				
			}
			
			
        	
        });
		
		
		
		
		
		/*String searchUserWork =  "";
		
		
			try {
				conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
				
				String query = " SELECT * FROM tasks Where userID =  '" +  searchUserWork + "'" ;
				pT = conn.prepareStatement(query);
	           rT = pT.executeQuery();
	           while(rT.next()) {
	        	   
	           }
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
		
		*/
		
      
		modelEmployeeWork.setColumnIdentifiers(columnEmployeeWork);
		
		
		// String dateWork = "";
   	 // String workGiven = "";
   
   	 
		
		DateOfWork.setBackground(Color.WHITE);
		DateOfWork.setPreferredSize(new Dimension(290,20));
		DateOfWork.setFont(new java.awt.Font("Jokerman", 0, 15));
		DateOfWork.setHorizontalAlignment(SwingConstants.CENTER);
		DateOfWork.setEditable(false);
		/*	
		WorkShow.setBackground(Color.RED);
		WorkShow.setPreferredSize(new Dimension(200,300));*/
   	    tableEmployeeWork.setPreferredSize(new Dimension(200,600));
		jPtableEmployeeWork.setPreferredSize(new Dimension(310,600));
		jPtableEmployeeWork.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		jPtableEmployeeWork.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jPtableEmployeeShowWorkContent.setPreferredSize(new Dimension(300,280));
		jPtableEmployeeShowWorkContent.setBackground(Color.WHITE);
		jPtableEmployeeShowWorkContent.setForeground(Color.ORANGE);
		jPtableEmployeeShowWorkContent.setFont(new java.awt.Font("Serif", 0, 18));
		
		WorkHeading.setPreferredSize(new Dimension(290,20));
		WorkHeading.setText("Work by selected Job code");
		WorkHeading.setBackground(Color.WHITE);
		WorkHeading.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		tableEmployeeWork.setModel(modelEmployeeWork);
		
		
		 jPtableEmployeeWork  = new JScrollPane(tableEmployeeWork);
	
		employeeActivitiesPaneAssigned.add(DateOfWork);
		employeeActivitiesPaneAssigned.add(jPtableEmployeeWork);
		employeeActivitiesPaneAssigned.add(WorkHeading);
		employeeActivitiesPaneAssigned.add(jPtableEmployeeShowWorkContent);
		
		
		ASSIGNClear.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				ASSIGNWork.setText("");
			}
			
		});
			
		
		
		searchBarUser.setHorizontalAlignment(SwingConstants.CENTER);
		searchBarUser .addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        	
			        	
			        	int c = 5 ;
				     	  String DateWork = "";
				   	  String workGiven = "";
				   	  numberWorksUser =  searchBarUser.getText() ;
				   	  String jobCodeW = "";
				   	
				     	  
				     	  try {
				  			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
				  			String query = " SELECT * FROM tasks where userID = '"+ numberWorksUser + "'" ;
				  			pT = conn.prepareStatement(query);
				             rT = pT.executeQuery();
				             while (rT.next()) {
				             	
				            	 DateWork = rT.getString("work");
				            	 workGiven  = rT.getString("date");
				            	 numberWorks = rT.getString("id");
				            	 jobCodeW = rT.getString("jobCode");
				             	 //c = rT.getInt("count(*)");
				            	 
				             	 
				             	 modelEmployeeWork.addRow(new Object[] { jobCodeW, workGiven,DateWork
				             	 
				             	 
				             		
				             	 }); 
				             	 
				             }
				  			
	 			  		} catch (SQLException et) {
				  			
				  			et.printStackTrace();
				  		}
			        	
			        }}});
		
		
		
		requeEmployeeWork.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				int c = 5 ;
		     	  String dateWork = "";
		   	  String workGiven = "";
		   	  numberWorksUser =  searchBarUser.getText() ;
		   	  String jobCodeW = "";
		   	  
		   	  
		   	
		     	  
		     	  try {
		  			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
		  			String query = " SELECT * FROM tasks where userID = '"+ numberWorksUser + "'" ;
		  			pT = conn.prepareStatement(query);
		             rT = pT.executeQuery();
		             while (rT.next()) {
		             	
		          	   dateWork = rT.getString("work");
		            	 workGiven  = rT.getString("date");
		            	 numberWorks = rT.getString("id");
		            	 jobCodeW = rT.getString("jobCode");
		             	 //c = rT.getInt("count(*)");
		            	 
		             	 
		             	 modelEmployeeWork.addRow(new Object[] { jobCodeW, workGiven
		             	 
		             	 
		             		
		             	 }); 
		             	 
		             }
		  			
		  		} catch (SQLException et) {
		  			
		  			et.printStackTrace();
		  		}
	        	
				
			}	});
		
		
		
		tableEmployeeWork.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				
				int rowWorkCode = tableEmployeeWork.getSelectedRow();
				displayWork(rowWorkCode);
				String JOBCODE = jPtableEmployeeWorkContent.getText().toString();
				String WorkContent = "";
				
				
				try {
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					
					String query = " SELECT * FROM tasks where jobCode = '"+ JOBCODE + "'" ;
		  			pT = conn.prepareStatement(query);
		  			while(rT.next()) {
		  				WorkContent = rT.getString("jobCode");
		  				
		  				
		  				jPtableEmployeeShowWorkContent.setText(WorkContent);
		  			}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	  			
				
				
				
			}
		});
		
		
		
		
		
		ASSIGNFIRE.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				String ASSIGNFNM1 = ASSIGNFNM.getText();
				String ASSIGNSNM1 = ASSIGNSNM .getText();
				String  ASSIGNUSER1 =  ASSIGNUSER.getText();
				String  ASSIGNUSERID1 = ASSIGNUSERID.getText();
				String ASSIGNEMAIL1 = ASSIGNEMAIL.getText();
				
				
				
				String query = "INSERT INTO `restaurant`.`fired`(`fname`,`sname`,`username`,`userID`,`email`)VALUES(?,?,?,?,?)";
				
				
				
				try {
					
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					pT= conn.prepareStatement(query);
					
					pT.setString(1, ASSIGNFNM1 );
					pT.setString(2,ASSIGNSNM1);
					pT.setString(3,  ASSIGNUSER1);
					pT.setString(4, ASSIGNUSERID1);
					pT.setString(5, ASSIGNEMAIL1);
					
					
					pT.execute();
					LoadFiredEmployee();
					modelFIRE.setRowCount(0);
					fire();
					//employeeWork();
					
					
					
					JOptionPane.showConfirmDialog(null,ASSIGNUSER.getText(), "DO you really want to fire",0);
				
				} catch (SQLException e1) {
					
					JOptionPane.showMessageDialog(null, "Not Fired");
					
					e1.printStackTrace();
				}
				
				
			
			
				
				
				
				
			}
			
		});
       ASSIGNRETIRE.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				String ASSIGNFNM2 = ASSIGNFNM.getText();
				String ASSIGNSNM2 = ASSIGNSNM .getText();
				String  ASSIGNUSER2 =  ASSIGNUSER.getText();
				String  ASSIGNUSERID2 = ASSIGNUSERID.getText();
				String ASSIGNEMAIL2 = ASSIGNEMAIL.getText();
				
             String query = "INSERT INTO `restaurant`.`retired`(`fname`,`sname`,`username`,`userID`,`email`)VALUES(?,?,?,?,?)";
				
				
				
				try {
					
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					pT= conn.prepareStatement(query);
					
					pT.setString(1, ASSIGNFNM2 );
					pT.setString(2,ASSIGNSNM2);
					pT.setString(3,  ASSIGNUSER2);
					pT.setString(4, ASSIGNUSERID2);
					pT.setString(5, ASSIGNEMAIL2);
					
					
					pT.execute();
					modelEmployeeWork.setRowCount(0);
					employeeWork();
					
					
					
					JOptionPane.showConfirmDialog(null,ASSIGNUSER.getText(), "So probably you are tired of them hehe",0);
				
				} catch (SQLException e1) {
					
					JOptionPane.showMessageDialog(null, "Not Added");
					
					e1.printStackTrace();
				}
				
				
			
			
				
			}
			
		});
      ASSIGNCONTRACT.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		String ASSIGNFNM3 = ASSIGNFNM.getText();
		String ASSIGNSNM3 = ASSIGNSNM .getText();
		String ASSIGNUSER3 =  ASSIGNUSER.getText();
		String ASSIGNUSERID3 = ASSIGNUSERID.getText();
		String ASSIGNEMAIL3 = ASSIGNEMAIL.getText();
		
	}
	
});
      
      
      
      modelFIRE.setColumnIdentifiers(columnEmployeeFIRE);
    
      
      /**
      String fnme2 = "";
      String snme2 = "" ;
  	  String usnme2 = "";
   	  String uside2  = "";
  	  String eme2  = "";
  	  String imge2  = "";
  
      
      try {
      	
      	
      	
      	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
      	String query2 = "SELECT * FROM fired"; 
      	
      	pT = conn.prepareStatement(query2);
          rT = pT.executeQuery();
          
          
          while (rT.next()) {
          	
          	fnme2 = rT.getString("fname");
          	snme2  = rT.getString("sname");
          	usnme2 = rT.getString("username");
          	uside2 = rT.getString("userID");
          	eme2  = rT.getString("email");
          	//imge2  = rT.getString("image");
          	 
          	modelFIRE.addRow(new Object[] {fnme2 , snme2, usnme2, uside2, eme2 });
          	 
          	
          	
          }
          
      	
      }catch(Exception ex) {
      	
      	
      	
      }
      
      **/
      StaffActivities.add(STAFFMAINPANE);
      STAFFMAINPANE.setLayout(cR3);
      
      tableFIRE.setModel(modelFIRE);
      jPtableFIRE = new JScrollPane(tableFIRE);
      FireUserID.setPreferredSize(new Dimension(0,0));
      FireUserID.setHorizontalAlignment(SwingConstants.CENTER);
      EmployeeFIREDTABLE.add(jPtableFIRE);
      EmployeeFIRE.add(EmployeeFIREDTABLE);
      EmployeeFIREREASON.add(menuBar);
      EmployeeFIREREASON.add( FireUserID);
      EmployeeFIREREASON.add(Reasonfiring );
      EmployeeFIREREASON.add(FIRE);
      EmployeeFIRE.add(EmployeeFIREREASON);
      
    menuBar.add(menu);
    menu.setPreferredSize(new Dimension(100,30));
    menu.add(menuItem);
    menu.add(menuItemFind);
    menu.add(menuItemReview);
    
    
      menuItem.setPreferredSize(new Dimension(100,30));
      menuItemFind.setPreferredSize(new Dimension(100,30));
      menuItemReview.setPreferredSize(new Dimension(100,30));
      menu.setBackground(Color.WHITE);
      menu.setForeground(Color.WHITE);
      
      FireUserID.setBackground(Color.WHITE);
      
      
      EmployeeFIRE.setPreferredSize(new Dimension(860,550));
		EmployeeFIREDTABLE.setPreferredSize(new Dimension(860,550));
		EmployeeFIREREASON.setPreferredSize(new Dimension(0,0));
		jPtableFIRE.setPreferredSize(new Dimension(860,550));
		jPtableFIRE.setBackground(Color.WHITE);
		EmployeeFIREDTABLE.setBackground(Color.WHITE);
		Reasonfiring.setBackground(Color.LIGHT_GRAY);
		STAFFMAINPANE.add(employeeMainBar); 
	    STAFFMAINPANE.add(EmployeeFIRE); 
	    
	    
	    tableFIRE.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				int rowFire = tableFIRE.getSelectedRow();
				showFired(rowFire);
			}
			});
	    
	    FIRE.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				String USER = FireUserIDGet.getText();
				String REASON = Reasonfiring.getText();
				
				
				if(REASON.equals("")) {
					JOptionPane.showConfirmDialog(null, "Kindly add reason as to why you are firing: ",  FireUserIDGet.getText() ,0 );
				}
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					String query = "INSERT INTO `restaurant`.`firedreason`(`userID`,`reason`) VALUES(?,?)";
					pT = conn.prepareStatement(query);
					pT.setString(1, USER);
					pT.setString(2, REASON);
					pT.execute();
					
					JOptionPane.showConfirmDialog(null, USER, "OFFICIALLY OUT OF THE COMPANY: ",0 );
					employeeFiringNow();
					employeeWork();
					 employeeData();
					 modelFIRE.setRowCount(0);
					 fire();
					
					Reasonfiring.setText("");
				} catch (SQLException e1) {
					
					JOptionPane.showConfirmDialog(null, USER , "NOT OUT OF THE COMPANY: ",0 );
					e1.printStackTrace();
				}
				
			}
	    	
	    });
	    
	    
	   /* try {
	    	
	    	String USERIDFIRE =  FireUserIDGet.getText();
			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
			String queryD = " DELETE FROM `restaurant`.`signin` WHERE userID = '"+ USERIDFIRE + "'";
			
			pT = conn.prepareStatement(queryD);
			 rT = pT.executeQuery();
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
	    */
	    
	    
	    String USEREMPLOYEEDELETE = FireUserIDGet.getText();
	    
	    
	    
	    
	   // FireUserIDGet
		
		/* CustomerPanel.add(CustomerNewPanel);
		CustomerPanel.add(CustomerRecordsPanel);
		CustomerPanel.add(CustomerMatchingPanel);
		*/
		
		
	/*	String JOBCODE = DateOfWork.getText().toString();
		
		DateOfWork.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				
				if(e.getKeyCode()== KeyEvent.VK_ENTER) {
					
				
					
					String WorkContent = "";
				try {
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/restaurant", "root", "chegeben123");
					String query = " SELECT * FROM tasks where jobCode = '"+ JOBCODE + "'" ;
		  			pT = conn.prepareStatement(query);
		  			while(rT.next()) {
		  				WorkContent = rT.getString("jobCode");
		  				
		  				
		  				jPtableEmployeeShowWorkContent.setText(WorkContent);
		  			}	} catch (SQLException e1) {
					
					e1.printStackTrace();
		
				
				}
			}
			}
			});
			*/	
		
		
		//jPtableEmployeeShowWorkContent
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		employee.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				//cR3.show(STAFFMAINPANE, "1");
				cR3.show(STAFFMAINPANE, "1");
				
				/* for(int i = 0; i< 20; i++) {
					
					employeeDetail = new JTextArea();
					employeeDetail.setPreferredSize(new Dimension(220,200));
					employeeDetailPane.add(employeeDetail);
				} */
			}
			 
		 });
		
		
		
       fired.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				cR3.show(STAFFMAINPANE, "3");
				modelFIRE.setRowCount(0);
				fireEmployee();
				//fire();
				
				
			}
			
		});
		
		
       // Creating instance of Booking panel
       
       
      
       
       
       //creating the component inside the MainBooking
       
       BookingAvailable.setBackground(Color.white);
       BookingChoice.setLayout(new FlowLayout(FlowLayout.LEFT));
       
       //creating the component inside the BookingDetails
       
       BookingDetails.setBackground(Color.RED);
       
       BookingStatistics.setBackground(Color.BLUE);
       
       BookingSoon.setBackground(Color.GRAY);
       
       BookingBooked.setBackground(Color.YELLOW);
       MainBooking.setBackground(Color.white);
      // BookingChoice.setLayout(new FlowLayout(FlowLayout.LEFT));
       
    // Creating instance of Booking panel: Closing
		//

		
		
		//CR2
		staffBtn.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				cR2.show(ScreenBar, "1");
				
				
				
				
			}
			
		});
		customerBtn.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				cR2.show(ScreenBar, "2");
				
				
				
				
				//Customer.show();
			}
			
		});
      orderBtn.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		cR2.show(ScreenBar, "3");
		
	}
	
        });
      bookingBtn.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		cR2.show(ScreenBar, "4");
	
	}
	
  });
    roomsBtn.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		cR2.show(ScreenBar, "5");
		
	}
	
});
    paymentsBtn.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		cR2.show(ScreenBar, "6");
		
	}
	
});
   healthBtn.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		cR2.show(ScreenBar, "7");
		
	}
	
});
   programsBtn.addActionListener(new ActionListener() {

	
	public void actionPerformed(ActionEvent e) {
		
		cR2.show(ScreenBar, "8");
		
	}
	
});
   
   reportsBtn.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			
			cR2.show(ScreenBar, "9"); 
			
		}
		
	});
		
   
   cRCustomer.layoutContainer(CustomerNewInfo);
   
   cRCustomer.setHgap(1);
   
   
    
    cRCustomer.addLayoutComponent(CustomerNewInfoCredentials ,"1");
    cRCustomer.addLayoutComponent(CustomerRecordsPaneMain ,"2");
      //  cR3.layoutContainer();
   
   
        //
		
		//
    
    
    // For adding the Booking panel into cardlayout
    
    
    
   
    
  
    
 BookingbookRoom.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			
			crBooking.show(MainBooking, "1");
		
    	
    }});
 
 Bookingavailable.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			
			crBooking.show(MainBooking, "2");
		
 	
 }});
 
 Bookingbooked.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			
			crBooking.show(MainBooking, "3");
		
 	
 }});
 
 
 Bookingexiting.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			
			crBooking.show(MainBooking, "4");
		
 	
 }});
 
 
 Bookingstatistics.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			
			crBooking.show(MainBooking, "5");
		
 	
 }});
    
    
 MainBooking.setLayout(crBooking);
 crBooking.layoutContainer(MainBooking);
 crBooking.addLayoutComponent(BookingDetails, "1");
 crBooking.addLayoutComponent(BookingBooked, "2");
 crBooking.addLayoutComponent(BookingAvailable, "3");
 crBooking.addLayoutComponent(BookingSoon, "4");
 crBooking.addLayoutComponent(BookingStatistics, "5");
 
 
 
 
 crBooking.setHgap(5);
 crBooking.setVgap(5);
    
    
    // For adding the Booking panel :Closing
    
   
       
        cR3.layoutContainer(STAFFMAINPANE);
        cR3.addLayoutComponent(employeeMainBar, "1");
        cR3.addLayoutComponent(yourPage, "2");
        cR3.addLayoutComponent( EmployeeFIRE, "3");
        
        
	    cR2.layoutContainer(ScreenBar);
		cR2.addLayoutComponent(Staff, "1");
		cR2.addLayoutComponent(Customer, "2");
		cR2.addLayoutComponent(Order, "3");
		
		cR2.addLayoutComponent(Booking, "4");
		
		cR2.addLayoutComponent(Rooms, "5");
		
		cR2.addLayoutComponent(Payment, "6");
		
		cR2.addLayoutComponent(Heath, "7");
		
		cR2.addLayoutComponent(Programs, "8");
		
		cR2.addLayoutComponent(Reports, "9");
		
		
		cR.layoutContainer(MainPanel);
		MainPanel.setMaximumSize(new Dimension(MainPanel.getMaximumSize().width, MainPanel.getPreferredSize().height));
		
		cR.setHgap(10);
		cR.setVgap(10);
		
		//
		
	}


	private void setContentPane(JPanel MainPanel) {
		// TODO Auto-generated method stub
		
	}

}
