abstract class A{
    abstract void display();
}

class AbstractAnonymous{
    public static void main(String a[]){
        A obj = new A(){

            public void display(){
                System.out.println("This is an Annonymous Inner Class");           
                
                }
        };
        obj.display();
    }
}