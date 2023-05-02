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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import connectDB.ConnectDB;

import entity.HoaDon;


import javax.swing.JButton;

public class HoaDonview extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmaHD;
	private JTextField txtmaKH;
	private JTextField txttongtien;
	private JTextField txtusername;
	private JComboBox comboBox;
	private JTextField txtTim;
	private DefaultTableModel model;
	private DAO_HoaDon daoHD;		
	private JTable table;
	private JButton btThem, btXoa,btXoaTrang,btLuu,btclose, btTim;
	private JTextField txtmaXe;
	private JTextField txtsoluong;
	private ArrayList<HoaDon> ds;
	private HoaDon hd;
	private JTextField txtMess;
	private JTextField txtngay;
	private JButton btThongKe;
	private thongKe_view UIThongKe;

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
	 * @throws SQLException 
	 */
	public HoaDonview() throws SQLException {
		ConnectDB.getInstance().connect();
		daoHD = new DAO_HoaDon();
		ds = new ArrayList<HoaDon>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 732);
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
		
		JLabel lbmhd = new JLabel("MÃ£ hÃ³a Ä‘Æ¡n");
		lbmhd.setBounds(10, 16, 88, 22);
		lbmhd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmhd.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lbmhd);
		
		txtmaHD = new JTextField();
		txtmaHD.setBounds(217, 10, 199, 33);
		panel.add(txtmaHD);
		txtmaHD.setColumns(10);
		
		JLabel lbmkh = new JLabel("MÃ£ khÃ¡ch hÃ ng");
		lbmkh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmkh.setBounds(513, 10, 101, 29);
		panel.add(lbmkh);
		
		txtmaKH = new JTextField();
		txtmaKH.setBounds(718, 11, 213, 32);
		panel.add(txtmaKH);
		txtmaKH.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NgÃ y láº­p hÃ³a Ä‘Æ¡n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(10, 56, 112, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lbhttt = new JLabel("HÃ¬nh thá»©c Thanh ToÃ¡n");
		lbhttt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbhttt.setBounds(513, 49, 156, 29);
		panel.add(lbhttt);
		
		comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tiá»�n máº·t", "Chuyá»ƒn khoáº£n"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(718, 53, 213, 25);
		panel.add(comboBox);
		
		JLabel lbtongtien = new JLabel("Tá»•ng tiá»�n");
		lbtongtien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbtongtien.setBounds(513, 169, 101, 22);
		panel.add(lbtongtien);
		
		txttongtien = new JTextField();
		txttongtien.setBounds(718, 166, 213, 32);
		panel.add(txttongtien);
		txttongtien.setColumns(10);
		
		JLabel lbNV = new JLabel("NhÃ¢n ViÃªn");
		lbNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNV.setBounds(513, 102, 134, 22);
		panel.add(lbNV);
		
		txtusername = new JTextField();
		txtusername.setBounds(718, 109, 213, 32);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lbmaXe = new JLabel("MÃ£ Xe");
		lbmaXe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmaXe.setBounds(10, 109, 88, 13);
		panel.add(lbmaXe);
		
		txtmaXe = new JTextField();
		txtmaXe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtmaXe.setBounds(217, 106, 199, 33);
		panel.add(txtmaXe);
		txtmaXe.setColumns(10);
		
		JLabel lbsoluong = new JLabel("Sá»‘ lÆ°á»£ng");
		lbsoluong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbsoluong.setBounds(10, 169, 112, 22);
		panel.add(lbsoluong);
		
		txtsoluong = new JTextField();
		txtsoluong.setBounds(217, 166, 199, 33);
		panel.add(txtsoluong);
		txtsoluong.setColumns(10);
		
		txtMess = new JTextField();
		txtMess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMess.setBounds(10, 231, 400, 33);
		panel.add(txtMess);
		txtMess.setColumns(10);
		txtMess.setEditable(false);
		txtMess.setBorder(null);
		txtMess.setBackground(new Color(128, 255, 255));
		txtMess.setForeground(Color.RED);
		
		txtngay = new JTextField();
		txtngay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtngay.setBounds(217, 60, 199, 36);
		panel.add(txtngay);
		txtngay.setColumns(10);
		
		
		JLabel lblNewLabel_7 = new JLabel("HÃ³a Ä�Æ¡n");
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_7.setBounds(441, 10, 144, 36);
		contentPane.add(lblNewLabel_7);
		
	    btclose = new JButton("ThoÃ¡t");
		btclose.setForeground(new Color(255, 0, 0));
		btclose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btclose.setBounds(906, 653, 99, 32);
		contentPane.add(btclose);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model.addColumn("MÃ£ hÃ³a Ä‘Æ¡n");
		model.addColumn("NgÃ y");
		model.addColumn("MÃ£ khÃ¡ch hÃ ng");
		model.addColumn("MÃ£ Loáº¡i Xe");
		model.addColumn("Sá»‘ lÆ°á»£ng");
		model.addColumn("HÃ¬nh thá»©c TT");
		model.addColumn("Tá»•ng tiá»�n");
		model.addColumn("NhÃ¢n viÃªn");
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 480, 995, 163);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(10, 406, 995, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbtim = new JLabel("Nháº­p mÃ£ hÃ³a Ä‘Æ¡n cáº§n tÃ¬m");
		lbtim.setBounds(10, 25, 147, 16);
		panel_1.add(lbtim);
		lbtim.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtTim = new JTextField();
		txtTim.setBounds(167, 21, 172, 27);
		panel_1.add(txtTim);
		txtTim.setColumns(10);
		
	 btTim = new JButton("TÃ¬m");
		btTim.setBounds(361, 22, 68, 21);
		panel_1.add(btTim);
		btTim.setForeground(new Color(0, 0, 0));
		btTim.setBackground(new Color(255, 255, 255));
		btTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btThem = new JButton("ThÃªm");
		btThem.setBounds(488, 22, 105, 21);
		panel_1.add(btThem);
		btThem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btXoa = new JButton("XÃ³a");
		btXoa.setBounds(629, 22, 85, 21);
		panel_1.add(btXoa);
		btXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btXoaTrang = new JButton("XÃ³a tráº¯ng");
		btXoaTrang.setBounds(754, 21, 105, 20);
		panel_1.add(btXoaTrang);
		btXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		 btLuu = new JButton("LÆ°u");
		btLuu.setBounds(900, 22, 85, 21);
		panel_1.add(btLuu);
		btLuu.setEnabled(false);
		btLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btThongKe = new JButton("Thá»‘ng kÃª hÃ³a Ä‘Æ¡n");
		btThongKe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btThongKe.setForeground(new Color(255, 0, 0));
		btThongKe.setBounds(140, 364, 158, 31);
		contentPane.add(btThongKe);
		
		btLuu.addActionListener(this);
		btXoaTrang.addActionListener(this);
		btXoa.addActionListener(this);
		btThem.addActionListener(this);
		btTim.addActionListener(this);
		btclose.addActionListener(this);
	    table.addMouseListener(this);
		daoHD = new DAO_HoaDon();
		btThongKe.addActionListener(this);
		loadList();
      
	}
	
	
	public void loadList() throws SQLException {
		ds = daoHD.getAllHoaDons();
		model.getDataVector().removeAllElements(); 
		model.fireTableDataChanged();
		load(ds);
	}
	public void load(ArrayList<HoaDon> ds) throws SQLException {
//		for(HoaDon hd : daoHD.getAllHoaDons()) {
//		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//			Object[] rowData = {
//					hd.getMaHD(),df.format(hd.getNgay()), hd.getMaKH(), hd.getTongtien(), hd.getUsername()
//			}; model.addRow(rowData);
//		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btclose)) {
			int mes = JOptionPane.showConfirmDialog(this, "Báº¡n cÃ³ muá»‘n thoÃ¡t?", "Exit", JOptionPane.YES_NO_OPTION);
			if(mes == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		else if(o.equals(btXoaTrang)) {
			xoaTrang();
		}else if(o.equals(btThem)) {
			if(btThem.getText().equalsIgnoreCase("ThÃªm"))
			{
				
				txtmaHD.requestFocus();
				btThem.setText("Há»§y");	
				btLuu.setEnabled(true);
				btXoa.setEnabled(false);
			}else if(btThem.getText().equalsIgnoreCase("Há»§y")) {
				btThem.setText("ThÃªm");
				btLuu.setEnabled(false);
				btXoa.setEnabled(true);
			}}
//		}else if(o.equals(btLuu)) {
//			
//			try {
//				if(valiData()) {
//					String maHoaDon = txtmaHD.getText();
//					String ngay = txtngay.getText();
//					String maKH = txtmaKH.getText();
//					String maLoaiXe = txtmaXe.getText();
//					String sl = txtsoluong.getText();
//					String httt = comboBox.getSelectedItem().toString();
//					String tong = txttongtien.getText();
//					String use = txtusername.getText();
//					
//					DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
////					HoaDon hd = new HoaDon(maHoaDon, dateFormat.parse(ngay), maKH, maLoaiXe, Integer.parseInt(sl), httt, Long.parseLong(tong), use);
//					daoHD.addHD(hd);
//					String []row = {maHoaDon,ngay,maKH,maLoaiXe,sl,httt,tong,use};
//					model.addRow(row);
//					JOptionPane.showMessageDialog(null, "Them thÃ nh cÃ´ng");
//				}
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//			
//			btThem.setText("ThÃªm");
//			btXoa.setEnabled(true);
//			btLuu.setEnabled(false);
////		}else if(o.equals(btXoa)) {
////			try {
//				int r = table.getSelectedRow();
//				if(r!=-1) {
//					String maHD = model.getValueAt(r, 0).toString();
//					int tb = JOptionPane.showConfirmDialog(this, "Báº¡n cÃ³ cháº¯c muá»‘n xÃ³a hÃ³a Ä‘Æ¡n nÃ y","Delete",JOptionPane.YES_NO_OPTION);
//					if(tb == JOptionPane.YES_OPTION) {
//						DAO_HoaDon.delete(maHD);
//						model.removeRow(r);
//						xoaTrang();
//						JOptionPane.showMessageDialog(this, "XÃ³a thÃ nh cÃ´ng");
//					}else {
//						JOptionPane.showMessageDialog(this, "ChÆ°a chá»�n dÃ²ng cáº§n xÃ³a");
//					}
////				}
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}else if(o.equals(btThongKe)) {
//			UIThongKe = new thongKe_view();
//			UIThongKe.setVisible(true);
//		}
			
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
			showMess("MÃ£ loáº¡i khÃ´ng Ä‘Æ°á»£c Ä‘á»ƒ trá»‘ng", txtmaHD);
			return false;
		} else if(ngay.equals("")) {
			showMess("NgÃ y khÃ´ng Ä‘Æ°á»£c rá»—ng", txtngay);
			return false;
		}else if(maKH.equals("")) {
			showMess("MÃ£ khÃ¡ch hÃ ng khÃ´ng Ä‘Æ°á»£c rá»—ng", txtmaKH);
			return false;
		}else if(maXe.equals("")) {
			showMess("MÃ£ xe khÃ´ng Ä‘Æ°á»£c rá»—ng", txtmaXe);
			return false;
		}else if(sl.equals("")) {
			showMess("Sá»‘ lÆ°á»£ng khÃ´ng Ä‘Æ°á»£c rá»—ng", txtsoluong);
			return false;
		}else if(tongtien.equals("")) {
			showMess("Tá»•ng tiá»�n khÃ´ng Ä‘Æ°á»£c rá»—ng", txttongtien);
			return false;
		}else if(username.equals("")) {
			showMess("NhÃ¢n viÃªn khÃ´ng Ä‘Æ°á»£c rá»—ng", txtusername);
			return false;
		}else {
			if(!maHD.matches("^[a-zA-z0-9]+$")) {
				showMess("MÃ£ hÃ³a Ä‘Æ¡n khÃ´ng chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t vÃ  khoáº£ng tráº¯ng", txtmaHD);
				return false;
			} else if(!ngay.matches("([0-2][1-9]|30)-(0[1-9]||1[0-2])-(19[8|9][0-9]||20[0-9]{2})")) {
				showMess("NgÃ y sai", txtngay);
				return false;
			}else if(!maKH.matches("^[a-zA-z0-9]+$")) {
				showMess("MÃ£ khÃ¡ch hÃ ng khÃ´ng chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t vÃ  khoáº£ng tráº¯ng", txtmaKH);
				return false;
			} else if(!maXe.matches("^[a-zA-z0-9]+$")) {
				showMess("MÃ£ Xe khÃ´ng chá»©a kÃ­ tá»± Ä‘áº·c biá»‡t vÃ  khoáº£ng tráº¯ng", txtmaXe);
				return false;
			} else if(!sl.matches("^[0-9]+$") && Integer.parseInt(txtsoluong.getText().trim())<0) {
				showMess("Sá»‘ lÆ°á»£ng pháº£i lÃ  sá»‘ vÃ  lÃ  sá»‘ dÆ°Æ¡ng", txtsoluong);
				return false;
			}else if(!tongtien.matches("^[0-9]+$") && Double.parseDouble(txttongtien.getText().trim())<0) {
				showMess("Tiá»�n pháº£i lÃ  sá»‘ vÃ  lÃ  sá»‘ dÆ°Æ¡ng", txttongtien);
				return false;
			}else if(!username.matches("[A-ZÃ€-á»¸]+[A-Za-zÃ€-á»¸Ã -á»¹]\s")) {
				showMess("Chá»¯ Ä‘áº§u viáº¿t hoa, khÃ´ng lÃ  khoáº£ng tráº¯ng", txtusername);
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
