import java.util.*;
public class HashSetExample 
{
    public static void main(String[] args) 
    {
        // Create a HashSet to store strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element
        System.out.println("HashSet after additions: " + fruits);

        // Check if an item exists
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + hasBanana);

        // Remove an item
        fruits.remove("Orange");
        System.out.println("HashSet after removing Orange: " + fruits);

        // Get the size of the HashSet
        int size = fruits.size();
        System.out.println("Size of HashSet: " + size);

        // Loop through the HashSet
        System.out.println("Fruits in HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the HashSet
        fruits.clear();
        System.out.println("HashSet after clearing: " + fruits);
    }
}