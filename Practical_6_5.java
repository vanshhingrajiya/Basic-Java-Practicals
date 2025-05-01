import java.util.Scanner;

class Practical_6_5{
    public static void main(String[] args) throws CustomException {
        try{
            if(args.length == 0){
                throw new IllegalArgumentException("No command-line argument provided.");
            }
            if(Integer.parseInt(args[0]) == 0){
                throw new CustomException();
            }
        } catch(CustomException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

class CustomException extends Exception{
    public CustomException(){
        super("Something went wrong.");
    }
}