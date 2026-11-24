import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String a[]) throws Exception{

        //default method of creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();


        //Creating an Arraylist with initial capacity
        ArrayList<Integer> List1 = new ArrayList<>(20); //intial capacity of 20

        //creating and List using the Arrays.asList() method
        List<String> List2 = Arrays.asList("Mango", "banana"); 
        // above method created a fixed size limit, so we cannot add or remove elements from it. we can only modify the existing elements using set() method. If we try to add or remove elements from it, we will get the UnsupportedOperationExceptions.
        List2.set(1, "Apple"); //modifies the element at index 1

        String[] arr = {"Grapes", "banana"};
        List<String> List3 = Arrays.asList(arr); //creating a list from array. This method also created a fixed size Limit, so we cannot add or remove elements from it, we can only modify the existing elemets using set() method. If we try to add or remove elements from it, we will get the UnsupportedOperationExceptions.
        List3.set(1, "Apple"); //modifies the element at index 1
        System.out.println(List3); //[Grapes, Apple]

        //Creating an List using the List.of() method. this method also created a fixed size Limit, so we cannot add or remove elements from it, we can only modify the existing elements using set() method. If we try to add or remove elements from it, we cant even modify the existing elements using set() method. If we try to add or remove elements from it, we will get the UnsupportedOperationExceptions.
        List<Integer> List4 = List.of(10, 20);

        //convertiing ArrayList to Array
        List<Integer> List5 = new ArrayList<>();
        List5.add(1);
        List5.add(2);
        List5.add(3);
        Object[] array = List5.toArray();
        List5.toArray(new Integer[0]); //converting to Integer arrray without specifying the size of the array. If we specify the size of the array, it will create an array of that size and copy the elements from the list to the array. If the size of the array is less than the size of the list, it will create a new array of the same type and size as the list and copy the elements from the list to the new array.

        //Sorting an ArrayList using the Collections.sort() method
        List<Integer> List6 = new ArrayList<>();
        List6.add(3);
        List6.add(1);
        List6.add(2);
        Collections.sort(List6); //sorts the list in ascending order
        System.out.println(List6); //[1, 2, 3]

        //but we can also directly use the List.sort() method to sort the list in ascending order
        List6.sort(null); //sorts the list in ascending order
        //here comes the concept of Comparator.

    // private static final int DEFAULT_CAPACITY = 10;

        list.add(3); //0
        list.add(8); //1
        list.add(80); //2 
        list.add(12); //3

        System.out.println(list); //[3, 8, 80, 12]

        //iteration using for loop
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //iteration using for each loop
        for(int x: list){
            System.out.println(x);
        }

        System.out.println(list.contains(40)); //false
        System.out.println(list.contains(80)); //true

        System.out.println(list.isEmpty()); //false
        System.out.println(list.size()); //4

        list.remove(1);  //removes the element at index 1
        System.out.println(list); //[3, 80, 12]
        list.add(2,100); //adds 100 at index 2 and shifts the rest of the elements to the right
        System.out.println(list); //[3, 80, 100, 12]
        list.set(3,200); //replaces the element at index 3 with 200
        System.out.println(list); //[3, 80, 100, 200]

        

    }
} 