package baitap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Nhanvien> ds = new ArrayList<>();

        // 1. Nhap danh sach nhan vien
        System.out.print("Nhap so luong nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- NHAP NHAN VIEN THU " + (i + 1) + " ---");

            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);

            ds.add(nv);
        }

        // 2. Xuat danh sach nhan vien
        System.out.println("\n========== DANH SACH NHAN VIEN ==========");

        for (Nhanvien nv : ds) {
            System.out.println("-------------------------");
            nv.xuat();
        }

        // 3. Tim nhan vien co so nam cong tac nhieu nhat
        System.out.println("\n========== NHAN VIEN CONG TAC LAU NHAT ==========");

        int max = ds.get(0).getSnct();

        for (Nhanvien nv : ds) {
            if (nv.getSnct() > max) {
                max = nv.getSnct();
            }
        }

        for (Nhanvien nv : ds) {
            if (nv.getSnct() == max) {
                nv.xuat();
                System.out.println("-------------------------");
            }
        }

        // 4. Sap xep theo tien luong giam dan
        ds.sort(Comparator.comparingDouble(Nhanvien::tinhLuong).reversed());

        System.out.println("\n========== DANH SACH LUONG CAO DEN THAP ==========");

        for (Nhanvien nv : ds) {
            System.out.println("-------------------------");
            nv.xuat();
        }

        sc.close();
    }
}