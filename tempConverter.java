
class TempConverter{
    public static void main(String args[]){
        double f = 200.8;
        double c = (f-32) * (5.0/9);
        System.out.println("Fahrenheit: " +f);
        System.out.printf("Celcius: %.2f\n" , c);
        // used %.2f\n to print the value of celcius to two decimal places
        
        //learnt: if we do 5/9 it will provide answer as 0 because it prints the integer value but if we do 5.0/9 it will print the exactly correct values
    }
}
