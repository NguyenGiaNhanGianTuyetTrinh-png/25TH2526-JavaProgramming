package ntu.trinhngngt;
import java.util.Scanner;

public class runMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HOCVIEN[] ds = new HOCVIEN[3];

        for (int i = 0; i < 3; i++) {
            ds[i] = new HOCVIEN();

            System.out.println("Nhap thong tin hoc vien thu " + (i + 1));

            System.out.print("Ma hoc vien: ");
            ds[i].setMaHocVien(sc.nextLine());

            System.out.print("Ho ten: ");
            ds[i].setHoTen(sc.nextLine());

            System.out.print("Nam sinh: ");
            ds[i].setNamSinh(sc.nextInt());
            sc.nextLine();

            System.out.print("Gioi tinh: ");
            ds[i].setGioiTinh(sc.nextLine());

            System.out.println();
        }

        System.out.println("===== DANH SACH HOC VIEN =====");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ma HV: " + ds[i].getMaHocVien());
            System.out.println("Ho ten: " + ds[i].getHoTen());
            System.out.println("Nam sinh: " + ds[i].getNamSinh());
            System.out.println("Gioi tinh: " + ds[i].getGioiTinh());
            System.out.println("------------------------");
        }

        HOCVIEN lonTuoiNhat = ds[0];

        for (int i = 1; i < 3; i++) {
            if (ds[i].getNamSinh() < lonTuoiNhat.getNamSinh()) {
                lonTuoiNhat = ds[i];
            }
        }

        System.out.println("Hoc vien nhieu tuoi nhat:");
        System.out.println("Ma HV: " + lonTuoiNhat.getMaHocVien());
        System.out.println("Ho ten: " + lonTuoiNhat.getHoTen());
        System.out.println("Nam sinh: " + lonTuoiNhat.getNamSinh());
        System.out.println("Gioi tinh: " + lonTuoiNhat.getGioiTinh());

        sc.close();
    }
}
