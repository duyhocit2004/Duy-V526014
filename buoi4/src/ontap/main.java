
import ontap.Point2D;

import java.util.ArrayList;

public static void main(String[] args) {
    List<Point2D> Point = new ArrayList<Point2D>();

    Point2D point2d_1 = new Point2D(1,5);
    Point2D point2d_3 = new Point2D(3,7);

    // đưa các điểm vào trong danh sách
    Point.add(point2d_1);
    Point.add(point2d_3);

    //hieen thi cac diem trong danh sach
    for (Point2D pointa : Point){
        System.out.println(pointa.toString());
    }

    // tính tổng khoảng cách
    double sum = 0.0;

    for (Point2D pointb :Point){
        sum += pointb.distance();
    }
    System.out.println("tong"+sum);
}