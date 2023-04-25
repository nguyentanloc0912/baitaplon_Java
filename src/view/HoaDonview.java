package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import dao.DAO_HoaDon;
import entity.HoaDon;
import entity.ListHD;

import javax.swing.JButton;

public class HoaDonview extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JTextField textField_5;
	private DefaultTableModel model;
	private DAO_HoaDon hoadon;		
	private ListHD ls;
	private JTable table;
	private JButton btThem, btXoa,btXoaTrang,btLuu,btThoat, btTim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDonview frame = new HoaDonview();
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
	public HoaDonview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 70, 995, 163);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã hóa đơn");
		lblNewLabel.setBounds(10, 16, 88, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 10, 199, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mã khách hàng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(513, 10, 101, 29);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(718, 11, 213, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày lập hóa đơn");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(10, 56, 112, 22);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 53, 199, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Hình thức Thanh Toán");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(513, 49, 156, 29);
		panel.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tiền mặt", "Chuyển khoản"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(718, 53, 213, 25);
		panel.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Tổng tiền");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 102, 101, 22);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(217, 101, 199, 30);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nhân Viên");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(513, 102, 134, 22);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(718, 92, 213, 32);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btTim = new JButton("Tìm");
		btTim.setForeground(new Color(0, 0, 0));
		btTim.setBackground(new Color(255, 255, 255));
		btTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btTim.setBounds(399, 255, 68, 21);
		contentPane.add(btTim);
		
		JButton btThem = new JButton("Thêm");
		btThem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btThem.setBounds(573, 255, 85, 21);
		contentPane.add(btThem);
		
		JButton btXoa = new JButton("Xóa");
		btXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btXoa.setBounds(680, 255, 85, 21);
		contentPane.add(btXoa);
		
		JButton btXoaTrang = new JButton("Xóa trắng");
		btXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btXoaTrang.setBounds(781, 257, 105, 21);
		contentPane.add(btXoaTrang);
		
		JLabel lblNewLabel_6 = new JLabel("Nhập mã hóa đơn cần tìm");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(32, 259, 172, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(199, 256, 172, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btLuu = new JButton("Lưu");
		btLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btLuu.setBounds(895, 257, 85, 21);
		contentPane.add(btLuu);
		
		JLabel lblNewLabel_7 = new JLabel("Hóa Đơn");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_7.setBounds(441, 10, 144, 36);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Thoát");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(906, 512, 99, 21);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(20, 243, 978, 51);
		contentPane.add(panel_1);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model.addColumn("Mã hóa đơn");
		model.addColumn("Mã khách hàng");
		model.addColumn("Ngày");
		model.addColumn("Hình thức TT");
		model.addColumn("Tổng tiền");
		model.addColumn("Nhân viên");
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 321, 995, 163);
		contentPane.add(scrollPane);
		 
		btTim.addActionListener(this);
		btThem.addActionListener(this);
		btXoa.addActionListener(this);
		btXoaTrang.addActionListener(this);
		btLuu.addActionListener(this);
	
	
	}


	private void timMa() {
		String maTim = textField_5.getText();
		//System.out.println(maTim);
		if(maTim !=null && maTim.trim().length() > 0) {
			try {
				String maHD = maTim;
				HoaDon hd = ls.timHD(maHD);
				//System.out.println(s);
				if(hd !=null) {
					xoadulieu();
					model.addRow(new Object[] {hd.getMaHD(), hd.getMaKH(), hd.getNgay(), hd.getHinhthucTT(), hd.getTongtien(), hd.getUsername()});
				}
				else {
					JOptionPane.showMessageDialog(null, "Không tìm thấy!");
					return;
				}
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Mã không được trống!");
				textField_5.selectAll();
				textField_5.requestFocus();
			}
		} else {
			xoadulieu();
			table.setModel(model);
		}
	}
	private void xoadulieu() {
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		df.getDataVector().removeAllElements();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btThem)){
			String maHD = textField.getText();
			String maKH = textField_1.getText();
			String ngay  = textField_2.getText();
			String httt = (String) comboBox.getSelectedItem();
			Double tongtien = Double.parseDouble(textField_4.getText());
			String user = textField_5.getText();
			
			HoaDon hd = new HoaDon(maHD, maKH, ngay, httt, tongtien, user);
			
			if(!ls.themHD(hd))
			{
				JOptionPane.showMessageDialog(this, "Mã trùng!");
			}else {
				model.addRow(new Object[] {hd.getMaHD(), hd.getMaKH(), hd.getNgay(), hd.getHinhthucTT(), String.format("%s", hd.getTongtien()), hd.getUsername()});
			}
		}
		
		if(o.equals(btXoa)) {
			int r = table.getSelectedRow();
			if(ls.xoaHD(r)) {
				model.removeRow(r);
			}
		}
		if(o.equals(btXoaTrang)) {
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField.requestFocus();
		}
		
		if(o.equals(btTim)) {
			timMa();
		}
	
}
}


