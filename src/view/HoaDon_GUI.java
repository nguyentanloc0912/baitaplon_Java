package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.SystemColor;

import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;

import java.awt.Font;

import javax.swing.JTabbedPane;

import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class HoaDon_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaHoaDon;
	private JLabel lbSoDienThoai;
	private JTextField txtSDT;
	private JLabel lbTongTien;
	private JTextField txtTongTien;
	private JLabel lblNgayLap;
	private JTextField txtNgayLap;
	private JLabel lblGhiCh;
	private JTextField txtNguoiLap;
	private JPanel panel_2;
	private JPanel panel_1;
	private JButton btnSua;
	private JButton btnXoa;
	private JButton btnIN;
	private JButton btnThoat;
	private JLabel lblTimKiem;
	private JTextField txtTimKiem;
	private JButton btnTmKim;
	private JTable table;
	private DefaultTableModel model;
	private JPanel panel_3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDon_GUI frame = new HoaDon_GUI();
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
	public HoaDon_GUI() {
		setTitle("Quản Lí Hóa Đơn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823,750);
		contentPane = new JPanel();
		contentPane.setToolTipText("Mã Hóa Đơn");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(12, 13, 781, 90);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel = new JLabel("Hóa Đơn");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(52, 13, 699, 64);
		panel_3.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel.setBounds(12, 115, 560, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setBounds(109, 24, 116, 22);
		panel.add(txtMaHoaDon);
		txtMaHoaDon.setForeground(Color.ORANGE);
		txtMaHoaDon.setToolTipText("Mã Hóa Đơn");
		txtMaHoaDon.setEditable(false);
		txtMaHoaDon.setBackground(null);
		txtMaHoaDon.setColumns(10);
		
		JLabel lblMaHoaDon = new JLabel("Mã Hóa Đơn : ");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaHoaDon.setBounds(12, 21, 99, 26);
		panel.add(lblMaHoaDon);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(109, 59, 116, 22);
		panel.add(txtSDT);
		txtSDT.setToolTipText("Mã Hóa Đơn");
		txtSDT.setEditable(false);
		txtSDT.setColumns(10);
		txtSDT.setBackground(null);
		
		txtTongTien = new JTextField();
		txtTongTien.setBounds(109, 94, 116, 22);
		panel.add(txtTongTien);
		txtTongTien.setToolTipText("Mã Hóa Đơn");
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);
		txtTongTien.setBackground(null);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setBounds(109, 129, 116, 22);
		panel.add(txtNgayLap);
		txtNgayLap.setToolTipText("Mã Hóa Đơn");
		txtNgayLap.setEditable(false);
		txtNgayLap.setColumns(10);
		txtNgayLap.setBackground(null);
		
		JTextArea txtGhiChu = new JTextArea();
		txtGhiChu.setBounds(12, 218, 266, 80);
		panel.add(txtGhiChu);
		txtGhiChu.setBackground(Color.WHITE);
		
		lblGhiCh = new JLabel("Ghi Chú");
		lblGhiCh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGhiCh.setBounds(23, 189, 105, 16);
		panel.add(lblGhiCh);
		
		JButton btnXemChiTiet = new JButton("Xem Chi Tiết");
		btnXemChiTiet.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXemChiTiet.setBounds(337, 247, 149, 40);
		panel.add(btnXemChiTiet);
		btnXemChiTiet.setBackground(Color.WHITE);
		btnXemChiTiet.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/report.png")));
		
		JLabel lblNguoiLap = new JLabel("Người Lập :");
		lblNguoiLap.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNguoiLap.setBounds(295, 22, 99, 26);
		panel.add(lblNguoiLap);
		
		txtNguoiLap = new JTextField();
		txtNguoiLap.setBounds(391, 24, 116, 22);
		panel.add(txtNguoiLap);
		txtNguoiLap.setEditable(false);
		txtNguoiLap.setColumns(10);
		txtNguoiLap.setBackground(null);
		
		lbSoDienThoai = new JLabel("Số Điện Thoại :");
		lbSoDienThoai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoDienThoai.setBounds(6, 59, 105, 26);
		panel.add(lbSoDienThoai);
		
		lbTongTien = new JLabel("Tổng Tiền :");
		lbTongTien.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbTongTien.setBounds(40, 97, 70, 16);
		panel.add(lbTongTien);
		lbTongTien.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNgayLap = new JLabel("Ngày Lập :");
		lblNgayLap.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNgayLap.setBounds(41, 132, 70, 16);
		panel.add(lblNgayLap);
		lblNgayLap.setHorizontalAlignment(SwingConstants.LEFT);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(584, 115, 209, 329);
		contentPane.add(tabbedPane);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		tabbedPane.addTab("Chức Năng", null, panel_2, null);
		tabbedPane.setForegroundAt(0, new Color(0, 153, 255));
		tabbedPane.setBackgroundAt(0, new Color(0, 255, 255));
		panel_2.setLayout(null);
		
		btnSua = new JButton("Sửa");
		btnSua.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/sua2.png")));
		btnSua.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSua.setBackground(SystemColor.info);
		btnSua.setBounds(35, 28, 139, 40);
		panel_2.add(btnSua);
		
		btnXoa = new JButton("Xóa");
		btnXoa.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/del.png")));
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXoa.setBackground(SystemColor.info);
		btnXoa.setBounds(35, 94, 139, 40);
		panel_2.add(btnXoa);
		
		btnIN = new JButton("IN");
		btnIN.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/print.png")));
		btnIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIN.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIN.setBackground(SystemColor.info);
		btnIN.setBounds(35, 160, 139, 40);
		panel_2.add(btnIN);
		
		btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/close2.png")));
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThoat.setBackground(Color.WHITE);
		btnThoat.setBounds(46, 252, 118, 34);
		panel_2.add(btnThoat);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Tìm Kiếm", null, panel_1, null);
		tabbedPane.setForegroundAt(1, new Color(30, 144, 255));
		tabbedPane.setBackgroundAt(1, new Color(0, 255, 255));
		panel_1.setLayout(null);
		
		lblTimKiem = new JLabel("Mã Hóa Đơn :");
		lblTimKiem.setForeground(SystemColor.desktop);
		lblTimKiem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTimKiem.setBackground(SystemColor.inactiveCaption);
		lblTimKiem.setBounds(12, 53, 95, 16);
		panel_1.add(lblTimKiem);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(12, 82, 180, 38);
		panel_1.add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		btnTmKim = new JButton("Tìm Kiếm");
		btnTmKim.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/search.png")));
		btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTmKim.setBackground(SystemColor.activeCaption);
		btnTmKim.setBounds(38, 263, 128, 38);
		panel_1.add(btnTmKim);
		
		
		
		String header[] = {"Mã Hóa Đơn","Ngày Lập","Số Điện Thoại","Tổng Tiền","Người lập","Ghi Chú"};
		model = new DefaultTableModel(header,0);
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(12,470,781,226);
		contentPane.add(sp);
	}
}
