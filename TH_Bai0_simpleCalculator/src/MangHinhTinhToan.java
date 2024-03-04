import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MangHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	
	public MangHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 39, 182, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai(b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(10, 126, 182, 32);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(179, 39, 260, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(179, 122, 260, 32);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(60, 193, 91, 32);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(161, 193, 93, 32);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(264, 193, 94, 32);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(368, 193, 91, 32);
		contentPane.add(btnChia);
		
		JLabel lblKtQuPhp = new JLabel("Kết quả phép tính:");
		lblKtQuPhp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuPhp.setBounds(22, 253, 152, 32);
		contentPane.add(lblKtQuPhp);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(179, 255, 260, 32);
		contentPane.add(txtKetQua);
	}
	void XamXuLyCong() {
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		double kq = a+b;
		txtKetQua.setText(String.valueOf(kq));
	}
	void XamXuLyTru() {
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		double kq = a-b;
		txtKetQua.setText(String.valueOf(kq));
	}
	void XamXuLyNhan() {
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		double kq = a*b;
		txtKetQua.setText(String.valueOf(kq));
	}
	void XamXuLyChia() {
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		double kq = a/b;
		txtKetQua.setText(String.valueOf(kq));
	}
}
