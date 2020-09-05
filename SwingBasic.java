package com.toddperkins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;

public class SwingBasic {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingBasic window = new SwingBasic();
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
	public SwingBasic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 719, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(187, 28, 236, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("SimSun-ExtB", Font.BOLD, 33));
		label.setBounds(67, 73, 414, 33);
		frame.getContentPane().add(label);
		
		JButton btnSayHi = new JButton("Say hi!");
		btnSayHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Hi " + textField.getText());
			}
		});
		btnSayHi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSayHi.setBounds(451, 31, 97, 40);
		frame.getContentPane().add(btnSayHi);
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		name.setHorizontalAlignment(SwingConstants.TRAILING);
		name.setBounds(57, 34, 115, 33);
		frame.getContentPane().add(name);
		
	}
}
