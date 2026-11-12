import java.util.Scanner;

class Array{
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);
        int row = 0;
        int col = 0;
        System.out.println("Enter the values of array: ");

        row = sc.nextInt();
        col = sc.nextInt();
        int arr[][] = new int[row][col];

        
        int value = 0;
        for(int i = 0;i<row ; i++){
            for(int j = 0; j<col; j++){

                arr[i][j] = value;
                value += 2;
            }
        }

        System.out.println(value);

    }
}