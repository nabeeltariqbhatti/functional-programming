package commandpattern;

public class Light {

    // we can create interface of receiver but that's okay for now
    public void on(){
        System.out.println("Bulb is turned on");
    }
    public void off(){
        System.out.println("Bulb is turned off");
    }
}
