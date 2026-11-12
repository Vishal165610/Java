import java.util.Scanner;

class factorial{

    public static void main(String a[]){
        int factorial=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int n = sc.nextInt();

        
        System.out.print("Factorial:  ");
        for (int i = 2; i <=n; i++) {
           
            factorial *= i;
            System.out.print(i + ( i<n ? "x" : ""));
        }
        System.out.println( " = " + factorial);
    }

}