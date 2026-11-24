
# Java Collections: ArrayList

## 1. What is an ArrayList?

An `ArrayList` is a resizable implementation of the Java `List` interface.

Unlike a regular array, whose length is fixed after creation, an `ArrayList` can grow or shrink as elements are added or removed.

Internally, an `ArrayList` stores its elements in an array (commonly called `elementData` in OpenJDK). This internal array stores references to objects.

```java
ArrayList<Integer> list = new ArrayList<>();
```

### Size vs Capacity

These two terms are different:

- **Size:** Number of elements currently stored in the ArrayList.
- **Capacity:** Number of elements the internal array can hold before resizing is required.

For example, an ArrayList can have:
- Size = 4
- Capacity = 10

You can check the size using:

```java
list.size();
```

However, ArrayList does not provide a public method to directly check its internal capacity.

### Default Capacity

In common OpenJDK implementations, a default-constructed ArrayList initially uses an empty internal array. When the first element is added, it typically allocates an array with a capacity of 10.

This is an implementation detail and should not be treated as a permanent API guarantee.

---

## 2. How ArrayList Works Internally

### Adding Elements

When we add an element to an ArrayList, the following steps occur:

1. **Check Capacity:** ArrayList checks whether there is enough space in its internal array (`elementData`).
2. **Resize if Necessary:** If the internal array is full, a larger array is created.
3. **Copy Elements:** Existing elements are copied from the old array to the new array.
4. **Add the Element:** The new element is inserted at the appropriate index.
5. **Update Size:** The size of the ArrayList is incremented.

### Growth Factor

In common OpenJDK implementations, when the internal array becomes full, its capacity generally grows by approximately 1.5 times.

For example:

- Initial capacity: 10
- Next capacity: 15
- Next capacity: 22
- Next capacity: 33

The exact growth policy is an implementation detail and may vary.

### Copying Elements

When resizing occurs, existing elements must be copied into the new internal array.

This is an O(n) operation, where n is the number of elements.

However, adding elements at the end of an ArrayList has an **amortized O(1)** time complexity.

### Removing Elements

When an element is removed:

1. **Check Bounds:** ArrayList checks whether the specified index is valid.
2. **Remove Element:** The element at that index is removed.
3. **Shift Elements:** All elements to the right of the removed element shift one position to the left.
4. **Reduce Size:** The size is decremented by 1.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);

list.remove(1);

System.out.println(list); // [10, 30, 40]
```

Removing an element from the middle or beginning generally takes O(n) time because elements need to shift.

---

## 3. Setting Initial Capacity

We can specify the initial capacity while creating an ArrayList.

```java
ArrayList<Integer> list = new ArrayList<>(1000);
```

This sets the requested initial capacity to 1000.

**Important:** Initial capacity is NOT the size of the ArrayList.

```java
System.out.println(list.size()); // 0
```

The ArrayList is still empty.

Capacity simply determines how many elements the internal array can accommodate before resizing is required.

If we know that we are going to store approximately 1000 elements, setting an initial capacity can help reduce unnecessary resizing operations.

There is no public `capacity()` method in ArrayList. Reflection can sometimes be used to inspect internal fields, but this is generally discouraged because it depends on implementation details and may be restricted by Java's module system.

---

## 4. Different Ways to Create an ArrayList

### 4.1 Default Constructor

```java
ArrayList<Integer> list = new ArrayList<>();
```

Creates an empty ArrayList.

### 4.2 Constructor with Initial Capacity

```java
ArrayList<Integer> list = new ArrayList<>(20);
```

Creates an empty ArrayList with an initial capacity of 20.

### 4.3 Using Arrays.asList()

```java
import java.util.Arrays;
import java.util.List;

List<String> list = Arrays.asList("Mango", "Banana");

list.set(1, "Apple");

System.out.println(list); // [Mango, Apple]
```

`Arrays.asList()` creates a fixed-size list backed by the supplied array.

Important points:

- We cannot add elements.
- We cannot remove elements.
- We can modify existing elements using `set()`.
- Trying to add or remove elements throws `UnsupportedOperationException`.
- Changes to the list are reflected in the original array and vice versa.

We can also create a list using an existing array:

```java
String[] arr = {"Grapes", "Banana"};

List<String> list = Arrays.asList(arr);

list.set(1, "Apple");

System.out.println(list); // [Grapes, Apple]
System.out.println(Arrays.toString(arr)); // [Grapes, Apple]
```

### 4.4 Using List.of()

```java
import java.util.List;

List<Integer> list = List.of(10, 20);
```

`List.of()` creates an unmodifiable list.

Important points:

- We cannot add elements.
- We cannot remove elements.
- We cannot modify existing elements using `set()`.
- It does not allow null elements.
- Modification operations throw `UnsupportedOperationException`.

### Comparison

| Feature | ArrayList | Arrays.asList() | List.of() |
|---|---|---|---|
| Add elements | Yes | No | No |
| Remove elements | Yes | No | No |
| Modify using set() | Yes | Yes | No |
| Fixed size | No | Yes | Yes |
| Allows null | Yes | Yes | No |

If we want to convert a fixed-size or unmodifiable list into a resizable ArrayList:

```java
List<String> list = new ArrayList<>(
    List.of("Mango", "Banana")
);

list.add("Apple");
```

---

## 5. Common ArrayList Methods

Consider the following ArrayList:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(3);
list.add(8);
list.add(80);
list.add(12);
```

| Method | Description |
|---|---|
| `add(element)` | Adds an element at the end. |
| `add(index, element)` | Inserts an element at a specified index. |
| `get(index)` | Returns the element at the specified index. |
| `set(index, element)` | Replaces an existing element. |
| `remove(index)` | Removes the element at the specified index. |
| `remove(object)` | Removes the first matching element. |
| `size()` | Returns the number of elements. |
| `isEmpty()` | Checks whether the list is empty. |
| `contains(object)` | Checks whether an element exists. |
| `clear()` | Removes all elements. |
| `indexOf(object)` | Returns the first occurrence index or -1. |

### Examples

```java
System.out.println(list); // [3, 8, 80, 12]

System.out.println(list.contains(40)); // false
System.out.println(list.contains(80)); // true

System.out.println(list.isEmpty()); // false
System.out.println(list.size()); // 4

list.remove(1);

System.out.println(list); // [3, 80, 12]

list.add(2, 100);

System.out.println(list); // [3, 80, 100, 12]

list.set(3, 200);

System.out.println(list); // [3, 80, 100, 200]
```

**Important:** When working with `ArrayList<Integer>`, `remove(1)` removes the element at index 1, not the integer value 1.

To remove the actual integer value:

```java
list.remove(Integer.valueOf(1));
```

---

## 6. Iterating Through an ArrayList

### Using a Regular For Loop

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

Useful when we need the index of each element.

### Using an Enhanced For Loop

```java
for (int element : list) {
    System.out.println(element);
}
```

Useful when we only need the elements and not their indexes.

---

## 7. Converting ArrayList into an Array

### Using toArray()

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(1);
list.add(2);
list.add(3);

Object[] arr = list.toArray();
```

This converts the ArrayList into an Object array.

### Converting into a Specific Data Type

```java
Integer[] arr = list.toArray(new Integer[0]);
```

This converts the ArrayList into an Integer array.

If the supplied array is too small, Java creates a new array of the required size.

If the supplied array is large enough, it is reused, and the position immediately after the copied elements is set to null when applicable.

---

## 8. Sorting an ArrayList

### Using Collections.sort()

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<Integer> list = new ArrayList<>();

list.add(3);
list.add(1);
list.add(2);

Collections.sort(list);

System.out.println(list); // [1, 2, 3]
```

`Collections.sort()` sorts the list in ascending natural order.

### Using List.sort()

We can also directly use the `sort()` method provided by the List interface.

```java
list.sort(null);

System.out.println(list); // [1, 2, 3]
```

Passing null tells Java to use the natural ordering of elements.

### Sorting in Descending Order

```java
list.sort(Collections.reverseOrder());

System.out.println(list); // [3, 2, 1]
```

This introduces the concept of **Comparator**, which allows us to define custom sorting rules.

---

## 9. Merging Two ArrayLists

We can merge two ArrayLists using the `addAll()` method.

```java
import java.util.ArrayList;

public class MergingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(4);

        list1.addAll(list2);

        System.out.println(list1); // [1, 2, 3, 4]
    }
}
```

`addAll()` adds all elements of the second collection to the first collection.

It does not remove elements from the second ArrayList.

We can also insert all elements at a particular index:

```java
list1.addAll(1, list2);
```

---

## 10. Time Complexity of ArrayList

Let n represent the number of elements in the ArrayList.

| Operation | Time Complexity |
|---|---|
| `get(index)` | O(1) |
| `set(index, element)` | O(1) |
| `add(element)` | Amortized O(1) |
| `add(index, element)` | O(n) |
| `remove(index)` | O(n) |
| `contains(element)` | O(n) |
| `indexOf(element)` | O(n) |
| `size()` | O(1) |
| `isEmpty()` | O(1) |
| `clear()` | O(n) |

### Why?

- **get():** Direct access using the array index.
- **set():** Directly replaces the element at an index.
- **add():** Usually adds at the end. Occasionally resizing is required.
- **add(index):** May require shifting existing elements.
- **remove(index):** May require shifting elements to fill the gap.
- **contains():** Searches elements one by one.
- **size():** The current size is maintained internally.

---

## 11. Complete Practice Code

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Default ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // ArrayList with initial capacity
        ArrayList<Integer> list1 = new ArrayList<>(20);

        // Creating a fixed-size list using Arrays.asList()
        List<String> list2 = Arrays.asList("Mango", "Banana");

        list2.set(1, "Apple");

        System.out.println(list2); // [Mango, Apple]

        // Creating a list using an existing array
        String[] fruits = {"Grapes", "Banana"};

        List<String> list3 = Arrays.asList(fruits);

        list3.set(1, "Apple");

        System.out.println(list3); // [Grapes, Apple]

        // Creating an unmodifiable list
        List<Integer> list4 = List.of(10, 20);

        // Adding elements
        list.add(3);
        list.add(8);
        list.add(80);
        list.add(12);

        System.out.println(list); // [3, 8, 80, 12]

        // Iteration using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Iteration using enhanced for loop
        for (int element : list) {
            System.out.println(element);
        }

        // Checking elements
        System.out.println(list.contains(40)); // false
        System.out.println(list.contains(80)); // true

        System.out.println(list.isEmpty()); // false
        System.out.println(list.size()); // 4

        // Removing element at index 1
        list.remove(1);

        System.out.println(list); // [3, 80, 12]

        // Adding element at index 2
        list.add(2, 100);

        System.out.println(list); // [3, 80, 100, 12]

        // Replacing element at index 3
        list.set(3, 200);

        System.out.println(list); // [3, 80, 100, 200]

        // Converting ArrayList into an array
        Object[] objectArray = list.toArray();

        Integer[] integerArray = list.toArray(new Integer[0]);

        // Sorting using Collections.sort()
        Collections.sort(list);

        System.out.println(list);

        // Sorting using List.sort()
        list.sort(null);
    }
}
```

---

## 12. Important Points to Remember

1. ArrayList is a resizable implementation of the List interface.
2. Internally, it uses an array to store elements.
3. Size and capacity are two different concepts.
4. Initial capacity does not determine the size of an ArrayList.
5. Default capacity is typically allocated as 10 on the first insertion in common OpenJDK implementations.
6. Capacity generally grows by approximately 1.5 times in common OpenJDK implementations.
7. Adding elements at the end is amortized O(1).
8. Inserting or removing elements from the middle generally takes O(n).
9. `Arrays.asList()` creates a fixed-size list.
10. `List.of()` creates an unmodifiable list.
11. `addAll()` is used to merge collections.
12. `toArray()` converts an ArrayList into an array.
13. `Collections.sort()` and `List.sort()` can be used for sorting.
14. ArrayList allows duplicate elements and null values.
15. ArrayList is not synchronized by default.

---

**Next Topic:** LinkedList
