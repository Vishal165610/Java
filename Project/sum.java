import java.util.Scanner;

class Sum{

    public static void main(String a[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int sumfor = 0;
        System.out.print("For Loop: ");
        for (int i = 1; i <=n; i++) {
            
            sumfor += i;
            System.out.print(i + ( i<n ? "+" : ""));
        }
        System.out.println( " = " + sumfor);

        int sumWhile = 0;
        int j = 1;
        System.out.print("While Loop: ");
        while(j<=n){
            sumWhile += j;
            
            System.out.print(j + ( j<n ? "+" : ""));
            j++;

        }

        System.out.println( " = " + sumWhile);

        int sumDo = 0;
        int k = 1;
        System.out.print("Do-While Loop: ");
        if (n > 0) {
            do {
                sumDo += k;
                System.out.print(k + (k < n ? "+" : ""));
                k++;
            } while (k <= n);
        }
        System.out.println(" = " + sumDo);


    }
}