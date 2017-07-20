package com.rathana.gui.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddStudentForm extends JDialog {

	private JLabel lName,lAge,lCountry,lGender,lZipcode;
	private JTextField tfName,tfGender,tfZipCode;
	private ButtonGroup genderButtonGroup;
	private JRadioButton rdMale,rdFemale;
	private JComboBox<String> conCountry;
	private JButton btnSave,btnCancel;
	
	private static final String[] COUNTRIES= {"canbodai","thia","korean","chines","Japanes"};

	
	public AddStudentForm() {
		setWindow();
		initializeVariables();
		constractLayout();
	}

	private void setWindow() {
		setSize(300,300);
		setLocationRelativeTo(null);
	}

	private void constractLayout() {
		JPanel studentInfoPanel=new JPanel();
		JPanel buttonPanel=new JPanel();
		Border spaceBorder=BorderFactory.createEmptyBorder(15,15,15,15);
		Border titleBorder=BorderFactory.createTitledBorder("Add new Student");
		studentInfoPanel.setBorder(BorderFactory.createCompoundBorder(spaceBorder,titleBorder));
		
		studentInfoPanel.setLayout(new GridBagLayout());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(this.btnSave);
		buttonPanel.add(this.btnCancel);
		
		
		GridBagConstraints con=new GridBagConstraints();
		Insets rightPadding= new Insets(0, 0, 0, 15);
		Insets zeroPadding=new Insets(0, 0, 0, 0);
		
		con.gridy=0;
		
		con.weightx=1;
		con.weighty=1;
		con.fill=GridBagConstraints.NONE;
		
		con.gridx=0;
		con.anchor=GridBagConstraints.EAST;
		con.insets=rightPadding;
		studentInfoPanel.add(this.lName,con);
		
		con.gridx ++;
		con.anchor=GridBagConstraints.WEST;
		con.insets=zeroPadding;
		studentInfoPanel.add(this.tfName,con);
		
		con.gridy++;
		
		con.weightx=1;
		con.weighty=1;
		con.fill=GridBagConstraints.NONE;
		
		con.gridx=0;
		con.anchor=GridBagConstraints.EAST;
		con.insets=rightPadding;
		studentInfoPanel.add(this.lAge,con);
		
		con.gridx++;
		con.anchor=GridBagConstraints.WEST;
		con.insets=zeroPadding;
		JPanel pGender=new JPanel();
		this.genderButtonGroup.add(this.rdMale);
		this.genderButtonGroup.add(this.rdFemale);
		pGender.add(this.rdMale);
		pGender.add(this.rdFemale);
		studentInfoPanel.add(pGender,con);
		
		con.gridy++;
		
		con.weightx=1;
		con.weighty=1;
		con.fill=GridBagConstraints.NONE;
		
		con.gridx=0;
		con.anchor=GridBagConstraints.EAST;
		con.insets=rightPadding;
		studentInfoPanel.add(this.lGender,con);
		
		con.gridx++;
		con.anchor=GridBagConstraints.WEST;
		con.insets=zeroPadding;
		studentInfoPanel.add(this.tfGender,con);
		
		con.gridy++;
		
		con.weightx=1;
		con.weighty=1;
		con.fill=GridBagConstraints.NONE;
		
		con.gridx=0;
		con.anchor=GridBagConstraints.EAST;
		con.insets=rightPadding;
		studentInfoPanel.add(this.lCountry,con);
		
		con.gridx++;
		con.anchor=GridBagConstraints.WEST;
		con.insets=zeroPadding;
		studentInfoPanel.add(this.conCountry,con);
		
		
		con.gridy++;
		
		con.weightx=1;
		con.weighty=1;
		con.fill=GridBagConstraints.NONE;
		
		con.gridx=0;
		con.anchor=GridBagConstraints.EAST;
		con.insets=rightPadding;
		studentInfoPanel.add(this.lZipcode,con);
		
		con.gridx++;
		con.anchor=GridBagConstraints.WEST;
		con.insets=zeroPadding;
		studentInfoPanel.add(this.tfZipCode,con);
		
		
		setLayout(new BorderLayout());
		add(studentInfoPanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
	}

	private void initializeVariables() {
		this.lName=new JLabel("Name ",JLabel.RIGHT);
		this.lAge=new JLabel("Age ",JLabel.RIGHT);
		this.lGender=new JLabel("Gender ",JLabel.RIGHT);
		this.lCountry=new JLabel("Country ",JLabel.RIGHT);
		this.lZipcode=new JLabel("Zip code ",JLabel.RIGHT);
		
		this.btnCancel=new JButton("Cancel");
		this.btnSave=new JButton("Save");
		
		this.tfName=new JTextField(20);
		this.tfGender=new JTextField(20);
		//this.tfAge=new JTextField(20);
		this.genderButtonGroup=new ButtonGroup();
		this.rdMale=new JRadioButton("Male" ,true);
		this.rdFemale=new JRadioButton("Female",false);
		this.conCountry=new JComboBox<>(COUNTRIES);
		this.conCountry.setSelectedIndex(0);
		this.tfZipCode=new JTextField(20);
	}
}
