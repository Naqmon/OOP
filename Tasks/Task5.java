public class Task5 {
    public static boolean sameLetterPattern(String str, String str2){
        for(int i = 0; i < str2.length()-1; i++) {
            str2 = str2.replace(str2.charAt(i), str.charAt(i));
        }
        return str.equals(str2);
    }
    public static void main(String args[]){
        String str = "abcabc";
        String str2 = "123113";
        System.out.println(sameLetterPattern(str, str2));
    }
    
}
