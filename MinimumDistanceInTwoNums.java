// Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. 
// The array might also contain duplicates. You may assume that both x and y are different and present in arr[].
// Examples: 
// Input: arr[] = {1, 2}, x = 1, y = 2
// Output: Minimum distance between 1 
// and 2 is 1.
// Explanation: 1 is at index 0 and 2 is at 
// index 1, so the distance is 1
// Input: arr[] = {3, 4, 5}, x = 3, y = 5
// Output: Minimum distance between 3 
// and 5 is 2.
// Explanation:3 is at index 0 and 5 is at 
// index 2, so the distance is 2

public class MinimumDistanceInTwoNums {

    static int minDist(int arr[], int n, int x, int y) {
        int idx1 = -1, idx2 = -1,
                min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {
                idx1 = i;
            }

            else if (arr[i] == y) {
                idx2 = i;
            }

            if (idx1 != -1 && idx2 != -1)
                min_dist = Math.min(min_dist, Math.abs(idx1 - idx2));
        }

        if (idx1 == -1 || idx2 == -1)
            return -1;
        else
            return min_dist;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
        int n = arr.length;
        int x = 3;
        int y = 6;

        System.out.println("Minimum distance between " + x + " and " + y + " is " + minDist(arr, n, x, y));
    }
}

