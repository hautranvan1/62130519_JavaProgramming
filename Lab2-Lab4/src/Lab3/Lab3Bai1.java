/**
 * 
 */
package Lab3;

import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = scanner.nextInt();
		boolean x = true;
		for(int i = 2; i < n-1; i++) {
			if( n % i == 0) {
				x = false;
				break;
			}
		}
		
		if( x == true) {
			System.out.printf("N = %d là số nguyên tố ",n);
		}else {
			System.out.printf("N không phải là số nguyên tố ",n);
		}

	}

}
