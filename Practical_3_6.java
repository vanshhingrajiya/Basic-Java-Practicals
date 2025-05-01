import java.util.Scanner;

class Practical_3_6{
    int x;
    int y;

    Practical_3_6(){
        this.x = 5;
        this.y = 5;
    }

    Practical_3_6(int x, int y){
        this.x = x;
        this.y = y;
    }

    Practical_3_6(Practical_3_6 temp){
        this.x = temp.x;
        this.y = temp.y;
    }

    public void display(){
        System.out.println("P(" + x + "," + y + ")");
    }

    public static void main(String[] args){
        Practical_3_6 p1 = new Practical_3_6();
        p1.display();
        Practical_3_6 p2 = new Practical_3_6(9,4);
        p2.display();
        Practical_3_6 p3 = new Practical_3_6(p2);
        p3.display();
    }
}