package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import dao.DAO_HoaDon;
import connectDB.ConnectDB;
import entity.HoaDon;
import entity.ListHD;

import javax.swing.JButton;

public class HoaDonview extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmaHD;
	private JTextField txtmaKH;
	private JTextField txtngay;
	private JTextField txttongtien;
	private JTextField txtusername;
	private JComboBox comboBox;
	private JTextField txtTim;
	private DefaultTableModel model;
	private DAO_HoaDon daoHD;		
	private ListHD ls;
	private JTable table;
	private JButton btThem, btXoa,btXoaTrang,btLuu,btclose, btTim;
	private JTextField txtmaXe;
	private JTextField txtsoluong;
	private ArrayList<HoaDon> ds;
	private HoaDon hd;
	private JTextField txtMess;

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
		setBounds(100, 100, 1029, 721);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 61, 995, 284);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbmhd = new JLabel("Mã hóa đơn");
		lbmhd.setBounds(10, 16, 88, 22);
		lbmhd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmhd.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lbmhd);
		
		txtmaHD = new JTextField();
		txtmaHD.setBounds(217, 10, 199, 33);
		panel.add(txtmaHD);
		txtmaHD.setColumns(10);
		
		JLabel lbmkh = new JLabel("Mã khách hàng");
		lbmkh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmkh.setBounds(513, 10, 101, 29);
		panel.add(lbmkh);
		
		txtmaKH = new JTextField();
		txtmaKH.setBounds(718, 11, 213, 32);
		panel.add(txtmaKH);
		txtmaKH.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày lập hóa đơn");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(10, 56, 112, 22);
		panel.add(lblNewLabel_2);
		
		txtngay = new JTextField();
		txtngay.setBounds(217, 53, 199, 33);
		panel.add(txtngay);
		txtngay.setColumns(10);
		
		JLabel lbhttt = new JLabel("Hình thức Thanh Toán");
		lbhttt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbhttt.setBounds(513, 49, 156, 29);
		panel.add(lbhttt);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tiền mặt", "Chuyển khoản"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(718, 53, 213, 25);
		panel.add(comboBox);
		
		JLabel lbtongtien = new JLabel("Tổng tiền");
		lbtongtien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbtongtien.setBounds(513, 169, 101, 22);
		panel.add(lbtongtien);
		
		txttongtien = new JTextField();
		txttongtien.setBounds(718, 166, 213, 32);
		panel.add(txttongtien);
		txttongtien.setColumns(10);
		
		JLabel lbNV = new JLabel("Nhân Viên");
		lbNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNV.setBounds(513, 102, 134, 22);
		panel.add(lbNV);
		
		txtusername = new JTextField();
		txtusername.setBounds(718, 109, 213, 32);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lbmaXe = new JLabel("Mã Xe");
		lbmaXe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmaXe.setBounds(10, 109, 88, 13);
		panel.add(lbmaXe);
		
		txtmaXe = new JTextField();
		txtmaXe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtmaXe.setBounds(217, 106, 199, 33);
		panel.add(txtmaXe);
		txtmaXe.setColumns(10);
		
		JLabel lbsoluong = new JLabel("Số lượng");
		lbsoluong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbsoluong.setBounds(10, 169, 112, 22);
		panel.add(lbsoluong);
		
		txtsoluong = new JTextField();
		txtsoluong.setBounds(217, 166, 199, 33);
		panel.add(txtsoluong);
		txtsoluong.setColumns(10);
		
		txtMess = new JTextField();
		txtMess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMess.setBounds(76, 231, 213, 33);
		panel.add(txtMess);
		txtMess.setColumns(10);
		txtMess.setEditable(false);
		txtMess.setForeground(Color.RED);
		
		JLabel lblNewLabel_7 = new JLabel("Hóa Đơn");
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_7.setBounds(441, 10, 144, 36);
		contentPane.add(lblNewLabel_7);
		
	    btclose = new JButton("Thoát");
		btclose.setForeground(new Color(255, 0, 0));
		btclose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btclose.setBounds(906, 653, 99, 21);
		contentPane.add(btclose);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model.addColumn("Mã hóa đơn");
		model.addColumn("Ngày");
		model.addColumn("Mã khách hàng");
		model.addColumn("Mã Loại Xe");
		model.addColumn("Số lượng");
		model.addColumn("Hình thức TT");
		model.addColumn("Tổng tiền");
		model.addColumn("Nhân viên");
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 480, 995, 163);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(10, 406, 995, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbtim = new JLabel("Nhập mã hóa đơn cần tìm");
		lbtim.setBounds(10, 25, 147, 16);
		panel_1.add(lbtim);
		lbtim.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtTim = new JTextField();
		txtTim.setBounds(167, 21, 172, 27);
		panel_1.add(txtTim);
		txtTim.setColumns(10);
		
	 btTim = new JButton("Tìm");
		btTim.setBounds(361, 22, 68, 21);
		panel_1.add(btTim);
		btTim.setForeground(new Color(0, 0, 0));
		btTim.setBackground(new Color(255, 255, 255));
		btTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btThem = new JButton("Thêm");
		btThem.setBounds(488, 22, 105, 21);
		panel_1.add(btThem);
		btThem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btXoa = new JButton("Xóa");
		btXoa.setBounds(629, 22, 85, 21);
		panel_1.add(btXoa);
		btXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btXoaTrang = new JButton("Xóa trắng");
		btXoaTrang.setBounds(754, 21, 105, 20);
		panel_1.add(btXoaTrang);
		btXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btLuu = new JButton("Lưu");
		btLuu.setBounds(900, 22, 85, 21);
		panel_1.add(btLuu);
		btLuu.setEnabled(false);
		btLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("Thống kê hóa đơn");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(20, 654, 158, 21);
		contentPane.add(btnNewButton);
		
		btLuu.addActionListener(this);
		btXoaTrang.addActionListener(this);
		btXoa.addActionListener(this);
		btThem.addActionListener(this);
		btTim.addActionListener(this);
		btclose.addActionListener(this);
	    table.addMouseListener(this);
		
		
		loadList();
      
	}
	
	
	public void loadList() {
		ds = daoHD.getAllHoaDons();
		model.getDataVector().removeAllElements(); 
		model.fireTableDataChanged();
		load(ds);
	}
	public void load(ArrayList<HoaDon> ds) {
		for(HoaDon hd : daoHD.getAllHoaDons()) {
			Object[] rowData = {
					hd.getMaHD(), hd.getNgay(), hd.getMaKH(), hd.getMaLoaiXe(), hd.getSoluong(), hd.getHinhthucTT(), hd.getTongtien(), hd.getUsername()
			}; model.addRow(rowData);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btclose)) {
			int mes = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát?", "Exit", JOptionPane.YES_NO_OPTION);
			if(mes == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		else if(o.equals(btXoaTrang)) {
			xoaTrang();
		}else if(o.equals(btThem)) {
			if(btThem.getText().equalsIgnoreCase("Thêm"))
			{
				xoaTrang();
				txtmaHD.requestFocus();
				btThem.setText("Hủy");
				btLuu.setEnabled(true);
				btXoa.setEnabled(false);
			}else if(btThem.getText().equalsIgnoreCase("Hủy")) {
				btThem.setText("Thêm");
				btLuu.setEnabled(false);
				btXoa.setEnabled(true);
			}
		}else if(o.equals(btLuu)) {
			try {
				luu();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			xoaTrang();
			btThem.setText("Thêm");
			btXoa.setEnabled(true);
			btLuu.setEnabled(false);
		}else if(o.equals(btXoa)) {
			try {
				xoa();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
			
}
	public void xoa()throws Exception {
		int r = table.getSelectedRow();
		if(r!=-1) {
			String maHD = model.getValueAt(r, 0).toString();
			int tb = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa hóa đơn này","Delete",JOptionPane.YES_NO_OPTION);
			if(tb == JOptionPane.YES_OPTION) {
				DAO_HoaDon.delete(maHD);
				model.removeRow(r);
				xoaTrang();
				JOptionPane.showMessageDialog(this, "Xóa thành công");
			}else {
				JOptionPane.showMessageDialog(this, "Chưa chọn dòng cần xóa");
			}
		}
	}
	public void luu()throws Exception {
		String maHD = txtmaHD.getText();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String ngay = df.format(txtngay.getText());
		String maKH = txtmaKH.getText();
		String maXe = txtmaXe.getText();
		String sl = txtsoluong.getText();
		String httt= comboBox.getSelectedItem().toString();
		String tongtien = txttongtien.getText();
		String nv = txtusername.getText();
		if(valiData()) {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnecttion();
			HoaDon hd = new HoaDon(maHD, ngay, maKH, maXe, Integer.parseInt(sl), httt, Double.parseDouble(tongtien), nv);
			try {
				Statement stm = con.createStatement();
				stm.executeUpdate("INSERT INTO hoadon" + String.format("VALUES ('%s', '%s','%s','%s','%d','%s','%f','%s')",
						maHD, ngay, maKH, maXe, Integer.parseInt(sl), httt, Double.parseDouble(tongtien), nv));
				showMess("Thêm thành công", txtmaHD);
				String[] row = {maHD,ngay, maKH, maXe, sl, httt, tongtien,nv};
				model.addRow(row);
			} catch (Exception e) {
				// TODO: handle exception
				showMess("Trùng mã hóa đơn", txtmaHD);
			}
		}	
	}
	public boolean valiData() {
		String maHD = txtmaHD.getText().trim();
		String ngay = txtngay.getText().trim();
		String maKH = txtmaKH.getText().trim();
		String maXe = txtmaXe.getText().trim();
		String sl = txtsoluong.getText().trim();
		String tongtien = txttongtien.getText().trim();
		String username = txtusername.getText().trim();
		if(maHD.equals("")) {
			showMess("Mã loại không được để trống", txtmaHD);
			return false;
		} else if(ngay.equals("")) {
			showMess("Ngày không được rỗng", txtngay);
			return false;
		}else if(maKH.equals("")) {
			showMess("Mã khách hàng không được rỗng", txtmaKH);
			return false;
		}else if(maXe.equals("")) {
			showMess("Mã xe không được rỗng", txtmaXe);
			return false;
		}else if(sl.equals("")) {
			showMess("Số lượng không được rỗng", txtsoluong);
			return false;
		}else if(tongtien.equals("")) {
			showMess("Tổng tiền không được rỗng", txttongtien);
			return false;
		}else if(username.equals("")) {
			showMess("Nhân viên không được rỗng", txtusername);
			return false;
		}else {
			if(!maHD.matches("^[a-zA-z0-9]+$")) {
				showMess("Mã hóa đơn không chứa kí tự đặc biệt và khoảng trắng", txtmaHD);
				return false;
			} else if(!ngay.matches("([0-2][1-9]|30)-(0[1-9]||1[0-2])-(19[8|9][0-9]||20[0-9]{2})")) {
				showMess("Ngày sai", txtngay);
				return false;
			}else if(!maKH.matches("^[a-zA-z0-9]+$")) {
				showMess("Mã khách hàng không chứa kí tự đặc biệt và khoảng trắng", txtmaKH);
				return false;
			} else if(!maXe.matches("^[a-zA-z0-9]+$")) {
				showMess("Mã Xe không chứa kí tự đặc biệt và khoảng trắng", txtmaXe);
				return false;
			} else if(!sl.matches("^[0-9]+$") && Integer.parseInt(txtsoluong.getText().trim())<0) {
				showMess("Số lượng phải là số và là số dương", txtsoluong);
				return false;
			}else if(!tongtien.matches("^[0-9]+$") && Double.parseDouble(txttongtien.getText().trim())<0) {
				showMess("Tiền phải là số và là số dương", txttongtien);
				return false;
			}else if(!username.matches("[A-ZÀ-Ỹ]+[A-Za-zÀ-Ỹà-ỹ]\s")) {
				showMess("Chữ đầu viết hoa, không là khoảng trắng", txtusername);
				return false;
			}else 
				return true;
		}
		
	}
	public void showMess(String mess,JTextField txt) {
		txt.requestFocus();
		txtMess.setText(mess);
	}

	public void xoaTrang() {
		txtmaHD.setText("");
		txtngay.setText("");
		txtmaKH.setText("");
		txtmaXe.setText("");
		txtsoluong.setText("");
		txttongtien.setText("");
		txtusername.setText("");
		txtmaHD.requestFocus();
	}
    
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();
		txtmaHD.setText(model.getValueAt(row, 0).toString());
		txtngay.setText(model.getValueAt(row, 1).toString());
		txtmaKH.setText(model.getValueAt(row, 2).toString());
		txtmaXe.setText(model.getValueAt(row, 3).toString());
		txtsoluong.setText(model.getValueAt(row, 4).toString());
		comboBox.setSelectedItem(model.getValueAt(row, 5).toString());
		txttongtien.setText(model.getValueAt(row, 6).toString());
	    txtusername.setText(model.getValueAt(row, 7).toString());
		
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


