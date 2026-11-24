import java.util.ArrayList;


public class MergingArrayList{
    public static void main(String a[]){

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        list1.addAll(list2);

        System.out.println(list1); //[1, 2, 3, 4]
    }
}