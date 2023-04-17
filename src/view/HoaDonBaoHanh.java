package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HoaDonBaoHanh extends JFrame implements ActionListener,MouseListener{

	private JPanel contentPane;
	private JTextField textmaPhieu;
	private JTextField textTenLK;
	private JTextField textSL;
	private JTextField textThanhTien;
	private JTable table;
	private DefaultTableModel model;
//	private 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDonBaoHanh frame = new HoaDonBaoHanh();
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
	public HoaDonBaoHanh() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Hóa Đơn Phiếu Bảo Hành");
		title.setForeground(new Color(255, 0, 0));
		title.setFont(new Font("Tahoma", Font.BOLD, 25));
		title.setBounds(135, 0, 324, 46);
		contentPane.add(title);
		
		JLabel lblMaPhieu = new JLabel("Mã phiếu bảo hành:");
		lblMaPhieu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaPhieu.setBounds(55, 66, 135, 24);
		contentPane.add(lblMaPhieu);
		
		JLabel lblTenLK = new JLabel("Tên linh kiện:");
		lblTenLK.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenLK.setBounds(100, 100, 90, 24);
		contentPane.add(lblTenLK);
		
		JLabel lblSL = new JLabel("Số lượng:");
		lblSL.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSL.setBounds(122, 134, 62, 24);
		contentPane.add(lblSL);
		
		JLabel lblThanhTien = new JLabel("Thành tiền:");
		lblThanhTien.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThanhTien.setBounds(111, 168, 75, 24);
		contentPane.add(lblThanhTien);
		
		textmaPhieu = new JTextField();
		textmaPhieu.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textmaPhieu.setBounds(200, 70, 96, 19);
		contentPane.add(textmaPhieu);
		textmaPhieu.setColumns(10);
		textmaPhieu.setBorder(null);
		textmaPhieu.setEditable(false);
		textmaPhieu.setForeground(Color.RED);
		
		textTenLK = new JTextField();
		textTenLK.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textTenLK.setColumns(10);
		textTenLK.setBounds(200, 104, 96, 19);
		contentPane.add(textTenLK);
		textTenLK.setBorder(null);
		textTenLK.setEditable(false);
		textTenLK.setForeground(Color.RED);
		
		textSL = new JTextField();
		textSL.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textSL.setColumns(10);
		textSL.setBounds(200, 138, 96, 19);
		contentPane.add(textSL);
		textSL.setBorder(null);
		textSL.setEditable(false);
		textSL.setForeground(Color.RED);
		
		textThanhTien = new JTextField();
		textThanhTien.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textThanhTien.setColumns(10);
		textThanhTien.setBounds(200, 172, 96, 19);
		contentPane.add(textThanhTien);
		textThanhTien.setBorder(null);
		textThanhTien.setEditable(false);
		textThanhTien.setForeground(Color.RED);
		
		JButton btnXoa = new JButton("Xóa hóa đơn");
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXoa.setBounds(374, 89, 157, 35);
		contentPane.add(btnXoa);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThoat.setBounds(374, 137, 157, 35);
		contentPane.add(btnThoat);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("Mã phiếu BH");
		model.addColumn("Tên linh kiện");
		model.addColumn("Số lượng");
		model.addColumn("Thành tiền");
		
		JScrollPane scrollPane = 	new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 202, 611, 126);
		contentPane.add(scrollPane);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
