/**
 * 
 */
package lab2;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai3 {

	
	public static void main(String[] args) {
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
