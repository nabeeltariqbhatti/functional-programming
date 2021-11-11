package ch2;


import java.util.Arrays;
import java.util.function.Predicate;

class DrumKit{


    boolean topHat = true;
    boolean snare = true;

    public void playSnare(){ System.out.println("bang ban ba-bang");}

    public void playTopHat(){System.out.println("ding ding da-ding");}


}



public class DrumKitTestDrive{



    public static void main(String[] args){



        final DrumKit d = new DrumKit();

        DrumKit e = d;


        d.topHat = false;
        d.snare = false;

        System.out.println(e.topHat + " and  " + e.snare  + " because  d and e both were referring to same object reference " + d.hashCode() );

        d.playSnare();
        d.snare = false;

        if(d.snare == true){

            d.playSnare();
        }


        d.playTopHat();


       Integer x = 234567;
      Byte byteChecker = 7;


        System.out.println(byteChecker.byteValue());

        int[] nums = new int[7];

        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;

        Arrays.sort(nums);
       Arrays.stream(nums).map(operand -> operand*20).filter(value -> value > 100).forEach(System.out::println);
       Arrays.stream(nums).forEach(System.out::println);

    }





}