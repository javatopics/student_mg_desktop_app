package com.rathana.gui.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

import javax.naming.Context;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.rathana.App;

public class BasicUI extends JFrame implements ItemListener,ActionListener{

	private JPanel BodyPanel;
	private JPanel controlPanel;
	private JPanel editorPanel;
	private JLabel mainLabel;
	private ImageIcon leftImageIcon;
	private ImageIcon lImageIcon;
	private ImageIcon rightImageIcon;
	
	private JButton btnLeftImagIcon;
	private JButton btnRightImagIcon;
	
	private JCheckBox javaCheck,cCheck,ccCheck;
	
	private ButtonGroup rdGroup;
	private JRadioButton bmw,luxis;
	private JTextField tfName,tfEmail;
	private JPasswordField password;
	
	private JTextArea editor;
	
	private JComboBox<String> comCountry;
	private String[] countryModel={"Cambodia","Thailand","korea","China","japan","Hongkong","Vetanam"};
	
	private Vector<String> countryModelVector=new Vector<>();
	private JList<String> countryList;
	
	public BasicUI() {
		initializeVariables();
		contructLayout();
		setContentData();
	}

	private void setContentData() {
		
		//this.mainLabel.setIcon(leftImageIcon);
		
	}

	private void contructLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(790, 420));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		Border spaceBorder=BorderFactory.createEmptyBorder(10,10,10,10);
		Border titleBorder=BorderFactory.createTitledBorder("Swing Basic UI");
		this.controlPanel.setBorder(BorderFactory.createCompoundBorder(spaceBorder,titleBorder));
		
		//set components to Jpanel
		this.BodyPanel.add(this.mainLabel);
		this.BodyPanel.add(this.btnLeftImagIcon);
		this.BodyPanel.add(this.btnRightImagIcon);
		
		this.BodyPanel.add(this.javaCheck);
		this.BodyPanel.add(this.cCheck);
		this.BodyPanel.add(this.ccCheck);
		this.BodyPanel.add(this.bmw);
		this.BodyPanel.add(this.luxis);
		this.BodyPanel.add(this.tfName);
		this.BodyPanel.add(this.tfEmail);
		this.BodyPanel.add(this.password);
		
		//this.editor.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		//this.editorPanel.add(this.editor);
		
		//subscribe event
		this.javaCheck.addItemListener(this);
		this.ccCheck.addItemListener(this);
		this.cCheck.addItemListener(this);
		this.btnLeftImagIcon.addActionListener(this);
		this.btnRightImagIcon.addActionListener(this);
		
		this.BodyPanel.add(this.comCountry);
		this.BodyPanel.add(new JScrollPane(countryList));
		
		this.controlPanel.setLayout(new BorderLayout());
		this.controlPanel.add(this.BodyPanel,BorderLayout.CENTER);
		//this.controlPanel.add(this.editorPanel,BorderLayout.CENTER);
		
		add(this.controlPanel,BorderLayout.CENTER);
	}

	private void initializeVariables() {
		this.BodyPanel=new JPanel();
		this.controlPanel=new JPanel();
		this.leftImageIcon=createImageIcon("src\\resources\\images\\test.png");
		this.mainLabel= new JLabel("MainLable",this.leftImageIcon,JLabel.LEFT);
		this.mainLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		//this.mainLabel.setHorizontalAlignment(SwingConstants.LEADING);
		
		this.lImageIcon=createImageIcon("src/resources/images/cloud-computing.png");
		this.rightImageIcon=createImageIcon("src/resources/images/cloud-computing-1.png");
		
		this.btnLeftImagIcon=new JButton("Download ...",this.lImageIcon);
		this.btnRightImagIcon=new JButton("Upload...",this.rightImageIcon);
		
		this.btnLeftImagIcon.setMargin(new Insets(5, 5, 5, 5));
		
		/*JLabel label1=new JLabel("Label 1",leftImageIcon,Label.CENTER);
		ImageIcon imageIcon=new ImageIcon("src/resources/images/cloud-computing-1.png");
	*/
		//JButton btn1=new JButton("continue",leftImageIcon);
		
		javaCheck=new JCheckBox("Java");
		cCheck=new JCheckBox("C program");
		ccCheck=new JCheckBox("c++");
		
		rdGroup=new ButtonGroup();
		bmw=new JRadioButton("BMW",true);
		luxis=new JRadioButton("Luxis",false);
		rdGroup.add(bmw);
		rdGroup.add(luxis);
		
		Insets tfPadding=new Insets(3, 0, 3, 0);
		tfName=new JTextField(20);
		tfEmail=new JTextField(20);
		tfName.setMargin(tfPadding);
		tfEmail.setMargin(tfPadding);
		
		password=new JPasswordField(20);
		password.setMargin(tfPadding);
		
		editorPanel =new JPanel(new GridLayout());
		editor=new JTextArea();
		
		this.comCountry=new JComboBox<>(this.countryModel);
		
	
		for(int i=0; i<100 ;i++){
			this.countryModelVector.add("Combodia-"+ i);
		}
		
		this.countryList=new  JList<>(this.countryModelVector);
		
		
	}
	protected ImageIcon createImageIcon(String resource) {
		return new ImageIcon(resource);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==javaCheck) {
			System.out.println(e.getStateChange()==1 ? "checked" :"unchecked");
		}else if(e.getSource()==cCheck) {
			System.out.println(e.getStateChange()==1 ? "checked" :"unchecked");
		}else if(e.getSource()==ccCheck) {
			
			System.out.println(e.getStateChange()==1 ? "checked" :"unchecked");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLeftImagIcon) {
			Enumeration<AbstractButton> buttons = rdGroup.getElements();
			if(bmw.isSelected()) {
				System.out.println(bmw.getText().toString());
			}else if(luxis.isSelected()){
				System.out.println(luxis.getText().toString());
			}
		}else if(e.getSource()==btnRightImagIcon) {
			System.out.println("Name : "+ 
		tfName.getText().toString() + " Email: "+
		tfEmail.getText().toString() +
		" Password "+password.getText().toString()+
		"Country : "+this.comCountry.getItemAt(this.comCountry.getSelectedIndex())
			);
		
		
		}
	}
}
