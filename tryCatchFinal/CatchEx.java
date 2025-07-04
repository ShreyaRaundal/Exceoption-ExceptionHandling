package tryCatchFinal;

public class CatchEx {
    public static void min(String[] args){
        try{
            int a=5/0;
        }catch(ArithmeticException e){
            System.out.println("Caught: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
