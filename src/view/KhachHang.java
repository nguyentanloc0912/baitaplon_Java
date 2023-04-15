package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.ds_KhachHang;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

public class KhachHang extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;
	private DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private ds_KhachHang ds;

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
		ds = new ds_KhachHang();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("KhÃ¡ch hÃ ng");
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
		model.addColumn("Số điện thoại");
		model.addColumn("Ngày sinh");
		model.addColumn("Email");
		
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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
		
		Label label_3 = new Label("MÃ£ khÃ¡ch hÃ ng:");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(10, 58, 136, 32);
		panel_1.add(label_3);
		
		Label label_4 = new Label("TÃªn khÃ¡ch hÃ ng:");
		label_4.setFont(new Font("Dialog", Font.BOLD, 13));
		label_4.setBounds(10, 102, 136, 32);
		panel_1.add(label_4);
		
		Label label_5 = new Label("Sá»‘ Ä‘iá»‡n thoáº¡i:");
		label_5.setFont(new Font("Dialog", Font.BOLD, 13));
		label_5.setBounds(10, 147, 136, 32);
		panel_1.add(label_5);
		
		Label label_6 = new Label("NgÃ y sinh:");
		label_6.setFont(new Font("Dialog", Font.BOLD, 13));
		label_6.setBounds(10, 190, 136, 34);
		panel_1.add(label_6);
		
		Label label_7 = new Label("Email:");
		label_7.setFont(new Font("Dialog", Font.BOLD, 13));
		label_7.setBounds(10, 243, 136, 21);
		panel_1.add(label_7);
		
		textField = new JTextField();
		textField.setBounds(158, 69, 168, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 115, 365, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 156, 365, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 200, 365, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(158, 245, 365, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(566, 55, 351, 291);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ThÃªm khÃ¡ch hÃ ng");
		
		btnNewButton.setBounds(10, 86, 331, 32);
		panel.add(btnNewButton);
		
		JButton btnXaKhchHng = new JButton("XÃ³a khÃ¡ch hÃ ng");
	
		btnXaKhchHng.setBounds(10, 126, 331, 32);
		panel.add(btnXaKhchHng);
		
		JButton btnCpNhtKhch = new JButton("Cáº­p nháº­t khÃ¡ch hÃ ng");

		btnCpNhtKhch.setBounds(10, 210, 331, 32);
		panel.add(btnCpNhtKhch);
		
		JButton btnLu = new JButton("LÆ°u");

		btnLu.setBounds(10, 252, 159, 32);
		panel.add(btnLu);
		
		JButton btnHy = new JButton("ThoÃ¡t");
		
		btnHy.setBounds(179, 252, 162, 32);
		panel.add(btnHy);
		
		JLabel lblNewLabel = new JLabel("Nháº­p mÃ£ khÃ¡ch hÃ ng cáº§n tÃ¬m:");
		lblNewLabel.setBounds(10, 16, 193, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_5 = new JTextField();
		textField_5.setBounds(204, 16, 137, 24);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnTm = new JButton("TÃ¬m khÃ¡ch hÃ ng");
		
		btnTm.setBounds(10, 44, 331, 32);
		panel.add(btnTm);
		
		JButton btnXaTrng = new JButton("XÃ³a tráº¯ng");
		btnXaTrng.setBounds(10, 168, 331, 32);
		panel.add(btnXaTrng);

		
		setVisible(true);
	}
}
