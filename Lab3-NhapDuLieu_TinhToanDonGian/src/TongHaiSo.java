import java.util.Scanner;
public class TongHaiSo {

	public static void main(String[] args) {
		// Khai báo
		double num1, num2, sum;
		
		// Khai báo đối tượng Sanner
		Scanner BanPhim = new Scanner(System.in);
		
		// In ra thông tin, mời User nhập số thứ tự
		System.out.print("Mời nhập số thứ nhất:");
			num1 = BanPhim.nextDouble();
		System.out.print("Mời nhập số thứ hai:");
			num2 = BanPhim.nextDouble();
		
		// Tính toán
		sum = num1+num2;
		
		// Xuất ra
		//System.out.print("Tổng của " + num1 + "và" + num2 + "là" + sum);
		//System.out.print("Tổng của ");
		//System.out.print(num1);
		//System.out.print(" + ");
		//System.out.print(num2);
		//System.out.print(" = ");
		//System.out.print(sum);
		
		System.out.print("Tổng của %.2f và %.2f là %.2f", num1, num2, sum);
	}
	

}
