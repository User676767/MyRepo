public class Runner {
    public static void main(String args[]) {
        int x = 23;
        boolean isPalindrome = palindromeCheck(x);
        if (isPalindrome) {
            System.out.println(x + " - это палиндром");
        } else {
            System.out.println(x + " - это не палиндром");
        }
    }

    public static boolean palindromeCheck(int x) {
        String checkSize = Integer.toString(x);
        int size = checkSize.length();
        char[] chstr = checkSize.toCharArray();
        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (chstr[left] != chstr[right]) {
                return false; // Не палиндром
            }
            left++;
            right--;
        }
        return true; // Палиндром
    }
}

