class A{
    
    public void display(){
        System.out.println("in a A Display");
    }
}

class AnonymousInner{
    public static void main(String a[]){

        A obj = new A(){

            public void display(){
                System.out.println("This is an Annonymous Inner Class");
            }
        };
        obj.display();

    }
}