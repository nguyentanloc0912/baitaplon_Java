package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

import java.awt.ScrollPane;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.SpringLayout;
import java.sql.Date;

import dao.khachHang_DAO;
import entity.NhanVien;
import entity.PasswordRenderer;
import entity.ds_KhachHang;
import entity.khachHang_model;

import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import connectDB.ConnectDB;

public class KhachHang extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;
	private DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtDiaChi;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnTm, btnNewButton, btnXaKhchHng, btnCpNhtKhch, btnLu,
			btnHy, btnXaTrng;
	private ArrayList<khachHang_model> ds;
	private khachHang_DAO daoKH;
	private JTextField txt_maKH;
	private JTextField txt_tenkh;
	private JTextField txt_email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHang frame = new KhachHang();
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
	public KhachHang() {
		// ds = new ds_KhachHang();
		try {
			ConnectDB.getInstance().connect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Khách hàng");
		setBounds(100, 100, 941, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Label label = new Label("Thông tin khách hàng");
		label.setFont(new Font("Arial", Font.PLAIN, 25));
		label.setForeground(new Color(255, 0, 0));
		label.setBounds(335, 0, 304, 45);
		contentPane.add(label);

		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Mã khách hàng");
		model.addColumn("Tên khách hàng");
		model.addColumn("Email");
		model.addColumn("Địa chỉ");

		JScrollPane scrollPane = new JScrollPane(table,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 364, 907, 198);
		contentPane.add(scrollPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 55, 546, 291);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		Label label_1 = new Label("Nhập thông tin khách hàng");
		label_1.setForeground(new Color(0, 0, 255));
		label_1.setFont(new Font("Dialog", Font.BOLD, 16));
		label_1.setBounds(158, 10, 257, 32);
		panel_1.add(label_1);

		Label label_3 = new Label("Mã khách hàng:");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(10, 72, 136, 32);
		panel_1.add(label_3);

		Label label_4 = new Label("Tên khách hàng:");
		label_4.setFont(new Font("Dialog", Font.BOLD, 13));
		label_4.setBounds(10, 116, 136, 32);
		panel_1.add(label_4);

		Label label_6 = new Label("Địa chỉ");
		label_6.setFont(new Font("Dialog", Font.BOLD, 13));
		label_6.setBounds(10, 204, 136, 34);
		panel_1.add(label_6);

		Label label_7 = new Label("Email:");
		label_7.setFont(new Font("Dialog", Font.BOLD, 13));
		label_7.setBounds(10, 177, 136, 21);
		panel_1.add(label_7);

		txt_maKH = new JTextField();
		txt_maKH.setBounds(158, 83, 168, 19);
		panel_1.add(txt_maKH);
		txt_maKH.setColumns(10);

		txt_tenkh = new JTextField();
		txt_tenkh.setBounds(158, 129, 365, 19);
		panel_1.add(txt_tenkh);
		txt_tenkh.setColumns(10);

		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(158, 214, 365, 19);
		panel_1.add(txtDiaChi);
		txtDiaChi.setColumns(10);

		txt_email = new JTextField();
		txt_email.setBounds(158, 179, 365, 19);
		panel_1.add(txt_email);
		txt_email.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)),
				"Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		panel.setBounds(566, 55, 351, 291);
		contentPane.add(panel);
		panel.setLayout(null);

		btnNewButton = new JButton("Thêm khách hàng");
		btnNewButton.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/add1.png")));
		btnNewButton.setBounds(10, 86, 331, 32);
		panel.add(btnNewButton);

		btnXaKhchHng = new JButton("Xóa khách hàng");
		btnXaKhchHng.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/del.png")));
		btnXaKhchHng.setBounds(10, 126, 331, 32);
		panel.add(btnXaKhchHng);

		btnCpNhtKhch = new JButton("Cập nhật khách hàng");
		btnCpNhtKhch.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/sua2.png")));
		btnCpNhtKhch.setBounds(10, 210, 331, 32);
		panel.add(btnCpNhtKhch);

		btnLu = new JButton("Lưu");
		btnLu.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/save.png")));
		btnLu.setBounds(10, 252, 159, 32);
		panel.add(btnLu);

		btnHy = new JButton("Thoát");
		btnHy.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/close2.png")));
		btnHy.setBounds(179, 252, 162, 32);
		panel.add(btnHy);

		JLabel lblNewLabel = new JLabel("Nhập mã khách hàng cần tìm:");
		lblNewLabel.setBounds(10, 16, 193, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

		textField_5 = new JTextField();
		textField_5.setBounds(204, 16, 137, 24);
		panel.add(textField_5);
		textField_5.setColumns(10);

		btnTm = new JButton("Tìm khách hàng");
		btnTm.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/search.png")));
		btnTm.setBounds(10, 44, 331, 32);
		panel.add(btnTm);

		btnXaTrng = new JButton("Xóa trắng");
		btnXaTrng.setBounds(10, 168, 331, 32);
		panel.add(btnXaTrng);
		btnXaTrng.setIcon(new ImageIcon(KhachHang.class
				.getResource("/anh/refresh.png")));

		setVisible(true);
		btnCpNhtKhch.addActionListener(this);
		btnHy.addActionListener(this);
		btnLu.addActionListener(this);
		btnNewButton.addActionListener(this);
		btnTm.addActionListener(this);
		btnXaKhchHng.addActionListener(this);
		btnXaTrng.addActionListener(this);
		table.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = table.getSelectedRow();
				txt_maKH.setText(model.getValueAt(row, 0).toString());
				txt_tenkh.setText(model.getValueAt(row, 1).toString());

				txt_email.setText(model.getValueAt(row, 2).toString());
				txtDiaChi.setText(model.getValueAt(row, 3).toString());
				txt_maKH.setEditable(false);

			}
		});

		daoKH = new khachHang_DAO();
		ds = daoKH.getALLKhachHang();
		for (khachHang_model kh : ds) {
			String maKH = kh.getMaKH().trim();
			String tenKH = kh.getTenKH();
			String diachi = kh.getDiaChi();
			String email = kh.getEmail();
			String data[] = { maKH, tenKH, email, diachi };
			model.addRow(data);
		}
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnTm)) {
			tim();
		} else if (e.getSource().equals(btnNewButton)) {
			// String ma,ten,sdt,email,diachi="";
			// java.util.Date ngaysinh = null;
			// ma = textField.getText();
			// sdt = textField_2.getText();
			// ten = textField_1.getText();
			// email = textField_4.getText();
			// SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			// try {
			// ngaysinh = df.parse(textField_3.getText());
			// } catch (Exception e2) {
			// // TODO: handle exception
			// e2.printStackTrace();
			//
			// }
			//
			// khachHang_model kh = new khachHang_model(ma, ten, sdt, ngaysinh,
			// email, diachi);
			if (validation()) {
				khachHang_model kh = new khachHang_model();
				kh.setMaKH(txt_maKH.getText());
				kh.setTenKH(txt_tenkh.getText());
				kh.setEmail(txt_email.getText());
				kh.setDiaChi(txtDiaChi.getText());
				ds.add(kh);
				if (daoKH.addKH(kh)) {
					JOptionPane.showMessageDialog(this, "Thêm thành công");
					String maKH = txt_maKH.getText();
					String tenKh = txt_tenkh.getText();

					String diachi = txtDiaChi.getText();
					String email = txt_email.getText();
					String da[] = { maKH, tenKh, email, diachi };
					model.addRow(da);
				} else {
					JOptionPane.showMessageDialog(this, "Trùng mã");
				}
			}
		} else if (e.getSource().equals(btnXaKhchHng)) {
			xoa();
			xoarong();
		} else if (e.getSource().equals(btnXaTrng)) {
			xoarong();
		} else if (e.getSource().equals(btnCpNhtKhch)) {
			capNhap();
		} else if (e.getSource().equals(btnHy)) {
			ConnectDB.getInstance().disconnect();
			dispose();
		}
	}

	public void xoarong() {
		txt_maKH.setText(null);
		txt_tenkh.setText(null);
		txt_maKH.setEditable(true);
		txt_email.setText(null);
		txtDiaChi.setText(null);
		table.clearSelection();
	}

	public void xoa() {
		int pos = table.getSelectedRow();
		if (pos >= 0) {
			khachHang_model kh = ds.get(pos);
			int tb = JOptionPane.showConfirmDialog(null,
					"Ban có muốn xóa dong này??", "Delete",
					JOptionPane.YES_NO_OPTION);
			if (tb == JOptionPane.YES_OPTION) {
				model.removeRow(pos);
				ds.remove(kh);
				if (daoKH.deleteKH(kh.getMaKH())) {
					JOptionPane.showMessageDialog(this, "Xoa thanh cong");
				} else {
					JOptionPane.showMessageDialog(this, "xoa khong thanh công");
				}
			} else {
				JOptionPane.showMessageDialog(this,
						"Ban chua chọn dong can xoa");
			}
		}
	}

	public void capNhap() {
		int pos = table.getSelectedRow();
		if (pos != -1) {
			if (JOptionPane.showConfirmDialog(this,
					"Bạn có chắc muôn sửa thông tin không", "Thông báo",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				model.removeRow(pos);
				khachHang_model kh = ds.get(pos);
				kh.setTenKH(textField_1.getText());

				kh.setEmail(textField_4.getText());

				model.insertRow(pos, new Object[] { kh.getMaKH(),
						kh.getTenKH(), kh.getEmail() });
				if (daoKH.updateKH(kh)) {
					JOptionPane.showMessageDialog(this, "Sửa thành công !");
				} else {
					JOptionPane.showMessageDialog(this, "Sửa không được !");
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa !");
		}
	}

	public int timKH(String maKH) {
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getMaKH().equalsIgnoreCase(maKH))
				return i;
		}
		return -1;
	}

	public void showKH(khachHang_model kh) {

		model.addRow(new Object[] { kh.getMaKH(), kh.getTenKH(), kh.getEmail() });
	}

	public void tim() {
		String tim = textField_5.getText();
		if (!tim.equals("")) {
			khachHang_model kh = new khachHang_model(tim);
			int a = timKH(tim);
			if (a == -1) {
				JOptionPane.showMessageDialog(this, "Không tìm thấy !");
			} else {
				table.setRowSelectionInterval(a, a);

			}
		} else {
			JOptionPane.showMessageDialog(null, "ban chua nhap ma kH");
			textField_5.requestFocus();
		}
	}

	public boolean validation() {
		String maKh = txt_maKH.getText();
		String tenkh = txt_tenkh.getText();
		String diaChi = txtDiaChi.getText();
		String email = txt_email.getText();

		//
		if (maKh.equals("")) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập MaKH!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txt_maKH.requestFocus();
			return false;
		} else if (!maKh.matches("[a-zA-Z0-9]{2,}")) {
			JOptionPane.showMessageDialog(null, "mã khách hàng không bao gồm các kí tự đặc biệt và từ 2 kí tự!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txt_maKH.setText("");
			txt_maKH.requestFocus();
			return false;
		} else if (tenkh.equals("")) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txt_tenkh.requestFocus();
			return false;
		} else if (!tenkh.matches("[a-zA-z' ]+")) {
			
			JOptionPane.showMessageDialog(null, "Tên Khách hàng không có kí tự đặt biệt!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txt_tenkh.setText("");
			txt_tenkh.requestFocus();
			return false;
		}
		else if(diaChi.equals("")){
			JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên Địa chỉ!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txtDiaChi.requestFocus();
			return false;
			
		}
		else if(!diaChi.matches("[a-zA-z' ]+")){
			JOptionPane.showMessageDialog(null, "Địa chỉ không được kí đặc biệt!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txtDiaChi.requestFocus();
			txtDiaChi.setText("");
			return false;
		}
		else if(email.equals("")){
			JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên email!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txt_email.requestFocus();
			return false;
		}
		else if(!email.matches("^\\w+\\d*@{1}(gmail|yahoo|css).com")){
			JOptionPane.showMessageDialog(null, "lỗi email", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txt_email.requestFocus();
			txt_email.setText("");
			return false;
		}
		return true;
	}
}
