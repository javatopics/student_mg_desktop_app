package com.rathana.gui.shared;

import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.rathana.gui.clock.DigitalClock;

public class Footer extends JPanel {

	private JLabel lFooter;
	private JLabel lTimer;
	private DigitalClock digitalClock;

	public Footer() {
		initailizeVariable();
		this.clockStartup();
	}

	private void initailizeVariable() {
		this.lFooter=new JLabel("@rathana2017",JLabel.CENTER);
		this.lTimer=new JLabel();
		this.digitalClock=new DigitalClock(this.lTimer);
		add(this.lFooter);
		add(this.lTimer);
	}
	
	public void clockStartup() {
		this.digitalClock.start();
	}
	public void clockShutdown() {
		this.digitalClock.setIsRunning(false);
	}
}
