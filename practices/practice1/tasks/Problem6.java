package practices.practice1.tasks;

public class Problem6 {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty())
            return true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";

        System.out.println(isPalindrome(str));
    }
}