package LeetCode.Easy;

import java.util.*;

class HappyNumber {
    public static boolean isHappy(int n) {
        if (n < 10)
            return false;
        Map<Integer, Boolean> map = new HashMap<>();
        int temp = n;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem;
                temp /= 10;
            }
            map.put(sum, true);
            System.out.println(map);
            temp = sum;
            if (temp == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }
}