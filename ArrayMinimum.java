public class ArrayMinimum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 56};
        int minElement = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < minElement) {
                minElement = num;
            }
        }
        System.out.println("Minimum Element In Array -> " + minElement);
    }
}
