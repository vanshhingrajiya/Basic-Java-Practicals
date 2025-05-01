package bpack;
import apack.A;

public class B extends A{
    public void display(){
        System.out.println("Class B.");
        System.out.println("Public : " + pub);
        System.out.println("Protected : " + pro);
        // System.out.println("Private : " + pri);
    }
}