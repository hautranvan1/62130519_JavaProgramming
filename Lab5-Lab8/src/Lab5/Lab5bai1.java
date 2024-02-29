/**
 * 
 */
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5bai1 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList();
		
		while(true){
			Double x = scanner.nextDouble();
			a.add(x);
			
			scanner.nextLine();
			
            System.out.print("Nhập thêm Y/N ?");
            String choice = scanner.nextLine();
            if (choice.equals("N")) {
                break;
            }

		}
		
		for (double s : a) {
            System.out.println(s);
        }
		


	}

}
