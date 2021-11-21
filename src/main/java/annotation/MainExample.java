package annotation;

import java.awt.color.ICC_Profile;
import java.lang.annotation.Annotation;
import java.util.*;

public class MainExample {

    public static void main(String[] args) {

        Student student = new Student();

        Class c = student.getClass();

        MyAnnotation annotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.intValue());

        System.out.println(annotation.name());
        System.out.println(annotation.city());


        Map<Integer, Integer> _map = new HashMap<>();





        _map.put(12,34);

        _map.put(13,23);

        _map.put(13,12);


//        _map.entrySet().stream().forEach(System.out::println);

        Iterator<Map.Entry<Integer,Integer>> it = _map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//
//  for(Map.Entry<Integer,Integer> entry : _map.entrySet()){
//      System.out.println(entry.getKey()+  "-> " + entry.getValue() );
//  }
//
//for(Integer key : _map.keySet()){
//
//}

    }
}
