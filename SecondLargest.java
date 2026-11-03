public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        Integer secondLargest = null;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest &&
                       (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        System.out.println("First largest: " + largest);
        if (secondLargest != null) {
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("Second largest distinct element does not exist");
        }
    }
}
