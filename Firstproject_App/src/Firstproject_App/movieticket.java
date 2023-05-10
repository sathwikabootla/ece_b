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

public class movieticket {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Movie ticket");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(172, 23, 160, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(27, 110, 76, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(27, 186, 55, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ticket");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(27, 243, 55, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(141, 113, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "DASARA", "LIFE IS BEAUTIFUL", "OYE", "BAHUBALI"}));
		c1.setBounds(141, 188, 86, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8"}));
		c2.setBounds(141, 245, 86, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String M =(String) c1.getSelectedItem();
				String t=(String) c2.getSelectedItem();
				int Ticket=Integer.parseInt(t);
				int bill=0;
				if(M=="RRR")
				{
					JOptionPane.showMessageDialog(btnNewButton, "Hello"+name+ "\n Selected movie : "+M+ "\n Tickets : "+t+ "\n Ypur bill"+bill);
				}
				else if(M=="BAHUBALI")
				{
					bill=Ticket*500;
					JOptionPane.showMessageDialog(btnNewButton, "Hello"+name+ "\n Selected movie : "+M+ "\n Tickets : "+t+ "\n Ypur bill"+bill);
				}
				else if(M=="OYE")
				{
					bill=Ticket*800;
					JOptionPane.showMessageDialog(btnNewButton, "Hello"+name+ "\n Selected movie : "+M+ "\n Tickets : "+t+ "\n Ypur bill"+bill);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"INVALID");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(68, 301, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
