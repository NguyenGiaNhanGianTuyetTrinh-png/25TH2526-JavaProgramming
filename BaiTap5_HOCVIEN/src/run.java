import java.util.Scanner;

public class run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HOVCVIEN hv = new HOVCVIEN();

        System.out.print("Nhap ma hoc vien: ");
        hv.setMaHocVien(sc.nextLine());

        System.out.print("Nhap ho ten: ");
        hv.setHoTen(sc.nextLine());

        System.out.print("Nhap nam sinh: ");
        hv.setNamSinh(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap gioi tinh: ");
        hv.setGioiTinh(sc.nextLine());

        System.out.println("\n===== THONG TIN HOC VIEN =====");
        System.out.println("Ma hoc vien: " + hv.getMaHocVien());
        System.out.println("Ho ten: " + hv.getHoTen());
        System.out.println("Nam sinh: " + hv.getNamSinh());
        System.out.println("Gioi tinh: " + hv.getGioiTinh());

        sc.close();
    }
}