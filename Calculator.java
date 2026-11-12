class Calc{
    
    int add( int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

}

public class Calculator{
    public static void main(String[] args) {

        Calc obj = new Calc();
        System.out.println("Sum of two numbers: " + obj.add(2,3));
        System.out.println("Sum of three numbers: " + obj.add(2,3,4));


    }
}