import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithXORK {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1);

        int prefixXor = 0;
        int maxLength = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            prefixXor ^= arr[i];

            int requiredXor = prefixXor ^ k;

            if (firstIndex.containsKey(requiredXor)) {
                int length = i - firstIndex.get(requiredXor);

                if (length > maxLength) {
                    maxLength = length;
                    startIndex = firstIndex.get(requiredXor) + 1;
                    endIndex = i;
                }
            }

            // Keep the earliest index to maximize the subarray length.
            if (!firstIndex.containsKey(prefixXor)) {
                firstIndex.put(prefixXor, i);
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
