// The value of an alphanumeric string can be defined as:
// The numeric representation of the string in base 10, 
// if it comprises of digits only. The length of the string, otherwise.
// Given an array strs of alphanumeric strings, 
// return the maximum value of any string in strs.

package LeetCode.Easy;

public class MaximumValueOfString { // 2496
    public static int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            int currVal = 0;
            if (strs[i].matches("\\d+"))
                currVal = Integer.parseInt(strs[i]);
            else
                currVal = strs[i].length();
            max = currVal > max ? currVal : max;
        }
        return max;
    }

    public static void main(String[] args) {
        String strs[] = { "alic3", "bob", "3", "4", "00000" };
        System.out.println(maximumValue(strs));
    }
}
