package baitap;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;

    // Constructor
    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }


    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }


    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }
}
