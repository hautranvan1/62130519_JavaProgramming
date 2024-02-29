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
	private static String ten;
	private static double donGia;
	private static  double giamGia = 0.9;
	public SanPham(String ten,double donGia,double giamGia) {
		this.ten = ten;
		this.donGia = donGia;
		this.giamGia =giamGia;
		
	}
	public String Ten(){
		return this.ten;
		}
	
	public void setTen(String ten){
		this.ten = ten;
		}
	public double donGia(){
		return this.donGia;
		}
	
	public void setDonGia(double donGia){
		this.donGia = donGia;
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
