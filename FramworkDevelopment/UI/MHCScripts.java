package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;


import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class MHCScripts {

	private JFrame frame;
	private JTextField LeadId;
	private JTextField Loginid;
    public static String ULeadId;
    public static String ULoginid;

	/**
	 * Launch the application.
	 */
	public static void MhcScriptsFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MHCScripts window = new MHCScripts();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MHCScripts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setForeground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 637, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        final JPanel panelTop = new JPanel();
		JLabel lblNewLabel = new JLabel("Process");
		lblNewLabel.setBounds(69, 89, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Url");
		lblNewLabel_1.setBounds(69, 133, 100, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Saving & Deposit", "Corporate Loan", "Retail Loan"}));
		comboBox.setBounds(187, 89, 208, 20);
		frame.getContentPane().add(comboBox);
		
		final JComboBox comboBox_1 = new JComboBox();
	
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"http://mhcsa/sn/app/login/login", "http://mhcsaacc/sn/app/login/login"}));
		comboBox_1.setBounds(187, 127, 208, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Rizwan\\Selenium Workspace\\MHC\\Jars\\crm2.png"));
		lblNewLabel_2.setBounds(35, 11, 157, 36);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblStatusCode = new JLabel("Status Code");
		lblStatusCode.setBounds(66, 168, 74, 14);
		frame.getContentPane().add(lblStatusCode);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"All", "Assign To CCE", "Assign To Counselling", "Docs Pending", "Docs Submitted", "Asses Lead", "Sea Verified"}));
		comboBox_2.setBounds(187, 168, 208, 20);
		frame.getContentPane().add(comboBox_2);
		
		ButtonGroup bG = new ButtonGroup();
		final JRadioButton Radio_Status = new JRadioButton("Till Status");
		Radio_Status.setBounds(187, 197, 98, 23);
		//frame.getContentPane().add(Radio_Status);
		
		final JRadioButton RadioleadId = new JRadioButton("For LeadID");
		RadioleadId.setBounds(306, 197, 89, 23);
		//frame.getContentPane().add(RadioleadId);
		
		bG.add(Radio_Status);
		bG.add(RadioleadId);
		
		LeadId = new JTextField();
		LeadId.setBounds(306, 268, 89, 20);
		//frame.getContentPane().add(LeadId);
		//LeadId.setColumns(10);
		
		final JLabel lblFillLeadid = new JLabel("LeadID");
		lblFillLeadid.setBounds(187, 268, 98, 25);
		//frame.getContentPane().add(lblFillLeadid);
		
		final JLabel LoginIdLabel = new JLabel("User LoginID");
		LoginIdLabel.setBounds(187, 232, 98, 23);
		//frame.getContentPane().add(LoginIdLabel);
		
		Loginid = new JTextField();
		Loginid.setBounds(306, 237, 89, 20);
		//frame.getContentPane().add(Loginid);
		//Loginid.setColumns(10);
		/*
		comboBox.addItemListener(new ItemListener() {
			   @Override
			   public void itemStateChanged(ItemEvent arg0) { // picks up changes to combobox selection
			      if (arg0.getStateChange() == ItemEvent.SELECTED) {
			         String newSelection = comboBox.getSelectedItem(); // takes the selected item
			         textField.setText(newSelection); // publishes to the textfield
			      }
			   }
		});*/
		
	   
		    comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				if(e.getStateChange() == ItemEvent.SELECTED && (comboBox_2.getSelectedItem().toString().equals("Assign To Counselling")||comboBox_2.getSelectedItem().toString().equals("Docs Pending")||comboBox_2.getSelectedItem().toString().equals("Docs Submitted")||comboBox_2.getSelectedItem().toString().equals("Asses Lead")||comboBox_2.getSelectedItem().toString().equals("Sea Verified")))
						
					//"Assign To Counselling"))
				{
					frame.getContentPane().add(RadioleadId);
					frame.getContentPane().add(Radio_Status);
					Radio_Status.setSelected(true);
					RadioleadId.setVisible(true);
				    Radio_Status.setVisible(true);
					LeadId.setVisible(false);
					Loginid.setVisible(false);
					lblFillLeadid.setVisible(false);
					LoginIdLabel.setVisible(false);
					//Radio_Status.setText((String) comboBox_2.getSelectedItem());
			     }
				
			
				else if (e.getStateChange() == ItemEvent.SELECTED && (comboBox_2.getSelectedItem().toString().equals("All")||comboBox_2.getSelectedItem().toString().equals("Assign To CCE")))
					 //if(e.getStateChange() == ItemEvent.SELECTED) 
					{   
				    RadioleadId.setVisible(false);
					Radio_Status.setVisible(false);
					LeadId.setVisible(false);
					Loginid.setVisible(false);
					lblFillLeadid.setVisible(false);
					LoginIdLabel.setVisible(false);
			}
			}
			
			
		   });
		    
		    /*
		    RadioleadId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (RadioleadId.isEnabled()==true)
					{
						frame.getContentPane().add(LeadId);
						LeadId.setColumns(10);
						frame.getContentPane().add(lblFillLeadid);
						frame.getContentPane().add(LoginIdLabel);
						frame.getContentPane().add(Loginid);
						Loginid.setColumns(10);
						LeadId.setVisible(true);
						Loginid.setVisible(true);
						lblFillLeadid.setVisible(true);
						LoginIdLabel.setVisible(true);
						
					}
					else if (RadioleadId.isEnabled()==false)
					{
						LeadId.setVisible(false);
						Loginid.setVisible(false);
						lblFillLeadid.setVisible(false);
						LoginIdLabel.setVisible(false);
						
					}
				}
			});
		    */
		    
		    /*RadioleadId.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if (RadioleadId.isEnabled()==true)
					{
						frame.getContentPane().add(LeadId);
						LeadId.setColumns(10);
						frame.getContentPane().add(lblFillLeadid);
						frame.getContentPane().add(LoginIdLabel);
						frame.getContentPane().add(Loginid);
						Loginid.setColumns(10);
						LeadId.setVisible(true);
						Loginid.setVisible(true);
						lblFillLeadid.setVisible(true);
						LoginIdLabel.setVisible(true);
						
					}
					else if (RadioleadId.isEnabled()==false)
					{
						LeadId.setVisible(false);
						Loginid.setVisible(false);
						lblFillLeadid.setVisible(false);
						LoginIdLabel.setVisible(false);
						
					}
					
				}
			});*/
       
		        RadioleadId.addItemListener(new ItemListener()
		        {
				public void itemStateChanged(ItemEvent e) {
				if (RadioleadId.isSelected()==true)
					{
						frame.getContentPane().add(LeadId);
						LeadId.setColumns(10);
						frame.getContentPane().add(lblFillLeadid);
						frame.getContentPane().add(LoginIdLabel);
						frame.getContentPane().add(Loginid);
						Loginid.setColumns(10);
						LeadId.setVisible(true);
						Loginid.setVisible(true);
						lblFillLeadid.setVisible(true);
						LoginIdLabel.setVisible(true);
						
					 }
					else if (RadioleadId.isSelected()==false)
					{
						LeadId.setVisible(false);
						Loginid.setVisible(false);
						lblFillLeadid.setVisible(false);
						LoginIdLabel.setVisible(false);
						
					}
				}
			});
        
		      
JButton btnNewButton = new JButton("Run");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{ 
			
/*		 --1st way---
TestListenerAdapter tla = new TestListenerAdapter();
TestNG testng = new TestNG();
List<String> suites = Lists.newArrayList();
suites.add("c:/tests/testng1.xml");//path to xml..
suites.add("c:/tests/testng2.xml");
tng.setTestSuites(suites);
tng.run();
*/

/*---2nd way---
// Create object of TestNG Class

TestNG testNG = new TestNG();
//Create a list of String 
ArrayList<String> suitefiles=new ArrayList<String>();

// Add xml file which you have to execute
suitefiles.add("D:\Rizwan\Selenium Workspace\MHC\testng1.xml");

// now set xml file for execution
runner.setTestSuites(suitefiles);

// finally execute the runner using run method
//runner.run();*/

                 /*    3rdway run time testng xml create 
				    XmlSuite suite = new XmlSuite();
				    suite.setName("MyTestSuite");
				    //suite.setParameters(options.convertToMap());

				    ArrayList<XmlClass> classes = new ArrayList<XmlClass>();
				 

				    XmlTest test = new XmlTest(suite);
				    test.setName("MyTests");
				    test.setXmlClasses(classes);

				    ArrayList<XmlSuite> suites = new ArrayList<XmlSuite>();
				    suites.add(suite);

				    TestNG testNG = new TestNG();
				    testNG.setXmlSuites(suites);

			  //  TestNG testNG = new TestNG();
			   * 
*/				 TestNG testNG = new TestNG();
			    
		if (comboBox.getSelectedItem().toString().equals("Saving & Deposit"))
		{   
					if (comboBox_2.getSelectedItem().toString().equals("All"))
					{
						
						//frame.setVisible(false);
						ArrayList<String> suitefiles=new ArrayList<String>();
						//suitefiles.clear();
						suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\CreateSDlead_All.xml");
						testNG.setTestSuites(suitefiles);
					    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
					    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
					   // classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadDocsPending"));
					    testNG.run();
					}
					
					if (comboBox_2.getSelectedItem().toString().equals("Assign To CCE"))
					{    
				       frame.setVisible(false);
				       ArrayList<String> suitefiles=new ArrayList<String>();
					    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_AssignToCCE.xml");
						testNG.setTestSuites(suitefiles);
				       //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
				       testNG.run();
					}
					
					if (comboBox_2.getSelectedItem().toString().equals("Assign To Counselling"))
					{
					/*	if (LeadId.equals("") && Loginid.equals(""))	
						{
							JOptionPane.showMessageDialog(frame, "you are authorised to access scripts");
		                    frame.setVisible(false);
							MHCScripts.MhcScriptsFrame();
						}
						else 	
						{
							JOptionPane.showMessageDialog(frame, "Sorry! you are not authorised.");
						}*/
						
						         if(Radio_Status.isSelected()==true && RadioleadId.isSelected()==false)
						         {
						        	 frame.setVisible(false);
						        	 ArrayList<String> suitefiles=new ArrayList<String>();
					    	suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_AssignToCouncelling.xml");
					    	testNG.setTestSuites(suitefiles);
					    	//classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
					    	//classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
					    	testNG.run();
						         }
						         else if (RadioleadId.isSelected()==true && Radio_Status.isSelected()==false )
						         {
							frame.setVisible(false);
							ULeadId=LeadId.getText();
							ULoginid=Loginid.getText();
						    ArrayList<String> suitefiles=new ArrayList<String>();
						    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_AssignToCouncellingForLeadID.xml");
							testNG.setTestSuites(suitefiles);
							
						    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
						    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
						    testNG.run();
						   
						    }
					}
					
					if (comboBox_2.getSelectedItem().toString().equals("Docs Pending"))
					{

				         if(Radio_Status.isSelected()==true && RadioleadId.isSelected()==false)
				         {
				        	 frame.setVisible(false);
							    ArrayList<String> suitefiles=new ArrayList<String>();
							    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_Docspending.xml"); 
								testNG.setTestSuites(suitefiles);
							    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
							    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
							    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadDocsPending"));
							    testNG.run();
				         }
				         else if (RadioleadId.isSelected()==true && Radio_Status.isSelected()==false )
				           {
					frame.setVisible(false);
					ULeadId=LeadId.getText();
					ULoginid=Loginid.getText();
				    ArrayList<String> suitefiles=new ArrayList<String>();
				    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_DocspendingForLeadID.xml");
					testNG.setTestSuites(suitefiles);
					
				    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
				    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
				    testNG.run();
				   
				            }
						
					   
					      }
					
					
					if (comboBox_2.getSelectedItem().toString().equals("Docs Submitted"))
					{

				         if(Radio_Status.isSelected()==true && RadioleadId.isSelected()==false)
				         {
				        	 frame.setVisible(false);
							    ArrayList<String> suitefiles=new ArrayList<String>();
							    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_DocsSubmitted.xml"); 
								testNG.setTestSuites(suitefiles);
							    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
							    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
							    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadDocsPending"));
							    testNG.run();
				         }
				         else if (RadioleadId.isSelected()==true && Radio_Status.isSelected()==false )
				           {
					frame.setVisible(false);
					ULeadId=LeadId.getText();
					ULoginid=Loginid.getText();
				    ArrayList<String> suitefiles=new ArrayList<String>();
				    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\SD_DocsSubmittedForLeadID.xml");
					testNG.setTestSuites(suitefiles);
					
				    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLead"));
				    //classes.add(new XmlClass("TestScenarios.SavingAndDepositCreateLeadAssignToCouncelling"));
				    testNG.run();
				   
				            }
						
					   
					      }
					
					
				}
		
	if (comboBox.getSelectedItem().toString().equals("Corporate Loan"))
	{
					    frame.setVisible(false);
					    ArrayList<String>  suitefiles=new ArrayList<String>();
					    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\CreateSDlead_All11.xml");
						testNG.setTestSuites(suitefiles);
					    //classes.add(new XmlClass("TestScenarios.CorporateLoan"));
					    testNG.run();
	}
				
/*else if (comboBox.getSelectedItem()=="")
		{
					

	frame.setVisible(false);
	ArrayList<String> suitefiles=new ArrayList<String>();
    suitefiles.add("D:\\Rizwan\\Selenium Workspace\\MHC\\CreateSDlead_All211.xml");
	testNG.setTestSuites(suitefiles);
 //classes.add(new XmlClass("TestScenarios.RetailLoan"));
    testNG.run();				 
}*/
}
			
			
		});


			btnNewButton.setBounds(248, 317, 89, 23);
			frame.getContentPane().add(btnNewButton);
}

	private void LeadIdUserDetails() {
		// TODO Auto-generated method stub
		
	}
}
