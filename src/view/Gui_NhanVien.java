package view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import connectDB.ConnectDB;
import dao.NhanVien_Dao;
import entity.NhanVien;
import entity.PasswordRenderer;
import entity.ds_NhanVien;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class Gui_NhanVien extends JFrame implements ActionListener, MouseListener{

	private JPanel contentPane;
	private JTextField txt_taikhoan;
	private JLabel lbl_matkhau;
	private JPasswordField txt_matkhau;
	private JLabel lbl_hoten;
	private JTextField txt_hoten;
	private JLabel lbl_email;
	private JTextField txt_email;
	private JLabel lbl_ngaysinh;
	private JTextField txt_ngaysinh;
	private JTextField txt_phone;
	private JToggleButton showHide_password;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lbl_taikhoan;
	private JLabel lbl_Phone;
	private JButton btn_tim;
	private JButton btn_them;
	private JButton btn_xoa;
	private JButton btn_luu;
	private JButton btn_huy;
	private DefaultTableModel model;
	private ArrayList<NhanVien> ds;
	private NhanVien_Dao dao;
	private JButton btn_sua;
	private JTextField txt_tim;
	private JLabel lbl_kiemtra_taikhoan;
	private JLabel lbl_kiemtra_matkhau;
	private JLabel lbl_kiemtra_hoten;
	private JLabel lbl_kiemtra_Email;
	private JLabel lbl_kiemtra_ngaysinh;
	private JLabel lbl_kiemtra_phone;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_NhanVien frame = new Gui_NhanVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * Create the frame.
	 */
	public Gui_NhanVien() {
		try {
			ConnectDB.getInstance().connect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setTitle("Thông tin nhân viên");
		setBounds(100, 100, 825, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		dao =new NhanVien_Dao();
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 364, 216);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbl_taikhoan = new JLabel("T\u00EAn t\u00E0i kho\u1EA3n\r\n : ");
		lbl_taikhoan.setBounds(10, 30, 95, 13);
		panel.add(lbl_taikhoan);
		
		txt_taikhoan = new JTextField();
		txt_taikhoan.setBounds(104, 30, 243, 19);
		panel.add(txt_taikhoan);
		txt_taikhoan.setColumns(10);
		
		lbl_matkhau = new JLabel("M\u1EADt kh\u1EA9u: ");
		lbl_matkhau.setBounds(10, 59, 84, 13);
		panel.add(lbl_matkhau);
		showHide_password = new JToggleButton("Show");
		showHide_password.setBounds(269, 59, 78, 19);
		panel.add(showHide_password);
		showHide_password.addActionListener(this);
		txt_matkhau = new JPasswordField();
		txt_matkhau.setColumns(10);
		txt_matkhau.setBounds(104, 59, 156, 19);
		panel.add(txt_matkhau);
	
		
		lbl_hoten = new JLabel("H\u1ECD t\u00EAn : ");
		lbl_hoten.setBounds(10, 88, 84, 13);
		panel.add(lbl_hoten);
		
		txt_hoten = new JTextField();
		txt_hoten.setColumns(10);
		txt_hoten.setBounds(104, 88, 243, 19);
		panel.add(txt_hoten);
		
		lbl_email = new JLabel("Email");
		lbl_email.setBounds(10, 117, 84, 13);
		panel.add(lbl_email);
		
		txt_email = new JTextField();
		txt_email.setColumns(10);
		txt_email.setBounds(104, 117, 243, 19);
		panel.add(txt_email);
		
		lbl_ngaysinh = new JLabel("Ng\u00E0y sinh : \r\n");
		lbl_ngaysinh.setBounds(10, 146, 84, 13);
		panel.add(lbl_ngaysinh);
		
		txt_ngaysinh = new JTextField();
		txt_ngaysinh.setColumns(10);
		txt_ngaysinh.setBounds(104, 146, 243, 19);
		panel.add(txt_ngaysinh);
		
		lbl_Phone = new JLabel("Phone : \r\n");
		lbl_Phone.setBounds(10, 175, 84, 13);
		panel.add(lbl_Phone);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(104, 175, 243, 19);
		panel.add(txt_phone);
		
		lbl_kiemtra_taikhoan = new JLabel();
		lbl_kiemtra_taikhoan.setForeground(Color.RED);
		lbl_kiemtra_taikhoan.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbl_kiemtra_taikhoan.setBounds(104, 47, 250, 13);
		panel.add(lbl_kiemtra_taikhoan);
		
		lbl_kiemtra_matkhau = new JLabel();
		lbl_kiemtra_matkhau.setForeground(Color.RED);
		lbl_kiemtra_matkhau.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbl_kiemtra_matkhau.setBounds(104, 77, 250, 13);
		panel.add(lbl_kiemtra_matkhau);
		
		lbl_kiemtra_hoten =  new JLabel();
		lbl_kiemtra_hoten.setForeground(Color.RED);
		lbl_kiemtra_hoten.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbl_kiemtra_hoten.setBounds(104, 106, 250, 13);
		panel.add(lbl_kiemtra_hoten);
		
		lbl_kiemtra_Email = new JLabel();
		lbl_kiemtra_Email.setForeground(Color.RED);
		lbl_kiemtra_Email.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbl_kiemtra_Email.setBounds(104, 133, 250, 13);
		panel.add(lbl_kiemtra_Email);
		
		lbl_kiemtra_ngaysinh = new JLabel();
		lbl_kiemtra_ngaysinh.setForeground(Color.RED);
		lbl_kiemtra_ngaysinh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbl_kiemtra_ngaysinh.setBounds(104, 162, 250, 13);
		panel.add(lbl_kiemtra_ngaysinh);
		
		lbl_kiemtra_phone = new JLabel();
		lbl_kiemtra_phone.setForeground(Color.RED);
		lbl_kiemtra_phone.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbl_kiemtra_phone.setBounds(104, 193, 250, 13);
		panel.add(lbl_kiemtra_phone);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(384, 10, 417, 216);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txt_tim = new JTextField();
		txt_tim.setColumns(10);
		txt_tim.setBounds(10, 27, 287, 19);
		panel_1.add(txt_tim);
		
		btn_tim = new JButton("Tìm");
//		btn_tim.setIcon(new ImageIcon(Gui_NhanVien.class.getResource("/anh/tim2.png")));
		btn_tim.setBounds(307, 26, 100, 21);
		panel_1.add(btn_tim);
		
		btn_them = new JButton("Th\u00EAm");
		btn_them.setIcon(new ImageIcon(Gui_NhanVien.class.getResource("/anh/add1.png")));
		btn_them.setBounds(10, 56, 397, 21);
		panel_1.add(btn_them);
		
		btn_sua = new JButton("S\u1EEDa");
		btn_sua.setIcon(new ImageIcon(Gui_NhanVien.class.getResource("/anh/sua2.png")));
		btn_sua.setBounds(10, 87, 397, 21);
		panel_1.add(btn_sua);
		
		btn_xoa = new JButton("X\u00F3a");
		btn_xoa.setIcon(new ImageIcon(Gui_NhanVien.class.getResource("/anh/del.png")));
		btn_xoa.setBounds(10, 119, 397, 21);
		panel_1.add(btn_xoa);
		
		btn_luu = new JButton("L\u01B0u");
		btn_luu.setIcon(new ImageIcon(Gui_NhanVien.class.getResource("/anh/save.png")));
		btn_luu.setBounds(10, 153, 397, 21);
		panel_1.add(btn_luu);
		
		btn_huy = new JButton("H\u1EE7y");
		btn_huy.setIcon(new ImageIcon(Gui_NhanVien.class.getResource("/anh/close2.png")));
		btn_huy.setBounds(10, 184, 397, 21);
		panel_1.add(btn_huy);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 236, 791, 256);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 791, 236);
		table = new JTable();
		String title[] = {"Tài khoản", "Mật khẩu", "Họ tên", "Email", "Ngày sinh", "Phone"};
		model = new DefaultTableModel(title, 0);
		table.setModel(model);	
		scrollPane.setViewportView(table);
		panel_3.add(scrollPane);
		JPanel panel_2 = new JPanel();
		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.cyan);
		((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		JPasswordField passwordField = new JPasswordField();
		// Add data base nhân viên
		ds = dao.getAllNhanVien();
		for(NhanVien nv : ds) {
			String taikhoan = nv.getUsename();
			String matkhau = nv.getPassword();
			String hoten = nv.getHoTen();
			String email = nv.getEmail();
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String ngaysinh = df.format(nv.getNgaySinh());
			String phone = nv.getPhone();
			String data[] = {taikhoan,matkhau,hoten,email,ngaysinh,phone };
			model.addRow(data);
			// mothod addlistner()
		}
		table.getColumnModel().getColumn(1).setCellRenderer(new PasswordRenderer());
		addlistener();
		
	}
	public void addlistener() {
		btn_them.addActionListener(this);
		table.addMouseListener(this);
		btn_huy.addActionListener(this);
		btn_sua.addActionListener(this);
		btn_xoa.addActionListener(this);
		btn_tim.addActionListener(this);
	}
	public boolean Kiemtradulieu() {
		String taikhoan  = txt_taikhoan.getText();
		String test_taikhoan = "[a-z0-9]{6,8}";
		if(taikhoan.equals("")) {
			lbl_kiemtra_taikhoan.setText("* Tài khoản không được rỗng !");
			return false;
		}else if(!taikhoan.matches(test_taikhoan)) {
			lbl_kiemtra_taikhoan.setText("Lỗi tài khoản !");
			return false;
		}else if(taikhoan.matches(test_taikhoan)) {
			lbl_kiemtra_taikhoan.setText("");
			
		}
//		String matkhau = txt_matkhau.getText();
//		Password must contain at least one digit [0-9].
//		Password must contain at least one lowercase Latin character [a-z].
//		Password must contain at least one uppercase Latin character [A-Z].
//		Password must contain at least one special character like ! @ # & ( ).
//		Password must contain a length of at least 8 characters and a maximum of 20 characters.
//		String test_matkhau = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
//		if(matkhau.equals("")) {
//			lbl_kiemtra_matkhau.setText("* Mật khẩu không được rỗng !");
//			return false;
//		}else if(!taikhoan.matches(test_matkhau)) {
//			lbl_kiemtra_matkhau.setText("Lỗi mật khẩu");
//			return false;
//		}else if(taikhoan.matches(test_matkhau)) {
//			lbl_kiemtra_matkhau.setText("");
//		}
		String hoten = txt_hoten.getText();
		String test_hoten = "\\p{L}+(\\s\\p{L}+){1,}";
		if(hoten.equals("")) {
			lbl_kiemtra_hoten.setText("* Tên không được rỗng !");
			return false;
		}else if(!hoten.matches(test_hoten)) {
			lbl_kiemtra_hoten.setText("* Lỗi họ tên !");
			return false;
		}else if(hoten.matches(test_hoten)) {
			lbl_kiemtra_hoten.setText("");
		}
		String email = txt_email.getText();
		String test_email = "[0-9a-zA-Z]+(@gmail.com)";
		if(email.equals("")) {
			lbl_kiemtra_Email.setText("* Email không được rỗng !");
			return false;
		}else if(!email.matches(test_email)) {
			lbl_kiemtra_Email.setText("* Lỗi Email !");
			return false;
		}else if(email.matches(test_email)) {
			lbl_kiemtra_Email.setText("");
			
		}
		String ngay = txt_ngaysinh.getText();
		String test_ngaysinh = "([0-2][1-9]|30)-(0[1-9]||1[0-2])-(19[8|9][0-9]||200[0-9])";
		if(ngay.equals("")) {
			lbl_kiemtra_ngaysinh.setText("* Ngày không được rỗng !");
			return false;
		}else if(!ngay.matches(test_ngaysinh)) {
			lbl_kiemtra_ngaysinh.setText("* Lỗi Ngày !");
			return false;
		}else if(ngay.matches(test_ngaysinh)) {
			lbl_kiemtra_ngaysinh.setText("");
			
		}
		String phone= txt_phone.getText();
		String test_phone = "0[9|3|2][0-9]{8}";
		if(phone.equals("")) {
			lbl_kiemtra_phone.setText("* Phone không được rỗng !");
			return false;
		}else if(!phone.matches(test_phone)) {
			lbl_kiemtra_phone.setText("* Lỗi Phone !");
			return false;
		}else if(phone.matches(test_phone)) {
			lbl_kiemtra_phone.setText("");
			
		}
		return true;
		
	}
	 public NhanVien timtheoma(String ma) {
	    	for(NhanVien nv : ds) {
	    		if(nv.getUsename().equalsIgnoreCase(ma)) {
	    			return nv;
	    		}
	    	}
	    	return null;
	    }
 
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		Object a =e.getSource();
		
		// TODO Auto-generated method stub
		if(a.equals(showHide_password)) {
		  if (showHide_password.isSelected()) {
			  txt_matkhau.setEchoChar('\u0000');
			  showHide_password.setText("Hide");	  
	        } else if(showHide_password.getText().equals("Hide")) {
	        	txt_matkhau.setEchoChar('*');
	        	showHide_password.setText("Show");	
	        }
	    }else if(a.equals(btn_them)) {
	    	themvaodatabase();
	    	
	    }else if(a.equals(btn_huy)) {
	    	xoarong();
	    }else if (a.equals(btn_sua)) {
	    	sua();
	    }else if(a.equals(btn_xoa)) {
	    	xoa();
	    	xoarong();
	    }else if(a.equals(btn_tim)) {
	        tim();
	    }
		}
	
	public void themvaodatabase() {
		if(Kiemtradulieu()) {
		NhanVien nv = new NhanVien();
    	nv.setUsename(txt_taikhoan.getText());
    	nv.setPassword(txt_matkhau.getText());
    	nv.setHoTen(txt_hoten.getText());
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	try {
			nv.setNgaySinh(dateFormat.parse(txt_ngaysinh.getText()));
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
    	nv.setEmail(txt_email.getText());
        nv.setPhone(txt_phone.getText());
        ds.add(nv);
        if(dao.addNhanVien(nv)) {
        	JOptionPane.showMessageDialog(this, "Thêm thành công");
        }else {
        	JOptionPane.showMessageDialog(this, "Trùng mã");
        }
        showResult();
        }
	}
	public void showResult() {
		NhanVien nv = ds.get(ds.size()-1);
		String user = txt_taikhoan.getText();
		String mk = txt_matkhau.getText();
		String hoten = txt_hoten.getText();
		String email = txt_email.getText();
		String ngaysinh = txt_ngaysinh.getText();
		String phone  = txt_phone.getText();
		String data[] = {user, mk,hoten, email, ngaysinh,phone};
		model.addRow(data);
	}
    public void xoarong() {
    	txt_email.setText(null);
    	txt_taikhoan.setText(null);
    	txt_matkhau.setText(null);
    	txt_phone.setText(null);
    	txt_hoten.setText(null);
    	txt_ngaysinh.setText(null);
    	txt_taikhoan.setEditable(true);
    	table.clearSelection();
    }
    public void sua() {
    	int pos = table.getSelectedRow();
    	
    	if(JOptionPane.showConfirmDialog(this, "Bạn có chắc muôn sửa thông tin không", "Thông báo", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
    	model.removeRow(pos);
    	NhanVien nv= ds.get(pos);
    	nv.setPassword(txt_matkhau.getText());
    	nv.setHoTen(txt_hoten.getText());
    	nv.setEmail(txt_email.getText());
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	try {
			nv.setNgaySinh(dateFormat.parse(txt_ngaysinh.getText()));
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
    	nv.setPhone(txt_phone.getText());
    	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String ngaysinh = df.format(nv.getNgaySinh());
    	model.insertRow(pos, new Object[] {nv.getUsename(), nv.getPassword(), nv.getHoTen(), nv.getEmail(), ngaysinh, nv.getPhone()});
    	if(dao.updateNhanVien(nv)) {
    		JOptionPane.showMessageDialog(this, "Sửa thành công !");
    	}else {
    		JOptionPane.showMessageDialog(this, "Sửa không được !");
    	}
    }
    }
    public void xoa() {
    	int pos = table.getSelectedRow();
    	NhanVien nv = ds.get(pos);
    	if(JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa dòng này không !", "Thông báo !", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
    		model.removeRow(pos);
    		ds.remove(nv);
    		if(dao.deleteNhanVien(nv.getUsename())) {
            	JOptionPane.showMessageDialog(this, "Xóa thành công");
            }else {
            	JOptionPane.showMessageDialog(this, "Trùng mã");
            }
    	}
    }
    public void xoaHetDuLieuTrenModel() {
    	DefaultTableModel dm = (DefaultTableModel) table.getModel();
    	dm.setRowCount(0);
    }
    public void showNhanVien(NhanVien nv) {
    	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    	String ngaysinh = df.format(nv.getNgaySinh());
    	model.addRow(new Object[] {nv.getUsename(), nv.getPassword(),nv.getHoTen(), nv.getEmail(), ngaysinh, nv.getPhone()});
    }
    public void resetTable() {
    	for(NhanVien nv: ds) {
    	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    	String ngaysinh = df.format(nv.getNgaySinh());
    	String data[] = {nv.getUsename(), nv.getPassword(), nv.getHoTen(), nv.getEmail(), ngaysinh, nv.getPhone()};
    	model.addRow(data);}
    }
   
    public void tim() {
       	String tim = txt_tim.getText();
    	if(!tim.equals("")) {
    		if(btn_tim.getText().equalsIgnoreCase("Tìm")) {
    			NhanVien nv = timtheoma(tim);
    			if(nv == null) {
    				JOptionPane.showMessageDialog(this, "Không tìm thấy !");
    			}else {
    				xoaHetDuLieuTrenModel();
    				showNhanVien(nv);
    				btn_tim.setText("Thoát");
    			}
    		}else if(btn_tim.getText().equalsIgnoreCase("Thoát")){
    			txt_tim.setText(null);
    			xoarong();
    			xoaHetDuLieuTrenModel();
    			resetTable();
    			btn_tim.setText("Tìm");
    		}
    	}else {
    		JOptionPane.showMessageDialog(this, "Hãy nhập user cần tìm !");
    	}
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int pos = table.getSelectedRow();
		txt_taikhoan.setText((String) model.getValueAt(pos, 0));
		txt_matkhau.setText((String) model.getValueAt(pos, 1));
		txt_hoten.setText((String) model.getValueAt(pos, 2));
		txt_email.setText((String) model.getValueAt(pos, 3));
		txt_ngaysinh.setText((String) model.getValueAt(pos, 4));
		txt_phone.setText((String) model.getValueAt(pos, 5));
		txt_taikhoan.setEditable(false);
		
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

