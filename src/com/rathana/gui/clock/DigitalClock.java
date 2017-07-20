package com.rathana.gui.clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;

public class DigitalClock extends Thread {

	private SimpleDateFormat format;
	private JLabel timeLabel;
	private Boolean isRunning;
	
	public DigitalClock(JLabel timeLabel) {
		this.timeLabel=timeLabel;
		isRunning=true;
		this.format=new SimpleDateFormat("hh:mm:ss");
	}
	
	
	public Boolean getIsRunning() {
		return isRunning;
	}


	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}


	@Override
	public void run() {
		
		while(isRunning) {
			Calendar calendar=Calendar.getInstance();
			Date currentTime =calendar.getTime();
			timeLabel.setText(format.format(currentTime));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
