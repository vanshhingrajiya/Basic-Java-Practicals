import java.util.Scanner;

class Shape{
    
    double dimension1;
    double dimension2;

    public void getData(double d1, double d2){
        dimension1 = d1;
        dimension2 = d2;
    }

    public void displayArea(){
        System.out.println("Shape class.");
    }
}

class Triangle extends Shape{

    public void displayArea(){
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape{

    public void displayArea(){
        double area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Practical_4_6{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Triangle tri = new Triangle();
        System.out.print("Enter base and height of Triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        tri.getData(base, height);
        tri.displayArea();

        Rectangle rect = new Rectangle();
        System.out.print("\nEnter length and width of Rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        rect.getData(length, width);
        rect.displayArea();
    }
}