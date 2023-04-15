package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
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
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import model.ds_hopDong;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HopDong extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private ds_hopDong ds;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HopDong frame = new HopDong();
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
	public HopDong() {
		ds = new ds_hopDong();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hợp đôngf");
		setBounds(100, 100, 1000, 609);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Hợp đồng bán hàng");
		label.setAlignment(Label.CENTER);
		label.setBounds(317, 0, 268, 49);
		label.setFont(new Font("Arial", Font.BOLD, 25));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(303, 55, 673, 259);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_tensanpham = new JLabel("Tên sản phẩm : ");
		lbl_tensanpham.setBounds(10, 10, 88, 13);
		panel.add(lbl_tensanpham);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(125, 6, 96, 21);
		panel.add(comboBox);
		
		JLabel lbl_soluong = new JLabel("Số lượng : \r\n");
		lbl_soluong.setBounds(10, 44, 88, 13);
		panel.add(lbl_soluong);
		
		textField = new JTextField();
		textField.setBounds(125, 41, 171, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_makhachhang = new JLabel("Mã KH : \r\n");
		lbl_makhachhang.setBounds(10, 84, 88, 13);
		panel.add(lbl_makhachhang);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 81, 171, 19);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Đơn giá\r\n :");
		lblNewLabel_3.setBounds(337, 44, 60, 13);
		panel.add(lblNewLabel_3);
		
		JLabel jradio_giam = new JLabel("Giảm giá");
		jradio_giam.setBounds(10, 148, 88, 13);
		panel.add(jradio_giam);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 145, 171, 19);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Thanh toán : ");
		lblNewLabel_2_1_1_1_1.setBounds(10, 113, 88, 13);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JRadioButton jradio_trahet = new JRadioButton("Trả hết");
		jradio_trahet.setBounds(125, 109, 103, 21);
		panel.add(jradio_trahet);
		
		JRadioButton jradio_tranhieulan = new JRadioButton("Trả nhiều lần\r\n");
		jradio_tranhieulan.setBounds(230, 106, 103, 21);
		panel.add(jradio_tranhieulan);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(337, 96, 252, 34);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Số tiền trả :");
		lblNewLabel_2.setBounds(10, 10, 68, 13);
		panel_2.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(72, 7, 170, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tổng tiền : ");
		lblNewLabel_4.setBounds(10, 190, 88, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tổng tiền hóa đơn : \r\n");
		lblNewLabel_4_1.setBounds(10, 213, 124, 13);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Tiền còn thiếu :");
		lblNewLabel_4_1_1.setBounds(10, 236, 124, 13);
		panel.add(lblNewLabel_4_1_1);
		
		ButtonGroup group = new ButtonGroup();
		
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Mã Hóa Đơn");
		model.addColumn("Mã Sản phẩm");
		model.addColumn("Tên sản phẩm");
		model.addColumn("Số lượng");
		model.addColumn("Thành tiền");
		model.addColumn("Tiền còn thiếu");
		
		TableColumn tableColumn = new TableColumn();
//		table.getColumnModel().getColumn(1).setPreferredWidth(90);
//		table.getColumnModel().getColumn(2).setPreferredWidth(105);
//		table.getColumnModel().getColumn(3).setPreferredWidth(110);
//		table.getColumnModel().getColumn(8).setPreferredWidth(90);
//		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		
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
		
		JButton btnThoat = new JButton("Thoát\r\n");
		btnThoat.setBounds(10, 246, 114, 31);
		contentPane.add(btnThoat);
		
		JButton btntaomoi = new JButton("Hóa đơn mới");
		btntaomoi.setBounds(303, 324, 114, 31);
		contentPane.add(btntaomoi);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setBounds(489, 324, 114, 31);
		contentPane.add(btnThem);
		
		JButton btnThanhtoan = new JButton("Thanh toán");
		btnThanhtoan.setBounds(669, 324, 114, 31);
		contentPane.add(btnThanhtoan);
		
		JButton btnInhoadon = new JButton("In hóa đơn");
		btnInhoadon.setBounds(862, 324, 114, 31);
		contentPane.add(btnInhoadon);
	}
}
