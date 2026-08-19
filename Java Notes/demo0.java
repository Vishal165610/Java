
import java.util.Objects;



class Laptop{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.model);
        hash = 23 * hash + this.price;
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    
}



class Demo0{
    public static void main(String a[]){
        Laptop obj1 = new Laptop();
        obj1.model = "Apple";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Apple";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);
        System.out.println(result); // output: true
        countdown();
        //if i want it to be true then i have to override the equals() method in the laptop class and compare the model and price of both objects. if different it will return false else true



        
        // System.out.println(obj.toString());  // or we can directly use obj 
        // output: Laptop@7ad041f3 this is the default toString() method of the Object class which returns the class name followed by the "@" symbol and the hashcode of the object in hexadecimal format.

        //but if we define our own toString() method in the Laptop class, it will override the default toString() method and return the string representation of the object as defined in our method.
        // output: Apple : 1000
    }

    private static void countdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

