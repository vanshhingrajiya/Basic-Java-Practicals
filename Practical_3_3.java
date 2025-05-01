class cartesianPoint{
    int x;
    int y;

    cartesianPoint(){
        x = 0;
        y = 0;
    }

    cartesianPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    cartesianPoint(int x){
        this.x = x;
        this.y = x;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void move(int x){
        this.x = x;
        this.y = x;
    }

    public void display(){
        System.out.println("Current values : X = " + getX() + " and Y = " + getY());
    }
}

class Practical_3_3{
    public static void main(String[] args){
        cartesianPoint p1 = new cartesianPoint(1,2);
        p1.display();
        cartesianPoint p2 = new cartesianPoint(9);
        p2.display();
        p2.move(45,54);
        p2.display();
        p2.move(100);
        p2.display();
    }
}