package arrays_and_arraylists;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
//        Create an array with 5 elements
           String[] food = new String[5];
//        give each index in the array a value
            food[0] = "chicken";
            food[1] = "ham";
            food[2] = "biscuit";
            food[3] = "squid";
            food[4] = "turkey";
//        print the entire array to the terminal
            System.out.println(Arrays.toString(food));
//        print the length of the array
            System.out.println(food.length);

//        Create an array with 5 elements and give the values in-line
            String[] drone = {"controller", "propeller", "camera", "frame", "antenna"};
//        print the entire array to the terminal
            System.out.println(Arrays.toString(drone));
//        print the length of the array
            System.out.println(drone.length);
//        change a few values in each array and then print both arrays to the terminal again
            food[2] = "scone";
            drone[4] = "goggles";
            System.out.println(Arrays.toString(food));
            System.out.println(Arrays.toString(drone));

    }
}
