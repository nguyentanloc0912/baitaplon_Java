package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JButton;

public class thongKe_view extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JDateChooser fromDate;
	private JDateChooser toDate;
	private JButton btnTK;

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
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 833, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Thống kê");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(336, 10, 122, 31);
		contentPane.add(lblNewLabel);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fromDate = new JDateChooser();
		fromDate.setBounds(105, 51, 176, 32);
		contentPane.add(fromDate);
		 
		toDate = new JDateChooser();
		toDate.setBounds(391, 51, 176, 32);
		contentPane.add(toDate);
			
		JLabel lbFromDate = new JLabel("Từ ngày");
		lbFromDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbFromDate.setBounds(28, 51, 67, 32);
		contentPane.add(lbFromDate);
		
		JLabel lbToDate = new JLabel("Đến ngày");
		lbToDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbToDate.setBounds(314, 51, 67, 32);
		contentPane.add(lbToDate);
		
		btnTK = new JButton("Thống kê");
		btnTK.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTK.setBounds(647, 51, 116, 32);
		contentPane.add(btnTK);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Danh s\u00E1ch th\u1ED1ng k\u00EA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 103, 819, 204);
		contentPane.add(panel);
		panel.setLayout(null);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		model.addColumn("Mã hóa đơn");
		model.addColumn("Ngày");
		model.addColumn("Số lượng");
		model.addColumn("Tổng tiền");
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(5, 17, 809, 180);
		panel.add(scrollPane);
		
		btnTK.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		
	}
}
