package effectivejava;


public class PhasOMatic{



    public static void main(String args[]){


        String[] wordListOne = {"Hello" , "World is the" , "Best phrase to start programmin"};

        String[] wordListTwo = {"Why", "don't", "you", "try", "other variable name", "instead of"};

        String[] wordListThree = {"I will", "Never", "betray this sacred  convention"};



        int randomOne = (int) (Math.random() * ((wordListOne.length-1 - 0) ) );
        int randomTwo = (int) (Math.random() * ((wordListTwo.length-1 - 0) ) );
        int randomThree = (int) (Math.random() * ((wordListThree.length-1 - 0) ));

        System.out.println(randomOne + " " + randomTwo + " " + randomThree);
        System.out.println(wordListOne[randomOne] + " " + wordListTwo[randomTwo] + " " + wordListThree[randomThree]);
    }

}