import java.util.Scanner;

public class Lab1Bai1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và Tên");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB");
		double diemTB= scanner.nextDouble();
		System.out.printf("%s %.2f điểm",hoTen, diemTB);

	}

}
