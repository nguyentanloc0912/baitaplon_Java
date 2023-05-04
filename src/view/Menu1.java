package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.sql.SQLException;
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

	private KhachHang khachhang;
	private thongKe_view thongKe;
	private JButton btnHoaDon;
	private JButton btn_thoat_hoadon;
	private JPanel jpanel_hoadon;
	private JButton btn_info_sanpham;
	private JButton btn_info_kh;
	private JButton btn_banhang;
	private JButton btnNhanVien;
	private JButton btn_dangnhap;
	private JButton btn_dangxuat;
	private JButton btn_baoCao;
	private dangNhap dn;
	private JLabel lbl_user;
	private String username;


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
		setResizable(false);
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
		btn_info_sanpham.setIcon(new ImageIcon(Menu1.class.getResource("/anh/cp.png")));
		btn_info_sanpham.setFont(new Font("Tahoma", Font.BOLD, 13));
	
		btn_info_sanpham.setBounds(30, 72, 254, 39);
		btn_info_sanpham.addActionListener(this);
		panel.add(btn_info_sanpham);
		
		btn_info_kh= new JButton("Th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		btn_info_kh.setIcon(new ImageIcon(Menu1.class.getResource("/anh/people2.png")));
		btn_info_kh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_info_kh.setBounds(30, 125, 254, 39);
		panel.add(btn_info_kh);
		
		btn_banhang  = new JButton("Bán hàng\r\n");
		btn_banhang.setIcon(new ImageIcon(Menu1.class.getResource("/anh/ban.png")));
		btn_banhang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_banhang.setBounds(30, 236, 254, 39);
		panel.add(btn_banhang);


		
		btnHoaDon = new JButton("H\u00F3a \u0111\u01A1n\r\n");
		btnHoaDon.setIcon(new ImageIcon(Menu1.class.getResource("/anh/report1.png")));
		btnHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHoaDon.setBounds(30, 294, 254, 39);
		panel.add(btnHoaDon);
		
		btn_baoCao = new JButton("Báo cáo");
		btn_baoCao.setIcon(new ImageIcon(Menu1.class.getResource("/anh/report4.png")));
		btn_baoCao.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_baoCao.setBounds(30, 350, 254, 39);
		panel.add(btn_baoCao);
		
		btnNhanVien = new JButton("Thông tin nhân viên");
		btnNhanVien.setIcon(new ImageIcon(Menu1.class.getResource("/anh/people.png")));
		btnNhanVien.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNhanVien.setBounds(30, 179, 254, 39);
		panel.add(btnNhanVien);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(330, 181, 344, 229);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
	
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu1.class.getResource("/anh/Untitled design.png")));
		lblNewLabel.setBounds(0, 0, 344, 229);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0110\u1EA1i l\u00FD xe C\u1EA9m Giang");
		lblNewLabel_1.setForeground(new Color(255, 0, 51));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 664, 42);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(330, 98, 344, 73);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Menu1.class.getResource("/anh/bfsd (4) (1) (1) (1).png")));

		lblNewLabel_2.setBounds(0, 0, 344, 73);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(330, 420, 344, 78);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		 btn_dangxuat = new JButton("Đăng xuất\r\n\r\n");
		 btn_dangxuat.setIcon(new ImageIcon(Menu1.class.getResource("/anh/logout.png")));
		 btn_dangxuat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 btn_dangxuat.setBounds(88, 10, 180, 63);
		panel_3.add(btn_dangxuat);
		
		JLabel lblNewLabel_3 = new JLabel("Xin chào : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(508, 75, 68, 13);
		contentPane.add(lblNewLabel_3);
		
		lbl_user = new JLabel();
		lbl_user.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_user.setBounds(586, 75, 88, 13);
		lbl_user.setText(dangNhap.usename);
		contentPane.add(lbl_user);
		
		addAcction();
		
		
	}
	
    public void addAcction() {
    	btn_dangxuat.addActionListener(this);
    	btnNhanVien.addActionListener(this);
    	btn_banhang.addActionListener(this);
    	btn_info_kh.addActionListener(this);
    	btnHoaDon.addActionListener(this);
    	btn_baoCao.addActionListener(this);

    }
//    public void name_user() {
//    	dn = new dangNhap();
//    	String name = dn.getUser(dn.tfUser.getText(), dn.tfPass.getText());
//    	lbl_user.setText(name);
//    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object a = e.getSource();
		if(a.equals(btn_dangxuat)) {
			this.hide();
			new dangNhap().setVisible(true); 
		}
		if(a.equals(btnNhanVien)) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
			new Gui_NhanVien().setVisible(true);
		}else if(a.equals(btn_banhang)) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
			try {
				new banHang().setVisible(true);
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(a.equals(btn_info_sanpham)) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
			try {
				new thongTinSanPham_GUI().setVisible(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(a.equals(btn_info_kh)) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
			new KhachHang().setVisible(true);

		}else if(a.equals(btnHoaDon)) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}

			try {
				new HoaDon_GUI().setVisible(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		

		else if(a.equals(btn_baoCao)) {
			new thongKe_view().setVisible(true);

		}
	}}


