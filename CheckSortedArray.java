public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 12, 20, 25};
        // int[] arr = {10, 20, 30, 40, 50};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is unSorted");
        }
    }
}
