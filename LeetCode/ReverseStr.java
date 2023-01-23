// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

package LeetCode;

public class ReverseStr {
    public static String[] revStr(String s[]) { // Naive implementation; LC runtime: 677ms
        String str = "";
        for (int i = s.length - 1; i >= 0; i--) {
            str += s[i];
        }
        System.out.println(str);
        for (int j = 0; j < str.length(); j++) {
            s[j] = Character.toString(str.charAt(j));
        }
        return s;
    }

    public static String[] revStr2(String s[]) { // Optimized implementation; LC runtime: 2ms
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            if (i < j) {
                s[i] = s[j];
                s[j] = temp;
                j--;
            }
        }
        return s;
    }

    public static String[] revStr3(String s[]) { // Even more optimized implementation; LC runtime: 1ms
        int j = s.length - 1;
        int i = 0;
        while (i < j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        String s[] = { "h", "e", "l", "l", "o" };
        String n[] = revStr2(s);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
