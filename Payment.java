package pre;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private String[] branches;
	
	//Creating objects of each class (B1k4S, B1k4P, B1bln)
	B1k4S bSteak = new B1k4S();
	B1k4P bPadthai = new B1k4P();
	B1bln billion = new B1bln();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NEXT Speed\\Downloads\\pool-table.png"));
		setTitle("สรุปยอด");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 507, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(new Color(0, 153, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// number of reserved table
		JLabel lblNewLabel_1 = new JLabel("จำนวนโต๊ะที่จอง");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(212, 26, 107, 29);
		contentPane.add(lblNewLabel_1);
		
		// total price
		JLabel lblNewLabel_1_1_1 = new JLabel("ราคารวม");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Mitr Light", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(212, 65, 107, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JTextPane numtb = new JTextPane();
		numtb.setFont(new Font("SF UI Display Light", Font.PLAIN, 18));
		numtb.setBounds(325, 26, 122, 29);
		contentPane.add(numtb);
		
		JTextPane tprice = new JTextPane();
		tprice.setFont(new Font("SF UI Display Light", Font.PLAIN, 18));
		tprice.setBounds(325, 65, 122, 29);
		contentPane.add(tprice);
		
		//select branches
		branches = new String[] {"กรุณาเลือกสาขา", "เกกี 4 ฝั่งร้านสเต็ก", "เกกี 4 ฝั่งร้านผัดไทย", "ซอยหอใหม่"};
		JComboBox comboBox = new JComboBox(branches);
		comboBox.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		comboBox.setBounds(30, 56, 144, 39);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("เลือกสาขา");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Mitr Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(30, 25, 76, 29);
		contentPane.add(lblNewLabel);
		
		//button that confirms the chosen branch
		JButton btnNewButton1 = new JButton("Enter");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if no branch has chosen
				if (comboBox.getSelectedItem() == branches[0]) {
					JOptionPane.showMessageDialog(null, "Please select the branch!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				// Steak branch
				else if (comboBox.getSelectedItem() == branches[1]) {
					//information
					numtb.setText(Integer.toString(bSteak.table.size()));
					tprice.setText(bSteak.getTotal());
				}
				// Padthai branch
				else if (comboBox.getSelectedItem() == branches[2]) {
					//information
					numtb.setText(Integer.toString(bPadthai.table.size()));
					tprice.setText(bPadthai.getTotal());
				}
				// Billion Branch
				else if (comboBox.getSelectedItem() == branches[3]) {
					//information
					numtb.setText(Integer.toString(billion.table.size()));
					tprice.setText(billion.getTotal());
				}		
			}
		});
					
		btnNewButton1.setFont(new Font("SF UI Display Light", Font.PLAIN, 15));
		btnNewButton1.setBounds(30, 113, 76, 21);
		contentPane.add(btnNewButton1);
		
		//qr payment
		JLabel lblNewLabel_3 = new JLabel("สแกนจ่าย");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Mitr Light", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(212, 121, 65, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\NEXT Speed\\Downloads\\qrcode_105538975_e59670b3fff877a3e25030782acf5f4a.jpg"));
		lblNewLabel_2.setBounds(297, 121, 150, 150);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("กรุณาเก็บสลิปโอนพร้อมกับภาพหน้าจอที่ยืนยันการจอง");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(59, 281, 374, 21);
		contentPane.add(lblNewLabel_4);

		//back to branches
		JButton btnNewButton = new JButton("กลับหน้าหลัก");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		btnNewButton.setBounds(185, 312, 122, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						WelcomePage wc = new WelcomePage();
						wc.setVisible(true);
						close();
						//clear all
						B1k4S.table.clear();
						B1k4P.table.clear();
						B1bln.table.clear();
					}
				});
			}
		});
		
	}
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}
