import java.util.Scanner;


class project{

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int[] arr ={5,89,46,33,75,11,34};

            System.out.println("enter the value which you wants to find in a array");
            int key = sc.nextInt();

            int flag = 0;
            int sumOdd = 0;
            int sumEven = 0;
            for(int i = 0; i<arr.length; i++){

                if(key == arr[i]){
                    flag = i;
                    break;
                }

            }

            for(int j = 0; j<arr.length ; j++){

                 if(arr[j] % 2==0){
                    sumEven += arr[j];
                }

                else if(arr[j] % 2 != 0){
                    sumOdd += arr[j];
                }
            }

                if(flag == 0){
                    System.out.println("No Match Found!!");
                }
                else{
                    System.out.println("Match Found at " + flag +"th position.");
                }

                System.out.println("Sum of odd numbers: " + sumOdd);
                System.out.println("Sum of even numbers: " + sumEven);

            
        }
}