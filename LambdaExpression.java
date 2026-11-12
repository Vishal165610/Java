
@FunctionalInterface //without this the compiler wont know which interface to run in the lambda expression so its imp
interface A{

    int add(int i, int j);

}

public class LambdaExpression {

    public static void main(String a[]){

        // Normal Annoymous Inner Class
        // A obj = new A(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        // Lambda Expression 

         A obj = (i,j) -> i+j;
            
        
    }
}