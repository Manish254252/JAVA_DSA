// Using Linear Search Method 
// Find Even Numbers of Digits in An Array

public class evenDigits {

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfdigit = digit(num);

        return numberOfdigit % 2 == 0;
    }

    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
