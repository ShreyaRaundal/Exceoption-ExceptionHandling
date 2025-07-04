public class exceptionHandling {
    public static void main(String[] args) {
        try{
            int rsult=10/0;
        }catch(ArithmeticException ref){
            System.out.println("Cannot divide by zero "+ref);
        }
    }
}
