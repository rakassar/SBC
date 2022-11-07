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
import TestScenarios.TC_004_LeadDocsCollectedUnEmployed;
import TestScenarios.TC_005_LeadDocsCollectedSelfEmployed;
import TestScenarios.TC_006_ETBLeadCreation;

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

public class script1 implements ActionListener {

	private JFrame frame;
	private JTextField LeadId;
	private JTextField Loginid;
	public static String ULeadId;
	public String items;

	/**
	 * Launch the application.
	 */
	public static void ScriptsFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					script1 window = new script1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws InterruptedException
	 */
	public script1() throws InterruptedException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws InterruptedException
	 */
	private void initialize() throws InterruptedException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setForeground(new Color(0, 128, 128));
		frame.setBounds(300, 200, 1000, 500);
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
		comboBox1.setModel(new DefaultComboBoxModel(new String[] { "Sales", "Service Request", "Jobs" }));
		comboBox1.setBounds(187, 89, 208, 20);
		frame.getContentPane().add(comboBox1);

		final JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] { "https://sbcdev.crmnext.com/sn/app/login/login",
				"https://sbcdev.crmnext.com/oldi5/app/login/login" }));
		comboBox2.setBounds(187, 127, 208, 20);
		frame.getContentPane().add(comboBox2);

		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setIcon(new ImageIcon("D:\\Rizwan\\Automation\\lib\\Jars\\crm2.png"));
		lblNewLabel3.setBounds(35, 11, 157, 36);
		frame.getContentPane().add(lblNewLabel3);

		JLabel lblStatusCode = new JLabel("All Test Cases");
		lblStatusCode.setBounds(77, 168, 120, 14);
		frame.getContentPane().add(lblStatusCode);

		JLabel lblStatusCode1 = new JLabel("Need to be Execute");
		lblStatusCode1.setBounds(400, 168, 174, 14);
		frame.getContentPane().add(lblStatusCode1);

		final JComboBox comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] { "All", "TC_001_NTBLeadCreation",
				"TC_002_NTBLeadAppointment", "TC_003_NTBDocsCollectionEmployed","TC_004_LeadDocsCollectedUnEmployed","TC_005_LeadDocsCollectedSelfEmployed", "TC_005-NTB Fill Account Details",
				"TC_006-NTB Lead Processing" }));
		comboBox3.setBounds(180, 168, 208, 20);
		frame.getContentPane().add(comboBox3);

		final JComboBox comboBox4 = new JComboBox();
		comboBox4.setModel(new DefaultComboBoxModel(new String[] { "All"}));
		comboBox4.setBounds(550, 168, 208, 20);
		frame.getContentPane().add(comboBox4);

		ButtonGroup bG = new ButtonGroup();
		final JRadioButton Radio_TestCase = new JRadioButton("Testcases Only");
		Radio_TestCase.setBounds(187, 197, 98, 23);
		// frame.getContentPane().add(Radio_Status);

		final JRadioButton RadioleadId = new JRadioButton("Run For LeadID");
		RadioleadId.setBounds(306, 197, 89, 23);
		// frame.getContentPane().add(RadioleadId);

		bG.add(Radio_TestCase);
		bG.add(RadioleadId);
		frame.getContentPane().add(RadioleadId);
		frame.getContentPane().add(Radio_TestCase);
		Radio_TestCase.setSelected(true);
		Radio_TestCase.setVisible(true);
		RadioleadId.setVisible(true);

		final JLabel lblFillLeadid = new JLabel("LeadID");
		lblFillLeadid.setBounds(187, 268, 98, 25);
		// frame.getContentPane().add(lblFillLeadid);
		LeadId = new JTextField();
		LeadId.setBounds(306, 268, 89, 20);
		// frame.getContentPane().add(LeadId);
		// LeadId.setColumns(10);

		final JLabel LoginIdLabel = new JLabel("User LoginID");
		LoginIdLabel.setBounds(187, 232, 98, 23);
		// frame.getContentPane().add(LoginIdLabel);

		Loginid = new JTextField();
		Loginid.setBounds(306, 237, 89, 20);

		RadioleadId.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (RadioleadId.isSelected() == true) {
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

				} else if (RadioleadId.isSelected() == false) {
					LeadId.setVisible(false);
					Loginid.setVisible(false);
					lblFillLeadid.setVisible(false);
					LoginIdLabel.setVisible(false);

				}
			}
		});

		JButton addbutton = new JButton("Add in Suite");
		addbutton.setBounds(180, 317, 140, 23);
		frame.getContentPane().add(addbutton);

		JButton removebutton = new JButton("Remove from Suite");
		removebutton.setBounds(340, 317, 140, 23);
		frame.getContentPane().add(removebutton);

		JButton removeallbutton = new JButton("Clear Test Suite");
		removeallbutton.setBounds(500, 317, 140, 23);
		frame.getContentPane().add(removeallbutton);

		JButton runbutton = new JButton("Run");
		runbutton.setBounds(220, 347, 80, 23);
		frame.getContentPane().add(runbutton);

		TestNG testNG = new TestNG();
		comboBox3.addActionListener(comboBox3);

		comboBox3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox3.getSelectedItem();
			}
		});

		addbutton.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				items = comboBox3.getSelectedItem().toString();

				System.out.println(items);
				System.out.println(comboBox4.getItemCount());
				int itemtoadd=0;

				for (int i = 0; i<comboBox4.getItemCount(); i++)
				
				  {

					Object itemtobox = comboBox4.getItemAt(i);
					System.out.println(itemtobox);

					if (!items.equals(itemtobox)) 
					
					{
						
					     System.out.println("need to addd");
						 //comboBox4.addItem(items);
					     itemtoadd++;
                         continue;
					}
                    
					
					else {

						if (items.equals(itemtobox)) 
						
						      {
                                  //comboBox4.addItem(items);
							     System.out.println("Item Already added");
							     JOptionPane.showMessageDialog(frame, "Sorry! Test Suite Already added.");
  
							      break;
                                }
											
                          }
					
}
				if (itemtoadd==comboBox4.getItemCount()) {
					
					comboBox4.addItem(items);
					System.out.println("Item added now");	
					 JOptionPane.showMessageDialog(frame, "Thanks! Test Suite added.");
				}
				
}
		});

		removebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				items = comboBox4.getSelectedItem().toString();
				comboBox4.removeItem(items);

			}
		});

		removeallbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				comboBox4.removeAllItems();

			}
		});

		runbutton.addActionListener(new ActionListener()

		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBox4.getSelectedItem() == "TC_001_NTBLeadCreation") {
					testNG.setTestClasses(new Class[] { TC_001_NTBLeadCreation.class });
					// testNG.addListener(new Test 5SuiteListener());
					testNG.setDefaultSuiteName("TC_001_NTBLeadCreation");
					// testNG.setDefaultTestName("My Test");
					// testNG.setOutputDirectory("/Users/pankaj/temp/testng-output");
					testNG.run();
				} else if (comboBox4.getSelectedItem() == "TC_002_NTBLeadAppointment") {

					testNG.setTestClasses(new Class[] { TC_002_NTBLeadAppointment.class });
					// testNG.addListener(new Test 5SuiteListener());
					testNG.setDefaultSuiteName("TC_002_NTBLeadAppointment");
					// testNG.setDefaultTestName("My Test");
					// testNG.setOutputDirectory("/Users/pankaj/temp/testng-output");
					testNG.run();
				} else if (comboBox4.getSelectedItem() == "TC_003_NTBDocsCollectionEmployed") {
					testNG.setTestClasses(new Class[] { TC_003_NTBDocsCollectionEmployed.class });
					// testNG.addListener(new Test 5SuiteListener());
					testNG.setDefaultSuiteName("TC_003_NTBDocsCollectionEmployed");
					// testNG.setDefaultTestName("My Test");
					// testNG.setOutputDirectory("/Users/pankaj/temp/testng-output");
					testNG.run();
				} 
				
				else if (comboBox4.getSelectedItem() == "All")

				{

					testNG.setTestClasses(new Class[] { TC_001_NTBLeadCreation.class,TC_003_NTBDocsCollectionEmployed.class,TC_004_LeadDocsCollectedUnEmployed.class,TC_005_LeadDocsCollectedSelfEmployed.class,TC_006_ETBLeadCreation.class});
					testNG.run();

				}

				/*
				 * else if (comboBox4.getSelectedItem()=="K") {
				 * 
				 * 
				 * String lovs=comboBox4.getSelectedItem().toString(); for (int
				 * i=0;i<=comboBox4.getItemCount();i++) { String
				 * nn="new Class[] {"+lovs+".class}"; testNG.setTestClasses(nn); testNG.run(); }
				 * 
				 * }
				 */

				else {
					JOptionPane.showMessageDialog(frame,"Please corret the Test Case Name AND Class Method Name as same OR check the Testcase Code !");

				}

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
