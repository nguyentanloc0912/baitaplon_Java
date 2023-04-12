package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Menu1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu1 frame = new Menu1();
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
	public Menu1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(151, 178, 206));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 62, 310, 410);
		contentPane.add(panel);
		panel.setLayout(null);
	    
		JButton btnNewButton = new JButton("Th\u00F4ng tin s\u1EA3n ph\u1EA9m");
		btnNewButton.setIcon(new ImageIcon("src\\anh\\cp.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(30, 30, 254, 39);
		panel.add(btnNewButton);
		
		JButton btnThngTinKhch = new JButton("Th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		btnThngTinKhch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThngTinKhch.setIcon(new ImageIcon("src\\anh\\people.png"));
		btnThngTinKhch.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThngTinKhch.setBounds(30, 80, 254, 39);
		panel.add(btnThngTinKhch);
		
		JButton btnHpng = new JButton("H\u1EE3p \u0111\u1ED3ng");
		btnHpng.setIcon(new ImageIcon("src\\anh\\ban.png"));
		btnHpng.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHpng.setBounds(30, 129, 254, 39);
		panel.add(btnHpng);
		
		JButton btnBoCo = new JButton("H\u00F3a \u0111\u01A1n");
		btnBoCo.setIcon(new ImageIcon("src\\anh\\report1.png"));
		btnBoCo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBoCo.setBounds(30, 184, 254, 39);
		panel.add(btnBoCo);
		
		JButton btnQunLTi = new JButton("Qu\u1EA3n l\u00FD t\u00E0i kho\u1EA3n");
		btnQunLTi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQunLTi.setIcon(new ImageIcon("src\\anh\\list.png"));
		btnQunLTi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnQunLTi.setBounds(30, 285, 254, 39);
		panel.add(btnQunLTi);
		
		JButton btnQunLNhn = new JButton("Qu\u1EA3n l\u00FD nh\u00E2n vi\u00EAn\r\n");
		btnQunLNhn.setIcon(new ImageIcon("src\\anh\\people3.png"));
		btnQunLNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQunLNhn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnQunLNhn.setBounds(30, 236, 254, 39);
		panel.add(btnQunLNhn);
		
		JButton btnBoHnh = new JButton("B\u1EA3o h\u00E0nh\r\n");
		btnBoHnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoHnh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBoHnh.setBounds(30, 334, 254, 39);
		panel.add(btnBoHnh);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(330, 150, 344, 229);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\Untitled design.png"));
		lblNewLabel.setBounds(0, 0, 344, 229);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0110\u1EA1i l\u00FD xe C\u1EA9m Giang");
		lblNewLabel_1.setForeground(new Color(255, 0, 51));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 664, 42);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(330, 62, 344, 73);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\bfsd (4) (1) (1) (1).png"));
		lblNewLabel_2.setBounds(0, 0, 344, 73);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(330, 394, 344, 78);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = 
				new JButton("\u0110\u0103ng nh\u1EADp\r\n\r\n");
		btnNewButton_1.setIcon(new ImageIcon("src\\anh\\key.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(92, 10, 180, 63);
		panel_3.add(btnNewButton_1);
	}
}
