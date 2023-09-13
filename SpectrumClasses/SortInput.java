package SpectrumClasses;

import java.util.*;

public class SortInput {
    public static void takeInputAndSort(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            list.add(sc.nextInt());
        System.out.println("Enter the sorting type; 1 for ascending, 2 descending: ");
        int sortType;
        while(true) {
            sortType = sc.nextInt();
            if(sortType == 1 || sortType == 2) break;
            System.out.println("Please enter either 1 or 2!");
        }
        if(sortType == 1)
            list.sort(Comparator.naturalOrder());
        else
            list.sort(Comparator.reverseOrder());

        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        takeInputAndSort(sc);
    }
}
