/**
 * 
 */
package Lab3;

import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Nhập n:");
		int n = scanner.nextInt();
		for(int i=1; i<=10;i++){
			System.out.printf("%d x %d = %d", n, i, n*i);
					System.out.println();
					
		}
		

	}

}
