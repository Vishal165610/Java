import basic.*;

public class Outside extends Original1{
    
    public void displayMemory(){
        System.out.println(memory); 
    }

    public static void main(String a[]){
        Outside obj = new Outside();
        obj.displayMemory();
    }
}