package data_structures;

import com.sun.source.tree.ReturnTree;

import java.text.MessageFormat;
import java.util.*;

public class DataStructures {

    public static void main(String[] args) {
        /*System.out.println(DataStructures.getArrayList());
        DataStructures.useArrayList();
        DataStructures.useLinkedList();
        DataStructures.useHashMap();
        DataStructures.useHashSet();*/
        DataStructures.useQueue();
    }

    //ArrayList are faster for item access than LinkedLists but slower for insertion and deletion
    public static ArrayList<String> getArrayList(){
        //The ArrayList is a modifiable list in Java, that is the difference with normal arrays: type[]
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Strawberries");
        fruits.add("Grape");
        //Removing item with index 3
       // fruits.remove(3);

        return fruits;
    }

    //LinkedList are faster for insertion and delete than ArrayLists but slower for item access
    public static LinkedList<String> getLinkedList(){
        LinkedList<String> technologies = new LinkedList<String>(){
            {
                add("Spring Boot");
                add("ASP.NET Core");
                add("Laravel");
            }
        };

        return technologies;
    }

    //A HashMap is a key-value based data structure in Java
    public static HashMap<String, String> getHashMap(){
        HashMap<String,String> capitals = new HashMap<>(){
            {
                //Storing new key-value pairs inside the HashMap
                put("DR", "Santo Domingo");
                put("ES", "Madrid");
                put("USA", "Washington");
                put("SWIT", "Berna");
                put("FR", "Paris");
            }
        };

        return capitals;
    }

    //HashSets are data structures that holds unrepeated and unique values
    public static HashSet<String> getHashSet(){
        HashSet<String> people = new HashSet<>(){
            {
                add("Adrian");
                add("Yarilyn");
                add("Elmer");
            }
        };

        return  people;
    }
    public static Queue<String> getQueue(){
        Queue<String> row = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Fourth");
            }
        };

        return row;
    }
    public static void useArrayList(){
        ArrayList<String> fruits = DataStructures.getArrayList();
        //Getting the item with index 1
        System.out.println(fruits.get(1));
        //Changing the item with index 1 for "Mango"
        fruits.set(1, "Mango");
        System.out.println(fruits);
        //Get the current size of the ArrayList
        System.out.println(fruits.size());

        for (String fruit: fruits){
            //Formatted strings in Java
            String message = MessageFormat.format("Fruit found in the fruits list: {0}", fruit);
            System.out.println(message);
        }
        //Sorting the array list with collections, this way will modify the original ArrayList
        Collections.sort(fruits);
        System.out.println(fruits);
    }

    //Also, LinkedLists are more efficient than ArrayList in the use of the following methods
    public static void useLinkedList(){
        LinkedList<String> technologies = DataStructures.getLinkedList();
        System.out.println(technologies);
        System.out.println(technologies.getFirst());
        System.out.println(technologies.getLast());
        technologies.addFirst("AWS");
        technologies.addLast("Azure");
        System.out.println(technologies);
        technologies.removeLast();
        technologies.removeFirst();
        System.out.println(technologies);
        technologies.add(1, "Docker");
        System.out.println(technologies);
        technologies.remove();
        System.out.println(technologies);
    }

    public static void useHashMap(){
        HashMap<String, String> capitals = DataStructures.getHashMap();

        //Accesing a HashMap value through its key
        System.out.println(capitals.get("ES"));

        //capitals.clear(); //Clearing out completely a HashMap
        System.out.println(capitals);
        //Removing an item based in its key
        capitals.remove("FR");
        System.out.println(capitals);
        //Getting the size of the HashMap
        System.out.println(capitals.size());
        //Accesing to the Set corresponding to the Keys of the HashMap
        System.out.println(capitals.keySet());
        //Accesing to the Set corresponding to the Values of the HashMap
        System.out.println(capitals.values());

    }

    public static void useHashSet(){
        HashSet<String> people = DataStructures.getHashSet();

        System.out.println(people);
        //Adding values to the HashSet
        people.add("Claudin");
        //Checking if the Hash
        System.out.println(people.contains("Adrian"));
        System.out.println(people);
        //Removing a value based on the value
        people.remove("Claudin");
        System.out.println(people);
        //Checking the size of the HashSet
        System.out.println(people.size());

        for (String value: people){
            System.out.println(value);
        }
        System.out.println("From ForEach method");
        people.forEach(p -> System.out.println(p));
    }

    public static void useQueue(){
        Queue<String> row = DataStructures.getQueue();
        //Getting the item that is ahead of the queue
        System.out.println(row.peek());
        //Removing the item ahead of the queue, we can also use .remove() but it will return
        // an Exception is there are not items
        row.poll();
        System.out.println(row.peek());
        //Getting the item ahead of the queue without removing it
        String secondItem = row.element();
    }
}
