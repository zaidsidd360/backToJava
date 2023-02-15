// You are a product manager and currently leading a team to develop a new product. 
// Unfortunately, the latest version of your product fails the quality check. 
// Since each version is developed based on the previous version, 
// all the versions after a bad version are also bad. Suppose you have
//  n versions [1, 2, ..., n] and you want to find out the first bad one, 
// which causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad. 
// Implement a function to find the first bad version. 
// You should minimize the number of calls to the API.
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

package LeetCode.Easy;

// Code won't work locally as it inherits from LeetCode's hidden VersionControl class.
public class FirstBadVersion /* extends VersionControl */ { // 278

    // The isBadVersion method below isn't part of the actual solution.
    public static boolean isBadVersion(int version) {
        return true;
    }
    // It's only here so that VSCode intellisense doesn't throw errors.

    public static int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (!isBadVersion(mid))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
