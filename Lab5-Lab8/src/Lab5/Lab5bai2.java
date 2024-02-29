/**
 * 
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class Lab5bai2 {

	
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			ArrayList<String> danhsach = new ArrayList();
			
			while(true){
				String x = scanner.nextLine();
				danhsach.add(x);
				System.out.print("Nhập thêm hay không Y/N ?");
	            if (scanner.nextLine().equals("N")) {
	                break;
	            }

			}
			System.out.println("Danh sách:");
			for (String d : danhsach) {
	            System.out.println(d);
	        }
			System.out.println("Danh sách ngẫu nhiên:");
			Collections.shuffle(danhsach);
			for (String d : danhsach) {
	            System.out.println(d);
	        }
			
			Collections.sort(danhsach,Collections.reverseOrder());
			
			System.out.println("Danh sách sau khi sắp xếp giảm dần:");
			for (String d : danhsach) {
	            System.out.println(d);
	        }
			
			
			System.out.println("Nhập tên cần xóa:");
			String s = scanner.nextLine();
			
			if (danhsach.contains(s)) {
				danhsach.remove(s);
	            System.out.println("Phần tử " + s + " đã được xóa.");
	        } else {
	            System.out.println("Không tìm thấy phần tử " + s + " trong danh sách.");
	        }

	        System.out.println("Danh sách sau khi xóa:");
	        for (String d : danhsach) {
	            System.out.println(d);
	        }
	}
	

}
