import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap chieu dai :");
		Double chieuDai = scanner.nextDouble();
		System.out.print("Nhap chieu rong :");
		Double chieuRong = scanner.nextDouble();
		System.out.printf("Chu vi: %.2f Dientich: %.2f Canh nho nhat: %.2f",(chieuDai+chieuRong) *2,chieuDai * chieuRong,Math.min(chieuDai,chieuRong));

	}

}
