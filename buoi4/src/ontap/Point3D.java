
package ontap;

import java.util.*;

public class Point3D extends Point2D {
        private double z ;

        public Point3D(double x , double y,double z){
            super(x,y);
            this.z = z;
        }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + this.getX() + "}" + "Y="+this.getY() + "z="+ this.z+ "}";
    }


    public double dinstance() {
        return Math.sqrt(super.distance() * this.distance() * this.z * this.z);
    }
}