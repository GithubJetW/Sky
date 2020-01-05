import java.util.*;
//创建一个Point4D类， 在Point3D类创建的(x, y, z)坐标系的基础上再加上t坐标。 t坐标代表时间，因此必须确保它不会被设置为负值。

public class Point4D extends Point3D {
    public int t;
    public Point4D(int x, int y, int z, int t){
        super(x, y, z);
//        int t = Integer.parseInt(t);
        if (t >= 0) {
            this.t = t;     
        }else t = 0;
    }
    
    public Vector<Integer> show() {
//        Vector<int>
        Vector<Integer> pt = new Vector<Integer>();
//        for (int i = 0; i < 4; i++) {
//            pt.add(i)
//        }
        pt.add(this.x);
        pt.add(this.y);
        pt.add(this.z);
        pt.add(this.t);
//        return (this.x + this.y +  this.z + this.t + "\t");
        return pt;
    }
}
