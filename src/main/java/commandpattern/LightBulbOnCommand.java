package commandpattern;

public class LightBulbOnCommand implements Command{
    Light light = new Light();
    @Override
    public void execute() {

        light.on();
    }

    @Override
    public void undo() {

        light.off();
    }
}
