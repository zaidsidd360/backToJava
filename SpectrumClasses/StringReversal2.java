package SpectrumClasses;

public class StringReversal2 {
    public static String reverse2(String s) {
        String arr[] = s.split(" ");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }
        return ans;
    }

    public static void main(String[] args) {
        String ans = reverse2("A quick brown fox jumps over the lazy dog");
        System.out.println(ans);
    }
}
