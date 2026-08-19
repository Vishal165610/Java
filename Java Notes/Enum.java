enum Status{

    Running, Failed, Executed, Error404; // these are the objects 

}

public class Enum{
    public static void main(String a[]) {
        
        Status s = Status.Error404;
        Status[] ss = Status.values();

        System.out.println(s);

        System.out.println(s.ordinal()); // this gives indexing to the enum from 0 to 3 so as per that the index 3 has Error404


        for(Status st: ss){
            System.out.println(st + " : " + st.ordinal());
        }

        


    }
}