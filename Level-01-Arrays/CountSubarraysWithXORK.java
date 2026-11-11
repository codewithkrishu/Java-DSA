import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithXORK {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int prefixXor = 0;
        int count = 0;

        for (int value : arr) {
            prefixXor ^= value;

            int requiredXor = prefixXor ^ k;
            count += frequency.getOrDefault(requiredXor, 0);

            frequency.put(
                prefixXor,
                frequency.getOrDefault(prefixXor, 0) + 1
            );
        }

        System.out.println("Subarrays with XOR " + k + " = " + count);
    }
}
