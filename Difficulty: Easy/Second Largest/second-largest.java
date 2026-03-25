class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;//store smallest value

        // Step 1: Find maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;

        // Step 2: Find second maximum (not equal to max)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        // If second max not found
        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }

        return secondMax;
    }
}