import java.util.Scanner;

public class Lab1Bai3 {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap canh :");
		Double canh = scanner.nextDouble();
		System.out.printf("The tich khoi chu nhat : %.2f",Math.pow(canh,3));

	}

}
