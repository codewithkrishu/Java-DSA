import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1); // Prefix sum 0 exists before the array starts.

        int prefixSum = 0;
        int maxLength = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int required = prefixSum - k;

            if (firstIndex.containsKey(required)) {
                int length = i - firstIndex.get(required);

                if (length > maxLength) {
                    maxLength = length;
                    startIndex = firstIndex.get(required) + 1;
                    endIndex = i;
                }
            }

            // Keep only the first occurrence to get the longest subarray.
            if (!firstIndex.containsKey(prefixSum)) {
                firstIndex.put(prefixSum, i);
            }
        }

        System.out.println("Longest length = " + maxLength);

        if (maxLength > 0) {
            System.out.print("Subarray = ");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
