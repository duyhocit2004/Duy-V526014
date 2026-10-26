package ontap;

public class hinhtron {
    private double x =2;
    private  double y =3;
    private double r =6;

    public hinhtron(){

    }

    public hinhtron(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getR() {
        return r;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "hinhtron{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }


    public int dientichhinhtron(){
        return (int) (Math.PI * r * r);
    }
}
