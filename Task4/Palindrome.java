package Task4;

public class Palindrome {
    public static boolean isPalindromeWord(String str) {
        StringBuilder reversedText = new StringBuilder(str);
        reversedText.reverse();
        return reversedText.toString().equals(str);
    }

    public static void outPut(){
        System.out.println(isPalindromeWord("606"));
    }
}
