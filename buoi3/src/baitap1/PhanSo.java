package baitap1;

public class PhanSo {

    private int mau;
    private  int tu;

    // gắn giá trị mặc định
    public PhanSo(){
        this.tu = 0;
        this.mau = 1;
    }

    // tạo đối số cho mau va tu
    public PhanSo(int tu,int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    @Override
    public String toString() {
        if (mau == 1) {
            return String.valueOf(tu);
        }
        return tu + "/" + mau;
    }


    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public void rutGon() {
        int uc = ucln(this.tu, this.mau);
        this.tu /= uc;
        this.mau /= uc;
        // Đưa dấu trừ lên tử số nếu mẫu số âm
        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }


    public PhanSo cong(PhanSo ps) {
        int t = this.tu * ps.mau + ps.tu * this.mau;
        int m = this.mau * ps.mau;
        return new PhanSo(t, m);
    }

    public PhanSo tru(PhanSo ps) {
        int t = this.tu * ps.mau - ps.tu * this.mau;
        int m = this.mau * ps.mau;
        return new PhanSo(t, m);
    }

    public PhanSo nhan(PhanSo ps) {
        int t = this.tu * ps.tu;
        int m = this.mau * ps.mau;
        return new PhanSo(t, m);
    }

    public PhanSo chia(PhanSo ps) {
        int t = this.tu * ps.mau;
        int m = this.mau * ps.tu;
        return new PhanSo(t, m);
    }

    public int soSanh(PhanSo ps) {
        double giaTriThis = (double) this.tu / this.mau;
        double giaTriPs = (double) ps.tu / ps.mau;
        if (giaTriThis > giaTriPs) return 1;
        if (giaTriThis < giaTriPs) return -1;
        return 0;
    }


    public boolean laSoNguyen() {
        return this.mau == 1 || this.tu % this.mau == 0;
    }


}
