// Given two strings needle and haystack, return the index 
// of the first occurrence of needle in haystack, or -1 if 
// needle is not part of haystack.

package LeetCode.Medium;

public class NeedleInHaystack { // 28
    public static int fineNeedleInHaystack(String needle, String haystack) {
        if (haystack == null || needle == null)
            return -1;

        if (haystack.equals(needle))
            return 0;

        int needleLength = needle.length();
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle))
                return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(fineNeedleInHaystack("issi", "mississippi"));
    }
}
