package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import entity.CT_HoaDon;
import entity.ListCT_HoaDon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class CT_HoaDonview extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtmaCTHD;
	private JTextField txtmaHD;
	private JTextField txtmaSP;
	private JTextField txtSoluong;
	private JTextField textThanhtien;
	private JTextField txtTim;
	private DefaultTableModel model;
	private JButton btThem, btXoa,btXoaTrang,btLuu, btTim;
	private ListCT_HoaDon ls;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CT_HoaDonview frame = new CT_HoaDonview();
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
	public CT_HoaDonview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chi tiết Hóa Đơn");
		lblNewLabel.setBounds(337, 10, 223, 33);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setForeground(new Color(0, 255, 255));
		panel_1.setBounds(10, 63, 963, 167);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbmaCTHD = new JLabel("Mã chi tiết Hóa Đơn");
		lbmaCTHD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmaCTHD.setBounds(10, 16, 126, 24);
		panel_1.add(lbmaCTHD);
		
		txtmaCTHD = new JTextField();
		txtmaCTHD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtmaCTHD.setBounds(156, 15, 214, 32);
		panel_1.add(txtmaCTHD);
		txtmaCTHD.setColumns(10);
		
		JLabel lbmaHD = new JLabel("Mã hóa đơn");
		lbmaHD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmaHD.setBounds(441, 17, 89, 23);
		panel_1.add(lbmaHD);
		
		txtmaHD = new JTextField();
		txtmaHD.setBounds(574, 16, 231, 31);
		panel_1.add(txtmaHD);
		txtmaHD.setColumns(10);
		
		JLabel lbmaSP = new JLabel("Mã Sản Phẩm");
		lbmaSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbmaSP.setBounds(10, 67, 126, 32);
		panel_1.add(lbmaSP);
		
		txtmaSP = new JTextField();
		txtmaSP.setBounds(156, 70, 214, 32);
		panel_1.add(txtmaSP);
		txtmaSP.setColumns(10);
		
		JLabel lbSoluong = new JLabel("Số lượng");
		lbSoluong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbSoluong.setBounds(441, 66, 89, 35);
		panel_1.add(lbSoluong);
		
		txtSoluong = new JTextField();
		txtSoluong.setBounds(574, 70, 231, 32);
		panel_1.add(txtSoluong);
		txtSoluong.setColumns(10);
		
		JLabel lbThanhtien = new JLabel("Thành tiền");
		lbThanhtien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbThanhtien.setBounds(10, 119, 126, 32);
		panel_1.add(lbThanhtien);
		
		textThanhtien = new JTextField();
		textThanhtien.setBounds(156, 119, 652, 32);
		panel_1.add(textThanhtien);
		textThanhtien.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 254, 963, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbTim = new JLabel("Nhập mã CT Hóa Đơn cần tìm");
		lbTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTim.setBounds(10, 10, 191, 25);
		panel.add(lbTim);
		
		txtTim = new JTextField();
		txtTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTim.setBounds(198, 7, 207, 35);
		panel.add(txtTim);
		txtTim.setColumns(10);
		
		 btTim = new JButton("Tìm");
		btTim.setBounds(448, 14, 85, 21);
		panel.add(btTim);
		
		 btThem = new JButton("Thêm");
		btThem.setBounds(554, 14, 85, 21);
		panel.add(btThem);
		
		 btXoa = new JButton("Xóa");
		btXoa.setBounds(669, 14, 85, 21);
		panel.add(btXoa);
		
		 btXoaTrang = new JButton("Xóa Trắng");
		btXoaTrang.setBounds(773, 14, 85, 21);
		panel.add(btXoaTrang);
		
		 btLuu = new JButton("Lưu");
		btLuu.setBounds(868, 14, 85, 21);
		panel.add(btLuu);
		model = new DefaultTableModel();
		table = new JTable (model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model.addColumn("Mã chi tiết HD");
		model.addColumn("Mã hóa đơn");
		model.addColumn("Mã sản phấm");
		model.addColumn("Số lượng");
		model.addColumn("Thành tiền");
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 309, 963, 134);
		contentPane.add(scrollPane);
		btTim.addActionListener(this);
		btThem.addActionListener(this);
		btXoa.addActionListener(this);
		btXoaTrang.addActionListener(this);
		btLuu.addActionListener(this);
	}

	private void timMa() {
		String maTim = txtTim.getText();
		//System.out.println(maTim);
		if(maTim !=null && maTim.trim().length() > 0) {
			try {
				String maCTHD = maTim;
				CT_HoaDon ct= ls.timHD(maCTHD);
				//System.out.println(s);
				if(ct !=null) {
					xoadulieu();
					model.addRow(new Object[] {ct.getMaCTHD(), ct.getMaHD(), ct.getMaLoai(), ct.getSoluong(), ct.getThanhtien()});
				}
				else {
					JOptionPane.showMessageDialog(null, "KhÃ´ng tÃ¬m tháº¥y!");
					return;
				}
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "MÃ£ khÃ´ng Ä‘Æ°á»£c trá»‘ng!");
				txtTim.selectAll();
				txtTim.requestFocus();
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
		if(o.equals(btThem)) {
			String maCTHD = txtmaCTHD.getText();
			String maHD = txtmaHD.getText();
			String maSP = txtmaSP.getText();
			int sl = Integer.parseInt(txtSoluong.getText());
			double tt = Double.parseDouble(textThanhtien.getText());
			CT_HoaDon ct = new CT_HoaDon(maCTHD, maHD, maSP, sl, tt);
			if(!ls.themCTHD(ct)){
				JOptionPane.showMessageDialog(this, "MÃ£ trÃ¹ng!");
			} else
			{
			   model.addRow(new Object[] {ct.getMaCTHD(), ct.getMaHD(), ct.getMaLoai(), ct.getSoluong(), String.format("%s", ct.getThanhtien())});
			}
		}
		if(o.equals(btXoa)) {
			int r = table.getSelectedRow();
			if(ls.xoaCTHD(r)) {
				model.removeRow(r);
			}
		}
		if(o.equals(btXoaTrang)) {
			txtmaCTHD.setText("");
			txtmaHD.setText("");
			txtmaSP.setText("");
			txtSoluong.setText("");
			textThanhtien.setText("");
			txtmaCTHD.requestFocus();
		}
		if(o.equals(btTim)) {
			timMa();
		}
	}
}


