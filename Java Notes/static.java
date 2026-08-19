class Mobile {
    String brand;
    String model;
    static String price; //static variable - static 

    public void displayDetails(){    //normal method
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nPrice: " + price);
    }

    public static void displayDetailsStatic(){ //Static method - here we cannot access non-static variables like brand and model because they are not associated with the class but with the object of the class. So we can only access static variables like price here.
        System.out.println("Price: " + price);

    }

    //but there is a method where we can access non-static variables in static method and that is by creating an object of the class inside the static method and then accessing the non-static variables using that object. 
    
    public static void displayDetailsStaticWithObject(Mobile obj){
       System.out.println("Brand: " + obj.brand + "\nModel: " + obj.model + "\nPrice: " + price);

    }

    public Mobile(){
        //constructor
        brand = "Unknown";
        model = "Unknown"; 
        // these are the default values of brand and model when the object is created but we can change it later in the main method. 
        //Question might c7ome into might why didn't we initialize price here in the constructor and the answer is that price is a static variable and static variables are initialized when the class is loaded into memory and not when the object is created so we can initialize it in a static block which will be executed when the class is loaded into memory.
    }

    static{
        //static block - we can use static block to initialize static variables when the class is loaded into memory. Static blocks are executed only once when the class is loaded into memory.
        price = "rs. 50000";
        System.out.println("Static block executed"); // it to show that static block is executed only once when the class is loaded into memory.

         // its the by default value of price when the class is loaded into memory but we can change it later in the main method.
    }
}

class MobileDetails{
    public static void main(String a[]){

        //Static variables:
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.model = "Iphone 14";
        Mobile.price = "Rs. 100000"; // since we used static variable we can access it using the class name although we can also access it using the object name but it is not recommended to do so.

        m1.displayDetails();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.model = "Galaxy S23";
        Mobile.price = "Rs. 80000"; 

        m2.displayDetails();

        //Static methods: 
        Mobile.displayDetailsStatic(); // we can acccess the static method using the class name although we can also access it using the object name but it is not recommended to do so.

        Mobile.displayDetailsStaticWithObject(m1);
        Mobile.displayDetailsStaticWithObject(m2);


        //Static Blocks:
        //Static variables and static methods are initialized when the class is loaded into memory but if we want to initialize same variables  or methods with some other values when the class is loaded into memory then we can use static blocks Static blocks are executed only once when the class is loaded into memory..

      
    }
}

//output - 

// static block is printed first 
//Static block executed - this shows the static block ran one time and 
// Brand: Apple
// Model: Iphone 14
// Price: Rs. 100000
// Brand: Samsung
// Model: Galaxy S23
// Price: Rs. 80000
// Price: Rs. 80000
// Brand: Apple
// Model: Iphone 14
// Price: Rs. 80000
// Brand: Samsung
// Model: Galaxy S23
// Price: Rs. 80000