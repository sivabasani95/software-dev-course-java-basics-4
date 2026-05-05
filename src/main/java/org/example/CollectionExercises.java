package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {

    public String[] makeFruitStringArray() {
        // Step 1: Create an array with size 5
        String[] fruits = new String[5];

        // Step 2: Add fruits by index
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        // Step 3: Return the array
        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Step 1: Create an array using the size parameter
        String[] fruits = new String[size];

        // Step 2: Use a loop to put "apple" in every index
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = "apple";
        }

        // Step 3: Return the array
        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Step 1: Create a new array with size 3
        String[] topThree = new String[3];

        // Step 2: Copy first three items from fruits
        topThree[0] = fruits[0];
        topThree[1] = fruits[1];
        topThree[2] = fruits[2];

        // Step 3: Return the new array
        return topThree;
    }

    public ArrayList<String> makeFruitList() {
        // Step 1: Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Step 2: Add fruits using add()
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        // Step 3: Return the ArrayList
        return fruits;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Step 1: Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Step 2: Add the parameter values
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        // Step 3: Return the ArrayList
        return fruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Step 1: Create a HashMap
        HashMap<String, String> fruitMap = new HashMap<>();

        // Step 2: Add key-value pairs using put()
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");

        // Step 3: Return the HashMap
        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Step 1: Use get() with the key "apple"
        String appleColor = fruitMap.get("apple");

        // Step 2: Return the value
        return appleColor;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Step 1: Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Step 2: Add fruits using add()
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        // Step 3: Return the HashSet
        return fruits;
    }
}