import java.util.Scanner;

public class Lab1Bai4 {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap a:");
		int a = scanner.nextInt();
		System.out.print("Nhap b:");
		int b = scanner.nextInt();
		System.out.print("Nhap c:");
		int c = scanner.nextInt();
		Double Delta = Math.pow(b, 2) - 4*a*c;
		System.out.printf("can Delta : %.2f",Math.sqrt(Delta));
	}

}
