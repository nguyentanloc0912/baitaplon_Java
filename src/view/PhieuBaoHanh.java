package view;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PhieuBaoHanh extends JFrame implements ActionListener{

	private JPanel contentPane;
	private DefaultTableModel model;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton;
	private HoaDonBaoHanh hdBaoHanh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhieuBaoHanh frame = new PhieuBaoHanh();
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
	public PhieuBaoHanh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phiếu Bảo Hành");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(362, 10, 209, 38);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin phi\u1EBFu b\u1EA3o h\u00E0nh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 46, 616, 197);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên các linh kiện cần bảo hành:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 58, 211, 22);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lí do bảo hành: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(10, 90, 104, 22);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lỗi thuộc về:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(287, 127, 104, 22);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mã khách hàng:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(10, 26, 109, 22);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số lượng cần bảo hành:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(10, 127, 158, 22);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 29, 477, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(218, 61, 388, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 93, 482, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(168, 127, 109, 19);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Khách hàng");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		rdbtnNewRadioButton.setBounds(379, 128, 96, 21);
		panel.add(rdbtnNewRadioButton);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCaHng = new JRadioButton("Cửa hàng");
		rdbtnCaHng.setFont(new Font("Tahoma", Font.ITALIC, 13));
		rdbtnCaHng.setBounds(480, 128, 96, 21);
		panel.add(rdbtnCaHng);
		group.add(rdbtnCaHng);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Giá tiền (nếu có):");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_2.setBounds(10, 159, 124, 22);
		panel.add(lblNewLabel_1_1_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(132, 162, 474, 19);
		panel.add(textField_6);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Mã phiếu BH");
		model.addColumn("Mã nhân viên");
		model.addColumn("Mã khách hàng");
		model.addColumn("Tên linh kiện");
		model.addColumn("Số lượng");
		model.addColumn("Lí do bảo hành");
		model.addColumn("Lỗi thuộc về");
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 307, 880, 170);
		contentPane.add(scrollPane);
		
		btnNewButton = new JButton("Hóa đơn bảo hành");
		btnNewButton.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/chi.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(636, 145, 254, 40);
		contentPane.add(btnNewButton);
		
		JButton btnThmPhiuBo = new JButton("Thêm phiếu bảo hành");
		btnThmPhiuBo.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/add.png")));
		btnThmPhiuBo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThmPhiuBo.setBounds(20, 257, 201, 40);
		contentPane.add(btnThmPhiuBo);
		
		JButton btnXaPhiuBo = new JButton("Xóa phiếu bảo hành");
		btnXaPhiuBo.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/del.png")));
		btnXaPhiuBo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXaPhiuBo.setBounds(231, 257, 188, 40);
		contentPane.add(btnXaPhiuBo);
		
		JButton btnSaPhiuBo = new JButton("Sửa phiếu bảo hành");
		btnSaPhiuBo.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/sua2.png")));
		btnSaPhiuBo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSaPhiuBo.setBounds(438, 257, 188, 40);
		contentPane.add(btnSaPhiuBo);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Mã phiếu bảo hành:");
		lblNewLabel_1_1_1_1_1_1.setBounds(636, 62, 135, 22);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setBounds(775, 65, 117, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mã nhân viên phụ trách:");
		lblNewLabel_1_1_1_1.setBounds(636, 101, 158, 22);
		contentPane.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setBounds(801, 104, 89, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLuPhiuBo = new JButton("Lưu phiếu bảo hành");
		btnLuPhiuBo.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/save.png")));
		btnLuPhiuBo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLuPhiuBo.setBounds(636, 195, 254, 40);
		contentPane.add(btnLuPhiuBo);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/close2.png")));
		btnThot.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThot.setBounds(775, 257, 115, 40);
		contentPane.add(btnThot);
		
		JButton btnXaTrng = new JButton("Xóa trắng");
		btnXaTrng.setIcon(new ImageIcon(PhieuBaoHanh.class.getResource("/hinh_anh/hinh/refresh.png")));
		btnXaTrng.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXaTrng.setBounds(636, 257, 129, 40);
		contentPane.add(btnXaTrng);
		
		
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnNewButton)) {
			hdBaoHanh = new HoaDonBaoHanh();
			hdBaoHanh.setVisible(true);
		}
	}
}
