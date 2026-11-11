import java.util.HashMap;

public class CountSubarraysWithSumK {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 3, 2, 1, 3, 4, 5, 7, 8, 9, 2, 1, 3, 4};
        int k = 4;

        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // The empty prefix has sum 0 and occurs once
        map.put(0, 1);

        for (int num : arr) {
            prefixSum += num;

            // Find earlier prefix sums that produce a subarray sum of k
            int required = prefixSum - k;
            count += map.getOrDefault(required, 0);

            // Store the frequency of the current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Total Subarrays: " + count);
    }
}
