public class Palindrome{
    public static String reverseString(String s){
        String str = "";
        for (int i = s.length()-1; i >= 0; i--){
            str += s.charAt(i);
        }
        return str;
    }
    public static boolean isPalindrome(String str){
        String s = reverseString(str);
        return str.equals(s);
    }


    public static void main(String[] args){
        String test[] = new String[] {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};
        for (int i = 0; i < test.length; i++){
            System.out.print(test[i]+"\t");
            System.out.println(isPalindrome(test[i]));
        }

    }
}
