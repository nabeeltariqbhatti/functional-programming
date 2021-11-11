package effectivejava;

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


        Point p = new Point(12,30);

        System.out.println("Point class " + p.getX() + " " + p.getY());



        PointWithColors pointWithColors = new PointWithColors(40,50,"Black");


        System.out.println(pointWithColors.getX() + " " + pointWithColors.getY() + " " + pointWithColors.getColor());


        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("polish");
        CaseInsensitiveString caseInsensitiveString2 = new CaseInsensitiveString("Polishff");

        System.out.println(caseInsensitiveString.equals(caseInsensitiveString2));
    }
}




