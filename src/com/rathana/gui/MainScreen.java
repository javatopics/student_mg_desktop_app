package com.rathana.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.rathana.entity.Student;
import com.rathana.gui.form.AddStudentForm;
import com.rathana.gui.shared.Footer;
import com.rathana.service.MainScreenService;
import com.rathana.service.impl.MainScreenServiceImpl;

public class MainScreen extends JFrame implements ActionListener{

	private JMenuBar menuBar;
	private JMenu fileMenu,windowMenu;
	private JMenuItem openItem,exitItem,addItem;
	
	private MainScreenService mainSCreenService;
	private TablePanel tablePanel;
	
	private AddStudentForm addStudentForm;
	
	//footer
	private Footer footer;
	
	public MainScreen() {
		initializer();
		setJMenuBar(initMenuBar());
		initializeVariable();
		constructLayout();
		refreshTable();
	}
	
	private void refreshTable(){
		this.tablePanel.updateTable();
	}
	private void constructLayout() {
		setLayout(new BorderLayout());
		add(this.tablePanel,BorderLayout.CENTER);
		add(this.footer,BorderLayout.SOUTH);
	}
	
	private void initializeVariable(){

		this.mainSCreenService= new MainScreenServiceImpl();
		this.tablePanel=new TablePanel(this.mainSCreenService.getStudents());
		this.footer=new Footer();
		this.addStudentForm=new AddStudentForm();
		
	}
	private JMenuBar initMenuBar() {
		menuBar=new JMenuBar();
		fileMenu =new JMenu();
		fileMenu.setText("FILE");
		
		openItem=new JMenuItem("open");
		//openItem.setIcon();
		exitItem=new JMenuItem("exit");
		fileMenu.add(openItem);
		fileMenu.add(exitItem);
		
		windowMenu=new JMenu();
		windowMenu.setText("WINDOW");
		addItem=new JMenuItem("add");
		windowMenu.add(addItem);
		
		menuBar.add(fileMenu);
		menuBar.add(windowMenu);

		//set event
		
		openItem.addActionListener(this);
		exitItem.addActionListener(this);
		addItem.addActionListener(this);
		
		return menuBar;
	}

	private void initializer() {
		//setExtendedState(MAXIMIZED_BOTH);
		setSize(678,490);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.openItem==e.getSource()){
			System.out.println("Open File");
		}else if(this.exitItem==e.getSource()){
			
			int action= JOptionPane.showConfirmDialog(MainScreen.this, "Are you want to exit?","Exit confirm",JOptionPane.OK_CANCEL_OPTION);
			if(action==JOptionPane.OK_OPTION){
				System.gc();
				System.exit(0);
			}
		}else if(this.addItem==e.getSource()){
			addStudentForm.setVisible(true);
		}
	}
}
