public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 9, 6, 3};
        int target = 9;

        // Check every pair of elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}