package tryCatchFinal;

public class FinallyBlock {
    public static void main(String[]args){
        try{
            int a=5/1;
        }catch(ArithmeticException e){
            System.out.println("Handling exception");

        }finally{
            System.out.println("Finally block runs always");
        }

    }
}
