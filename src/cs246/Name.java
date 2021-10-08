package cs246;

import javax.swing.*;

public class Name {
    public String name;
    public String getName(){
        return JOptionPane.showInputDialog("Give me your name: ");
    }
    public void printName(){
        this.name = getName();
        System.out.println("Hello, my name is " + name);

    }
}
