public class ReverseArrayInGroupsOfK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        // Process each group of k elements
        for (int start = 0; start < arr.length; start += k) {
            int left = start;
            int right = Math.min(start + k - 1, arr.length - 1);

            // Reverse the current group using two pointers
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}