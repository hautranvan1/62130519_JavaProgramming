/**
 * 
 */
package lab2;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai1 {

	
	public static void main(String[] args) {
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

}
