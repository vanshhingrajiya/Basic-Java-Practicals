class Practical_3_2 { //Practical_3_2 = rectangle
    double width;
    double height;
    Practical_3_2(){
        width = 1.0;
        height = 1.0;
    }
    Practical_3_2(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return (width*height);
    }

    double getPerimeter(){
        return (2*(width+height));
    }
    public static void main(String[] args){
        Practical_3_2 r1 = new Practical_3_2(4,40);
        Practical_3_2 r2 = new Practical_3_2(3.5,35.9);
        System.out.println("\nRectangle 1 :");
        r1.display();
        System.out.println("\nRectangle 2 :");
        r2.display();
    }

    void display(){
        System.out.println("Width : " + width);
        System.out.println("Heigth : " + height);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }
}
