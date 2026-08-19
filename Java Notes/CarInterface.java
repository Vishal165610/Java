interface Vehicle{

    String engineName = "E245";  // public static final varibale so we must instantiate
    void StartEngine();  // public abstract implicitly

}


class Car implements Vehicle{ 

// uses implement to use methods and variables of Vehicle interface
// also all the methods of interface must be all used otherwsie it will show the error and if we fail to use the all methods of the the interface we have to make this class abstractto remove the compile time error

    public void StartEngine(){
        System.out.println("Started Engine");
    }

}

public class CarInterface{

    public static void main(String a[]){
    
    // we can instantiate the object reference varbiable of the interface but we can't do this : = new Vehicle(); bcz its not the class its interface
    //but we can use the clas which implements that interface like in our car class Car implements the interface Vehicle 
    Vehicle myCar;
    myCar = new Car();

    // now we can use the object reference variable of the interface class to call the methods

    myCar.StartEngine();

    }

}