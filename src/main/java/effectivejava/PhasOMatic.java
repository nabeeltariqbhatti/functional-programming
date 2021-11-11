package effectivejava;
class Shape{

    //we actually remove the function parameters because only the amoeba has different way to calculate the point of circulation
    //and sound track to play for which we have overridden the functions
    void rotate(String shapeType){
        System.out.println("rotating the shape " + shapeType);


    }

    void playSound(String file){
        System.out.println("playing sound from  " + file);
    }
}


class Circle extends Shape{}
class Triangle extends Shape{}
class Rectangle extends  Shape{}

class Amoeba extends Shape{ private   final  int  x;
    private  final int y;


    Amoeba(int x, int y){ this.x =x; this.y = y;}
    @Override
    void rotate(String shapeType){
        System.out.println("rotating amoeba with " + x + " and  " + y);
    }
}

public class PhasOMatic{



    public static void main(String args[]){

   Amoeba amoeba = new Amoeba(12,30);


   amoeba.rotate("amoeba");

   amoeba.playSound(".hif");
//        String[] wordListOne = {"Hello" , "World is the" , "Best phrase to start programmin"};
//
//        String[] wordListTwo = {"Why", "don't", "you", "try", "other variable name", "instead of"};
//
//        String[] wordListThree = {"I will", "Never", "betray this sacred  convention"};
//
//
//
//        int randomOne = (int) (Math.random() * ((wordListOne.length-1 - 0) ) );
//        int randomTwo = (int) (Math.random() * ((wordListTwo.length-1 - 0) ) );
//        int randomThree = (int) (Math.random() * ((wordListThree.length-1 - 0) ));
//
//        System.out.println(randomOne + " " + randomTwo + " " + randomThree);
//        System.out.println(wordListOne[randomOne] + " " + wordListTwo[randomTwo] + " " + wordListThree[randomThree]);
//
//
//        //this will print the value two times
//            int x = 5;
//            while ( x > 1 ) {
//                x = x - 1;
//                if ( x < 3) {
//                    System.out.println("small x");
//                }
//            }

        //prints the big x 6 times
//        int x = 1;
//        while ( x < 10 ) {
//            if ( x > 3) {
//                System.out.println("big x");
//            }
//            x++;
//        }

        //this will print 2 times
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }

    }

}