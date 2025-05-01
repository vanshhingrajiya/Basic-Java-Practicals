abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r = r;
    }
    double area(){
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape{
    double l,w;
    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    double area(){
        return l*w;
    }
}

class Triangle extends Shape{
    double a,b,c;
    public Triangle(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double area(){
        double s = 0;
        s = (a+b+c)/2;
        return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }
}

class Practical_5_1{
    public static void main(String[] args) {
        Circle c = new Circle(10);
        double area = c.area();
        System.out.println(area);
        Rectangle r = new Rectangle(8,9);
        area = r.area();
        System.out.println(area);
        Triangle t = new Triangle(5,6,7);
        area = t.area();
        System.out.println(area);
    }
}