import java.util.Scanner;

public class Practical_6_4{
    
    public static double average(String[] str) throws NullPointerException, NumberFormatException {
        double sum = 0;
        int count = 0;
        
        for(String s : str){
            if(s == null){
                throw new NullPointerException("Array element is null");
            }
            try{
                sum += Double.parseDouble(s);
            } catch(NumberFormatException e){
                throw new NumberFormatException("Invalid number format: " + s);
            }
            count++;
        }        
        return (sum / count);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter value(type double) " + (i+1) + " : ");
            str[i] = scanner.nextLine();
            if("null".equals(str[i])){
                str[i] = null;
            }
        }

        try{
            double result = average(str);
            System.out.println("Average: " + result);
        } catch(NullPointerException | NumberFormatException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}