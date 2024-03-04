import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MangHinhGiai extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;
	private JTextField txtKetQua2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MangHinhGiai() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập hệ số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 70, 152, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpHS = new JLabel("Nhập hệ số b:");
		lblNhpHS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpHS.setBounds(28, 104, 152, 28);
		contentPane.add(lblNhpHS);
		
		JLabel lblNhpHS_1 = new JLabel("Nhập hệ số c:");
		lblNhpHS_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpHS_1.setBounds(28, 143, 152, 28);
		contentPane.add(lblNhpHS_1);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(48, 246, 109, 28);
		contentPane.add(lblKtQu);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(161, 65, 235, 28);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(161, 104, 235, 28);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(161, 143, 235, 28);
		contentPane.add(txtC);
		
		JButton btnTinh = new JButton("Tính Toán");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyPTBac2();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(196, 182, 109, 35);
		contentPane.add(btnTinh);
		
		JLabel lblGiiPhngTrnh = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2");
		lblGiiPhngTrnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGiiPhngTrnh.setBounds(150, 11, 246, 28);
		contentPane.add(lblGiiPhngTrnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(206, 228, 235, 28);
		contentPane.add(txtKetQua);
		
		JLabel lblNhpHS_1_1 = new JLabel("X1 :");
		lblNhpHS_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpHS_1_1.setBounds(147, 228, 49, 28);
		contentPane.add(lblNhpHS_1_1);
		
		JLabel lblNhpHS_1_1_1 = new JLabel("X2 :");
		lblNhpHS_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpHS_1_1_1.setBounds(147, 272, 49, 28);
		contentPane.add(lblNhpHS_1_1_1);
		
		txtKetQua2 = new JTextField();
		txtKetQua2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua2.setEditable(false);
		txtKetQua2.setColumns(10);
		txtKetQua2.setBounds(204, 272, 235, 28);
		contentPane.add(txtKetQua2);
	}
	void XuLyPTBac2() {
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		String str_c = txtC.getText();
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		Double c = Double.parseDouble(str_c);
		
		double kq,x1,x2;
		if(a == 0) {
			if(b == 0){
				if(c == 0){
					txtKetQua.setText(String.valueOf(" vô số nghiệm"));
					txtKetQua2.setText(String.valueOf(" vô số nghiệm"));
					}else{
					
						txtKetQua.setText(String.valueOf(" vô nghiệm"));
						txtKetQua2.setText(String.valueOf(" vô nghiệm"));
					
						}
				
				}
				else{
					
					 kq = -c/b;
					 txtKetQua.setText(String.valueOf(kq));
					 txtKetQua2.setText(String.valueOf(kq));
				}
		}else {
			
				double delta = Math.pow(b,2) - 4 *a *c;
				if(delta < 0) {
					txtKetQua.setText(String.valueOf(" vô nghiệm"));
					txtKetQua2.setText(String.valueOf(" vô nghiệm"));
				}else if( delta == 0) {
						kq = -b/(2*a);
						txtKetQua.setText(String.valueOf(kq));
						txtKetQua2.setText(String.valueOf(kq));
				}else {
					x1 = (-b+ Math.sqrt(delta))/(2*a);
					x2 = (-b-Math.sqrt(delta))/(2*a);
					txtKetQua.setText(String.valueOf(x1));
					txtKetQua2.setText(String.valueOf(x2));
				
				}
		}
	
	}

}
