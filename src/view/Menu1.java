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
import javax.swing.UIManager;

import java.awt.Panel;
import java.awt.Button;
import java.awt.Cursor;

public class Menu1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnNewButton_sanpham;
	private ThongTinSanPham thongtinsanpham;
	private KhachHang khachhang;
	private NhanVien nhanvien;
	private HopDong hopdong;
	private JButton btnHoaDon;

	private JButton btn_thoat_hoadon;
	private JPanel jpanel_hoadon;
<<<<<<< HEAD
	private JButton btn_info_kh;
	private JButton btn_info_sanpham;
	private JButton btn_banhang;
=======
	private JButton btnTTKH;
	private JButton btnNhanVien;
	private JButton btnHD;
	
>>>>>>> de948942362d05c210d9820b380159ba5022d0d2

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
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
	    
		btn_info_sanpham = new JButton("Thông tin sản phẩm");
		btn_info_sanpham.setIcon(new ImageIcon("src\\anh\\cp.png"));
		btn_info_sanpham.setFont(new Font("Tahoma", Font.BOLD, 13));
	
<<<<<<< HEAD
		btn_info_sanpham.setBounds(30, 57, 254, 39);
		btn_info_sanpham.addActionListener(this);
		panel.add(btn_info_sanpham);
		
		btn_info_kh= new JButton("Th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		btn_info_kh.setIcon(new ImageIcon("src\\anh\\people.png"));
		btn_info_kh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_info_kh.setBounds(30, 106, 254, 39);
		panel.add(btn_info_kh);
		
		btn_banhang  = new JButton("Bán hàng\r\n");
		btn_banhang.setIcon(new ImageIcon("src\\anh\\report1.png"));
		btn_banhang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_banhang.setBounds(30, 204, 254, 39);
		panel.add(btn_banhang);
=======
		btnNewButton_sanpham.setBounds(30, 56, 254, 39);
		btnNewButton_sanpham.addActionListener(this);
		panel.add(btnNewButton_sanpham);
		
		btnTTKH = new JButton("Thông tin khách hàng");
		btnTTKH.setIcon(new ImageIcon("src\\anh\\people.png"));
		btnTTKH.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTTKH.setBounds(30, 105, 254, 39);
		panel.add(btnTTKH);
		btnTTKH.addActionListener(this);
		
		JButton btnHpng = new JButton("Nh\u1EADp H\u00E0ng\r\n");
		btnHpng.setIcon(new ImageIcon("src\\anh\\ban.png"));
		btnHpng.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHpng.setBounds(30, 203, 254, 39);
		panel.add(btnHpng);
		
		btnHD = new JButton("Hợp đồng");
		btnHD.setIcon(new ImageIcon("src\\anh\\report1.png"));
		btnHD.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHD.setBounds(30, 252, 254, 39);
		panel.add(btnHD);
		btnHD.addActionListener(this);
>>>>>>> de948942362d05c210d9820b380159ba5022d0d2
		
		btnHoaDon = new JButton("H\u00F3a \u0111\u01A1n\r\n");
		btnHoaDon.setIcon(new ImageIcon("src\\anh\\people3.png"));
		btnHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHoaDon.setBounds(30, 301, 254, 39);
		panel.add(btnHoaDon);
		
		JButton btnBoHnh = new JButton("B\u1EA3o h\u00E0nh\r\n");
		btnBoHnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoHnh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBoHnh.setBounds(30, 350, 254, 39);
		panel.add(btnBoHnh);
		
		JButton btnQunLTi = new JButton("Qu\u1EA3n l\u00FD t\u00E0i kho\u1EA3n\r\n");
		btnQunLTi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnQunLTi.setBounds(30, 399, 254, 39);
		panel.add(btnQunLTi);
		
		JButton btnHpng_1_1 = new JButton("Th\u00F4ng tin nh\u00E0 cung c\u1EA5p\r\n");
		btnHpng_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHpng_1_1.setBounds(30, 7, 254, 39);
		panel.add(btnHpng_1_1);
		
		btnNhanVien = new JButton("Thông tin nhân viên");
		btnNhanVien.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNhanVien.setBounds(30, 154, 254, 39);
		panel.add(btnNhanVien);
		btnNhanVien.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(330, 150, 344, 229);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
	
		
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu1.class.getResource("/hinh_anh/hinh/Untitled design.png")));
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
<<<<<<< HEAD
		lblNewLabel_2.setIcon(new ImageIcon("src\\anh\\bfsd (4) (1) (1) (1).png"));
=======
		lblNewLabel_2.setIcon(new ImageIcon(Menu1.class.getResource("/hinh_anh/hinh/bfsd (4) (1) (1) (1).png")));
>>>>>>> de948942362d05c210d9820b380159ba5022d0d2
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
    	
    
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object a = e.getSource();
		if(a.equals(btnNewButton_sanpham)) {
			thongtinsanpham = new ThongTinSanPham();
			thongtinsanpham.setVisible(true);
<<<<<<< HEAD
=======
		}else if(a.equals(btnHoaDon)) {
			jpanel_hoadon.setVisible(true);
		}else if(a.equals(btn_thoat_hoadon)) {
			jpanel_hoadon.setVisible(false);
		}else if(a.equals(btnTTKH)) {
			khachhang = new KhachHang();
			khachhang.setVisible(true);
		}else if(a.equals(btnNhanVien)) {
			nhanvien = new NhanVien();
			nhanvien.setVisible(true);
		}else if(a.equals(btnHD)) {
			hopdong = new HopDong();
			hopdong.setVisible(true);
>>>>>>> de948942362d05c210d9820b380159ba5022d0d2
		}
		
		
	}
}
