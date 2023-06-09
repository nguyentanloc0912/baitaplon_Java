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
	private JTextField txtSoPK;
	private JTable table;
	private DefaultTableModel model;
	private JTable table_1;
	private JTable table_2;
	private JButton btnThoat;
	private JButton btnCapNhat;
	private JButton btnXoaTrang;
	private JButton btnXoa;
	private JButton btnThem;
	private JTextField txtMaLoai;
	private thongTinSP_DAO dao_sanPham;
	private JTextField txtMess;
	public static ArrayList<sanPham> list;
	private sanPham sp;
	private JTextField txt_LoaiXe;

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


	 
	
	
	public thongTinSanPham_GUI() throws SQLException {

		ConnectDB.getInstance().connect();
		dao_sanPham = new thongTinSP_DAO();
		list = new ArrayList<sanPham>();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(400, 150, 834, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("THÔNG TIN SẢN PHẨM");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(262, 10, 286, 40);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBounds(10, 55, 800, 172);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lbNSX = new JLabel("Nước sản xuất:");
		lbNSX.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbNSX.setBounds(404, 30, 105, 24);
		panel.add(lbNSX);

		JLabel lbLXe = new JLabel("Loại xe:");
		lbLXe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbLXe.setBounds(404, 74, 59, 24);
		panel.add(lbLXe);

		JLabel lbGia = new JLabel("Giá bán:");
		lbGia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbGia.setBounds(10, 74, 95, 24);
		panel.add(lbGia);

		JLabel lbSoKhung = new JLabel("Số khung:");
		lbSoKhung.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoKhung.setBounds(316, 120, 95, 24);
		panel.add(lbSoKhung);

		JLabel lbSoPK = new JLabel("Số PK:");
		lbSoPK.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoPK.setBounds(578, 120, 95, 24);
		panel.add(lbSoPK);

		JLabel lbSoSuon = new JLabel("Số sườn:");
		lbSoSuon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoSuon.setBounds(10, 120, 95, 24);
		panel.add(lbSoSuon);

		txtNSX = new JTextField();
		txtNSX.setBounds(535, 34, 192, 19);
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
		txtSoKhung.setBounds(383, 124, 183, 19);
		panel.add(txtSoKhung);

		txtSoPK = new JTextField();
		txtSoPK.setColumns(10);
		txtSoPK.setBounds(628, 124, 162, 19);
		panel.add(txtSoPK);

		JLabel lbVND = new JLabel("VNĐ/chiếc");
		lbVND.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbVND.setBounds(316, 77, 77, 24);
		panel.add(lbVND);

		JLabel lblMaLoai = new JLabel("Mã loại xe:");
		lblMaLoai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaLoai.setBounds(10, 30, 77, 24);
		panel.add(lblMaLoai);

		txtMaLoai = new JTextField();
		txtMaLoai.setColumns(10);
		txtMaLoai.setBounds(89, 34, 217, 19);
		panel.add(txtMaLoai);
		
		txt_LoaiXe = new JTextField();
		txt_LoaiXe.setBounds(535, 78, 192, 19);
		panel.add(txt_LoaiXe);
		txt_LoaiXe.setColumns(10);

		btnThem = new JButton("Thêm sản phẩm");
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThem.setBounds(30, 236, 140, 32);
		contentPane.add(btnThem);

		btnXoa = new JButton("Xóa sản phẩm");
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoa.setBounds(217, 236, 135, 32);
		contentPane.add(btnXoa);

		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoaTrang.setBounds(400, 237, 135, 32);
		contentPane.add(btnXoaTrang);

		btnCapNhat = new JButton("Cập nhật thông tin");
		btnCapNhat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCapNhat.setBounds(613, 237, 157, 32);
		contentPane.add(btnCapNhat);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Danh s\u00E1ch s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1.setBounds(10, 281, 800, 193);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		model = new DefaultTableModel();
		table = new JTable(model);
		model.addColumn("Mã loại xe");
		model.addColumn("Loại xe");
		model.addColumn("Nước sản xuẩt");
		model.addColumn("Giá bán");
		model.addColumn("Số sườn");
		model.addColumn("Số khung");
		model.addColumn("Số PK");
		JScrollPane scroll = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(5,18,788,170);
		panel_1.add(scroll);

		btnThoat = new JButton("Thoát");
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
		btnXoa.addActionListener(this);
		btnCapNhat.addActionListener(this);

		loadList();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnThoat)) {
			int tb = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát chương trình","Exit",JOptionPane.YES_NO_OPTION);
			if(tb == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}else if(o.equals(btnXoaTrang)) {
			xoaTrang();
		}else if(o.equals(btnThem)) {
			them();
			xoaTrang();
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
				Object choose = JOptionPane.showInputDialog(null, "Chọn thông tin bạn muốn cập nhật", "Thông báo",
						JOptionPane.QUESTION_MESSAGE, null,
						new String[] { "Giá bán", "Số lượng"}, "Giá bán");
				if (choose.equals("Giá bán")) {
					updateGia(row, ma);
				}else if (choose.equals("Số lượng")) {
					updateSL(row, ma);
				}
			}else {
				JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng cần cập nhật");
			}
		}
	}

	public void loadList() {
		list = dao_sanPham.getAllSanPham();
//		model.getDataVector().removeAllElements();
//		model.fireTableDataChanged();
//		load(list);
		for(sanPham sp : list) {
			String ma = sp.getMaLoai();
			String ten = sp.getTenLoai();
			String  nuoc = sp.getNsx();
			String gia = sp.getGiaBan()+"";
			String sosuon = sp.getSoSuon();
			String sokhung = sp.getSoKhung();	
			String soPK = sp.getSoPK()+"";
			String data[]  = {ma,ten,nuoc,gia, sosuon, sokhung, soPK};
			model.addRow(data);
		}
	}
   public void them() {
	   String ma  = txtMaLoai.getText();
	   String ten= txt_LoaiXe.getText();
	   String nuoc  =txtNSX.getText();
	   String gia = txtGia.getText();
	   String soSuon = txtSoSuon.getText();
	   String sokhung = txtSoKhung.getText();
	   String soPK = txtSoPK.getText();
	   sanPham sp = new sanPham(ma, ten, nuoc, Long.parseLong(gia), soSuon, sokhung, Integer.parseInt(soPK));
	   String data[] = {ma, ten, nuoc, gia, soSuon, sokhung, soPK};
	   if(dao_sanPham.addSP(sp)) {
		   list.add(sp);
		   model.addRow(data);
		   JOptionPane.showMessageDialog(this, "Thêm thành công");
	   }
	   
   }
	private void load(ArrayList<sanPham> list) {
		for(sanPham sp : dao_sanPham.getAllSanPham()) {
			Object[] rowData = {sp.getMaLoai(),
								sp.getTenLoai(),
								sp.getNsx(),
								sp.getGiaBan(),
								sp.getSoSuon(),
								sp.getSoKhung(),
								sp.getSoPK()};
			model.addRow(rowData);
		}
	}



	public void luu() throws Exception{
		String maLoai = txtMaLoai.getText();
	
		String nsx = txtNSX.getText();
		String gia = txtGia.getText();
		
		String soSuon = txtSoSuon.getText();
		String soKhung = txtSoKhung.getText();
		String soPK = txtSoPK.getText();


	

	
	
}

	public void xoa() throws Exception{
		int r = table.getSelectedRow();
		if(r != -1) {
			String maLoai = model.getValueAt(r, 0).toString();
			int tb = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này","Delete",JOptionPane.YES_NO_OPTION);
			if(tb == JOptionPane.YES_OPTION) {
				dao_sanPham.delete(maLoai);
				model.removeRow(r);
				xoaTrang();
				JOptionPane.showMessageDialog(this, "Xóa thành công");
			}
		}else {
			JOptionPane.showMessageDialog(this, "Chưa chọn dòng cần xóa");
		}
	}


	public void updateGia(int row,String ma) {
		String giaMoi = "Nhập vào giá tiền mới cho mã xe " + ma;
		String input = JOptionPane.showInputDialog(null,giaMoi);
		if(input.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Giá tiền không được để trống");
		}else {
			Long gia = Long.parseLong(input);
			dao_sanPham.updateGia(list.get(row).getMaLoai(), gia);
			giaMoi = "Cập nhật giá mới thành công cho mã xe " + ma;
			JOptionPane.showMessageDialog(this, giaMoi);
			model.setValueAt(gia, row, 3);
		}
	}


	

	public void updateSL(int row,String ma) {
		String slMoi = "Nhập vào số lượng mới cho mã xe " + ma;
		String input = JOptionPane.showInputDialog(null,slMoi);
		if(input.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Số lượng không được để trống");
		}else {
			int sl = Integer.parseInt(input);
//			dao_sanPham.updateSL(list.get(row).getMaLoai(), sl);
			slMoi = "Cập nhật số lượng thành công cho mã xe " + ma;
			JOptionPane.showMessageDialog(this, slMoi);
			model.setValueAt(sl, row, 4);
		}
	}

	public void xoaTrang() {
		txtMaLoai.setText("");
	
		txtNSX.setText("");
		txtGia.setText("");
		
		txtSoSuon.setText("");
		txtSoKhung.setText("");
		txtSoPK.setText("");
		txtMaLoai.requestFocus();
	}

	public boolean valiData() {
		String maLoai = txtMaLoai.getText().trim();
		String nsx = txtNSX.getText().trim();
		String gia = txtGia.getText().trim();
		
		String soSuon = txtSoSuon.getText().trim();
		String soKhung = txtSoKhung.getText().trim();
		String soPK = txtSoPK.getText().trim();
		if(maLoai.equals("")) {
			showMess("Mã loại xe không được để trống", txtMaLoai);
			return false;
		}else if(nsx.equals("")) {
			showMess("Nước sản xuất không được để trống", txtNSX);
			return false;
		}else if(gia.equals("")) {
			showMess("Giá bán không được để trống", txtGia);
			return false;
		}else if(soSuon.equals("")) {
			showMess("Số sườn không được để trống", txtSoSuon);
			return false;
		}else if(soKhung.equals("")) {
			showMess("Số khung không được để trống", txtSoKhung);
			return false;
		}else if(soPK.equals("")) {
			showMess("Số phân khối không được để trống", txtSoPK);
			return false;
		}else {
			if(!maLoai.matches("^[a-zA-z0-9]+$")) {
				showMess("Mã loại không chứa kí tự đặc biệt và khoảng trắng", txtMaLoai);
				return false;
			}else if(!nsx.matches("^[a-zA-z- ]+$")) {
				showMess("Nước sản xuất không được chứa kí tự đặc biệt và số", txtNSX);
				return false;
			}else if(!gia.matches("^[0-9]+$")){
				showMess("Giá phải là số", txtGia);
				return false;
			}
			else if(Long.parseLong(txtGia.getText().trim()) < 0) {
				showMess("Giá tiền không được âm", txtGia);
				return false;
			}else if(!soSuon.matches("^[a-zA-z0-9-]+$")) {
				showMess("Số sườn không được chứa kí tự đặc biệt", txtSoSuon);
				return false;
			}else if(!soKhung.matches("^[a-zA-z0-9-]+$")) {
				showMess("Số khung không được chứa kí tự đặc biệt", txtSoKhung);
				return false;
			}else if(Integer.parseInt(txtSoPK.getText().trim()) < 0) {
				showMess("Số phân khối không được âm", txtSoPK);
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
	    txt_LoaiXe.setText(model.getValueAt(vitri, 1).toString());
		txtNSX.setText(model.getValueAt(vitri, 2).toString());
		txtGia.setText(model.getValueAt(vitri, 3).toString());
	
		txtSoSuon.setText(model.getValueAt(vitri, 4).toString());
		txtSoKhung.setText(model.getValueAt(vitri, 5).toString());
		txtSoPK.setText(model.getValueAt(vitri, 6).toString());
	
		
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
