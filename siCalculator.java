//Calculate the simple interest and compound interest ( with menu )
//SI = principal amount * rate of interest * time /100
//compound interest = amount - principal amount
//amount = principal amount * (1 + rate of interest /100) ^ time
import java.util.Scanner;
class siCalculator{
    public static void main (String a[]){

        Scanner sc = new Scanner(System.in);

    char again;
    do{
        System.out.print("Enter the principal amount: "); 
        int principalAmount = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();

        System.out.println("Select what you want to calculate: ");

         double simpleInterest = (principalAmount * rateOfInterest * time)/100;
         double amountMuliplier = 1 + (rateOfInterest/100);
         double amount = principalAmount * Math.pow(amountMuliplier, time);
         double compundInterest = amount - principalAmount;

         System.out.println("1. Simple Interest");
         System.out.println("2. Compund Interest");
         System.out.println("3. Both");
         System.out.println("4. Exit");

        int choice = sc.nextInt();

        switch(choice){

            case 1: 
           
            System.out.println("Simple Interest: " + simpleInterest);
            break;

            case 2:
            
            System.out.println("Compound Interest: " + compundInterest);
            break;

            case 3:
                System.out.println("Simple Interest: "+ simpleInterest);
                System.out.println("Compound Interest: " + compundInterest);
                break;

            case 4:
                System.out.println("Exiting the Program");
                break;

            default:
                System.out.println("Invalid Choice");

        }

        System.out.println("Do you want to calculate again? (y/n)");
        again = sc.next().charAt(0);
        
    }while(again=='y' || again=='Y' );
        
        
    }
}
