import java.util.Scanner;

class Practical_3_5{
    int h; // h = hour
    int m; /// m = minutes
    int s; // s = seconds
    
    public void printTime(){
        System.out.print("Time : " + this.h + ":" + this.m + ":" + this.s + "\n");
    }

    public void sum(Practical_3_5 t1, Practical_3_5 t2){
        int temp1 = (t1.h*3600) + (t1.m*60) + t1.s;
        int temp2 = (t2.h*3600) + (t2.m*60) + t2.s;
        if(temp1 < 0 || temp2 < 0){
            System.out.println("Please enter positive time.");
        } else{
            int temp3 = temp1 + temp2;
            this.h = temp3/3600;
            this.m = (temp3%3600)/60;
            this.s = (temp3%3600)%60;
        }
    }

    public void getTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour : ");
        this.h = scanner.nextInt();
        checkTime(this.h);
        System.out.print("Enter minutes : ");
        this.m = scanner.nextInt();
        checkTime(this.m);
        System.out.print("Enter seconds : ");
        this.s = scanner.nextInt();
        checkTime(this.s);
    }

    public void checkTime(int i){
        if(i < 0){
            System.out.print("Please enter positive number only.");
            System.exit(0);
        }
        else if(i > 60){
            System.out.print("Please enter number between 0-60.");
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Practical_3_5 t1 = new Practical_3_5();
        System.out.println("Time 1");
        t1.getTime();
        Practical_3_5 t2 = new Practical_3_5();
        System.out.println("Time 2");
        t2.getTime();
        Practical_3_5 t3 = new Practical_3_5();
        t3.sum(t1,t2);
        t1.printTime();
        t2.printTime();
        t3.printTime();
    }
}