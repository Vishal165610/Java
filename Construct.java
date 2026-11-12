public class Construct{

        int x;
        public Construct(int x){
             this.x = x;
        }

        void display(){
            System.out.println(x);
        }

    public static void main(String[] args) {
        
        Construct con = new Construct(10);
        con.display();
    }
}