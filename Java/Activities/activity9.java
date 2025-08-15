package activities;

import java.util.ArrayList;

public class activity9 {
    public static void main(String[] args) {
        //declaring Array list of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Roy");
        myList.add("Momy");
        myList.add("Maxime");
        //Adding object at specific index
        myList.add(3, "Tom");
        myList.add(1, "Bob");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Bell is in list: " + myList.contains("Bell"));
        System.out.println("Size of ArrayList: " + myList.size());
        System.out.println("my array: " + myList);
        
        myList.remove("Bob");
        
        System.out.println("New Size of ArrayList: " + myList.size());
        System.out.println("my array: " + myList);
    }
}