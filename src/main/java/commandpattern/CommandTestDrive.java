package commandpattern;

public class CommandTestDrive {

    public static void main(String[] args) {

        Invoker invoker = new Invoker(new LightBulbOnCommand());


        invoker.command.execute();
         invoker.command.undo();

    }
}
