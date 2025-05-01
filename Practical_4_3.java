class Practical_4_3{

    public static double area(double l){
        return l*l;
    }

    public static double area(double l, double w){
        return l*w;
    }

    public static double area(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args){
        System.out.println("Area of Square : " + area(5.0));
        System.out.println("Area of Rectangle : " + area(5.5,6.0));
        System.out.println("Area of Triangle : " + area(10.0,5.7,6.3));
    }
}