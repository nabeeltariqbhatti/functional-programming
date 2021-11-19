package effectivejava;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

// List-based Chooser - typesafe
 class Chooser<T> {
    private final List<T> choiceList;
    public Chooser(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    @Override
    public String toString() {
        return "Chooser{" +
                "choiceList=" + choiceList +
                '}';
    }
}
abstract class Car
{
    String model;
    String brand;
    public abstract void addFeatures();
    Car()
    {
        this.model = "X5";
        this.brand = "BMW";
    }
}
class SportCar extends Car
{
    boolean nitro;
    @Override
    public void addFeatures()
    {
        this.nitro = true;
    }
    public void showDetail()
    {
        System.out.println("Model :"+ model);
        System.out.println("Brand :"+ brand);
        System.out.println("Nitro :"+ nitro);
    }
}


class Main{


    public static void main(String[] args) {



//        Object[] objectArray = new Long[1];
//        objectArray[0] = "I don't fit in"; // Throws ArrayStoreException

        // Won't compile!


        Chooser<Integer> chooser = new Chooser<Integer>(List.of(1,2));

        chooser.choose();

        System.out.println(chooser);
        System.out.println(chooser);
        System.out.println(chooser);




        List<Object> ol = new ArrayList<>(); // Incompatible types
        ol.add("I don't fit in");

 // Why generic array creation is illegal - won't compile!
//        List<String>[] stringLists = new List<String>[1]; // (1)
//        List<Integer> intList = List.of(42); // (2)
//        Object[] objects = stringLists; // (3)
//        objects[0] = intList; // (4)
//        String s = stringLists[0].get(0); // (5)


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




