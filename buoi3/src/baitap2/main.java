package baitap2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Diem2D> danhSachDiem = new ArrayList<>();
        danhSachDiem.add(new Diem2D(1, 2));
        danhSachDiem.add(new Diem2D(4, 6));
        danhSachDiem.add(new Diem3D(1, 2, 3));
        danhSachDiem.add(new Diem3D(4, 5, 6));

        System.out.println("--- DANH SACH CAC DIEM BAN DAU ---");
        for (Diem2D d : danhSachDiem) {
            System.out.println(d);
        }


        double tongKhoangCach2D = 0;
        double tongKhoangCach3D = 0;


        List<Diem2D> ds2D = new ArrayList<>();
        List<Diem3D> ds3D = new ArrayList<>();

        for (Diem2D d : danhSachDiem) {
            if (d instanceof Diem3D) {
                ds3D.add((Diem3D) d);
            } else {
                ds2D.add(d);
            }
        }


        for (int i = 0; i < ds2D.size() - 1; i++) {
            tongKhoangCach2D += ds2D.get(i).tinhKhoangCach(ds2D.get(i + 1));
        }


        for (int i = 0; i < ds3D.size() - 1; i++) {
            tongKhoangCach3D += ds3D.get(i).tinhKhoangCach3D(ds3D.get(i + 1));
        }

        System.out.println("\nTong khoang cach cac diem 2D lien tiep: " + tongKhoangCach2D);
        System.out.println("Tong khoang cach cac diem 3D lien tiep: " + tongKhoangCach3D);


        List<Diem2D> danhSachDoiXung = new ArrayList<>();
        for (Diem2D d : danhSachDiem) {
            danhSachDoiXung.add(d.timDiemDoiXung());
        }

        danhSachDiem.addAll(danhSachDoiXung);

        System.out.println("\n--- DANH SACH SAU KHI THEM CAC DIEM DOI XUNG ---");
        for (Diem2D d : danhSachDiem) {
            System.out.println(d);
        }
    }
}