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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class ChiTietHD_GUI extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JButton btnThoat;
	private JLabel lbl_GhiChu;
	private JLabel lbl_ThanhTien;
	private JLabel lbl_SoLuong;
	private JLabel lbl_MaSP;
	private JLabel lbl_MaHoaDon;
	private JLabel lbl_MaChiTiet;
	public static JTable table_cthd;
	public static DefaultTableModel model_cthd;

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
		setTitle("Quản lý chi tiết hóa đơn");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 803, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		pnNorth.setForeground(new Color(220, 20, 60));
		pnNorth.setBackground(new Color(173, 216, 230));
		contentPane.add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblC = new JLabel("Chi tiết hóa đơn");
		lblC.setForeground(new Color(220, 20, 60));
		lblC.setBackground(new Color(135, 206, 250));
		lblC.setFont(new Font("Tahoma", Font.BOLD, 32));
		pnNorth.add(lblC);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(pnCenter, BorderLayout.CENTER);
		pnCenter.setLayout(null);
		
		JLabel lbl_title_MachiTiet = new JLabel("Mã chi tiết hóa đơn");
		lbl_title_MachiTiet.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_title_MachiTiet.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_title_MachiTiet.setBounds(138, 45, 165, 16);
		pnCenter.add(lbl_title_MachiTiet);
		
		JLabel lbl_title_MaHD = new JLabel("Mã hóa đơn");
		lbl_title_MaHD.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_title_MaHD.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_title_MaHD.setBounds(200, 74, 103, 16);
		pnCenter.add(lbl_title_MaHD);
		
		JLabel lbl_title_MaSP = new JLabel("Mã sản phẩm");
		lbl_title_MaSP.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_title_MaSP.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_title_MaSP.setBounds(176, 103, 127, 16);
		pnCenter.add(lbl_title_MaSP);
		
		JLabel lbl_title_SLuong = new JLabel("Số lượng");
		lbl_title_SLuong.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_title_SLuong.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_title_SLuong.setBounds(220, 132, 83, 16);
		pnCenter.add(lbl_title_SLuong);
		
		JLabel lbl_tltle_ThanhTien = new JLabel("Thành tiền");
		lbl_tltle_ThanhTien.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_tltle_ThanhTien.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_tltle_ThanhTien.setBounds(176, 161, 127, 16);
		pnCenter.add(lbl_tltle_ThanhTien);
		
		btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(ChiTietHD_GUI.class.getResource("/anh/close2.png")));
		btnThoat.setBackground(new Color(135, 206, 250));
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setBounds(602, 211, 121, 39);
		pnCenter.add(btnThoat);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 264, 751, 102);
		pnCenter.add(panel);
		
		JLabel lbl_title_Ghichu = new JLabel("Ghi chú");
		lbl_title_Ghichu.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_title_Ghichu.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_title_Ghichu.setBounds(176, 194, 127, 16);
		pnCenter.add(lbl_title_Ghichu);
		
		lbl_MaChiTiet = new JLabel("");
		lbl_MaChiTiet.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_MaChiTiet.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_MaChiTiet.setBounds(323, 49, 165, 16);
		pnCenter.add(lbl_MaChiTiet);
		
		lbl_MaHoaDon = new JLabel("");
		lbl_MaHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_MaHoaDon.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_MaHoaDon.setBounds(323, 78, 165, 16);
		pnCenter.add(lbl_MaHoaDon);
		
		lbl_MaSP = new JLabel("");
		lbl_MaSP.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_MaSP.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_MaSP.setBounds(323, 107, 165, 16);
		pnCenter.add(lbl_MaSP);
		
		lbl_SoLuong = new JLabel("");
		lbl_SoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SoLuong.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_SoLuong.setBounds(323, 136, 165, 16);
		pnCenter.add(lbl_SoLuong);
		
		lbl_ThanhTien = new JLabel("");
		lbl_ThanhTien.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ThanhTien.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_ThanhTien.setBounds(323, 165, 165, 16);
		pnCenter.add(lbl_ThanhTien);
		
		lbl_GhiChu = new JLabel("");
		lbl_GhiChu.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_GhiChu.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_GhiChu.setBounds(323, 194, 165, 25);
		pnCenter.add(lbl_GhiChu);
		
		JPanel pnSouth_1 = new JPanel();
		contentPane.add(pnSouth_1, BorderLayout.SOUTH);
		
		String header[] ={"Mã chi tiết hóa đơn","Mã hóa đơn","Mã sản phẩm","Số lượng","Thành tiền", "Ghi chú"};
		model_cthd = new DefaultTableModel(header, 0);
		table_cthd = new JTable(model_cthd);
		JScrollPane jScrollPane = new JScrollPane(table_cthd, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jScrollPane.setPreferredSize(new Dimension(770,190));
		pnSouth_1.add(jScrollPane);
		// Add Listener
		table_cthd.addMouseListener(this);
		btnThoat.addActionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int pos = table_cthd.getSelectedRow();
		lbl_MaChiTiet.setText((String) model_cthd.getValueAt(pos, 0));
		lbl_MaHoaDon.setText((String) model_cthd.getValueAt(pos, 1));
		lbl_MaSP.setText((String) model_cthd.getValueAt(pos, 2));
		lbl_SoLuong.setText((String) model_cthd.getValueAt(pos, 3));
		lbl_ThanhTien.setText((String) model_cthd.getValueAt(pos, 4));
		lbl_GhiChu.setText((String) model_cthd.getValueAt(pos, 5));
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object a = e.getSource();
		if(a.equals(btnThoat)) {
			this.setVisible(false);
		}
		
	}
}
