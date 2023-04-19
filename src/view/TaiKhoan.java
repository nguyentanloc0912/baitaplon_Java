package view;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class TaiKhoan extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private DefaultTableModel model1;
	private JTable table1;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField4;
	private JTextField textField6;
	private JTextField textField9;
	private JTextField textField_9;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_10_1;
	private JLabel lbl_username;
	private JTextField txt_password;
	private JLabel lbl_matkhau;
	private JTextField txt_matkhau;
	private JTextField txt_hoten;
	private JLabel lbl_ngaysinh;
	private JTextField txt_ngaysinh;
	private JLabel lbl_email;
	private JTextField txt_email;
	private JLabel lbl_Phone;

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
					TaiKhoan frame = new TaiKhoan();
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
	public TaiKhoan() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Quản lý tài khoản");
		setBounds(100, 100, 966, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel);
		
//		JPanel panel_2 = new JPanel();
//		
//		panel.add(panel_2);
//		Box box_bottom = Box.createVerticalBox();
//		Box box1_bottom = Box.createHorizontalBox();
//		box1_bottom.add(Box.createRigidArea(new Dimension(912, 5)));
//		box_bottom.add(box1_bottom);
//		String[] row_title = {"Mã NV", "Tên nhân viên", "Email", "Chức vụ", "Phòng ban", "Học vấn"};
//		model = new DefaultTableModel(row_title, 0);
//		table = new JTable(model);
//		model = new DefaultTableModel(row_title, 0);
//		table = new JTable(model);
//		
//		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//	            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scrollPane.setPreferredSize(new Dimension(926, 235));
//		box_bottom.add(scrollPane);
//		panel_2.add(box_bottom);
//		
//		JPanel panel_3 = new JPanel();
//		panel_3.setBorder(new TitledBorder(null, "Thông tin nhân viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		panel_3.setBounds(10, 4, 445, 241);
//		panel.add(panel_3);
//		panel_3.setLayout(null);
//		
//		lbl_username = new JLabel("Tên tài khoản: \r\n");
//		lbl_username.setBounds(10, 28, 92, 13);
//		panel_3.add(lbl_username);
//		
//		txt_password = new JTextField();
//		txt_password.setBounds(112, 22, 301, 19);
//		panel_3.add(txt_password);
//		txt_password.setColumns(10);
//		
//		lbl_matkhau = new JLabel("Mật khẩu: \r\n");
//		lbl_matkhau.setBounds(10, 63, 92, 13);
//		panel_3.add(lbl_matkhau);
//		
//		txt_matkhau = new JTextField();
//		txt_matkhau.setColumns(10);
//		txt_matkhau.setBounds(112, 57, 301, 19);
//		panel_3.add(txt_matkhau);
//		
//		JLabel lbl_hoten = new JLabel("Họ và tên: \r\n");
//		lbl_hoten.setBounds(10, 105, 92, 13);
//		panel_3.add(lbl_hoten);
//		
//		txt_hoten = new JTextField();
//		txt_hoten.setColumns(10);
//		txt_hoten.setBounds(112, 99, 301, 19);
//		panel_3.add(txt_hoten);
//		
//		lbl_ngaysinh = new JLabel("Chức vụ: \r\n");
//		lbl_ngaysinh.setBounds(10, 144, 92, 13);
//		panel_3.add(lbl_ngaysinh);
//		
//		txt_ngaysinh = new JTextField();
//		txt_ngaysinh.setColumns(10);
//		txt_ngaysinh.setBounds(112, 138, 301, 19);
//		panel_3.add(txt_ngaysinh);
//		
//		lbl_email = new JLabel("Email: \r\n");
//		lbl_email.setBounds(10, 181, 92, 13);
//		panel_3.add(lbl_email);
//		
//
//		txt_email = new JTextField();
//		txt_email.setColumns(10);
//		txt_email.setBounds(112, 174, 92, 13);
//		panel_3.add(txt_email);
//		
//		lbl_Phone = new JLabel("Phone: \r\n");
//		lbl_Phone.setBounds(10, 218, 92, 13);
//		panel_3.add(lbl_Phone);
//		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
//		textField_4.setBounds(112, 212, 301, 19);
//		panel_3.add(textField_4);
//		
//		JPanel panel_4 = new JPanel();
//		panel_4.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		panel_4.setBounds(465, 4, 452, 241);
//		panel.add(panel_4);
//		panel_4.setLayout(null);
//		
//		JButton btnThm = new JButton("Thêm\r\n");
//		btnThm.setIcon(new ImageIcon("src\\anh\\new.png"));
//		btnThm.setBounds(10, 53, 432, 25);
//		panel_4.add(btnThm);
//		
//		JButton btnNewButton_1_1 = new JButton("Xửa");
//		btnNewButton_1_1.setIcon(new ImageIcon("src\\anh\\del.png"));
//		btnNewButton_1_1.setBounds(10, 88, 432, 25);
//		panel_4.add(btnNewButton_1_1);
//		
//		JButton btnNewButton_1_2 = new JButton("Xóa");
//		btnNewButton_1_2.setIcon(new ImageIcon("src\\anh\\sua2.png"));
//		btnNewButton_1_2.setBounds(10, 123, 432, 25);
//		panel_4.add(btnNewButton_1_2);
//		
//		JButton btnNewButton_1_3 = new JButton("Lưu");
//		btnNewButton_1_3.setIcon(new ImageIcon("src\\anh\\save.png"));
//		btnNewButton_1_3.setBounds(10, 158, 432, 25);
//		panel_4.add(btnNewButton_1_3);
//		
//		JButton btnNewButton_1_4 = new JButton("Hủy");
//		btnNewButton_1_4.setIcon(new ImageIcon("src\\anh\\close2.png"));
//		btnNewButton_1_4.setBounds(10, 193, 432, 25);
//		panel_4.add(btnNewButton_1_4);
//		
//		JButton btnNewButton_1_5 = new JButton("Tìm\r\n");
//		btnNewButton_1_5.setIcon(new ImageIcon("src\\anh\\tim2.png"));
//		btnNewButton_1_5.setBounds(280, 18, 162, 25);
//		panel_4.add(btnNewButton_1_5);
//		
//		textField_5 = new JTextField();
//		textField_5.setBounds(10, 21, 260, 19);
//		panel_4.add(textField_5);
//		textField_5.setColumns(10);
//		
//		panel.setLayout(null);
		
		
		
	}
}
