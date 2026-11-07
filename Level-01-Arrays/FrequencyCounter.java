public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 5, 3, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;

            // Count each distinct number only once
            for (int p = 0; p < i; p++) {
                if (arr[p] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}