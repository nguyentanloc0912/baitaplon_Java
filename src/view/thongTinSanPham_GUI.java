package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.thongTinSP_DAO;
import entity.sanPham;

import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class thongTinSanPham_GUI extends JFrame implements MouseListener,ActionListener{

	private JPanel contentPane;
	private JTextField txtNSX;
	private JTextField txtGia;
	private JTextField txtSoSuon;
	private JTextField txtSoKhung;
	private JTextField txtSL;
	private JTextField txtSoPK;
	private JTable table;
	private DefaultTableModel model;
	private JTable table_1;
	private JTable table_2;
	private JComboBox comboBox;
	private JButton btnThoat;
	private JButton btnLuu;
	private JButton btnCapNhat;
	private JButton btnXoaTrang;
	private JButton btnXoa;
	private JButton btnThem;
	private JTextField txtMaLoai;
	private thongTinSP_DAO dao_sanPham;
	private JTextField txtMess;
	private ArrayList<sanPham> list;
	private sanPham sp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thongTinSanPham_GUI frame = new thongTinSanPham_GUI();
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
	public thongTinSanPham_GUI() {
		try {
			connectDB.getInstance().connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dao_sanPham = new thongTinSP_DAO();
		list = new ArrayList<sanPham>();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 834, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÃ”NG TIN Sáº¢N PHáº¨M");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(262, 10, 286, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBounds(10, 55, 800, 172);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbNSX = new JLabel("NÆ°á»›c sáº£n xuáº¥t:");
		lbNSX.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbNSX.setBounds(473, 30, 105, 24);
		panel.add(lbNSX);
		
		JLabel lbSL = new JLabel("Sá»‘ lÆ°á»£ng:");
		lbSL.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSL.setBounds(507, 74, 71, 24);
		panel.add(lbSL);
		
		JLabel lbLXe = new JLabel("Loáº¡i xe:");
		lbLXe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbLXe.setBounds(316, 30, 59, 24);
		panel.add(lbLXe);
		
		JLabel lbGia = new JLabel("GiÃ¡ bÃ¡n:");
		lbGia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbGia.setBounds(10, 74, 95, 24);
		panel.add(lbGia);
		
		JLabel lbSoKhung = new JLabel("Sá»‘ khung:");
		lbSoKhung.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoKhung.setBounds(316, 120, 95, 24);
		panel.add(lbSoKhung);
		
		JLabel lbSoPK = new JLabel("Sá»‘ PK:");
		lbSoPK.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoPK.setBounds(578, 120, 95, 24);
		panel.add(lbSoPK);
		
		JLabel lbSoSuon = new JLabel("Sá»‘ sÆ°á»�n:");
		lbSoSuon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoSuon.setBounds(10, 120, 95, 24);
		panel.add(lbSoSuon);
		
		txtNSX = new JTextField();
		txtNSX.setBounds(598, 34, 192, 19);
		panel.add(txtNSX);
		txtNSX.setColumns(10);
		
		txtGia = new JTextField();
		txtGia.setColumns(10);
		txtGia.setBounds(89, 78, 217, 19);
		panel.add(txtGia);
		
		txtSoSuon = new JTextField();
		txtSoSuon.setColumns(10);
		txtSoSuon.setBounds(89, 124, 217, 19);
		panel.add(txtSoSuon);
		
		txtSoKhung = new JTextField();
		txtSoKhung.setColumns(10);
		txtSoKhung.setBounds(385, 124, 183, 19);
		panel.add(txtSoKhung);
		
		txtSL = new JTextField();
		txtSL.setColumns(10);
		txtSL.setBounds(598, 78, 137, 19);
		panel.add(txtSL);
		
		txtSoPK = new JTextField();
		txtSoPK.setColumns(10);
		txtSoPK.setBounds(628, 124, 162, 19);
		panel.add(txtSoPK);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Honda", "Yamaha", "Vison", "Sonic"}));
		comboBox.setBounds(373, 32, 86, 21);
		panel.add(comboBox);
		
		JLabel lbVND = new JLabel("VNÄ�/chiáº¿c");
		lbVND.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbVND.setBounds(316, 77, 77, 24);
		panel.add(lbVND);
		
		JLabel lblMaLoai = new JLabel("MÃ£ loáº¡i xe:");
		lblMaLoai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaLoai.setBounds(10, 30, 77, 24);
		panel.add(lblMaLoai);
		
		txtMaLoai = new JTextField();
		txtMaLoai.setColumns(10);
		txtMaLoai.setBounds(89, 34, 217, 19);
		panel.add(txtMaLoai);
		
		JLabel lblChic = new JLabel("chiáº¿c");
		lblChic.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChic.setBounds(747, 77, 43, 24);
		panel.add(lblChic);
		
		btnThem = new JButton("ThÃªm sáº£n pháº©m");
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThem.setBounds(30, 236, 140, 32);
		contentPane.add(btnThem);
		
		btnXoa = new JButton("XÃ³a sáº£n pháº©m");
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoa.setBounds(196, 237, 135, 32);
		contentPane.add(btnXoa);
		
		btnXoaTrang = new JButton("XÃ³a tráº¯ng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoaTrang.setBounds(358, 236, 135, 32);
		contentPane.add(btnXoaTrang);
		
		btnCapNhat = new JButton("Cáº­p nháº­t thÃ´ng tin");
		btnCapNhat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCapNhat.setBounds(521, 236, 157, 32);
		contentPane.add(btnCapNhat);
		
		btnLuu = new JButton("LÆ°u ");
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLuu.setBounds(700, 236, 85, 32);
		btnLuu.setEnabled(false);
		contentPane.add(btnLuu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Danh s\u00E1ch s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1.setBounds(10, 281, 800, 193);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		model = new DefaultTableModel();
		table = new JTable(model);
		model.addColumn("MÃ£ loáº¡i xe");
		model.addColumn("Loáº¡i xe");
		model.addColumn("NÆ°á»›c sáº£n xuáº©t");
		model.addColumn("GiÃ¡ bÃ¡n");
		model.addColumn("Sá»‘ lÆ°á»£ng");
		model.addColumn("Sá»‘ sÆ°á»�n");
		model.addColumn("Sá»‘ khung");
		model.addColumn("Sá»‘ PK");
		JScrollPane scroll = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(5,18,788,170);
		panel_1.add(scroll);
		
		
		btnThoat = new JButton("ThoÃ¡t");
		btnThoat.setForeground(new Color(0, 0, 255));
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThoat.setBounds(725, 475, 85, 32);
		contentPane.add(btnThoat);
		
		txtMess = new JTextField();
		txtMess.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtMess.setBounds(30, 484, 685, 19);
		contentPane.add(txtMess);
		txtMess.setColumns(10);
		txtMess.setBorder(null);
		txtMess.setEditable(false);
		txtMess.setForeground(Color.RED);
		
		
		//su kien
		table.addMouseListener(this);
		btnThoat.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnThem.addActionListener(this);
		btnLuu.addActionListener(this);
		btnXoa.addActionListener(this);
		btnCapNhat.addActionListener(this);
		
		loadList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnThoat)) {
			int tb = JOptionPane.showConfirmDialog(this, "Báº¡n cÃ³ cháº¯c muá»‘n thoÃ¡t chÆ°Æ¡ng trÃ¬nh","Exit",JOptionPane.YES_NO_OPTION);
			if(tb == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}else if(o.equals(btnXoaTrang)) {
			xoaTrang();
		}else if(o.equals(btnThem)) {
			if(btnThem.getText().equals("ThÃªm sáº£n pháº©m")) {
				xoaTrang();
				txtMaLoai.requestFocus();
				
				btnThem.setText("Há»§y thÃªm");
				btnXoa.setEnabled(false);
				btnLuu.setEnabled(true);
			}else {
				btnThem.setText("ThÃªm sáº£n pháº©m");
				btnXoa.setEnabled(true);
				btnLuu.setEnabled(false);
			}
		}else if(o.equals(btnLuu)) {
//			if(txtMaLoai.getText().equals("") || txtNSX.getText().equals("") || txtGia.getText().equals("") || txtSL.getText().equals("")
//					|| txtSoSuon.getText().equals("") || txtSoKhung.getText().equals("") || txtSoPK.getText().equals("")) {
//				JOptionPane.showMessageDialog(this, "ChÆ°a nháº­p thÃ´ng tin");
//			}else {
				try {
					luu();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
//			}
			xoaTrang();
			btnThem.setText("ThÃªm sáº£n pháº©m");
			btnXoa.setEnabled(true);
			btnLuu.setEnabled(false);
		}else if(o.equals(btnXoa)) {
			try {
				xoa();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(o.equals(btnCapNhat)) {
			int row = table.getSelectedRow();
			if(row != -1) {
				String ma = model.getValueAt(row, 0).toString();
				Object choose = JOptionPane.showInputDialog(null, "Chá»�n thÃ´ng tin báº¡n muá»‘n cáº­p nháº­t", "ThÃ´ng bÃ¡o",
						JOptionPane.QUESTION_MESSAGE, null,
						new String[] { "GiÃ¡ bÃ¡n", "Sá»‘ lÆ°á»£ng"}, "GiÃ¡ bÃ¡n");
				if (choose.equals("GiÃ¡ bÃ¡n")) {
					updateGia(row, ma);
				}else if (choose.equals("Sá»‘ lÆ°á»£ng")) {
					updateSL(row, ma);
				}
			}else {
				JOptionPane.showMessageDialog(this, "Báº¡n chÆ°a chá»�n dÃ²ng cáº§n cáº­p nháº­t");
			}
		}
	}
	
	public void loadList() {
		list = dao_sanPham.getAllSanPham();
		model.getDataVector().removeAllElements();
		model.fireTableDataChanged();
		load(list);
	}

	private void load(ArrayList<sanPham> list) {
		for(sanPham sp :dao_sanPham.getAllSanPham()) {
			Object[] rowData = {sp.getMaLoai(),
								sp.getTenLoai(),
								sp.getNsx(),
								sp.getGiaBan(),
								sp.getSoluong(),
								sp.getSoSuon(),
								sp.getSoKhung(),
								sp.getSoPK()};
			model.addRow(rowData);
		}
	}
	
	public void luu() throws Exception{
		String maLoai = txtMaLoai.getText();
		String loaiXe = comboBox.getSelectedItem().toString();
		String nsx = txtNSX.getText();
		String gia = txtGia.getText();
		String sl = txtSL.getText();
		String soSuon = txtSoSuon.getText();
		String soKhung = txtSoKhung.getText();
		String soPK = txtSoPK.getText();
		
		if(valiData()) {
			connectDB.getInstance();
			Connection con = connectDB.getConnection();
			sanPham sp = new sanPham(maLoai, loaiXe, nsx, Long.parseLong(gia), Integer.parseInt(sl), soSuon, soKhung, Integer.parseInt(soPK));
			try {
				Statement stm = con.createStatement();
				stm.executeUpdate("INSERT INTO thongTinSanPham " + String.format("VALUES ('%s','%s','%s','%d','%d','%s','%s','%d')",
						maLoai, loaiXe, nsx, Long.parseLong(gia), Integer.parseInt(sl), soSuon, soKhung, Integer.parseInt(soPK)));
				showMess("ThÃªm thÃ nh cÃ´ng", txtMaLoai);
				String []row = {maLoai,loaiXe,nsx,gia,sl,soSuon,soKhung,soPK};
				model.addRow(row);
			} catch (Exception e) {
				showMess("TrÃ¹ng mÃ£ loáº¡i xe", txtMaLoai);
			}
		}
	}
	
	public void xoa() throws Exception{
		int r = table.getSelectedRow();
		if(r != -1) {
			String maLoai = model.getValueAt(r, 0).toString();
			int tb = JOptionPane.showConfirmDialog(this, "Báº¡n cÃ³ cháº¯c muá»‘n xÃ³a sáº£n pháº©m nÃ y","Delete",JOptionPane.YES_NO_OPTION);
			if(tb == JOptionPane.YES_OPTION) {
				dao_sanPham.delete(maLoai);
				model.removeRow(r);
				xoaTrang();
				JOptionPane.showMessageDialog(this, "XÃ³a thÃ nh cÃ´ng");
			}
		}else {
			JOptionPane.showMessageDialog(this, "ChÆ°a chá»�n dÃ²ng cáº§n xÃ³a");
		}
	}
	
	
	
	public void updateGia(int row,String ma) {
		String giaMoi = "Nháº­p vÃ o giÃ¡ tiá»�n má»›i cho mÃ£ xe " + ma;
		String input = JOptionPane.showInputDialog(null,giaMoi);
		if(input.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "GiÃ¡ tiá»�n khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng");
		}else {
			Long gia = Long.parseLong(input);
			dao_sanPham.updateGia(list.get(row).getMaLoai(), gia);
			giaMoi = "Cáº­p nháº­t giÃ¡ má»›i thÃ nh cÃ´ng cho mÃ£ xe " + ma;
			JOptionPane.showMessageDialog(this, giaMoi);
			model.setValueAt(gia, row, 3);
		}
	}
	
	public void updateSL(int row,String ma) {
		String slMoi = "Nháº­p vÃ o sá»‘ lÆ°á»£ng má»›i cho mÃ£ xe " + ma;
		String input = JOptionPane.showInputDialog(null,slMoi);
		if(input.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Sá»‘ lÆ°á»£ng khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng");
		}else {
			int sl = Integer.parseInt(input);
			dao_sanPham.updateSL(list.get(row).getMaLoai(), sl);
			slMoi = "Cáº­p nháº­t sá»‘ lÆ°á»£ng thÃ nh cÃ´ng cho mÃ£ xe " + ma;
			JOptionPane.showMessageDialog(this, slMoi);
			model.setValueAt(sl, row, 4);
		}
	}
	
	
	
	public void xoaTrang() {
		txtMaLoai.setText("");
		comboBox.setSelectedIndex(0);
		txtNSX.setText("");
		txtGia.setText("");
		txtSL.setText("");
		txtSoSuon.setText("");
		txtSoKhung.setText("");
		txtSoPK.setText("");
		txtMaLoai.requestFocus();
	}
	
	public boolean valiData() {
		String maLoai = txtMaLoai.getText().trim();
		String nsx = txtNSX.getText().trim();
		String gia = txtGia.getText().trim();
		String sl = txtSL.getText().trim();
		String soSuon = txtSoSuon.getText().trim();
		String soKhung = txtSoKhung.getText().trim();
		String soPK = txtSoPK.getText().trim();
		if(maLoai.equals("")) {
			showMess("MÃ£ loáº¡i xe khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtMaLoai);
			return false;
		}else if(nsx.equals("")) {
			showMess("NÆ°á»›c sáº£n xuáº¥t khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtNSX);
			return false;
		}else if(gia.equals("")) {
			showMess("GiÃ¡ bÃ¡n khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtGia);
			return false;
		}else if(sl.equals("")) {
			showMess("Sá»‘ lÆ°á»£ng khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtSL);
			return false;
		}else if(soSuon.equals("")) {
			showMess("Sá»‘ sÆ°á»�n khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtSoSuon);
			return false;
		}else if(soKhung.equals("")) {
			showMess("Sá»‘ khung khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtSoKhung);
			return false;
		}else if(soPK.equals("")) {
			showMess("Sá»‘ phÃ¢n khá»‘i khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtSoPK);
			return false;
		}else {
			if(!maLoai.matches("^[a-zA-z0-9]+$")) {
				showMess("MÃ£ loáº¡i khÃ´ng chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t vÃ  khoáº£ng tráº¯ng", txtMaLoai);
				return false;
			}else if(!nsx.matches("^[a-zA-z- ]+$")) {
				showMess("NÆ°á»›c sáº£n xuáº¥t khÃ´ng Ä‘Æ°á»£c chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t vÃ  sá»‘", txtNSX);
				return false;
			}else if(!gia.matches("^[0-9]+$")){
				showMess("GiÃ¡ pháº£i lÃ  sá»‘", txtGia);
				return false;
			}else if(!sl.matches("^[0-9]+$")){
				showMess("Sá»‘ lÆ°á»£ng pháº£i lÃ  sá»‘", txtSL);
				return false;
			}else if(Long.parseLong(txtGia.getText().trim()) < 0) {
				showMess("GiÃ¡ tiá»�n khÃ´ng Ä‘Æ°á»£c Ã¢m", txtGia);
				return false;
			}else if(Integer.parseInt(txtSL.getText().trim()) < 0) {
				showMess("Sá»‘ lÆ°á»£ng khÃ´ng Ä‘Æ°á»£c Ã¢m", txtSL);
				return false;
			}else if(!soSuon.matches("^[a-zA-z0-9-]+$")) {
				showMess("Sá»‘ sÆ°á»�n khÃ´ng Ä‘Æ°á»£c chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t", txtSoSuon);
				return false;
			}else if(!soKhung.matches("^[a-zA-z0-9-]+$")) {
				showMess("Sá»‘ khung khÃ´ng Ä‘Æ°á»£c chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t", txtSoKhung);
				return false;
			}else if(Integer.parseInt(txtSoPK.getText().trim()) < 0) {
				showMess("Sá»‘ phÃ¢n khá»‘i khÃ´ng Ä‘Æ°á»£c Ã¢m", txtSoPK);
				return false;
			}else
				return true;
		}
		
	}
	
	public void showMess(String mess,JTextField txt) {
		txt.requestFocus();
		txtMess.setText(mess);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int vitri = table.getSelectedRow();
		txtMaLoai.setText(model.getValueAt(vitri, 0).toString());
		comboBox.setSelectedItem(model.getValueAt(vitri, 1).toString());
		txtNSX.setText(model.getValueAt(vitri, 2).toString());
		txtGia.setText(model.getValueAt(vitri, 3).toString());
		txtSL.setText(model.getValueAt(vitri, 4).toString());
		txtSoSuon.setText(model.getValueAt(vitri, 5).toString());
		txtSoKhung.setText(model.getValueAt(vitri, 6).toString());
		txtSoPK.setText(model.getValueAt(vitri, 7).toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
}
