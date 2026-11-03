public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        if (arr.length == 0) {
            System.out.println("Unique Element: 0");
            return;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {

                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("Unique Element: " + (i + 1));

        System.out.print("Unique Values: ");

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
