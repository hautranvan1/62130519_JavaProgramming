/**
 * 
 */
package Lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai3 {

	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);	
		System.out.print("Nhập so phan tu cua mang n:");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ",i);
			a[i]= scanner.nextInt();
		}
		System.out.printf("Mảng vừa nhập là "+ Arrays.toString(a));
		
		 Arrays.sort(a);
		 System.out.printf("Mảng sau khi được sắp xếp là: "+Arrays.toString(a));
			
			
		int Min = a[0];
		for(int i = 0; i < a.length; i++) {
			
			Min= Math.min(Min,a[i]);
		}
		 System.out.printf("Phần tử nhỏ nhất là : %d ",Min);
		 
		

	}

}
