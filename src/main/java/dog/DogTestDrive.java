package dog;

class Dog{


    int size;
    String name;

    void bark(){
        playBark();
    }
    //we can overload function to parametrize it

    void bark(int frequency){


        while (frequency > 0){

            playBark();

            frequency--;
        }
    }

    private void playBark() {
        if(size >= 90){

            System.out.println("Woof, woof!");
            System.out.println("I am " + name);
        }else if(size <= 60 && size > 20){

            System.out.println("Rauf, Rauf!");
            System.out.println("I am " + name);
        }else{

            System.out.println("Yip, yip!");
            System.out.println("I am " + name);

        }
    }


}


public class DogTestDrive{


    public static void main(String[] args) {


        Dog d = new Dog();


        Dog e = d;

        d.name = "Duffy";

//        e.name = "Duffy";

        d.size =91;
//        e.size=91;

        if(d.equals(e)){
            System.out.println("same");
        }


//        d.bark();
//
//        e.bark();
//
//        e.bark(3);
    }
}