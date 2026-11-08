public class MaximumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 2, 11};

        int minValue = arr[0];
        int minIndex = 0;

        int maxDifference = Integer.MIN_VALUE;
        int startIndex = -1;
        int endIndex = -1;

        // Find the largest arr[j] - arr[i], where j is after i
        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - minValue;

            if (difference > maxDifference) {
                maxDifference = difference;
                startIndex = minIndex;
                endIndex = i;
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Maximum Difference: " + maxDifference);
        System.out.println("Start Index: " + startIndex);
        System.out.println("End Index: " + endIndex);
    }
}