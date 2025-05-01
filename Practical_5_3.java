interface Exam{
    public boolean Pass(int marks);
}

interface Classify{
    public String Division(int average);
}

public class Practical_5_3 implements Exam, Classify{
    public boolean Pass(int marks){
        if(marks>=50){
            return true;
        }
        else{
            return false;
        }
    }
    public String Division(int average){
        if(average>=60){
            return "First Division";
        }
        else if(average>=50){
            return "Second Division";
        }
        else{
            return "No Division";
        }
    }

    public static void main(String[] args){
        Practical_5_3 obj = new Practical_5_3();
        System.out.println("Marks : 70 " + obj.Pass(70) + " " +obj.Division(70));        
        System.out.println("Marks : 55 " + obj.Pass(55) + " " +obj.Division(55));        
        System.out.println("Marks : 40 " + obj.Pass(40) + " " +obj.Division(40));        
    }
}
