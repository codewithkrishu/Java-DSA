public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {12, 7, 8, 15, 20, 33, 44, 9};
        int evenNum = 0;
        int oddNum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println("Even Numbers -> " + evenNum);
        System.out.println("Odd Numbers -> " + oddNum);
    }
}
