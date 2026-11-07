public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 5, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            boolean alreadySeen = false;

            // Avoid printing the same duplicate more than once
            for (int p = 0; p < i; p++) {
                if (arr[p] == arr[i]) {
                    alreadySeen = true;
                    break;
                }
            }

            if (alreadySeen) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    break;
                }
            }
        }
    }
}