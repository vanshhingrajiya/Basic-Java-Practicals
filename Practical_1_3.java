import java.util.Scanner;

class Practical_1_3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x; 
        double y;
        System.out.println("ax+by=e and cx+dy=f.");
        System.out.println("To find x and y, enter values like above");
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter e");
        double e = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        System.out.println("Enter d");
        double d= scanner.nextDouble();
        System.out.println("Enter f");
        double f= scanner.nextDouble();
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("X = " + x); 
        System.out.println("Y = " + y); 
    }
}