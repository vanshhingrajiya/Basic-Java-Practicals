class Practical_4_4{
     public static double volume(double l){
        return l*l*l;
    }

    public static double volume(double l, double w, double h){
        return l*w*h;
    }

    public static double volume(double r, boolean b){
        if(b){
            return (4.0/3.0)*3.14*r*r*r;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println("Volume of Cube : " + volume(5.0));
        System.out.println("Volume of Rectangle cube : " + volume(5.5,6.0,7.7));
        System.out.println("Volume of Sphere : " + volume(10.0,true));
    }
}