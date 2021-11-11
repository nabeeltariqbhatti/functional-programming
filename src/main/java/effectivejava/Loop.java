package effectivejava;
class Loopy{


    public static void main(String args[]){


        int z = 1;

        System.out.println("This is before the execution of the loop");


        for(int i = 0; i< 4; i++){


            System.out.println("Loop is running");

            System.out.println("Iteration number is " + i);


        }


        System.out.println("Loop has run");




    }

}