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
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HoaDonBaoHanh extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private DefaultTableModel model;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HÃ³a Ä�Æ¡n Phiáº¿u Báº£o HÃ nh");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(135, 0, 324, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MÃ£ phiáº¿u báº£o hÃ nh:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(55, 66, 135, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TÃªn linh kiá»‡n:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(100, 100, 90, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sá»‘ lÆ°á»£ng:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(122, 134, 62, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ThÃ nh tiá»�n:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(111, 168, 75, 24);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textField.setBounds(200, 70, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setEditable(false);
		textField.setForeground(Color.RED);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 104, 96, 19);
		contentPane.add(textField_1);
		textField_1.setBorder(null);
		textField_1.setEditable(false);
		textField_1.setForeground(Color.RED);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(200, 138, 96, 19);
		contentPane.add(textField_2);
		textField_2.setBorder(null);
		textField_2.setEditable(false);
		textField_2.setForeground(Color.RED);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(200, 172, 96, 19);
		contentPane.add(textField_3);
		textField_3.setBorder(null);
		textField_3.setEditable(false);
		textField_3.setForeground(Color.RED);
		
		JButton btnNewButton = new JButton("XÃ³a hÃ³a Ä‘Æ¡n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(374, 89, 157, 35);
		contentPane.add(btnNewButton);
		
		JButton btnThot = new JButton("ThoÃ¡t");
		btnThot.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThot.setBounds(374, 137, 157, 35);
		contentPane.add(btnThot);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		model.addColumn("MÃ£ phiáº¿u BH");
		model.addColumn("TÃªn linh kiá»‡n");
		model.addColumn("Sá»‘ lÆ°á»£ng");
		model.addColumn("ThÃ nh tiá»�n");
		
		JScrollPane scrollPane = 	new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 202, 611, 126);
		contentPane.add(scrollPane);
	}

}
