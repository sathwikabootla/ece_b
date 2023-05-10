package Firstproject_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
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
	public Ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(169, 22, 87, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book1.jpg"));
		lblNewLabel_1.setBounds(26, 100, 56, 92);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book2.jpg"));
		lblNewLabel_2.setBounds(146, 112, 46, 58);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book3.jpg"));
		lblNewLabel_3.setBounds(302, 112, 46, 58);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.100");
		lblNewLabel_4.setBounds(25, 190, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs.120");
		lblNewLabel_5.setBounds(146, 190, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs.150");
		lblNewLabel_6.setBounds(302, 190, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "paper", "kindel", "PDF"}));
		comboBox.setBounds(10, 232, 87, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "paper", "kindel", "PDF"}));
		comboBox_1.setBounds(127, 232, 92, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "paper", "kindel", "PDF"}));
		comboBox_2.setBounds(283, 232, 92, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART:0");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lb.setBounds(337, 61, 79, 27);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnNewButton.setBounds(8, 285, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnNewButton_1.setBounds(127, 285, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnNewButton_2.setBounds(286, 285, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
