import java.util.Scanner;

class Practical_4_1{
    public static boolean checkPalindrome(String str,String reverse){
        return str.equalsIgnoreCase(reverse); 
    }
    public static void main(String[] atgs){
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        String[] reverse = new String[5];
        System.out.println("Enter 5 strings.");
        for(int i=0; i<5; i++){
            str[i] = scanner.next();
            reverse[i] = new StringBuilder(str[i]).reverse().toString();;
        }
        for(int i=0; i<5; i++){
            System.out.println("\nString " + (i+1) + " : ");
            System.out.println("Original : " + str[i] + " Reversed : " + reverse[i]);
            if(checkPalindrome(str[i],reverse[i])){
                System.out.println(str[i] + " is Palindrome.");
            }
            else{
                System.out.println(str[i] + " is not Palindrome.");
            }
        }
    }
}