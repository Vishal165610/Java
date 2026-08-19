enum Laptop{ 

    Mackbook(3000), ThinkPad, HpVictus(2500), Acer(2890); // defined the prices of the laptops before initializing the constructor

    // if we define any Object without he the ( price ) inside of it then we need to use the defalt constructor with the price

    Laptop(){
        price = 5000;
    }

    private int price;

    Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

class EnumClass {
    public static void main(String a[]){
        Laptop lap = Laptop.Mackbook;

        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lp: Laptop.values()){
            System.out.println(lp + " : " + lp.getPrice());
        }





        System.out.println(lap.getClass().getSuperclass()); // class java.lang.Enum
    }
}

