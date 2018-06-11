package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        Main mainClass = new Main();
        mainClass.testingLists();
    }

    private void testingLists() {
        nameList = new ArrayList<String>();

        nameList.add("Crystal");
        nameList.add("Chris");
        nameList.add("Bin");
        nameList.add("Luke");
// For Each Loop to see all items in arrayList.
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("See a single item in the array list:");
        System.out.println(nameList.get(2));

        System.out.println("Remove a single item and list what is left in the ArrayList: ");
        nameList.remove(0);

        for (String name : nameList) {
            System.out.println(name);

        }


        System.out.println("viewing array List using Iteration loop with numbers");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(i + nameList.get(i));
        }
        System.out.println("which number would you like to remove?");
        int numberToRemove = input.nextInt() - 1;
        if(numberToRemove > nameList.size()) {
            System.out.println("that is not a valid number");
        } else {

            nameList.remove(numberToRemove);
        }

        System.out.println("list after take out selected number");

    }
}

