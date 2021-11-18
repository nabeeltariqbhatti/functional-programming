package effectivejava;

import java.awt.*;
import java.util.Objects;

public class Point {

    private  final Integer x;
    private  final Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Objects.equals(getX(), point.getX()) && Objects.equals(getY(), point.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}


class PointWithColors extends  Point{

    private final String color ;

    PointWithColors(Integer x, Integer y, String color){
        super(x,y);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    // Broken - violates transitivity!
    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
// If o is a normal Point, do a color-blind comparison
        if (!(o instanceof PointWithColors))
            return o.equals(this);
// o is a ColorPoint; do a full comparison
        return super.equals(o) && ((PointWithColors) o).color == color;
    }


}


class CaseInsensitiveString{
    private final String s;

    CaseInsensitiveString(String s){
        this.s = s;


    }


    @Override
    public boolean equals (Object o){
        if(o instanceof  CaseInsensitiveString && s.equalsIgnoreCase(((CaseInsensitiveString)o).s)){
            return true;
        }
        return false;
    }
}
class Main{
    public static void main(String[] args) {


        PointWithColors p1 = new PointWithColors(1, 2, Color.RED.toString());
        Point p2 = new Point(1, 2);
        PointWithColors p3 = new PointWithColors(1, 2, Color.BLUE.toString());

        System.out.println(p1.equals(p3));

//        System.out.println(pointWithColors.getX() + " " + pointWithColors.getY() + " " + pointWithColors.getColor());
//
//
//        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("polish");
//        CaseInsensitiveString caseInsensitiveString2 = new CaseInsensitiveString("Polishff");
//
//        System.out.println(caseInsensitiveString.equals(caseInsensitiveString2));
    }
}




