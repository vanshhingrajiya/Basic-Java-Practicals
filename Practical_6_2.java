class Practical_6_2{
    static void divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }else{
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args){
        try{
            try{
                divide(10, 0);
            } catch(ArithmeticException e){
                System.out.println("Arithmetic exception " + e.getMessage());
            }
            
            try{
                int arr[] = {1, 2, 3};
                System.out.println(arr[5]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bound exception : " + e.getMessage());
            }
        } catch(Exception e){
            System.out.println("Somethiong went wrong : " + e.getMessage());
        } finally{
            System.out.println("Finally.");
        }
    }
}
