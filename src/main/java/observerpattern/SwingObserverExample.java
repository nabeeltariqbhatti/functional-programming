package observerpattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("sjkdfsjkadfgjsa"));
        button.addActionListener(event -> System.out.println("sjkdfsjkadfgjsa"));
// Set frame properties here
    }

}