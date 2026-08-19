class Human{
    
    private String name;
    private int age;
    private int phoneNumber;

    // now these private variables can only be accessed by the methods of this class and not by any other class. This is called encapsulation.

    public void setName(String name){ 
        // we can set the values of the private variables only by using setters we can't set the values of the private variables directly from outside the class thats why we use settters to set the values of the private variables.
        this.name=name ; //this keyword is the reference variable that points directly to the current object instance executing the method or constructor
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setPhoneNumber(int p){
        phoneNumber = p; 
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

}

class Encapsulation{
    public static void main(String a[]){
        Human h = new Human();
        h.setName("Vishal");
        h.setAge(20);
        h.setPhoneNumber(917501391);
        System.out.println("Name: " + h.getName() + "\nAge: " + h.getAge() + "\nPhone Number: " + h.getPhoneNumber());
    }
}