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
import TestScenarios.TC_001_NTBLeadCreation;
import TestScenarios.TC_002_NTBLeadAppointment;
import TestScenarios.TC_003_NTBDocsCollectionEmployed;

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


public class Scripts implements ActionListener  {

	private JFrame frame;
	private JTextField LeadId;
	private JTextField Loginid;
    public static String ULeadId;
    public static String ULoginid;

	/**
	 * Launch the application.
	 */
	public static void ScriptsFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scripts window = new Scripts();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws InterruptedException 
	 */
	public Scripts() throws InterruptedException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws InterruptedException 
	 */
	private void initialize() throws InterruptedException {
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
		
		JLabel lblNewLabel2 = new JLabel("Url");
		lblNewLabel2.setBounds(69, 133, 100, 14);
		frame.getContentPane().add(lblNewLabel2);
		
		final JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Sales", "Service Request", "Jobs"}));
		comboBox1.setBounds(187, 89, 208, 20);
		frame.getContentPane().add(comboBox1);
		
		final JComboBox comboBox2 = new JComboBox();
	
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"https://sbcdev.crmnext.com/sn/app/login/login", "https://sbcdev.crmnext.com/oldi5/app/login/login"}));
		comboBox2.setBounds(187, 127, 208, 20);
		frame.getContentPane().add(comboBox2);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setIcon(new ImageIcon("D:\\Rizwan\\Automation\\lib\\Jars\\crm2.png"));
		lblNewLabel3.setBounds(35, 11, 157, 36);
		frame.getContentPane().add(lblNewLabel3);

		JLabel lblStatusCode = new JLabel("Test Scripts");
		lblStatusCode.setBounds(66, 168, 74, 14);
		frame.getContentPane().add(lblStatusCode);
		
		final JComboBox comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"TC_001_NTBLeadCreation", "TC_002_NTBLeadAppointment", "TC_003_NTBDocsCollectionEmployed", "TC_005-NTB Fill Account Details","TC_006-NTB Lead Processing"}));
		comboBox3.setBounds(187, 168, 208, 20);
		frame.getContentPane().add(comboBox3);
		
		ButtonGroup bG = new ButtonGroup();
		final JRadioButton Radio_TestCase = new JRadioButton("Testcases");
		Radio_TestCase.setBounds(187, 197, 98, 23);
		//frame.getContentPane().add(Radio_Status);
		
		final JRadioButton RadioleadId = new JRadioButton("Scripts For LeadID");
		RadioleadId.setBounds(306, 197, 89, 23);
		//frame.getContentPane().add(RadioleadId);
		
		bG.add(Radio_TestCase);
		bG.add(RadioleadId);
		frame.getContentPane().add(RadioleadId);
		frame.getContentPane().add(Radio_TestCase);
		Radio_TestCase.setSelected(true);
		Radio_TestCase.setVisible(true);
		RadioleadId.setVisible(true);
		

		final JLabel lblFillLeadid = new JLabel("LeadID");
		lblFillLeadid.setBounds(187, 268, 98, 25);
		//frame.getContentPane().add(lblFillLeadid);
		LeadId = new JTextField();
		LeadId.setBounds(306, 268, 89, 20);
		//frame.getContentPane().add(LeadId);
		//LeadId.setColumns(10);
		
		
		final JLabel LoginIdLabel = new JLabel("User LoginID");
		LoginIdLabel.setBounds(187, 232, 98, 23);
		//frame.getContentPane().add(LoginIdLabel);
		
		Loginid = new JTextField();
		Loginid.setBounds(306, 237, 89, 20);
		
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

JButton runbutton = new JButton("Run");
runbutton.setBounds(248, 317, 89, 23);
frame.getContentPane().add(runbutton);

TestNG testNG = new TestNG();
comboBox3.addActionListener(comboBox3);

comboBox3.addActionListener(new ActionListener() 
{
	@Override
    public void actionPerformed(ActionEvent e) 
    {
    	comboBox3.getSelectedItem();
    }
}
);

runbutton.addActionListener(new ActionListener() 

{
     @Override
    public void actionPerformed(ActionEvent e) 
    {
    if (comboBox3.getSelectedItem()=="TC_001_NTBLeadCreation")
    { 	
    testNG.setTestClasses(new Class[] { TC_001_NTBLeadCreation.class });
    //testNG.addListener(new Test 5SuiteListener());
    testNG.setDefaultSuiteName("TC_001_NTBLeadCreation");
    //testNG.setDefaultTestName("My Test");
    //testNG.setOutputDirectory("/Users/pankaj/temp/testng-output");
    testNG.run();
    }
    else if (comboBox3.getSelectedItem()=="TC_002_NTBLeadAppointment")
    {
    	
    	testNG.setTestClasses(new Class[] { TC_002_NTBLeadAppointment.class });
        //testNG.addListener(new Test 5SuiteListener());
        testNG.setDefaultSuiteName("TC_002_NTBLeadAppointment");
        //testNG.setDefaultTestName("My Test");
        //testNG.setOutputDirectory("/Users/pankaj/temp/testng-output");
        testNG.run();
    }
    else if (comboBox3.getSelectedItem()=="TC_003_NTBDocsCollectionEmployed")
    {
    	testNG.setTestClasses(new Class[] { TC_003_NTBDocsCollectionEmployed.class });
        //testNG.addListener(new Test 5SuiteListener());
        testNG.setDefaultSuiteName("TC_003_NTBDocsCollectionEmployed");
        //testNG.setDefaultTestName("My Test");
        //testNG.setOutputDirectory("/Users/pankaj/temp/testng-output");
        testNG.run();
    }
    else 
    {
    	JOptionPane.showMessageDialog(frame, "Please corret the Test Case Name AND Class Method Name as same OR check the Testcase Code !");
    	
    }
}
     }
);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	

        
		
	   
		   
	
