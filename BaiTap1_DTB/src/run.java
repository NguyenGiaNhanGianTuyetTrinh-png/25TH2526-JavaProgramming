import java.util.Scanner;

public class run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten sinh vien: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double dtb = sc.nextDouble();

        System.out.println("\n===== THONG TIN SINH VIEN =====");
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Diem trung binh: " + dtb);

        sc.close();
    }

}