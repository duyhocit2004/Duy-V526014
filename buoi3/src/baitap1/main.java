package baitap1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<PhanSo> danhSachPS = new ArrayList<>();
        danhSachPS.add(new PhanSo(3, 4));   // 3/4
        danhSachPS.add(new PhanSo(5, 2));   // 5/2 (không phải số nguyên)
        danhSachPS.add(new PhanSo(6, 3));   // 6/3 = 2 (là số nguyên)
        danhSachPS.add(new PhanSo(1, 3));   // 1/3

        System.out.println("Danh sach cac phan so:");
        for (PhanSo ps : danhSachPS) {
            System.out.print(ps + " ");
        }
        System.out.println("\n-----------------------------------------");


        PhanSo maxPS = danhSachPS.get(0);
        for (int i = 1; i < danhSachPS.size(); i++) {
            if (danhSachPS.get(i).soSanh(maxPS) > 0) {
                maxPS = danhSachPS.get(i);
            }
        }
        System.out.println("Phan so lon nhat la: " + maxPS);

        // 2. Tính tổng các phân số trong tập hợp
        PhanSo tongPS = new PhanSo(0, 1); // Khởi tạo phân số 0/1
        for (PhanSo ps : danhSachPS) {
            tongPS = tongPS.cong(ps);
        }
        System.out.println("Tong cac phan so la: " + tongPS);


        System.out.println("Cac phan so khong phai so nguyen la:");
        boolean coPhanSoKhongNguyen = false;
        for (PhanSo ps : danhSachPS) {
            if (!ps.laSoNguyen()) {
                System.out.print(ps + " ");
                coPhanSoKhongNguyen = true;
            }
        }
        if (!coPhanSoKhongNguyen) {
            System.out.println("Khong co phan so nao ca.");
        }
    }
}