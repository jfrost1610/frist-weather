package com.weather.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Startup extends JFrame implements ActionListener {

	JLabel countryLabel;
	JLabel zipLabel;
	JLabel tempLabel;
	JButton actionButton;
	JTextField countryField;
	JTextField zipField;
	JTextField tempField;

	Startup() {
		countryLabel = new JLabel("COUNTRY CODE ");
		zipLabel = new JLabel("POSTAL CODE   ");
		tempLabel = new JLabel("COOLEST TEMP");
		actionButton = new JButton("GO");

		countryField = new JTextField(10);
		zipField = new JTextField(10);
		tempField = new JTextField(10);

		add(countryLabel);
		add(countryField);
		add(zipLabel);
		add(zipField);
		add(tempLabel);
		add(tempField);
		add(actionButton);

		actionButton.addActionListener(this);

		setSize(250, 200);
		setLayout(new FlowLayout());
		setTitle("FROST WEATHER");
	}

	public void actionPerformed(ActionEvent ae) {
		String countryCode;
		String zipCode;
		String coolestTemp;
		if (ae.getSource() == actionButton) {
			countryCode = countryField.getText();
			zipCode = zipField.getText();
			coolestTemp = countryCode + zipCode;
			tempField.setText(String.valueOf(coolestTemp));

		}

	}

	public static void main(String args[]) {
		Startup a = new Startup();
		a.setVisible(true);
		a.setLocation(200, 200);

	}

}
