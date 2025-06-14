// Sorted TreeSet with own methods to store unic elements

package com.set;

import java.util.SortedSet;
import java.util.TreeSet;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating sorted set
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Jeans");
        set.add("Snickers");
        set.add("Sandals");
        set.add("Flip flops");
        set.add("T-shirt");
        set.add("Jacket");
        set.add("Sweater");
        set.add("Skirt");
        set.add("Blouse");
        set.add("Dress");
        set.add("Hat");
        set.add("Gloves");
        set.add("Pyjama");

        // Printing alphabetically sorted elements of set to console
        System.out.println(set);

        // Printing last element of set to console
        System.out.println(set.last()); // T-shirt

        // Printing first element of set to console
        System.out.println(set.first()); // Blouse

        //  Printing subset to console
        for (String s : set.subSet("Gloves", "Sandals")) {
            System.out.println(s); // Gloves /nHat /nJacket /nJeans /nPyjama
        }
    }
}