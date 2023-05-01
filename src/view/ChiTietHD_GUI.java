package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class ChiTietHD_GUI extends JFrame {

	private JPanel contentPane;
	private JButton btnXoa, btnThoat;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChiTietHD_GUI frame = new ChiTietHD_GUI();
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
	public ChiTietHD_GUI() {
		setTitle("Quản Lí Chi Tiết Hóa Đơn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		pnNorth.setForeground(new Color(220, 20, 60));
		pnNorth.setBackground(new Color(173, 216, 230));
		contentPane.add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblC = new JLabel("Chi Tiết Hóa Đơn");
		lblC.setForeground(new Color(220, 20, 60));
		lblC.setBackground(new Color(135, 206, 250));
		lblC.setFont(new Font("Tahoma", Font.BOLD, 32));
		pnNorth.add(lblC);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(pnCenter, BorderLayout.CENTER);
		pnCenter.setLayout(null);
		
		JLabel lblMachiTiet = new JLabel("Mã Chi Tiết Hóa Đơn:");
		lblMachiTiet.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMachiTiet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMachiTiet.setBounds(138, 45, 165, 16);
		pnCenter.add(lblMachiTiet);
		
		JLabel lblMaHD = new JLabel("Mã Hóa Đơn:");
		lblMaHD.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMaHD.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaHD.setBounds(200, 74, 103, 16);
		pnCenter.add(lblMaHD);
		
		JLabel lblMaSP = new JLabel("Mã Sản Phẩm:");
		lblMaSP.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMaSP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaSP.setBounds(176, 103, 127, 16);
		pnCenter.add(lblMaSP);
		
		JLabel lblSLuong = new JLabel("Số Lượng:");
		lblSLuong.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSLuong.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSLuong.setBounds(220, 132, 83, 16);
		pnCenter.add(lblSLuong);
		
		JLabel lblThanhTien = new JLabel("Thành Tiền:");
		lblThanhTien.setFont(new Font("Dialog", Font.BOLD, 14));
		lblThanhTien.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThanhTien.setBounds(176, 161, 127, 16);
		pnCenter.add(lblThanhTien);
		
		btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(ChiTietHD_GUI.class.getResource("/anh/close2.png")));
		btnThoat.setBackground(new Color(135, 206, 250));
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setBounds(626, 211, 97, 39);
		pnCenter.add(btnThoat);
		
		btnXoa = new JButton("Xóa Dữ liệu");
		btnXoa.setIcon(new ImageIcon(ChiTietHD_GUI.class.getResource("/anh/del.png")));
		btnXoa.setBackground(new Color(135, 206, 250));
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXoa.setBounds(33, 211, 146, 39);
		pnCenter.add(btnXoa);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 264, 751, 102);
		pnCenter.add(panel);
		
		JPanel pnSouth_1 = new JPanel();
		contentPane.add(pnSouth_1, BorderLayout.SOUTH);
		
		String header[] ={"Mã Chí Tiết Hóa Đơn","Mã Hóa Đơn","Mã Sản Phẩm","Số lượng","Thành Tiền"};
		model = new DefaultTableModel(header, 0);
		table = new JTable(model);
		JScrollPane jScrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jScrollPane.setPreferredSize(new Dimension(770,190));
		pnSouth_1.add(jScrollPane);
	}

}
