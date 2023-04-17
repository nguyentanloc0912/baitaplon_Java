package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Window;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;



import model.ds_hopDong;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class banHang extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private ds_hopDong ds;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Label jlb_banhang;
	private JComboBox comboBox_tenxe;
	private JLabel jlb_soluong;
	private JTextField txt_soluong;
	private JLabel lbl_makhachhang;
	private JTextField txt_ma;
	private JLabel jlb_dongia;
	private JTextField txt_giamgia;
	private JLabel txt_tongtien;
	private JLabel jlb_tongtien;
	private JLabel lblghichu;
	private JTextArea txt_area_ghichu;
	private JButton btnThoat;
	private JButton btntaomoi;
	private JButton btnThem;
	private JButton btnThanhtoan;
	private JButton btnInhoadon;

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
					banHang frame = new banHang();
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
	public banHang() {
		ds = new ds_hopDong();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Hợp đồng");
		setBounds(100, 100, 1000, 609);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jlb_banhang = new Label("Bán hàng");
		jlb_banhang.setAlignment(Label.CENTER);
		jlb_banhang.setBounds(317, 0, 268, 49);
		jlb_banhang.setFont(new Font("Arial", Font.BOLD, 25));
		contentPane.add(jlb_banhang);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(303, 55, 673, 228);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_tensanpham = new JLabel("Tên sản phẩm : ");
		lbl_tensanpham.setBounds(10, 10, 105, 13);
		panel.add(lbl_tensanpham);
		
		comboBox_tenxe = new JComboBox();
		comboBox_tenxe.setBounds(125, 6, 96, 21);
		panel.add(comboBox_tenxe);
		
		jlb_soluong = new JLabel("Số lượng : \r\n");
		jlb_soluong.setBounds(10, 44, 88, 13);
		panel.add(jlb_soluong);
		
		txt_soluong = new JTextField();
		txt_soluong.setBounds(125, 41, 171, 19);
		panel.add(txt_soluong);
		txt_soluong.setColumns(10);
		
		lbl_makhachhang = new JLabel("Mã KH : \r\n");
		lbl_makhachhang.setBounds(10, 84, 88, 13);
		panel.add(lbl_makhachhang);
		
		txt_ma = new JTextField();
		txt_ma.setColumns(10);
		txt_ma.setBounds(125, 81, 171, 19);
		panel.add(txt_ma);
		
		jlb_dongia = new JLabel("Đơn giá\r\n :");
		jlb_dongia.setBounds(337, 44, 60, 13);
		panel.add(jlb_dongia);
		
		JLabel jlb_giam = new JLabel("Giảm giá");
		jlb_giam.setBounds(10, 127, 88, 13);
		panel.add(jlb_giam);
		
		txt_giamgia = new JTextField();
		txt_giamgia.setColumns(10);
		txt_giamgia.setBounds(125, 124, 171, 19);
		panel.add(txt_giamgia);
		
		jlb_tongtien = new JLabel("Tổng tiền : ");
		jlb_tongtien.setBounds(10, 174, 88, 13);
		panel.add(jlb_tongtien);
		
		txt_tongtien = new JLabel("Tổng tiền hóa đơn : \r\n");
		txt_tongtien.setBounds(10, 205, 124, 13);
		panel.add(txt_tongtien);
		
		lblghichu = new JLabel("Ghi chú : \r\n");
		lblghichu.setBounds(337, 106, 60, 13);
		panel.add(lblghichu);
		
		txt_area_ghichu = new JTextArea();
		txt_area_ghichu.setBounds(417, 100, 231, 110);
		panel.add(txt_area_ghichu);
		
		
		
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Mã Hóa Đơn");
		model.addColumn("Mã Sản phẩm");
		model.addColumn("Tên sản phẩm");
		model.addColumn("Số lượng");
		model.addColumn("Thành tiền");
		
		
		JTableHeader Theader = table.getTableHeader();
		Theader.setBackground(Color.red);
//		table.getColumnModel().getColumn(1).setPreferredWidth(90);
//		table.getColumnModel().getColumn(2).setPreferredWidth(105);
//		table.getColumnModel().getColumn(3).setPreferredWidth(110);
//		table.getColumnModel().getColumn(8).setPreferredWidth(90);
//		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		((DefaultTableCellRenderer)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);;
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 373, 966, 189);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 55, 283, 73);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Hóa Đơn : \r\n ");
		lblNewLabel.setBounds(10, 32, 92, 13);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 150, 283, 73);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên nhân viên lập : ");
		lblNewLabel_1.setBounds(10, 10, 121, 13);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày lập : ");
		lblNewLabel_1_1.setBounds(10, 50, 101, 13);
		panel_1_1.add(lblNewLabel_1_1);
		
		btnThoat = new JButton("Thoát\r\n");
		btnThoat.setIcon(new ImageIcon(banHang.class.getResource("/anh/thoat.png")));
		btnThoat.setBounds(10, 244, 134, 39);
		contentPane.add(btnThoat);
		
		btntaomoi = new JButton("Hóa đơn mới");
		btntaomoi.setIcon(new ImageIcon(banHang.class.getResource("/anh/add1.png")));
		btntaomoi.setBounds(303, 324, 134, 39);
		contentPane.add(btntaomoi);
		
		btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon(banHang.class.getResource("/anh/them.png")));
	
		btnThem.setBounds(489, 324, 134, 39);
		contentPane.add(btnThem);
		
		btnThanhtoan = new JButton("Thanh toán");
		btnThanhtoan.setIcon(new ImageIcon(banHang.class.getResource("/anh/chi.png")));
		btnThanhtoan.setBounds(669, 324, 134, 39);
		contentPane.add(btnThanhtoan);
		
		btnInhoadon = new JButton("In hóa đơn");
		btnInhoadon.setBounds(842, 324, 134, 39);
		contentPane.add(btnInhoadon);
	}
}
