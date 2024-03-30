package pre;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class WelcomePage extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		
		//set default panel
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("pool-table.png"));
		setTitle("Billiard Table Reservation Program");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Header in English
		JLabel lblNewLabel_1 = new JLabel("Billiard Table Reservation Program");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SF UI Display Light", Font.BOLD, 20));
		lblNewLabel_1.setBounds(233, 40, 320, 23);
		contentPane.add(lblNewLabel_1);
		
		//Header in Thai
		JLabel lblNewLabel_4 = new JLabel("ระบบจองโต๊ะบิลเลียด");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Mitr Light", Font.PLAIN, 23));
		lblNewLabel_4.setBounds(247, 73, 292, 23);
		contentPane.add(lblNewLabel_4);
		
		//reserve button that navigates to another page
		JButton btnNewButton = new JButton("จองโต๊ะพูล");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Branches branch = new Branches();
				branch.setVisible(true);
				close();
			}
		});
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Mitr Light", Font.PLAIN, 18));
		btnNewButton.setBounds(402, 277, 111, 47);
		contentPane.add(btnNewButton);
		
		//photo
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NEXT Speed\\Downloads\\shutterstock_1150604456-scaled (2).jpg"));
		lblNewLabel.setBounds(141, 130, 500, 333);
		contentPane.add(lblNewLabel);
	}
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}