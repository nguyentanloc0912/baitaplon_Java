package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.SystemColor;

import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTabbedPane;

import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import connectDB.ConnectDB;
import dao.Dao_CtHoaDon;
import dao.Dao_Hoadon1;
import entity.ChiTietHoaDon;
import entity.HoaDon;

import javax.swing.JScrollBar;
import java.awt.event.KeyAdapter;

public class HoaDon_GUI extends JFrame implements ActionListener, MouseListener, KeyListener {

	private JPanel contentPane;
	private JTextField txtMaHoaDon;
	private JLabel lbSoDienThoai;
	private JTextField txtMaKH;
	private JLabel lbTongTien;
	private JTextField txtTongTien;
	private JLabel lblNgayLap;
	private JTextField txtNgayLap;
	private JTextField txtNguoiLap;
	private JPanel panel_2;
	private JPanel panel_1;
	private JButton btnXoa;
	private JButton btnIn;
	private JButton btnThoat;
	private JLabel lblTimKiem;
	public static JTextField txtTimKiem;
	private JButton btnTmKim;
	public static  JTable table_hd;
	public static  DefaultTableModel model_hd;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	public static ArrayList<HoaDon> ds_hd;
	private JButton btnXemChiTiet;
	private ChiTietHD_GUI cthd_gui;
	boolean isFieldChanged = false;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDon_GUI frame = new HoaDon_GUI();
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
	public HoaDon_GUI() throws SQLException {
		
		setResizable(false);
		setTitle("Quản Lý Hóa Đơn");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 823,750);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(12, 13, 781, 90);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel = new JLabel("Hóa Đơn");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(52, 13, 699, 64);
		panel_3.add(lblNewLabel);
		
		JPanel panel =  new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel.setBounds(12, 115, 560, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setBounds(136, 25, 116, 22);
		panel.add(txtMaHoaDon);
		txtMaHoaDon.setForeground(Color.RED);
		txtMaHoaDon.setEditable(false);
		txtMaHoaDon.setBackground(null);
		txtMaHoaDon.setColumns(10);
		
		JLabel lblMaHoaDon = new JLabel("Mã Hóa Đơn");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaHoaDon.setBounds(12, 21, 99, 26);
		panel.add(lblMaHoaDon);
		
		txtMaKH = new JTextField();
		txtMaKH.setBounds(136, 57, 116, 22);
		panel.add(txtMaKH);
		txtMaKH.setEditable(false);
		txtMaKH.setColumns(10);
		txtMaKH.setBackground(null);
		
		txtTongTien = new JTextField();
		txtTongTien.setBounds(136, 97, 116, 22);
		panel.add(txtTongTien);
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);
		txtTongTien.setBackground(null);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setBounds(136, 129, 116, 22);
		panel.add(txtNgayLap);
	
		txtNgayLap.setEditable(false);
		txtNgayLap.setColumns(10);
		txtNgayLap.setBackground(null);
		
		btnXemChiTiet = new JButton("Xem Chi Tiết");
		btnXemChiTiet.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXemChiTiet.setBounds(337, 247, 170, 40);
		panel.add(btnXemChiTiet);
		btnXemChiTiet.setBackground(Color.WHITE);
		btnXemChiTiet.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/report.png")));
		
		JLabel lblNguoiLap = new JLabel("Người lập:");
		lblNguoiLap.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNguoiLap.setBounds(295, 22, 99, 26);
		panel.add(lblNguoiLap);
		
		txtNguoiLap = new JTextField();
		txtNguoiLap.setBounds(391, 24, 116, 22);
		panel.add(txtNguoiLap);
		txtNguoiLap.setEditable(false);
		txtNguoiLap.setColumns(10);
		txtNguoiLap.setBackground(null);
		
		lbSoDienThoai = new JLabel("Mã khách hàng: ");
		lbSoDienThoai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbSoDienThoai.setBounds(12, 57, 123, 26);
		panel.add(lbSoDienThoai);
		
		lbTongTien = new JLabel("Tổng tiền :");
		lbTongTien.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbTongTien.setBounds(12, 95, 87, 16);
		panel.add(lbTongTien);
		lbTongTien.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNgayLap = new JLabel("Ngày lập :");
		lblNgayLap.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNgayLap.setBounds(12, 130, 70, 16);
		panel.add(lblNgayLap);
		lblNgayLap.setHorizontalAlignment(SwingConstants.LEFT);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(584, 115, 209, 329);
		contentPane.add(tabbedPane);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		tabbedPane.addTab("Chức năng", null, panel_2, null);
		tabbedPane.setForegroundAt(0, new Color(0, 153, 255));
		tabbedPane.setBackgroundAt(0, new Color(0, 255, 255));
		panel_2.setLayout(null);
		
		btnXoa = new JButton("Xóa");
		btnXoa.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/del.png")));
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXoa.setBackground(SystemColor.info);
		btnXoa.setBounds(35, 33, 139, 40);
		panel_2.add(btnXoa);
		
		btnIn = new JButton("IN");
		btnIn.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/print.png")));
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIn.setBackground(SystemColor.info);
		btnIn.setBounds(35, 102, 139, 40);
		panel_2.add(btnIn);
		
		btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/close2.png")));
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThoat.setBackground(Color.WHITE);
		btnThoat.setBounds(46, 252, 118, 34);
		panel_2.add(btnThoat);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Tìm kiếm", null, panel_1, null);
		tabbedPane.setForegroundAt(1, new Color(30, 144, 255));
		tabbedPane.setBackgroundAt(1, new Color(0, 255, 255));
		panel_1.setLayout(null);
		
		lblTimKiem = new JLabel("Mã Hóa Đơn");
		lblTimKiem.setForeground(SystemColor.desktop);
		lblTimKiem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTimKiem.setBackground(SystemColor.inactiveCaption);
		lblTimKiem.setBounds(12, 53, 95, 16);
		panel_1.add(lblTimKiem);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(12, 82, 180, 38);
		panel_1.add(txtTimKiem);
		txtTimKiem.setColumns(10);
	
		txtTimKiem.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				isFieldChanged = true;
				Dao_Hoadon1.timHoaDon();
				
			}});
		
		btnTmKim = new JButton("Tìm kiếm");
		btnTmKim.setIcon(new ImageIcon(HoaDon_GUI.class.getResource("/anh/search.png")));
		btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTmKim.setBackground(SystemColor.activeCaption);
		btnTmKim.setBounds(35, 237, 128, 38);
		panel_1.add(btnTmKim);

		String header[] = {"Mã Hóa Đơn","Ngày lập","Mã Khách Hàng","Tổng tiền","Người lâp"};
		model_hd = new DefaultTableModel(header,0);
		table_hd = new JTable(model_hd);
		JScrollPane sp = new JScrollPane(table_hd, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(12,470,781,226);
		contentPane.add(sp);
		JTableHeader header1 = table_hd.getTableHeader();
		header1.setBackground(Color.cyan);
		((DefaultTableCellRenderer)header1.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		
		ds_hd = Dao_Hoadon1.getAllHoaDons();
		for(HoaDon hd : ds_hd) {
			DecimalFormat dcmf = new DecimalFormat("###,###,###");
			String mahd = hd.getMaHD();
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String ngaylap = df.format(hd.getNgay());
			String makh = hd.getMaKH();
			String tongtien =  dcmf.format(hd.getTongtien())+" VND";
			String nguoilap = hd.getUsername();
			String data[] = {mahd, ngaylap, makh, tongtien, nguoilap};
			model_hd.addRow(data);
		
		}
		
		cthd_gui = new ChiTietHD_GUI();
		AddListener();
	}
   public void AddListener() {
	   btnThoat.addActionListener(this);
	   btnXoa.addActionListener(this);
	   btnXemChiTiet.addActionListener(this);
	   table_hd.addMouseListener(this);
	   btnIn.addActionListener(this);
	   
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object a = e.getSource();
		if(a.equals(btnThoat)) {
			this.setVisible(false);
		}else if(a.equals(btnXoa)) {
			Xoa();
		}else if(a.equals(btnXemChiTiet)) {
			XemChiTiet();
		}else if(a.equals(btnIn)) {
			In();
		}
		
	}
	public void Xoa() {
		int pos = table_hd.getSelectedRow();
		if(pos<0) {
			JOptionPane.showMessageDialog(this, "Hãy nhập dòng cần xóa");
		}else {
			if(JOptionPane.showConfirmDialog(this,   "Bạn có chắc muốn xóa dòng này không", "Thông Báo", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
			String mahd = (String) model_hd.getValueAt(pos, 0);
			if(Dao_Hoadon1.deleteHoaDon(mahd)) {
				model_hd.removeRow(pos);
				JOptionPane.showMessageDialog(this, "Xóa thành công !");
			}else {
				JOptionPane.showMessageDialog(this, "Xóa thất bại !");
			}}	
		}
	}
    public void XemChiTiet() {
    	try {
			
		
    	ArrayList<ChiTietHoaDon> ls_cthd;
		int pos = table_hd.getSelectedRow();
		String mahd = (String) model_hd.getValueAt(pos, 0);
		ls_cthd = Dao_CtHoaDon.getCTHoaDonByMaHoaDon(mahd);
		DefaultTableModel dm = (DefaultTableModel) cthd_gui.table_cthd.getModel();
		dm.setRowCount(0);
		DecimalFormat dcm = new DecimalFormat("###,###,###");
		for(ChiTietHoaDon cthd : ls_cthd) {
			String macthd = cthd.getMaCTHoaDon();
			String mahoadon = cthd.getMaHoaDon();
			String masp = cthd.getMaSP();
			String soluong = cthd.getSoLuong()+"";
			String thanhtien = dcm.format(cthd.thanhTien)+" VND";
			String ghichu = cthd.getGhiChu()+"";
			String data[] = {macthd, mahoadon, masp, soluong, thanhtien, ghichu};
			cthd_gui.model_cthd.addRow(data);
		  	cthd_gui.setVisible(true);
			
		}
    	}catch (Exception e) {
				// TODO: handle exception
    		JOptionPane.showMessageDialog(null,"Hãy chọn hóa đơn để xem chi tiết !" );
			}
  
    }
    public static void Clear_table () {
    	DefaultTableModel dm = (DefaultTableModel) table_hd.getModel();
    	dm.setRowCount(0);
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int pos = table_hd.getSelectedRow();
		txtMaHoaDon.setText((String) model_hd.getValueAt(pos, 0));
		txtNgayLap.setText((String) model_hd.getValueAt(pos, 1));
		txtMaKH.setText((String) model_hd.getValueAt(pos, 2));
		txtTongTien.setText((String) model_hd.getValueAt(pos, 3));
		txtNguoiLap.setText((String) model_hd.getValueAt(pos, 4));
	}
    public void In() {
//    	try {
//			XSSFWorkbook wordbook  = new XSSFWorkbook();
//			XSSFSheet sheet = wordbook.createSheet("DanhSachHoaDon");
//			XSSFRow row = null;
//			Cell cell = null;
//			row = sheet.createRow(5);
//			cell = row.createCell(0, CellType.STRING);
//			cell.setCellValue("STT");
//			cell = row.createCell(0, CellType.STRING);
//			cell.setCellValue("Ma Hoa Don");
//			cell = row.createCell(1, CellType.STRING);
//			cell.setCellValue("Ngay Lap");
//			cell = row.createCell(2, CellType.STRING);
//			cell.setCellValue("Ma Khach Hang");
//			cell = row.createCell(3, CellType.STRING);
//			cell.setCellValue("Tong Tien");
//			cell = row.createCell(4, CellType.STRING);
//			cell.setCellValue("Nguoi Lap");
//			for(int i=0;i<ds_hd.size();i++) {
//				row = sheet.createRow(4+i);
//				cell = row.createCell(0, CellType.NUMERIC);
//				cell.setCellValue(i+1);
//				cell = row.createCell(1, CellType.STRING);
//				cell.setCellValue(ds_hd.get(i).getMaHD());
//				cell = row.createCell(2, CellType.STRING);
//				cell.setCellValue(ds_hd.get(i).getNgay());
//				cell = row.createCell(3, CellType.STRING);
//				cell.setCellValue(ds_hd.get(i).getMaKH());
//				cell = row.createCell(4, CellType.STRING);
//				cell.setCellValue(ds_hd.get(i).getTongtien());
//				cell = row.createCell(5, CellType.STRING);
//				cell.setCellValue(ds_hd.get(i).getUsername());
//			}
//			File f = new File("D://danhsach.xlsx");
//			try {
//				FileOutputStream fis =new FileOutputStream(f);
//				wordbook.write(fis);
//				fis.close();
//			} catch (FileNotFoundException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}catch (IOException e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    	JOptionPane.showMessageDialog(this, "In Thành Công");
    }
    public static void LoadDataArrayListToTable() {
    	for(HoaDon hd : ds_hd) {
			DecimalFormat dcmf = new DecimalFormat("###,###,###");
			String mahd = hd.getMaHD();
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String ngaylap = df.format(hd.getNgay());
			String makh = hd.getMaKH();
			String tongtien =  dcmf.format(hd.getTongtien())+" VND";
			String nguoilap = hd.getUsername();
			String data[] = {mahd, ngaylap, makh, tongtien, nguoilap};
			model_hd.addRow(data);
		
		}
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}
