/**
 * 
 */
package Lab4;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

/**
 * 
 */

public class SanPham{
	Scanner scanner = new Scanner(System.in);	
	public static String ten;
	public static double donGia;
	public static  double giamGia = 0.9;
	public SanPham(String ten,double donGia,double giamGia) {
		this.ten = ten;
		this.donGia = donGia;
		this.giamGia =giamGia;
		
	}
	public SanPham(String ten,double donGia) {
		this.ten = ten;
		this.donGia = donGia;		
		
	}
	private double getThueNhapKhau() {
		 
		return donGia * giamGia;
	}
	public void input() {
		System.out.print("Nhập tên sản phẩm :");
		ten = scanner.nextLine();
		System.out.print("Đơn giá:");
		donGia = scanner.nextDouble();

		
	}
	
	public void output() {
		System.out.printf(" \ntên sản phẩm %s\n đơn giá :%.2f \n Đơn giá sau giảm giá: %.2f ", ten,donGia,getThueNhapKhau());
		
		
		
		
	}
	public static void main(String[] args) {
		SanPham sp1 = new SanPham(ten,donGia,giamGia);
		SanPham sp2 = new SanPham(ten,donGia);
		sp1.input();
		sp2.input();
		sp1.output();
		sp2.output();
		
		

	}
}
