package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Window;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import javax.swing.text.Element;

import dao.Dao_CtHoaDon;
import dao.Dao_Hoadon1;
import dao.khachHang_DAO;
import dao.thongTinSP_DAO;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import entity.TaoChiTietHoaDon;
import entity.TaoHoadon;
import entity.khachHang_model;
import entity.sanPham;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class banHang extends JFrame implements ActionListener, WindowListener {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Label jlb_banhang;
	private JComboBox comboBox_tenxe;
	private JLabel jlb_soluong;
	private JTextField txt_soluong;
	private JLabel lbl_makhachhang;
	private JLabel jlb_title_dongia;
	private JTextField txt_giamgia;
	private JLabel lbl_title_tongtienhoadon;
	private JLabel jlb_title_tongtien;
	private JLabel lblghichu;
	private JTextArea txt_area_ghichu;
	private JButton btnThoat;
	private JButton btntaomoi;
	private JButton btnThem;
	private JButton btnThanhtoan;
	private JButton btn_xoa;
	private JLabel lbl_user;
	private JLabel lbl_day;
	public static LocalDate currentDate;
	public thongTinSanPham_GUI thsp;
	private JLabel lbl_dongia;
	private ArrayList<sanPham> list_sp;
	private ArrayList<khachHang_model> list_kh;
	private thongTinSP_DAO dao_sanPham;
	private JComboBox comboBox_maKH;
	private khachHang_DAO dao_khachHang;
	private JLabel jlb_mahoadon;
	private long soluong;
	private JLabel lbl_tongtien;
	public static int so ;
	public static String mangaynhien ;
	private JLabel lbl_tongtienhoadon;
	public static long tongTien;
	public static ArrayList<HoaDon> list_hd;
	public Dao_Hoadon1 dao_hd;
	private int tongtienhoadon;
	private boolean isComboBoxEnabled = false;
	
	

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
					banHang frame = new banHang();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public banHang() throws SQLException {
		dao_hd = new Dao_Hoadon1();
		dao_khachHang = new khachHang_DAO();
		dao_sanPham = new thongTinSP_DAO();
		thsp = new thongTinSanPham_GUI();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Hợp đồng");
		setBounds(100, 100, 1000, 609);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jlb_banhang = new Label("Bán hàng");
		jlb_banhang.setAlignment(Label.CENTER);
		jlb_banhang.setBounds(352, 0, 268, 49);
		jlb_banhang.setFont(new Font("Arial", Font.BOLD, 25));
		contentPane.add(jlb_banhang);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(303, 55, 673, 228);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_tensanpham = new JLabel("Tên sản phẩm : ");
		lbl_tensanpham.setBounds(10, 10, 105, 13);
		panel.add(lbl_tensanpham);
		
		comboBox_tenxe = new JComboBox();
		comboBox_tenxe.setBounds(125, 6, 96, 21);
		panel.add(comboBox_tenxe);
//	    for(sanPham sp : thongTinSanPham_GUI.list) {
//	    	comboBox_tenxe.addItem(sp);
//	    }
		
		jlb_soluong = new JLabel("Số lượng : \r\n");
		jlb_soluong.setBounds(10, 44, 88, 13);
		panel.add(jlb_soluong);
		
		txt_soluong = new JTextField();
		txt_soluong.setBounds(125, 41, 171, 19);
		panel.add(txt_soluong);
		txt_soluong.setColumns(10);
		txt_soluong.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0' && c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
		            e.consume(); // không cho phép nhập các ký tự khác số
		            JOptionPane.showMessageDialog(null, "Vui lòng nhập giá trị số!", "Thông báo", JOptionPane.ERROR_MESSAGE); // xuất thông báo lỗi
		        }
		    }
		});
		
		lbl_makhachhang = new JLabel("Mã KH : \r\n");
		lbl_makhachhang.setBounds(10, 84, 88, 13);
		panel.add(lbl_makhachhang);
		
		jlb_title_dongia = new JLabel("Đơn giá\r\n :");
		jlb_title_dongia.setBounds(337, 44, 60, 13);
		panel.add(jlb_title_dongia);
		
		JLabel jlb_giam = new JLabel("Giảm giá");
		jlb_giam.setBounds(10, 127, 88, 13);
		panel.add(jlb_giam);
		
		txt_giamgia = new JTextField();
		txt_giamgia.setColumns(10);
		txt_giamgia.setBounds(125, 124, 171, 19);
		panel.add(txt_giamgia);
		txt_giamgia.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0' && c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
		            e.consume(); // không cho phép nhập các ký tự khác số
		            JOptionPane.showMessageDialog(null, "Vui lòng nhập giá trị số!", "Thông báo", JOptionPane.ERROR_MESSAGE); // xuất thông báo lỗi
		        }
		    }
		});
		
		jlb_title_tongtien = new JLabel("Tổng tiền : ");
		jlb_title_tongtien.setBounds(10, 174, 88, 13);
		panel.add(jlb_title_tongtien);
		
		lbl_title_tongtienhoadon = new JLabel("Tổng tiền hóa đơn : \r\n");
		lbl_title_tongtienhoadon.setBounds(10, 205, 124, 13);
		panel.add(lbl_title_tongtienhoadon);
		
		lblghichu = new JLabel("Ghi chú : \r\n");
		lblghichu.setBounds(337, 106, 60, 13);
		panel.add(lblghichu);
		
		txt_area_ghichu = new JTextArea();
		txt_area_ghichu.setBounds(417, 100, 231, 110);
		panel.add(txt_area_ghichu);
		
		lbl_dongia = new JLabel("0");
		lbl_dongia.setBounds(417, 44, 45, 13);
		panel.add(lbl_dongia);
		
		comboBox_maKH = new JComboBox();
		comboBox_maKH.setBounds(125, 80, 96, 21);
		panel.add(comboBox_maKH);
		
		lbl_tongtien = new JLabel("");
		lbl_tongtien.setBounds(125, 174, 88, 13);
		panel.add(lbl_tongtien);
		
		lbl_tongtienhoadon = new JLabel("");
		lbl_tongtienhoadon.setBounds(125, 205, 96, 13);
		panel.add(lbl_tongtienhoadon);
		list_kh = dao_khachHang.getALLKhachHang(); 
		for(khachHang_model kh  : list_kh) {
			comboBox_maKH.addItem(kh.getMaKH());
		}

		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Mã Hóa Đơn");
		model.addColumn("Mã Sản phẩm");
		model.addColumn("Tên sản phẩm");
		model.addColumn("Số lượng");
		model.addColumn("Thành tiền");
		model.addColumn("Ghi chú");
		
		
		JTableHeader Theader = table.getTableHeader();
		Theader.setBackground(Color.red);
//		table.getColumnModel().getColumn(1).setPreferredWidth(90);
//		table.getColumnModel().getColumn(2).setPreferredWidth(105);
//		table.getColumnModel().getColumn(3).setPreferredWidth(110);
//		table.getColumnModel().getColumn(8).setPreferredWidth(90);
//		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		((DefaultTableCellRenderer)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);;
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 373, 966, 189);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 55, 283, 73);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Hóa Đơn : \r\n ");
		lblNewLabel.setBounds(10, 32, 92, 13);
		panel_1.add(lblNewLabel);
		
		jlb_mahoadon = new JLabel("\r\n");
		jlb_mahoadon.setBounds(112, 32, 92, 13);
		panel_1.add(jlb_mahoadon);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 150, 283, 73);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên nhân viên lập : ");
		lblNewLabel_1.setBounds(10, 10, 121, 13);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày lập : ");
		lblNewLabel_1_1.setBounds(10, 50, 101, 13);
		panel_1_1.add(lblNewLabel_1_1);
		
		lbl_user = new JLabel(dangNhap.usename);
		lbl_user.setBounds(141, 10, 121, 13);
		panel_1_1.add(lbl_user);
		
		lbl_day = new JLabel();
		lbl_day.setBounds(121, 50, 113, 13);
		panel_1_1.add(lbl_day);
		
		btnThoat = new JButton("Thoát\r\n");
		btnThoat.setIcon(new ImageIcon(banHang.class.getResource("/anh/thoat.png")));
		btnThoat.setBounds(10, 244, 134, 39);
		contentPane.add(btnThoat);
		
		btntaomoi = new JButton("Hóa đơn mới");
		btntaomoi.setIcon(new ImageIcon(banHang.class.getResource("/anh/add1.png")));
		btntaomoi.setBounds(303, 324, 134, 39);
		contentPane.add(btntaomoi);
		
		btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon(banHang.class.getResource("/anh/them.png")));
	
		btnThem.setBounds(486, 324, 134, 39);
		contentPane.add(btnThem);
		
		btnThanhtoan = new JButton("Thanh toán");
		btnThanhtoan.setIcon(new ImageIcon(banHang.class.getResource("/anh/chi.png")));
		btnThanhtoan.setBounds(842, 324, 134, 39);
		contentPane.add(btnThanhtoan);
		
		btn_xoa = new JButton("Xóa");
		btn_xoa.setIcon(new ImageIcon(banHang.class.getResource("/anh/deldata.png")));
		btn_xoa.setBounds(668, 324, 134, 39);
		contentPane.add(btn_xoa);
		currentDate =LocalDate.now();
		
	
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String date = currentDate.format(formatter);
		lbl_day.setText(date);
		
		getTenXe();
		addAction();
		addWindowListener(this);
		btnThem.setEnabled(false);
		setEnabled_false();
		
	
	}
	public void addAction() {
		comboBox_tenxe.addActionListener(this);
		btntaomoi.addActionListener(this);
		btnThem.addActionListener(this);
		btnThanhtoan.addActionListener(this);
		btnThoat.addActionListener(this);
		btn_xoa.addActionListener(this);
		
	}
	public void getTenXe() {
		list_sp = dao_sanPham.getAllSanPham();
		for (sanPham sanPham : list_sp) {
			comboBox_tenxe.addItem(sanPham.getTenLoai());
		}
	}
    public void AddHdvaodatabase() {
    	int countRow = model.getRowCount();
    	if(countRow > 0) {
    	tongtienhoadon = 0;
		DecimalFormat currency = new DecimalFormat ("###,###,### VND");
		int soluong = model.getRowCount();
		for(int i=0;i<soluong;i++) {
			String str = (String) model.getValueAt(i, 4);
			String result = str.replaceAll("\\.", "");
			tongtienhoadon+= Long.parseLong(result);
		}
		lbl_tongtienhoadon.setText(currency.format(tongtienhoadon));
    	HoaDon hd = new HoaDon();
		String makh = (String) comboBox_maKH.getSelectedItem();
		hd.setMaKH(makh);
		String mahd = jlb_mahoadon.getText();
		hd.setMaHD(mahd);
		hd.setTongtien(tongtienhoadon);
		String usenae = lbl_user.getText();
		hd.setUsername(usenae);
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	try {
			hd.setNgay(dateFormat.parse(lbl_day.getText()));
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
    	if(dao_hd.addHoaDon(hd)) {
    		JOptionPane.showMessageDialog(this, "Thanh toán Thành công");
    	
    		btnThem.setEnabled(false);
    		
    	}else {
    		JOptionPane.showMessageDialog(this, "Thanh toán thất bại");
    	}}else {
    		JOptionPane.showMessageDialog(this, "Không có sản phẩm để thanh toán");
    	}
    }
    public void Themspvaotable() {
    	NumberFormat currency = new DecimalFormat ("###,###,###");
		String soluong = txt_soluong.getText();
		if(!soluong.equals("")) {
		long sl = Long.parseLong(soluong);
		long gia = Long.parseLong(lbl_dongia.getText());
	    if(txt_giamgia.getText().equals("") || txt_giamgia.getText().equalsIgnoreCase("0")){
	    	tongTien = (long)sl*gia;
			lbl_tongtien.setText(currency.format(tongTien));
		}else {
			int giam = Integer.parseInt(txt_giamgia.getText());
			int tinhgiam = 100-giam;
			double  a = (double)tinhgiam/100;
			tongTien = (long)(sl*gia*a);
			lbl_tongtien.setText(currency.format(tongTien));
		}
		String mahd = jlb_mahoadon.getText();
		String tenSp =(String) comboBox_tenxe.getSelectedItem();
	    
		String maSp =null;
		for (sanPham sanPham : list_sp) {
			if(sanPham.getTenLoai().equalsIgnoreCase(tenSp)){
				maSp = sanPham.getMaLoai();
			}
		}
		lbl_tongtien.setText(currency.format(tongTien));
        String ghichu = txt_area_ghichu.getText();
		String[] rowdata = {mahd,maSp,tenSp,soluong,tongTien+"", ghichu};
		model.addRow(rowdata);
		comboBox_maKH.setEnabled(false);
		}else {
			JOptionPane.showMessageDialog(this, "Hãy nhập số lượng");
		}
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(comboBox_tenxe)){
			if(isComboBoxEnabled) {
			String tenSP = (String) comboBox_tenxe.getSelectedItem();
	       
			for (sanPham sp : list_sp) {
				if(sp.getTenLoai().equalsIgnoreCase(tenSP)){
					lbl_dongia.setText(Long.toString(sp.getGiaBan()));
				}
			}}
		}else if(o.equals(btntaomoi)) {
			 jlb_mahoadon.setText(TaoHoadon.TaoSoHD());
			 setEnabled_true();
			 DefaultTableModel dm = (DefaultTableModel) table.getModel();
			 dm.setRowCount(0);
			 
			
		}else if(o.equals(btnThem)) {
			try {
				Themspvaotable();
				btn_xoa.setEnabled(true);
//				reset();
				btntaomoi.setEnabled(false);
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "Hãy chọn sản phẩm cần mua !");
			}
			
		}if(o.equals(btnThanhtoan)){
			AddHdvaodatabase();
			try {
				AddCthdVaoDatabase();
				reset();
				btnThanhtoan.setEnabled(false);
				btn_xoa.setEnabled(false);
				btnThem.setEnabled(false);
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			btntaomoi.setEnabled(true);
	    }else if(o.equals(btnThoat)) {
	        this.setVisible(false);
	    }else if(o.equals(btn_xoa)) {
	    	   Xoa();
	    }

	}
	public void xoaTrang() {
		txt_giamgia.setText(null);
		txt_soluong.setText(null);
		
	}
    public void setEnabled_false() {
    	btn_xoa.setEnabled(false);
    	btnThanhtoan.setEnabled(false);
    	txt_giamgia.setEditable(false);
    	txt_soluong.setEditable(false);
    	btnThem.setEnabled(false);
    	comboBox_maKH.setEnabled(false);
    	comboBox_tenxe.setEnabled(false);
    	txt_area_ghichu.setEditable(false);
    }
    public void setEnabled_true() {
    	btnThanhtoan.setEnabled(true);
    	txt_giamgia.setEditable(true);
    	txt_soluong.setEditable(true);
    	btnThem.setEnabled(true);
    	comboBox_maKH.setEnabled(true);
    	comboBox_tenxe.setEnabled(true);
    	isComboBoxEnabled = true;
    	txt_area_ghichu.setEditable(true);
    }
    public void reset() {
    	lbl_dongia.setText("");
    	txt_giamgia.setText("");
    	txt_soluong.setText("");
    	lbl_tongtien.setText("");
    }
    public void AddCthdVaoDatabase() {
    	int k = 0;
    	int count = table.getRowCount();
    	for(int i=0;i<count;i++) {
    		String machitiethoadon = TaoChiTietHoaDon.TaoSoCTHD();
    		String mahd = (String) model.getValueAt(i, 0);
    		String masp = (String) model.getValueAt(i, 1);
    		int soluong = Integer.parseInt( (String)model.getValueAt(i, 3));
    		long thanhtien =  Long.parseLong((String)model.getValueAt(i, 4));
    		String ghichu = (String) model.getValueAt(i, 5);
    		ChiTietHoaDon cthd = new ChiTietHoaDon();
    		cthd.setMaCTHoaDon(machitiethoadon);
    		cthd.setMaHoaDon(mahd);
    		cthd.setMaSP(masp);
    		cthd.setSoLuong(soluong);
    		cthd.setThanhTien(thanhtien);
    		cthd.setGhiChu(ghichu);
    		if(Dao_CtHoaDon.addCtHoaDon(cthd)) {
    			k++;
    		}
    	}
    	if(k!=0) {
    		JOptionPane.showMessageDialog(this, "Thêm Vào Chi Tiết Hóa Đơn Thành Công");
    	}else {
    		JOptionPane.showMessageDialog(this, "Thêm thất bại");
    	}
    }
    public void Xoa() {
    	int pos = table.getSelectedRow();
    	if(JOptionPane.showConfirmDialog(this,  "Bạn có chắc muốn xóa dòng này không !", "Thông báo",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    	model.removeRow(pos);
    }
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		jlb_mahoadon.setText(TaoHoadon.TaoSoHD());
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

