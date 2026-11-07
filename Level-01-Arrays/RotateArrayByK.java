public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;

        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        // Left rotate the array by k positions
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        // Copy rotated elements back
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}