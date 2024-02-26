/**
 * 
 */
package lab2;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai4 {

	public static void main(String[] args) {
		Menu();
		Scanner scanner= new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a) {
		case 1: 
			GiaiPTB1();
			break;
		case 2:
			GiaiPTB2();
			break;
		case 3: 
			TinhTienDien();
			break;
		default:
			break;
			
		}
		
		

	}
	public static void Menu() {
	System.out.println("<< 	 	LỰA CHỌN MENU  >>");
		System.out.println("+--------------------+");
		System.out.println("| 1.Giải pt bậc nhất |");
		System.out.println("| 2.Giải pt bậc 2    | ");
		System.out.println("| 3.Tính Tiền Điện   |");
		System.out.println("| 4.Kết thúc         |");
		System.out.println("+--------------------+ ");
		System.out.println("Chọn Chức năng?");
	}
	public static void GiaiPTB1(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap a");
		double a = scanner.nextDouble();
		System.out.print("Nhap b");
		double b= scanner.nextDouble();
		if(a == 0){
			if(b == 0){
				System.out.printf("phương trình vô số nghiệm");
				}else{
				
					System.out.printf("phương trình vô nghiệm");
				
					}
			
			}
			else{
				
				double x = -b/a;
				System.out.printf("Nghiệm của phương trình là : %.2f ",x);
			}
		
	}
	public static void GiaiPTB2(){
		double x,x1,x2;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap a:");
		int a = scanner.nextInt();
		System.out.print("Nhap b :");
		int b = scanner.nextInt();
		System.out.print("Nhap c :");
		int c = scanner.nextInt();
		
		if(a == 0) {
			if(b == 0){
				if(c == 0){
					System.out.printf("phương trình vô số nghiệm");
					}else{
					
						System.out.printf("phương trình vô nghiệm");
					
						}
				
				}
				else{
					
					 x = -c/b;
					System.out.printf("Nghiệm của phương trình là : %.2f ",x);
				}
		}else {
			
				double delta = Math.pow(b,2) - 4 *a *c;
				if(delta < 0) {
					System.out.printf("phương trình vô nghiệm");
				}else if( delta == 0) {
						x = -b/(2*a);
					System.out.printf("phương trình nghiệm kép là: ",x);
				}else {
					x1 = (-b+ Math.sqrt(delta))/(2*a);
					x2 = (-b-Math.sqrt(delta))/(2*a);
					System.out.printf("phương trình có 2 nghiệm x1=%.2f , x2 = %.2f",x1,x2);
				}
				
		}
		
		
		
	}
	public static void TinhTienDien() {
		int tien;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap số điện:");
		int soDien = scanner.nextInt();
		if(soDien < 50) {
			tien = soDien *1000;
		}else {
			tien = 50*1000 +(soDien-50)*1200;
		}
		System.out.printf("Tiền điện của tháng là %d:",tien); 
	}

}
