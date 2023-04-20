package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import connectDB.ConnectDB;


public class dangNhap extends JFrame  implements ActionListener{
	private JButton bttLogin;
	private JButton bttExit;
	private JButton bttCancel;
	private JTextField tfUser;
	private JPasswordField tfPass;

	public static void main(String[] args) throws InvocationTargetException,
			InterruptedException {
		EventQueue.invokeAndWait(new Runnable() {
			public void run() {
				try {
					dangNhap frame = new dangNhap();
					frame.setVisible(true);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		});
	}

	public dangNhap() {
		// TODO Auto-generated constructor stub
		try {
			ConnectDB.getInstance().connect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setTitle("Login program");
		setSize(700, 370);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel pnNorth = new JPanel();
		pnNorth.setBorder(BorderFactory.createLineBorder(Color.red));
		JLabel labelLogo;
		pnNorth.add(labelLogo = new JLabel("Login"));
		labelLogo.setFont(new Font("Arial", Font.BOLD, 30));
		labelLogo.setForeground(Color.red);
		add(pnNorth, BorderLayout.NORTH);
		JPanel pnlWest = new JPanel();
		pnlWest.setBorder(BorderFactory.createLineBorder(Color.red));
		ImageIcon myImage = new ImageIcon(dangNhap.class.getResource("/anh/user1.png"));
		pnlWest.add(new JLabel(myImage));
		add(pnlWest, BorderLayout.WEST);

		JPanel pnlSouth = new JPanel();
		pnlSouth.setBorder(BorderFactory.createLineBorder(Color.red));
		
		pnlSouth.add(bttLogin = new JButton("Login"));
		pnlSouth.add(bttCancel= new JButton("Cancel"));
		pnlSouth.add(bttExit = new JButton("Exit"));
		add(pnlSouth, BorderLayout.SOUTH);
		JPanel pnlcenter = new JPanel();
		pnlcenter.setBorder(BorderFactory.createLineBorder(Color.red));
		javax.swing.Box b = javax.swing.Box.createVerticalBox();
		javax.swing.Box b1 = javax.swing.Box.createHorizontalBox();
		javax.swing.Box b2 = javax.swing.Box.createHorizontalBox();
		JLabel labeluser, labelPass;
		b1.add(labeluser= new JLabel("User name: "));
		labeluser.setFont(new Font("arial",Font.PLAIN,15));
		b1.add(tfUser = new JTextField(20));
		b2.add(labelPass= new JLabel("Pasword: "));
		labelPass.setFont(new Font("arial",Font.PLAIN,15));
		b2.add(tfPass = new JPasswordField(20));
		labelPass.setPreferredSize(labeluser.getPreferredSize());
		b.add(javax.swing.Box.createVerticalStrut(60));
		b.add(b1); b.add(javax.swing.Box.createVerticalStrut(10));
		b.add(b2);
		
		pnlcenter.add(b);
		add(pnlcenter,BorderLayout.CENTER);
		
		bttExit.addActionListener(this);
		bttCancel.addActionListener(this);
		bttLogin.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(bttCancel)){
			tfUser.setText("");
			tfPass.setText("");
		}
		else if(e.getSource().equals(bttExit)){
			System.exit(0);
		}
		if(e.getSource().equals(bttLogin)){
			if(tfUser.getText().equals("") || tfPass.getPassword().equals("")){
				JOptionPane.showMessageDialog(null,"chua nhap thong tin");
				tfUser.requestFocus();
			}
			else {
				char[] pass ={'1','2','3','4','5','6','7','8'};
				if(tfUser.getText().equalsIgnoreCase("admin") && Arrays.equals(tfPass.getPassword(), pass)){
					dispose();
					new Menu1().setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"thong tin user sai");
					tfUser.requestFocus();
				}
			}
			
		}
	}
}
