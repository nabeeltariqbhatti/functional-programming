package effectivejava;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Party{


    public void buildInvite(){


        Frame f = new JFrame();
        Label l = new Label("Party at Tim's ");

        Button b = new Button("You bet");
        Button c = new Button("Shoot me");

        Panel p = new Panel();


        p.add(l);
    }
}
public class PartyAtTims {

    public static void main(String args[]) throws FileNotFoundException {


        Party  p = new Party();

        p.buildInvite();

        System.out.println("Called");



    }
}
