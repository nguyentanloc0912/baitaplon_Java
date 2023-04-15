package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Cursor;

public class Menu1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnNewButton_sanpham;
	ThongTinSanPham thongtinsanpham;
	private JButton btnHoaDon;
	private JButton btn_hoadon_baohanh;
	private JButton btn_thoat_hoadon;
	private JPanel jpanel_hoadon;

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
		setBounds(100, 100, 704, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(151, 178, 206));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 62, 310, 448);
		contentPane.add(panel);
		panel.setLayout(null);
	    
		btnNewButton_sanpham = new JButton("Thông tin sản phẩm");
		btnNewButton_sanpham.setIcon(new ImageIcon("src\\anh\\cp.png"));
		btnNewButton_sanpham.setFont(new Font("Tahoma", Font.BOLD, 13));
	
		btnNewButton_sanpham.setBounds(30, 57, 254, 39);
		btnNewButton_sanpham.addActionListener(this);
		panel.add(btnNewButton_sanpham);
		
		JButton btnThngTinKhch = new JButton("Th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		btnThngTinKhch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThngTinKhch.setIcon(new ImageIcon("src\\anh\\people.png"));
		btnThngTinKhch.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThngTinKhch.setBounds(30, 106, 254, 39);
		panel.add(btnThngTinKhch);
		
		JButton btnBoCo = new JButton("H\u1EE3p \u0111\u1ED3ng\r\n");
		btnBoCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoCo.setIcon(new ImageIcon("src\\anh\\report1.png"));
		btnBoCo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBoCo.setBounds(30, 204, 254, 39);
		panel.add(btnBoCo);
		
		btnHoaDon = new JButton("H\u00F3a \u0111\u01A1n\r\n");
		btnHoaDon.setIcon(new ImageIcon("src\\anh\\people3.png"));
		btnHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHoaDon.setBounds(30, 260, 254, 39);
		panel.add(btnHoaDon);
		
		JButton btnBoHnh = new JButton("B\u1EA3o h\u00E0nh\r\n");
		btnBoHnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoHnh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBoHnh.setBounds(30, 309, 254, 39);
		panel.add(btnBoHnh);
		
		JButton btnQunLTi = new JButton("Qu\u1EA3n l\u00FD t\u00E0i kho\u1EA3n\r\n");
		btnQunLTi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnQunLTi.setBounds(30, 358, 254, 39);
		panel.add(btnQunLTi);
		
		JButton btnThngTinNhn = new JButton("Th\u00F4ng tin nh\u00E2n vi\u00EAn\r\n");
		btnThngTinNhn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThngTinNhn.setBounds(30, 155, 254, 39);
		panel.add(btnThngTinNhn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(330, 150, 344, 229);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		jpanel_hoadon = new JPanel();
		jpanel_hoadon.setVisible(false);
		jpanel_hoadon.setBorder(new LineBorder(new Color(0, 0, 0)));
		jpanel_hoadon.setLayout(null);
		jpanel_hoadon.setBounds(0, 0, 196, 229);
		panel_1.add(jpanel_hoadon);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1_1.setBounds(10, 10, 176, 209);
		jpanel_hoadon.add(panel_3_1_1);
		
		JButton btn_hoadon_banhang = new JButton("New button");
		btn_hoadon_banhang.setText("Hóa đơn bán hàng\r\n");
		btn_hoadon_banhang.setBounds(10, 10, 156, 34);
		panel_3_1_1.add(btn_hoadon_banhang);
		
		btn_hoadon_baohanh = new JButton("Hóa đơn bảo hành");
		btn_hoadon_baohanh.setBounds(10, 54, 156, 34);
		panel_3_1_1.add(btn_hoadon_baohanh);
		
		btn_thoat_hoadon = new JButton("Thoát\r\n");
		btn_thoat_hoadon.setBounds(10, 165, 156, 34);
		panel_3_1_1.add(btn_thoat_hoadon);
		
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
		panel_3.setBounds(330, 420, 344, 78);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = 
				new JButton("\u0110\u0103ng nh\u1EADp\r\n\r\n");
		btnNewButton_1.setIcon(new ImageIcon("src\\anh\\key.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(88, 10, 180, 63);
		panel_3.add(btnNewButton_1);
		addAcction();
		
	}
    public void addAcction() {
    	btnHoaDon.addActionListener(this);
    	btn_thoat_hoadon.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object a = e.getSource();
		if(a.equals(btnNewButton_sanpham)) {
			thongtinsanpham = new ThongTinSanPham();
			thongtinsanpham.setVisible(true);
		}else if(a.equals(btnHoaDon)) {
			jpanel_hoadon.setVisible(true);
		}else if(a.equals(btn_thoat_hoadon)) {
			jpanel_hoadon.setVisible(false);
		}
		
		
	}
}
