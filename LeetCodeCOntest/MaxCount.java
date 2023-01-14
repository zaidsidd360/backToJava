package LeetCodeCOntest;

public class MaxCount {
    public static int maxCount(int arr[]) {
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                posCount += 1;
            else if (arr[i] < 0)
                negCount += 1;
            else
                continue;
        }
        return posCount > negCount ? posCount : negCount;
    }

    public static void main(String[] args) {
        int array[] = { -3, -2, -1, -2, -3, -5, 0, 0, 1, 2, 3, 4, 4 };
        System.out.println(maxCount(array));
    }
}
