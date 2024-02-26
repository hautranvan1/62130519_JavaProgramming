/**
 * 
 */
package lab2;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai2 {

	
	public static void main(String[] args) {
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
					System.out.printf("phương trình nghiệm kép là: %.2f",x);
				}else {
					x1 = (-b+ Math.sqrt(delta))/(2*a);
					x2 = (-b-Math.sqrt(delta))/(2*a);
					System.out.printf("phương trình có 2 nghiệm x1=%.2f , x2 = %.2f",x1,x2);
				}
		}

	}

}
