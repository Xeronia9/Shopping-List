package gui_components.imp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeFrame extends JFrame {
	
	private JTextField txtSadf;

	public WelcomeFrame() {
		setAlwaysOnTop(true);
		setTitle("Shopping List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		getContentPane().setLayout(null);
		this.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(300, 0, 250, 113);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 179, 886, 266);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please Enter Your Name");
		lblNewLabel_1.setBounds(284, 0, 329, 35);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 29));
		panel.add(lblNewLabel_1);
		
		txtSadf = new JTextField();
		txtSadf.setHorizontalAlignment(SwingConstants.CENTER);
		txtSadf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSadf.setBounds(226, 64, 419, 51);
		panel.add(txtSadf);
		txtSadf.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//check database if there is an account according to the name
				//and act according to the result
			}
		});
		btnNewButton.setBounds(688, 64, 85, 51);
		panel.add(btnNewButton);
		
	}

	
}
