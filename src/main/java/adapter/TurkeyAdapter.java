package adapter;

public class TurkeyAdapter implements Duck{



    Turkey turkey;

    public  TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {

        turkey.gobble();
    }

    @Override
    public void fly() throws Exception{

        for (int i=0; i<5; i++) {

            try{
                Thread.sleep(2000);
                turkey.fly();
            }catch (Exception e){
                System.out.println(e);
            }

        }

    }
}
