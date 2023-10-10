package SpectrumClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class OddArrayList {
    public static void printTwiceOdd(ArrayList<Integer> list) {


//        for(int val: list) {
//            if(val % 2 != 0)
//                System.out.println(val * 2);
//        }

        list.forEach((val) -> {
            if(val % 2 != 0) System.out.println(val * 2);
        });
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,3,8,6));
        printTwiceOdd(list);
    }
}
