/**
 * 
 */
package Lab3;

import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai4 {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);	
		System.out.print("Nhập số sinh viên  có thông tin :");
		int n = scanner.nextInt();
		String SinhVien[] = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhập thông tin sinh viên  thứ "+ (i+1)); 
			scanner.nextLine();
			 SinhVien[i] = scanner.nextLine();
			 
		}
		for(int i = 0; i < n; i++) {
			System.out.printf("thông tin sinh vien "+ (i+1)); 	
			System.out.printf("Nhập thông tin sinh viên  thứ "+ (i+1) +"tên:"+SinhVien[i]); 
			 
		}
		float Diem[] = new float [n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhập điểm sinh viên  thứ "+ (i+1));
			Diem[i]= scanner.nextFloat();
		}
		for(int i = 0; i < n; i++) {
			if(Diem[i]<5) {
				System.out.println("Ten : "+SinhVien[i]+"\n Diem: "+Diem[i]+"\nHoc Luc: yeu");
			}
			if(Diem[i]>=5 && Diem[i]<6.5) {

				System.out.println("Ten : "+SinhVien[i]+"\n Diem: "+Diem[i]+"\nHoc Luc: trung binh");
			}
			if(Diem[i]>=6.5 && Diem[i]<7.5) {

				System.out.println("Ten : "+SinhVien[i]+"\n Diem: "+Diem[i]+"\nHoc Luc: kha");
			}
			if(Diem[i]>=7.5 && Diem[i]<9) {

				System.out.println("Ten : "+SinhVien[i]+"\n Diem: "+Diem[i]+"\nHoc Luc: gioi");
			}
			if(Diem[i ]>=9) {

				System.out.println("Ten : "+SinhVien[i]+"\n Diem: "+Diem[i]+"\nHoc Luc: xuat sac");
			}
		}


	}

}
