class Calculator {
    

    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Result 1: " + calc.add(5, 10));         
        System.out.println("Result 2: " + calc.add(5, 10, 20));      
        System.out.println("Result 3: " + calc.add(5.5, 4.5));        
    }
}
