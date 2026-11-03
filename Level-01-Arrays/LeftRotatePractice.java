public class LeftRotatePractice {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};

        if (arr.length > 0) {

            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {

                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
