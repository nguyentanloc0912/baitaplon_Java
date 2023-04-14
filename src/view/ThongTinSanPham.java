package view;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class ThongTinSanPham extends JFrame {

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
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinSanPham frame = new ThongTinSanPham();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThongTinSanPham() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 873, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout(0, 0));
		String[] row_title = {"Mã SP", "Tên sản phẩm", "MÃ£ nhÃ³m", "GiÃ¡ bÃ¡n", "Sá»‘ lÆ°á»£ng", "NÆ°á»›c SX", "Loáº¡i xe", "Sá»‘ PK", "Sá»‘ Khung"};
		model = new DefaultTableModel(row_title, 0);
		table = new JTable(model);
		
		
		panel.setPreferredSize(new DimensionUIResource(1200, 300));
		panel.setBounds(10, 322, 849, 228);
		contentPane.add(panel);
		
		Box box_bottom = Box.createVerticalBox();
		Box box1_bottom = Box.createHorizontalBox();
		box1_bottom.add(Box.createRigidArea(new Dimension(1179, 5)));
		box_bottom.add(box1_bottom);
		
		model = new DefaultTableModel(row_title, 0);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		DefaultTableCellRenderer right = new DefaultTableCellRenderer();
		right.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		table.getColumnModel().getColumn(3).setCellRenderer(right);
		table.getColumnModel().getColumn(5).setCellRenderer(right);
		table.getColumnModel().getColumn(6).setCellRenderer(right);
		box_bottom.add(scrollPane);
		panel.add(box_bottom);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
	    panel_1.setBounds(10, 40, 361, 272);
	     contentPane.add(panel_1);
	     panel_1.setLayout(null);
		
	     JLabel lblNewLabel = new JLabel("Mã SP");
		lblNewLabel.setBounds(10, 42, 60, 13);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 39, 277, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblTnSp = new JLabel("Tên SP\r\n");
		lblTnSp.setBounds(10, 84, 60, 13);
		panel_1.add(lblTnSp);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 81, 106, 19);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MÃ£ NhÃ³m\r\n");
		lblNewLabel_1_1.setBounds(182, 82, 60, 13);
		panel_1.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(242, 78, 101, 19);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("GiÃ¡ BÃ¡n\r\n");
		lblNewLabel_1_2.setBounds(10, 130, 60, 13);
		panel_1.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 127, 106, 19);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sá»‘ lÆ°á»£ng");
		lblNewLabel_1_1_1.setBounds(182, 130, 60, 13);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(242, 127, 101, 19);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("NÆ°á»›c SX\r\n\r\n");
		lblNewLabel_1_2_1.setBounds(10, 182, 60, 13);
		panel_1.add(lblNewLabel_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(66, 179, 106, 19);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Loáº¡i Xe\r\n");
		lblNewLabel_1_1_1_1.setBounds(182, 182, 60, 13);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(242, 179, 101, 19);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Sá»‘ PK\r\n");
		lblNewLabel_1_2_2.setBounds(10, 230, 60, 13);
		panel_1.add(lblNewLabel_1_2_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(66, 227, 106, 19);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Sá»‘ Khung\r\n");
		lblNewLabel_1_1_1_2.setBounds(182, 230, 60, 13);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(242, 227, 101, 19);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_2 = new JLabel("Nháº­p thÃ´ng tin\r\n");
		lblNewLabel_2.setBounds(141, 10, 100, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(242, -73, 237, 242);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(377, 40, 246, 272);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("áº¢nh\r\n");
		lblNewLabel_1.setBounds(105, 10, 45, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 33, 226, 229);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(628, 40, 221, 272);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Chá»©c nÄƒng");
		lblNewLabel_4.setBounds(88, 10, 65, 13);
		panel_3.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("ThÃªm");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\add1.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 74, 201, 35);
		panel_3.add(btnNewButton);
		
		JButton btnXa = new JButton("XÃ³a");
		btnXa.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\del.png"));
		btnXa.setBounds(10, 113, 201, 35);
		panel_3.add(btnXa);
		
		JButton btnNewButton_1_1 = new JButton("Sá»­a");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\sua2.png"));
		btnNewButton_1_1.setBounds(10, 152, 201, 35);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("LÆ°u");
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\save.png"));
		btnNewButton_1_2.setBounds(10, 190, 201, 35);
		panel_3.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Há»§y");
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\close2.png"));
		btnNewButton_1_3.setBounds(10, 227, 201, 35);
		panel_3.add(btnNewButton_1_3);
		
		JButton btnTm = new JButton("TÃ¬m\r\n");
		btnTm.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\BuiNgocDuy\\QuanLyXe\\src\\hinh\\search.png"));
		btnTm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTm.setBounds(134, 33, 77, 35);
		panel_3.add(btnTm);
		
		textField_9 = new JTextField();
		textField_9.setBounds(10, 35, 114, 31);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("ThÃ´ng Tin Sáº£n Pháº©m");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(204, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(348, 10, 188, 20);
		contentPane.add(lblNewLabel_6);
	  
		
	}
}
