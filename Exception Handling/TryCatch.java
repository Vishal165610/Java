public class TryCatch{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18/i; //risky code that may throw an exception
        } 
        
        catch (Exception e) {
            System.err.println("Something went wrong");
        }

        finally {
            System.out.println("This is the finally block"); //finally block is always executed whether exception occurs or not
        }

        

        System.out.println(j);

        System.out.println("Exception handling with try-catch worked");
    }
}


//checked  and unchecked exceptions

//checked exceptions are checked at compile time and unchecked exceptions are checked at runtime
//unchecked exceptions are also known as runtime exceptions. They are not checked at compile time, but they can occur during the execution of the program. Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.