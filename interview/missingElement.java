package interview;

public class missingElement {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int sum = arr[arr.length - 1] * (arr[arr.length - 1] + 1) / 2;
        int asum = 0;
        for (int i = 0; i < arr.length; i++) {
            asum += arr[i];

        }
        System.out.println("missing num is " + (sum - asum));
    }

}
