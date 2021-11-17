package proxy;

import java.rmi.*;
import java.rmi.server.*;
public class GumballMachine
        extends UnicastRemoteObject implements GumballMachineRemote
{
    private static final long serialVersionUID = 2L;
    int count =0;
    State state;
    String location;
    public GumballMachine(String location, int numberGumballs) throws RemoteException {

        this.count = numberGumballs;
        this.location = location;

    }
    public int getCount() {
        return count;
    }
//    public State getState() {
//        return state;
//    }
    public String getLocation() {
        return location;
    }

    @Override
    public javax.swing.plaf.nimbus.State getState() throws RemoteException {
        return null;
    }
// other methods here
}