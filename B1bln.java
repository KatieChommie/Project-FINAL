package pre;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class B1bln extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] time, round;
	public static double price;
	public static double hr;
	public String tm, rd;
	static ArrayList<JToggleButton> table = new ArrayList<>();
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B1bln frame = new B1bln();
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
	public B1bln() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NEXT Speed\\Downloads\\pool-table.png"));
		setTitle("ซอยหอใหม่");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0, 153, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//title
		JLabel lblNewLabel = new JLabel("สาขาซอยหอใหม่");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Mitr Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(184, 16, 118, 29);
		contentPane.add(lblNewLabel);
		
		//back button
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setToolTipText("Back to Branches");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("SF UI Display Light", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Branches bran = new Branches();
				bran.setVisible(true);
				close();			
			}
		});
		btnNewButton.setBounds(10, 21, 74, 21);
		contentPane.add(btnNewButton);
		
		//tables
		JToggleButton t1 = new JToggleButton("โต๊ะ 1");
		t1.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t1.setBounds(47, 162, 63, 29);
		contentPane.add(t1);
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.isSelected()) {
					table.add(t1);
				}
				else table.remove(t1);
			}
		});
				
		JToggleButton t2 = new JToggleButton("โต๊ะ 2");
		t2.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t2.setBounds(120, 162, 63, 29);
		contentPane.add(t2);
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t2.isSelected()) {
					table.add(t2);
				}
				else table.remove(t2);
			}
		});
				
		JToggleButton t3 = new JToggleButton("โต๊ะ 3");
		t3.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t3.setBounds(193, 162, 63, 29);
		contentPane.add(t3);
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t3.isSelected()) {
					table.add(t3);
				}
				else table.remove(t3);
			}
		});
				
		JToggleButton t4 = new JToggleButton("โต๊ะ 4");
		t4.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t4.setBounds(47, 123, 63, 29);
		contentPane.add(t4);
		t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t4.isSelected()) {
					table.add(t4);
				}
				else table.remove(t4);
			}
		});
				
		JToggleButton t5 = new JToggleButton("โต๊ะ 5");
		t5.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t5.setBounds(120, 123, 63, 29);
		contentPane.add(t5);
		t5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t5.isSelected()) {
					table.add(t5);
				}
				else table.remove(t5);
			}
		});
		
		JToggleButton t6 = new JToggleButton("โต๊ะ 6");
		t6.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t6.setBounds(193, 123, 63, 29);
		contentPane.add(t6);	
		t6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t6.isSelected()) {
					table.add(t6);
				}
				else table.remove(t6);
			}
		});
		
		JToggleButton t7 = new JToggleButton("โต๊ะ 7");
		t7.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t7.setBounds(47, 84, 63, 29);
		contentPane.add(t7);
		t7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t7.isSelected()) {
					table.add(t7);
				}
				else table.remove(t7);
			}
		});
				
		JToggleButton t8 = new JToggleButton("โต๊ะ 8");
		t8.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t8.setBounds(120, 84, 63, 29);
		contentPane.add(t8);
		t8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t8.isSelected()) {
					table.add(t8);
				}
				else table.remove(t8);
			}
		});
		
		JToggleButton t9 = new JToggleButton("โต๊ะ 9");
		t9.setFont(new Font("Mitr Light", Font.PLAIN, 10));
		t9.setBounds(193, 84, 63, 29);
		contentPane.add(t9);
		t9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t9.isSelected()) {
					table.add(t9);
				}
				else table.remove(t9);
			}
		});
		
		//panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(47, 203, 85, 27);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ประตูร้าน");
		lblNewLabel_1.setBounds(0, 0, 85, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		//round choose
		JLabel lblNewLabel_2_1 = new JLabel("รอบ");
	    lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(283, 75, 63, 13);
		contentPane.add(lblNewLabel_2_1);
						
		round = new String[] {"------", "12.00 น.", "14.00 น.", "16.00 น.", "18.00 น."};
		JComboBox comboBox_1 = new JComboBox(round);
		comboBox_1.setFont(new Font("Mitr Light", Font.PLAIN, 12));
		comboBox_1.setBounds(356, 70, 94, 21);
		contentPane.add(comboBox_1);
		
		//time choose
		JLabel lblNewLabel_2 = new JLabel("เลือกเวลา");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(283, 104, 63, 13);
		contentPane.add(lblNewLabel_2);
				
		time = new String[] {"------", "30 นาที", "1 ชั่วโมง", "1.5 ชั่วโมง", "2 ชั่วโมง"};
		JComboBox comboBox = new JComboBox(time);
		comboBox.setFont(new Font("Mitr Light", Font.PLAIN, 12));
		comboBox.setBounds(356, 101, 94, 21);
		contentPane.add(comboBox);
				
		//name text field
		JLabel lblNewLabel_3 = new JLabel("จองในชื่อ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(283, 127, 63, 29);
		contentPane.add(lblNewLabel_3);
				
		textField = new JTextField();
		textField.setToolTipText("Please input in English Alphabet Only!!");
		textField.setFont(new Font("Mitr Light", Font.PLAIN, 15));
		textField.setBounds(356, 132, 94, 21);
		contentPane.add(textField);
		textField.setColumns(10);
				
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setFont(new Font("SF UI Display Light", Font.PLAIN, 15));
		btnNewButton_1.setBounds(355, 177, 95, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//no round
				if (comboBox_1.getSelectedItem() == round[0]) {
					//no round, time
					if (comboBox.getSelectedItem() == time[0]) {
						//no round, time, name
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter round, time and name!", "Error",
								JOptionPane.ERROR_MESSAGE);
						}
						else JOptionPane.showMessageDialog(null, "Please enter both round and time!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					//no round, name
					else if (textField.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please enter both round and name!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					// no round only!
					else JOptionPane.showMessageDialog(null, "Please enter round!", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				//no time
				else if ((comboBox.getSelectedItem() == time[0])) {
					//no time and name
					if (textField.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please enter both time and name!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					//have name but no time
					else {
						JOptionPane.showMessageDialog(null, "Please enter time!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
				//no name
				else if (textField.getText().length() == 0) {JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
						JOptionPane.ERROR_MESSAGE);
				}
				//12.00
				else if (comboBox_1.getSelectedItem() == round[1]) {
					//half an hour was chosen
					rd = "12.00";
					if (comboBox.getSelectedItem() == time[1]) {
						tm = "30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								
								hr = 0.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1 hr was chosen
					else if (comboBox.getSelectedItem() == time[2]) {
						tm = "1 hour";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1.5 hr was chosen
					else if (comboBox.getSelectedItem() == time[3]) {
						tm = "1 hour 30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//2 hr was chosen
					else if (comboBox.getSelectedItem() == time[4]) {
						tm = "2 hours";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 2.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				//14.00
				else if (comboBox_1.getSelectedItem() == round[2]) {
					rd = "14.00";
					//half an hour was chosen
					if (comboBox.getSelectedItem() == time[1]) {
						tm = "30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 0.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1 hr was chosen
					else if (comboBox.getSelectedItem() == time[2]) {
						tm = "1 hour";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1.5 hr was chosen
					else if (comboBox.getSelectedItem() == time[3]) {
						tm = "1 hour 30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//2 hr was chosen
					else if (comboBox.getSelectedItem() == time[4]) {
						tm = "2 hours";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 2.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				//16.00
				else if (comboBox_1.getSelectedItem() == round[3]) {
					rd = "16.00";
					//half an hour was chosen
					if (comboBox.getSelectedItem() == time[1]) {
						tm = "30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 0.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1 hr was chosen
					else if (comboBox.getSelectedItem() == time[2]) {
						tm = "1 hour";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1.5 hr was chosen
					else if (comboBox.getSelectedItem() == time[3]) {
						tm = "1 hour 30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//2 hr was chosen
					else if (comboBox.getSelectedItem() == time[4]) {
						tm = "2 hours";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 2.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				//18.00
				else if (comboBox_1.getSelectedItem() == round[4]) {
					rd = "18.00";
					//half an hour was chosen
					if (comboBox.getSelectedItem() == time[1]) {
						tm = "30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 0.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1 hr was chosen
					else if (comboBox.getSelectedItem() == time[2]) {
						tm = "1 hour";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//1.5 hr was chosen
					else if (comboBox.getSelectedItem() == time[3]) {
						tm = "1 hour 30 mins";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 1.5;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
					//2 hr was chosen
					else if (comboBox.getSelectedItem() == time[4]) {
						tm = "2 hours";
						if (textField.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "Please enter name!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
						else {
							//no table was chosen
							if (table.size() != 0) {
								hr = 2.0;
								JOptionPane.showMessageDialog(null, "Branch: Soi Hor Mai" + "\nRound: " + rd + "\nReserve for " + tm + "\nPrice: " + getTotal() + "\nReserve in name: "
								+ textField.getText() + "\nPlease screenshot this page for confirming the reservation!");
							}
							else
								JOptionPane.showMessageDialog(null, "Please choose table!", "Error",
										JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});
		
		JButton btnNewButton_2 = new JButton("Payment");
		btnNewButton_2.setBackground(new Color(255, 255, 128));
		btnNewButton_2.setFont(new Font("SF UI Display Light", Font.PLAIN, 15));
		btnNewButton_2.setBounds(355, 240, 95, 29);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedItem() == round[0] || comboBox.getSelectedItem() == time[0] || textField.getText().length() == 0 || table.size() == 0) {
					JOptionPane.showMessageDialog(null, "Please enter all information needed!", "Error",
					JOptionPane.ERROR_MESSAGE);
				}
				else {
					Payment p = new Payment();
					p.setVisible(true);
					close();
				}
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("ราคาโต๊ะเริ่มต้นโต๊ะละ 50 บาท (30 นาที)");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Mitr Light", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(47, 240, 209, 21);
		contentPane.add(lblNewLabel_4);
	}
	public void setTotal(double price) {
		B1bln.price = price;
	}
	public String getTotal() {
		price = table.size() * 100 * hr;
		return String.format("%,.2f baht", price);
	}
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}
