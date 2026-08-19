public class Wrapper{
    public static void main(String a[]){

        //what is wrapper?
        //Wrapper classes are used to convert primitive data types into objects and vice versa.

        int num = 117;
        Integer num1 = new Integer(num); // boxing 
        Integer num2 = num; //autoboxing

        System.out.println(num1);
        System.out.println(num2);

        int num3 = num1.intValue(); // unboxing
        int num4 = num1; //autounboxing
        System.out.println(num3);
        System.out.println(num4);

        String str = "123";
        int num5  = Integer.parseInt(str); //converting string to int
        System.out.println(num5);

        //converting int to string
        String str1 = Integer.toString(num5);
        System.out.println(str1);

    }
}