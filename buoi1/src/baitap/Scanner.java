package baitap;
import java.util.Calendar;
// bai tap Scanner
public class Scanner {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        java.util.Scanner in = new java.util.Scanner(System.in);

        // test
        int dulieu = c.get(c.YEAR);
        System.out.println("Du lieu" + dulieu);
        System.out.println("hello");


     System.out.print("Vui lòng nhập số bạn muốn : ");
     int Sotuoi = in.nextInt();

     while (Sotuoi > 0 || Sotuoi < 100){
        System.out.print("so ban nhap  la : "+Sotuoi);
        break;
     }


     // in tuổi
        System.out.println("Vui lòng nhập năm sinh của bạn");
        int namsinh = in.nextInt();

        while (namsinh < 1900 || namsinh > 2010 ){
            System.out.println("Năm sinh không hợp lệ vui lòng nhập lại : ");
            namsinh = in.nextInt();
        }
        int tuoi = dulieu - namsinh;
        System.out.println("tuổi của bạn là : " + tuoi);
    }
}

