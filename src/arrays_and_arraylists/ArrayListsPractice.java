package arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsPractice {
    public static void main(String[] args) {
//        Create an ArrayList with 5 elements
            ArrayList<String> sandwhich = new ArrayList<String>();
//        add 5 elements to it
            sandwhich.add("cheese");
            sandwhich.add("bread");
            sandwhich.add("meat");
            sandwhich.add("oil");
            sandwhich.add("vinegar");
//        print the entire ArrayList to the terminal
            System.out.println(sandwhich);
//        print the length of it
            System.out.println(sandwhich.size());
//        remove some elements from the ArrayList
            sandwhich.remove("meat");
//        print the entire ArrayList again, and it's size
            System.out.println(sandwhich);

//        Create an ArrayList with 5 elements and give the value in-line
            ArrayList<String> shoes = new ArrayList<>(Arrays.asList("laces", "sole", "tongue", "decal", "color"));
//        mess around with various methods for ArrayLists. Just type out the variable name and then put a "." and scroll through the list of methods.
//        read the information it shows you and try to figure out how to use it.
//        create different conditionals using "if-else" statements to test different methods. For example:
//        if (myArray.contains("something"){
//        then do something
//        }
            if (shoes.contains("decal")) {
                    shoes.remove("decal");
            } else {
                    shoes.add("grommets");
            }
//        print out whatever you need to the terminal to check and see if the methods work the way you think they should.
            System.out.println(shoes);


    }
}
