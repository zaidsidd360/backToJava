/*
There is a class with m students and n exams. You are given a 0-indexed m x n 
integer matrix score, where each row represents one student and score[i][j] 
denotes the score the ith student got in the jth exam. The matrix score contains 
distinct integers only. You are also given an integer k. 
Sort the students (i.e., the rows of the matrix) by their scores in the 
kth (0-indexed) exam from the highest to the lowest.
Return the matrix after sorting it.
*/

/*
    Input:                               Expexted output:
    k = 2

    10, 6,  (9,)   1                     7,  5,  (11,)  2
    7,  5,  (11,)  2                     10, 6,  (9,)   1
    4,  8,  (3,)   15                    4,  8,  (3,)   15

    Notice the numbers in parentheses, those are the numbers according to 
    which the matrix has to be sorted. In other words, sort the matrix
    according to matrix[i][k].
*/

package LeetCode.Medium;

import java.util.*;

public class SortStudentsByScore { // 2545
    public static int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (student1, student2) -> student2[k] - student1[k]);
        return score;
    }

    public static void main(String[] args) {
        int score[][] = { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } };
        int k = 2;
        int result[][] = sortTheStudents(score, k);
        for (int[] student : result) {
            for (int marks : student) {
                System.out.print(marks + "    ");
            }
            System.out.println();
        }
    }
}
