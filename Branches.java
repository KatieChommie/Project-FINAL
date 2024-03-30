package pre;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Branches extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] branches;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Branches frame = new Branches();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Branches() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NEXT Speed\\Downloads\\pool-table.png"));
		setTitle("Main");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0, 153, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    branches = new String[] {"กรุณาเลือกสาขา", "เกกี 4 ฝั่งร้านสเต็ก", "เกกี 4 ฝั่งร้านผัดไทย", "ซอยหอใหม่"};
		JComboBox comboBox = new JComboBox(branches);
		comboBox.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		comboBox.setBounds(101, 49, 183, 44);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("เลือกสาขา");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Mitr Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(155, 10, 76, 29);
		contentPane.add(lblNewLabel);
		
		//button that confirms the chosen branch
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == branches[0]) {
					JOptionPane.showMessageDialog(null, "Please select the branch!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else if (comboBox.getSelectedItem() == branches[1]) {
					B1k4S bran1 = new B1k4S();
					bran1.setVisible(true);
					close();
				}
				else if (comboBox.getSelectedItem() == branches[2]) {
					B1k4P bran2 = new B1k4P();
					bran2.setVisible(true);
					close();
				}
				else if (comboBox.getSelectedItem() == branches[3]) {
					B1bln bran3 = new B1bln();
					bran3.setVisible(true);
					close();
				}
				
			}
		});
		
		btnNewButton.setFont(new Font("SF UI Display Light", Font.PLAIN, 15));
		btnNewButton.setBounds(147, 118, 91, 29);
		contentPane.add(btnNewButton);
		
		//back button
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setToolTipText("Back to Main Page");
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.setFont(new Font("SF UI Display Light", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage wc = new WelcomePage();
				wc.setVisible(true);
				close();			
			}
		});
		btnNewButton_1.setBounds(10, 10, 74, 21);
		contentPane.add(btnNewButton_1);
	}
	
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}
