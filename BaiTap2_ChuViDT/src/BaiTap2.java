import java.util.Scanner;

public class BaiTap2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();
        // tính chu vi
        double chuVi = (dai + rong) * 2;
        // tính diện tích
        double dienTich = dai * rong;
        // tìm cạnh nhỏ
        double canhNho;
        if (dai < rong) {
        	canhNho = dai;
        }
        else { canhNho = rong;}
        	
        // Xuất kết quả
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Canh nho: " + canhNho);

        sc.close();
    }
}