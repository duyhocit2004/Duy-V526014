package baitap;

import java.util.Scanner;

public class Nhanvien extends Nguoi {

    private int snct;
    private double hsl;

    // Constructor
    public Nhanvien() {
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    // Getter và Setter
    public int getSnct() {
        return snct;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    // Tính tiền lương
    public double tinhLuong() {
        return 1.5 * hsl + 0.2 * snct;
    }

    // Ghi đè phương thức nhập
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    // Ghi đè phương thức xuất
    @Override
    public void xuat() {
        super.xuat();

        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.printf("Tien luong: %.2f trieu dong%n", tinhLuong());
    }
}
