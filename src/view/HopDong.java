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

public class HopDong extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private DefaultTableModel model;
	private JTextField textField_10;
	private ds_hopDong ds;

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
		setTitle("Hợp đồng");
		setBounds(100, 100, 1000, 609);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Quản lý hợp đồng");
		label.setBounds(317, 0, 268, 49);
		label.setFont(new Font("Arial", Font.BOLD, 25));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin h\u1EE3p \u0111\u1ED3ng", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 55, 673, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số hợp đồng:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 18, 92, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNgyHpng = new JLabel("Ngày hợp đồng:");
		lblNgyHpng.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNgyHpng.setBounds(10, 55, 107, 30);
		panel.add(lblNgyHpng);
		
		JLabel lblThiGianBo = new JLabel("Thời gian bảo hành:");
		lblThiGianBo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThiGianBo.setBounds(363, 59, 128, 23);
		panel.add(lblThiGianBo);
		
		JLabel lblTinPhiThanh = new JLabel("Tiền phải thanh toán:");
		lblTinPhiThanh.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTinPhiThanh.setBounds(10, 95, 145, 24);
		panel.add(lblTinPhiThanh);
		
		JLabel lblSTin = new JLabel("Số tiền đã trả:");
		lblSTin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSTin.setBounds(363, 102, 92, 13);
		panel.add(lblSTin);
		
		JLabel lblMNhnVin = new JLabel("Mã nhân viên lập hợp đồng:");
		lblMNhnVin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMNhnVin.setBounds(10, 129, 176, 25);
		panel.add(lblMNhnVin);
		
		JLabel lblMuaTrGp = new JLabel("Mua trả góp:");
		lblMuaTrGp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMuaTrGp.setBounds(10, 164, 92, 24);
		panel.add(lblMuaTrGp);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Trả góp");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.ITALIC, 12));
		rdbtnNewRadioButton.setBounds(122, 160, 84, 30);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnKhngTrGp = new JRadioButton("Không trả góp");
		rdbtnKhngTrGp.setFont(new Font("Tahoma", Font.ITALIC, 12));
		rdbtnKhngTrGp.setBounds(222, 161, 114, 30);
		panel.add(rdbtnKhngTrGp);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnKhngTrGp);
		group.add(rdbtnNewRadioButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ngày trả lần 1", "Ngày trả lần 2", "Ngày trả lần 3"}));
		comboBox.setBounds(363, 167, 120, 21);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(493, 169, 175, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 134, 471, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 100, 203, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(492, 100, 175, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(492, 60, 175, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(112, 60, 241, 19);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(112, 23, 241, 19);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 274, 673, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên khách hàng:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 21, 120, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(10, 55, 120, 24);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số điện thoại:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(386, 21, 99, 24);
		panel_1.add(lblNewLabel_1_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(128, 25, 226, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(128, 59, 539, 19);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(495, 25, 172, 19);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(693, 55, 283, 308);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnThmHpng = new JButton("Thêm hợp đồng");
		btnThmHpng.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/add1.png")));
		btnThmHpng.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThmHpng.setBounds(10, 89, 263, 33);
		panel_2.add(btnThmHpng);
		
		JButton btnXaHpng = new JButton("Xóa hợp đồng");
		btnXaHpng.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/del.png")));
		btnXaHpng.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXaHpng.setBounds(10, 132, 263, 33);
		panel_2.add(btnXaHpng);
		
		JButton btnCpNht = new JButton("Cập nhật ");
		btnCpNht.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/sua2.png")));
		btnCpNht.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCpNht.setBounds(10, 222, 263, 33);
		panel_2.add(btnCpNht);
		
		JButton btnXaTrng = new JButton("Xóa trắng");
		btnXaTrng.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/refresh.png")));
		btnXaTrng.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXaTrng.setBounds(10, 179, 263, 33);
		panel_2.add(btnXaTrng);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/close2.png")));
		btnThot.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThot.setBounds(146, 265, 127, 33);
		panel_2.add(btnThot);
		
		JButton btnLu = new JButton("Lưu");
		btnLu.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/save.png")));
		btnLu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLu.setBounds(10, 265, 126, 33);
		panel_2.add(btnLu);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập số hợp đồng cần tìm:");
		lblNewLabel_2.setBounds(10, 22, 186, 24);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 52, 159, 27);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setIcon(new ImageIcon(HopDong.class.getResource("/hinh_anh/hinh/search.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(179, 48, 94, 33);
		panel_2.add(btnNewButton);
		
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Số hợp đồng");
		model.addColumn("Ngày hợp đồng");
		model.addColumn("Thời gian bảo hành");
		model.addColumn("Tiền phải thanh toán");
		model.addColumn("Số tiền đã trả");
		model.addColumn("Mã nhân viên");
		model.addColumn("Mua trả góp");
		model.addColumn("Ngày trả lần");
		model.addColumn("Mã khách hàng");
		model.addColumn("Số điện thoại");
		model.addColumn("Địa chỉ");
		
		TableColumn tableColumn = new TableColumn();
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(110);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 373, 966, 189);
		contentPane.add(scrollPane);
	}
}
