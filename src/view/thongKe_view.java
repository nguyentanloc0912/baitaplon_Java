package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import dao.baoCao_DAO;
import entity.ChiTietHoaDon;
//import dao.DAO_HoaDon;
import entity.HoaDon;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTable;
import javax.swing.JButton;

public class thongKe_view extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JDateChooser fromDate;
	private JDateChooser toDate;
	private JButton btnTK;
	private ArrayList<ChiTietHoaDon> baoCaoList;
	private baoCao_DAO dao_baoCao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thongKe_view frame = new thongKe_view();
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
	public thongKe_view() {
		baoCaoList = new ArrayList<ChiTietHoaDon>();
		dao_baoCao = new baoCao_DAO();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 659, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Xem báo cáo");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(241, 10, 169, 31);
		contentPane.add(lblNewLabel);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fromDate = new JDateChooser();
		fromDate.setBounds(112, 51, 176, 32);
		contentPane.add(fromDate);
		 
		toDate = new JDateChooser();
		toDate.setBounds(112, 102, 176, 32);
		contentPane.add(toDate);
			
		JLabel lbFromDate = new JLabel("Từ ngày");
		lbFromDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbFromDate.setBounds(28, 51, 67, 32);
		contentPane.add(lbFromDate);
		
		JLabel lbToDate = new JLabel("Đến ngày");
		lbToDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbToDate.setBounds(28, 102, 67, 32);
		contentPane.add(lbToDate);
		
		btnTK = new JButton("Xem");
		btnTK.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTK.setBounds(356, 102, 96, 32);
		contentPane.add(btnTK);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Danh s\u00E1ch th\u1ED1ng k\u00EA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 165, 625, 204);
		contentPane.add(panel);
		panel.setLayout(null);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model.addColumn("Tên sản phẩm");
		model.addColumn("Đơn giá");
		model.addColumn("Số lượng");
		model.addColumn("Tổng tiền");
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(5, 17, 610, 180);
		panel.add(scrollPane);
		
		btnTK.addActionListener(this);
		setTableBaoCao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnTK)) {
			baoCaoList = dao_baoCao.getDsBaoCaoTheoNgay(new Date(fromDate.getDate().getTime()),
					new Date(toDate.getDate().getTime()));
			loadTableBaoCaoTheoNgay(baoCaoList);
		}
	}
	
	private void loadTableBaoCaoTheoNgay(ArrayList<ChiTietHoaDon> list) {
		model.getDataVector().removeAllElements();
		model.fireTableDataChanged();
		
		for (ChiTietHoaDon baoCao : list) {
			model.addRow(new Object[] {baoCao.getSanPham().getTenLoai(),baoCao.getSanPham().getGiaBan(),baoCao.getSoluong(),baoCao.getThanhtien()});
		}
	}
	
	private void setTableBaoCao() {
		baoCaoList = dao_baoCao.getAllBaoCao();
		loadTableBaoCaoTheoNgay(baoCaoList);
	}
}







