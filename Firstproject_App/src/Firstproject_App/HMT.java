package Firstproject_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HMT {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HMT window = new HMT();
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
	public HMT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HMT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(169, 23, 69, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(31, 92, 62, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(28, 146, 46, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(28, 198, 46, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(31, 242, 46, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(127, 96, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "kphp", "jntuh", "miyapur", "uppal", "secunderabad"}));
		c1.setBounds(127, 149, 86, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "secunderabad", "uppal", "miyapur", "jntuh", "kphp"}));
		c2.setBounds(127, 201, 86, 22);
		frame.getContentPane().add(c2);
		
		JComboBox t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		t2.setBounds(127, 245, 86, 22);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String t=(String) t2.getSelectedItem();
				int ticket=Integer.parseInt(t);
				int bill=0;
				if(fs=="jntuh" && ts=="jntuh")
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid");
				}
				else if(fs=="jntuh" && ts=="miyapur")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n From: "+fs+"\n To: "+ts+"\n Tickets: "+t+ "\n Your bill :"+bill);
				}
				else if(fs=="jntuh" && ts=="uppal")
				{
					bill=ticket*20;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n From: "+fs+"\n To: "+ts+"\n Tickets: "+t+ "\n Your bill :"+bill);
				}
				
			}
		});	
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(65, 277, 97, 30);
		frame.getContentPane().add(btnNewButton);
	}
}
