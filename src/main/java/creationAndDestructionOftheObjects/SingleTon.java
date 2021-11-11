package creationAndDestructionOftheObjects;

import java.awt.desktop.OpenFilesEvent;
import java.util.Optional;

public class SingleTon {
    // Singleton with final field
    public static class Elvis {
        public static final Elvis INSTANCE = new Elvis();
        private Elvis() {}


    }


    // Singleton with static factory
    public static class ElvisTwo {
        private static ElvisTwo INSTANCE = null;
        private ElvisTwo() {

        }
        public static ElvisTwo getInstance() {
            if(INSTANCE == null){
                INSTANCE = new ElvisTwo();
                return  INSTANCE;
            }
            return INSTANCE;
        }

    }

    public static void main(String[] args) {

        for(int i =0; i<10000; i++){
            System.out.println(Elvis.INSTANCE.hashCode());



        }


//        for(int i =0; i<10000; i++){
//            System.out.println(ElvisTwo.getInstance().hashCode());
//
//
//
//        }


        //lazy loading singleton



        System.out.println(Optional.ofNullable(ElvisTwo.INSTANCE));

        System.out.println(ElvisTwo.getInstance().hashCode());

        //eager loading

        System.out.println(Elvis.INSTANCE);


    }
}
