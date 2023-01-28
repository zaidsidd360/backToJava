// The Tribonacci sequence Tn is defined as follows: 
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Given n, return the value of Tn.

package LeetCode.Easy;

public class NthTribonacci { // 1137
    public int tribonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        int fst = 0;
        int sec = 1;
        int thd = 1;
        int next = 0;
        int i = 3;
        while (i <= n) {
            next = fst + sec + thd;
            fst = sec;
            sec = thd;
            thd = next;
            i++;
        }
        return next;
    }
}
