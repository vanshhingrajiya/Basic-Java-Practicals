interface I1 {}
interface I2 {}
interface I3 extends I1, I2 {}
interface I4 {}

class X implements I3 {}

class W extends X implements I4 {}

public class Practical_5_2{
    public static void main(String[] args) {
        W obj = new W();

        System.out.println("obj instanceof I1: " + (obj instanceof I1));
        System.out.println("obj instanceof I2: " + (obj instanceof I2));
        System.out.println("obj instanceof I3: " + (obj instanceof I3));
        System.out.println("obj instanceof I4: " + (obj instanceof I4));
        System.out.println("obj instanceof X: " + (obj instanceof X));
        System.out.println("obj instanceof W: " + (obj instanceof W));
    }
}   