package annotation;

import java.lang.annotation.Annotation;

public class MainExample {

    public static void main(String[] args) {

        Student student = new Student();

        Class c = student.getClass();

        MyAnnotation annotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.intValue());

        System.out.println(annotation.name());
        System.out.println(annotation.city());


    }
}
