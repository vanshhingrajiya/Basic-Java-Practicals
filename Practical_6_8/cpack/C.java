package cpack;
import apack.A;

public class C{
    public void display(){
        System.out.println("Class C.");
        A obj = new A();
        System.out.println("Public " + obj.pub);
        // System.out.println("Protected " + obj.pro);
        // System.out.println("Private " + obj.pri);
    }
}