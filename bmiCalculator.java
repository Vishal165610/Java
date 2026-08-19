import java.util.Scanner;


class BmiCalculator{
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Welcome to BMI Calculator");

        System.out.print("Enter your weight(kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height(m): ");
        double height = sc.nextDouble();

        double bmi = weight/Math.pow(height,2);

        System.out.println("Your BMI: " + bmi);

        if(bmi<18.5){
            System.out.println("Category: Underweight");
        }
        else if(bmi>18.5 || bmi<24.9){
            System.out.println("Category: Normal");
        }
        else if(bmi>24.9){
            System.out.println("Category: Obese");
        }

    }
}
