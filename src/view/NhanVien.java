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

public class NhanVien extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhanVien frame = new NhanVien();
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
	public NhanVien() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 966, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 932, 520);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Nhân viên hành chính", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 247, 927, 264);
		panel.add(panel_2);
		Box box_bottom = Box.createVerticalBox();
		Box box1_bottom = Box.createHorizontalBox();
		box1_bottom.add(Box.createRigidArea(new Dimension(912, 5)));
		box_bottom.add(box1_bottom);
		String[] row_title = {"Mã NV", "Tên nhân viên", "Email", "Chức vụ", "Phòng ban", "Học vấn"};
		model = new DefaultTableModel(row_title, 0);
		table = new JTable(model);
		model = new DefaultTableModel(row_title, 0);
		table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(926, 235));
		box_bottom.add(scrollPane);
		panel_2.add(box_bottom);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Thông tin nhân viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 4, 445, 241);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên\r\n");
		lblNewLabel.setBounds(10, 28, 92, 13);
		panel_3.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(112, 22, 301, 19);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tên nhân viên\r\n");
		lblNewLabel_1.setBounds(10, 63, 92, 13);
		panel_3.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 57, 301, 19);
		panel_3.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email\r\n");
		lblNewLabel_1_1.setBounds(10, 105, 92, 13);
		panel_3.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 99, 301, 19);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Chức vụ");
		lblNewLabel_1_2.setBounds(10, 144, 92, 13);
		panel_3.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(112, 138, 301, 19);
		panel_3.add(textField_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Phòng ban\r\n");
		lblNewLabel_1_2_1.setBounds(10, 181, 92, 13);
		panel_3.add(lblNewLabel_1_2_1);
		String phongban[] = {"Phòng nhân sự", "Phòng kế toán", "Phòng tài chinh"};
		JComboBox comboBox = new JComboBox(phongban);
		
		comboBox.setBounds(112, 174, 130, 21);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Học vụ\r\n");
		lblNewLabel_1_2_2.setBounds(10, 218, 92, 13);
		panel_3.add(lblNewLabel_1_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(112, 212, 301, 19);
		panel_3.add(textField_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(465, 4, 452, 241);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnThm = new JButton("Thêm\r\n");
		btnThm.setIcon(new ImageIcon("src\\anh\\new.png"));
		btnThm.setBounds(10, 53, 432, 25);
		panel_4.add(btnThm);
		
		JButton btnNewButton_1_1 = new JButton("Xửa");
		btnNewButton_1_1.setIcon(new ImageIcon("src\\anh\\del.png"));
		btnNewButton_1_1.setBounds(10, 88, 432, 25);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Xóa");
		btnNewButton_1_2.setIcon(new ImageIcon("src\\anh\\sua2.png"));
		btnNewButton_1_2.setBounds(10, 123, 432, 25);
		panel_4.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Lưu");
		btnNewButton_1_3.setIcon(new ImageIcon("src\\anh\\save.png"));
		btnNewButton_1_3.setBounds(10, 158, 432, 25);
		panel_4.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Hủy");
		btnNewButton_1_4.setIcon(new ImageIcon("src\\anh\\close2.png"));
		btnNewButton_1_4.setBounds(10, 193, 432, 25);
		panel_4.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Tìm\r\n");
		btnNewButton_1_5.setIcon(new ImageIcon("src\\anh\\tim2.png"));
		btnNewButton_1_5.setBounds(280, 18, 162, 25);
		panel_4.add(btnNewButton_1_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 21, 260, 19);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Nhân viên hành chính", null, panel, null);
		panel.setLayout(null);
		
		
		tabbedPane.addTab("Nhân viên kỹ thuật", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new TitledBorder(null, "Thông tin nhân viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3_1.setBounds(10, 10, 445, 241);
		panel_1.add(panel_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã nhân viên\r\n");
		lblNewLabel_2.setBounds(10, 28, 92, 13);
		panel_3_1.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(112, 22, 301, 19);
		panel_3_1.add(textField_6);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tên nhân viên\r\n");
		lblNewLabel_1_3.setBounds(10, 63, 92, 13);
		panel_3_1.add(lblNewLabel_1_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(112, 57, 301, 19);
		panel_3_1.add(textField_7);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email\r\n");
		lblNewLabel_1_1_1.setBounds(10, 105, 92, 13);
		panel_3_1.add(lblNewLabel_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(112, 99, 301, 19);
		panel_3_1.add(textField_8);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Chức vụ");
		lblNewLabel_1_2_3.setBounds(10, 144, 92, 13);
		panel_3_1.add(lblNewLabel_1_2_3);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(112, 138, 301, 19);
		panel_3_1.add(textField_10);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Bậc thợ\r\n");
		lblNewLabel_1_2_1_1.setBounds(10, 181, 92, 13);
		panel_3_1.add(lblNewLabel_1_2_1_1);
		
	
		textField_10_1 = new JTextField();
		textField_10_1.setColumns(10);
		textField_10_1.setBounds(112, 174, 301, 21);
		panel_3_1.add(textField_10_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Năm KN\r\n");
		lblNewLabel_1_2_2_1.setBounds(10, 218, 92, 13);
		panel_3_1.add(lblNewLabel_1_2_2_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(112, 212, 301, 19);
		panel_3_1.add(textField_11);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4_1.setBounds(465, 10, 452, 241);
		panel_1.add(panel_4_1);
		
		JButton btnThm_1 = new JButton("Thêm\r\n");
		btnThm_1.setIcon(new ImageIcon("src\\anh\\new.png"));
		btnThm_1.setBounds(10, 53, 432, 25);
		panel_4_1.add(btnThm_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Xửa");
		btnNewButton_1_1_1.setBounds(10, 88, 432, 25);
		btnNewButton_1_1_1.setIcon(new ImageIcon("src\\anh\\sua2.png"));
		panel_4_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Xóa");
		btnNewButton_1_2_1.setBounds(10, 123, 432, 25);
		btnNewButton_1_2_1.setIcon(new ImageIcon("src\\anh\\del.png"));
		panel_4_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("Lưu");
		btnNewButton_1_3_1.setBounds(10, 158, 432, 25);
		btnNewButton_1_3_1.setIcon(new ImageIcon("src\\anh\\save.png"));
		panel_4_1.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_4_1 = new JButton("Hủy");
		btnNewButton_1_4_1.setBounds(10, 193, 432, 25);
		btnNewButton_1_4_1.setIcon(new ImageIcon("src\\anh\\close2.png"));
		panel_4_1.add(btnNewButton_1_4_1);
		
		JButton btnNewButton_1_5_1 = new JButton("Tìm\r\n");
		btnNewButton_1_5_1.setBounds(280, 18, 162, 25);
		btnNewButton_1_5_1.setIcon(new ImageIcon("src\\anh\\tim2.png"));
		panel_4_1.add(btnNewButton_1_5_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 21, 260, 19);
		panel_4_1.add(textField_12);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 252, 927, 264);
		panel_1.add(panel_2_1);
		
		Box box_bottom_1 = Box.createVerticalBox();
		panel_2_1.add(box_bottom_1);
		
		Box box1_bottom_1 = Box.createHorizontalBox();
		box_bottom_1.add(box1_bottom_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(912, 5));
		box1_bottom_1.add(rigidArea);
		String[] row_title1 = {"Mã NV", "Tên nhân viên", "Email", "Chức vụ", "Bậc thợ", "Số năm kinh nghiệm"};
		model1 = new DefaultTableModel(row_title1, 0);
		table1 = new JTable(model1);
		
		
		JScrollPane scrollPane_1 = new JScrollPane(table1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_1.setPreferredSize(new Dimension(926, 235));
		box_bottom_1.add(scrollPane_1);
		box_bottom_1.add(scrollPane_1);
	}
}
