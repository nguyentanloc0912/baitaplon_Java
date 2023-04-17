package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import model.ds_hopDong;
import model.hopDong_model;

import javax.swing.ImageIcon;

public class HopDong extends JFrame implements ActionListener,MouseListener{

	private JPanel contentPane;
	private JTextField txtSoHD;
	private JTextField txtNgayHD;
	private JTextField txtTGBH;
	private JTextField txtTienPhaiTT;
	private JTextField txtTienDaTra;
	private JTextField txtMaNV;
	private JTextField txtNgayTraLan;
	private JTextField txtTenKH;
	private JTextField txtSDT;
	private JTextField txtDiaChi;
	private JTable table;
	private DefaultTableModel model;
	private JTextField txtTimHD;
	private ds_hopDong ds;
	private JRadioButton rdbtnTraGop;
	private JRadioButton rdbtnKhongTraGop;
	private JComboBox comboBox;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnCapNhat;
	private JButton btnXoaTrang;
	private JButton btnThoat;
	private JButton btnLuu;
	private JLabel lblTim;
	private JButton btnTim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HopDong frame = new HopDong();
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
	public HopDong() {
		ds = new ds_hopDong();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Hợp đôngf");
		setBounds(100, 100, 1000, 609);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Quản lý hợp đồng");
		label.setBounds(317, 0, 268, 49);
		label.setFont(new Font("Arial", Font.BOLD, 25));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin h\u1EE3p \u0111\u1ED3ng", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 55, 673, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSoHD = new JLabel("Số hợp đồng:");
		lblSoHD.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoHD.setBounds(10, 18, 92, 27);
		panel.add(lblSoHD);
		
		JLabel lblNgayHD = new JLabel("Ngày hợp đồng:");
		lblNgayHD.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNgayHD.setBounds(10, 55, 107, 30);
		panel.add(lblNgayHD);
		
		JLabel lblThGianBH = new JLabel("Thời gian bảo hành:");
		lblThGianBH.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThGianBH.setBounds(363, 59, 128, 23);
		panel.add(lblThGianBH);
		
		JLabel lblTienPhaiTT = new JLabel("Tiền phải thanh toán:");
		lblTienPhaiTT.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTienPhaiTT.setBounds(10, 95, 145, 24);
		panel.add(lblTienPhaiTT);
		
		JLabel lblSoTienDaTra = new JLabel("Số tiền đã trả:");
		lblSoTienDaTra.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoTienDaTra.setBounds(363, 102, 92, 13);
		panel.add(lblSoTienDaTra);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên lập hợp đồng:");
		lblMaNV.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMaNV.setBounds(10, 129, 176, 25);
		panel.add(lblMaNV);
		
		JLabel lblMuaTraGop = new JLabel("Mua trả góp:");
		lblMuaTraGop.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMuaTraGop.setBounds(10, 164, 92, 24);
		panel.add(lblMuaTraGop);
		
		rdbtnTraGop = new JRadioButton("Trả góp");
		rdbtnTraGop.setFont(new Font("Tahoma", Font.ITALIC, 12));
		rdbtnTraGop.setBounds(122, 160, 84, 30);
		panel.add(rdbtnTraGop);
		
		rdbtnKhongTraGop = new JRadioButton("Không trả góp");
		rdbtnKhongTraGop.setFont(new Font("Tahoma", Font.ITALIC, 12));
		rdbtnKhongTraGop.setBounds(222, 161, 114, 30);
		panel.add(rdbtnKhongTraGop);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTraGop);
		group.add(rdbtnKhongTraGop);
		
		comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ngày trả lần 1", "Ngày trả lần 2", "Ngày trả lần 3"}));
		comboBox.setBounds(363, 167, 120, 21);
		panel.add(comboBox);
		
		txtSoHD = new JTextField();
		txtSoHD.setBounds(112, 23, 241, 19);
		panel.add(txtSoHD);
		txtSoHD.setColumns(10);
	
		txtNgayHD = new JTextField();
		txtNgayHD.setBounds(112, 60, 241, 19);
		panel.add(txtNgayHD);
		txtNgayHD.setColumns(10);
		
		txtTGBH = new JTextField();
		txtTGBH.setBounds(492,60,175,19);
		panel.add(txtTGBH);
		txtTGBH.setColumns(10);
		
		txtTienPhaiTT = new JTextField();
		txtTienPhaiTT.setBounds(150, 100, 203, 19);
		panel.add(txtTienPhaiTT);
		txtTienPhaiTT.setColumns(10);
		
		txtTienDaTra = new JTextField();
		txtTienDaTra.setBounds(492, 100, 175, 19);
		panel.add(txtTienDaTra);
		txtTienDaTra.setColumns(10);
		
		txtMaNV = new JTextField();
		txtMaNV.setBounds(196, 134, 471, 19);
		panel.add(txtMaNV);
		txtMaNV.setColumns(10);
		
		txtNgayTraLan = new JTextField();
		txtNgayTraLan.setEnabled(false);
		txtNgayTraLan.setBounds(493, 169, 175, 19);
		panel.add(txtNgayTraLan);
		txtNgayTraLan.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 274, 673, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng:");
		lblTenKH.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenKH.setBounds(10, 21, 120, 24);
		panel_1.add(lblTenKH);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ:");
		lblDiaChi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiaChi.setBounds(10, 55, 120, 24);
		panel_1.add(lblDiaChi);
		
		JLabel lblSDT = new JLabel("Số điện thoại:");
		lblSDT.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSDT.setBounds(386, 21, 99, 24);
		panel_1.add(lblSDT);
		
		txtTenKH = new JTextField();
		txtTenKH.setBounds(128, 25, 226, 19);
		panel_1.add(txtTenKH);
		txtTenKH.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(128, 59, 539, 19);
		panel_1.add(txtSDT);
		txtSDT.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(495, 25, 172, 19);
		panel_1.add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(693, 55, 283, 308);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnThem = new JButton("Thêm khách hàng");
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThem.setBounds(10, 89, 263, 33);
		panel_2.add(btnThem);
		
		btnXoa = new JButton("Xóa khách hàng");
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXoa.setBounds(10, 132, 263, 33);
		panel_2.add(btnXoa);
		
		btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCapNhat.setBounds(10, 222, 263, 33);
		panel_2.add(btnCapNhat);
		
		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXoaTrang.setBounds(10, 179, 263, 33);
		panel_2.add(btnXoaTrang);
		
		btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThoat.setBounds(146, 265, 127, 33);
		panel_2.add(btnThoat);
		
		btnLuu = new JButton("Lưu");
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLuu.setBounds(10, 265, 126, 33);
		panel_2.add(btnLuu);
		
		lblTim = new JLabel("Nhập số hợp đồng cần tìm:");
		lblTim.setBounds(10, 22, 186, 24);
		panel_2.add(lblTim);
		lblTim.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtTimHD = new JTextField();
		txtTimHD.setBounds(10, 52, 159, 27);
		panel_2.add(txtTimHD);
		txtTimHD.setColumns(10);
		
		btnTim = new JButton("Tìm");
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTim.setBounds(179, 48, 94, 33);
		panel_2.add(btnTim);
		
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Số hợp đồng");
		model.addColumn("Ngày hợp đồng");
		model.addColumn("Thời gian BH");
		model.addColumn("Tiền phải thanh toán");
		model.addColumn("Số tiền đã trả");
		model.addColumn("Mã nhân viên");
		model.addColumn("Mua trả góp");
		model.addColumn("Lần trả");
		model.addColumn("Ngày trả");
		model.addColumn("Tên khách hàng");
		model.addColumn("Số điện thoại");
		model.addColumn("Địa chỉ");
		
		TableColumn tableColumn = new TableColumn();
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(110);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 373, 966, 189);
		contentPane.add(scrollPane);
		
		rdbtnTraGop.addActionListener(this);
		rdbtnKhongTraGop.addActionListener(this);
		btnThem.addActionListener(this);
		btnLuu.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o =e.getSource();
		if(o.equals(rdbtnTraGop)) {
			comboBox.setEnabled(true);
			txtNgayTraLan.setEnabled(true);
		}else if(o.equals(rdbtnKhongTraGop)) {
			comboBox.setEnabled(false);
			txtNgayTraLan.setEnabled(false);
		}else if(o.equals(btnThem)) {
			if(btnThem.getText().equals("Thêm khách hàng")) {
				txtSoHD.requestFocus();
				
				btnXoa.setEnabled(false);
				btnThem.setText("Hủy");
			}else {
				btnXoa.setEnabled(true);
				btnThem.setText("Thêm khách hàng");
			}
		}else if(o.equals(btnLuu)) {
			try {
				luu();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
//			xoatrang();
			this.btnThem.setText("Thêm");
			this.btnXoa.setEnabled(true);
		}
	}
	
	public void luu() throws Exception{
		String traGop= "";
		String soHD = txtSoHD.getText();
		String ngayHD = txtNgayHD.getText();
		String tGianBH = txtTGBH.getText();
		String tienPhaiTT = txtTienPhaiTT.getText();
		String tienDaTra = txtTienDaTra.getText();
		String maNV = txtMaNV.getText();
		if(rdbtnTraGop.isSelected())
			traGop = rdbtnTraGop.getText();
		else
			traGop = rdbtnKhongTraGop.getText();
		String lanTra = comboBox.getSelectedItem().toString();
		String txtNgayTra = txtNgayTraLan.getText();
		String tenKH = txtTenKH.getText();
		String sdt = txtSDT.getText();
		String dc = txtDiaChi.getText();
		
		hopDong_model hd = new hopDong_model(Integer.parseInt(soHD), ngayHD, Integer.parseInt(tGianBH), Double.parseDouble(tienPhaiTT), Double.parseDouble(tienDaTra), maNV, traGop,Integer.parseInt(lanTra), txtNgayTra, tenKH, dc, sdt);
		if(ds.themHD(hd)) {
			JOptionPane.showMessageDialog(this, "Thêm thành công");
			String []row = {soHD,ngayHD,tGianBH,tienPhaiTT,tienDaTra,maNV,traGop,lanTra,txtNgayTra,tenKH,sdt,dc};
			model.addRow(row);
		}else{
			JOptionPane.showMessageDialog(this, "Trùng số hóa đơn");
			txtSoHD.setText("");
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int vitri = table.getSelectedRow();
		hopDong_model hd = ds.getHopDong(vitri);
		txtSoHD.setText(hd.getSoDH()+"");
		txtNgayHD.setText(hd.getNgayHD()+"");
		txtTGBH.setText(hd.getTgbaohanh()+"");
		txtTienPhaiTT.setText(hd.getTienPhaiThanhToan()+"");
		txtTienDaTra.setText(hd.getTienDaTra()+"");
		txtMaNV.setText(hd.getMaNV());
		if(model.getValueAt(vitri, 6).toString().equalsIgnoreCase("Trả góp")) {
			rdbtnTraGop.setSelected(true);
			rdbtnKhongTraGop.setSelected(false);
			comboBox.getSelectedItem().toString();
			txtNgayTraLan.setText(hd.getNgayTraTien()+"");
		}else {
			rdbtnTraGop.setSelected(false);
			rdbtnKhongTraGop.setSelected(true);
		}
		txtTenKH.setText(hd.getTenKH());
		txtSDT.setText(hd.getSdt());
		txtDiaChi.setText(hd.getDiaChi());
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
