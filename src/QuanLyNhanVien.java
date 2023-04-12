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

public class QuanLyNhanVien extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyNhanVien frame = new QuanLyNhanVien();
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
	public QuanLyNhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 932, 520);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Nhân viên hành chánh", null, panel, null);
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
		panel_3.setBorder(new TitledBorder(null, "Th\u00F4ng tin nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mã nhân viên\r\n");
		lblNewLabel_1_2_1.setBounds(10, 181, 92, 13);
		panel_3.add(lblNewLabel_1_2_1);
		String phongban[] = {"Phòng nhân sư", "Phòng kế toán", "Phòng tài chinh"};
		JComboBox comboBox = new JComboBox(phongban);
		
		comboBox.setBounds(112, 174, 130, 21);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Học vấn\r\n");
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
		btnThm.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\new.png"));
		btnThm.setBounds(10, 53, 432, 25);
		panel_4.add(btnThm);
		
		JButton btnNewButton_1_1 = new JButton("Xóa");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\del.png"));
		btnNewButton_1_1.setBounds(10, 88, 432, 25);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Sửa");
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\sua2.png"));
		btnNewButton_1_2.setBounds(10, 123, 432, 25);
		panel_4.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Lưu");
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\save.png"));
		btnNewButton_1_3.setBounds(10, 158, 432, 25);
		panel_4.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Hủy");
		btnNewButton_1_4.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\close2.png"));
		btnNewButton_1_4.setBounds(10, 193, 432, 25);
		panel_4.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Tìm\r\n");
		btnNewButton_1_5.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\tim2.png"));
		btnNewButton_1_5.setBounds(280, 18, 162, 25);
		panel_4.add(btnNewButton_1_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 21, 260, 19);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		
		tabbedPane.addTab("Nhân viên kỹ thuật", null, panel_1, null);
	}
}
