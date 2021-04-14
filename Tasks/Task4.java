import java.util.HashSet;
import java.util.Arrays;

public class Task4{
    public static void main(String args[]){
    }


    static String unrepeated(String str){
        HashSet<String> duplicates  = new HashSet<>();
        int l = str.length();
        String st = "";
        for(int i = 0; i < l; i++){
            if(duplicates.add(String.valueOf(str.charAt(i)))){
                st += String.valueOf(str.charAt(i));
            }
        }
        return st;
    }


    static int memeSum(int a, int b){
        String st = "";
        while(a > 0 && b > 0){
            st = String.valueOf(a % 10 + b % 10) + st;
            a /= 10;
            b /= 10;
        }
        return Integer.parseInt(st);
    }
    

    static String commonLastVowel(String str){
        str = str.toLowerCase();
        String words[] = str.split(" ");
        int vowels[] = {0, 0, 0, 0, 0, 0};
        for (String st : words) {
            if(st.charAt(st.length()-1) == 'a'){vowels[0]++;}
            if(st.charAt(st.length()-1) == 'e'){vowels[1]++;}
            if(st.charAt(st.length()-1) == 'y'){vowels[2]++;}
            if(st.charAt(st.length()-1) == 'u'){vowels[3]++;}
            if(st.charAt(st.length()-1) == 'i'){vowels[4]++;}
            if(st.charAt(st.length()-1) == 'o'){vowels[5]++;}
        }
        int mx = 0;
        int ind = -1;
        for (int i = 0; i < vowels.length; i++){
            if(vowels[i] > mx){ 
                ind = i;
                mx = vowels[i];
            }
        }
        if(ind == 0)     { return "a"; }
        else if(ind == 1){ return "e"; }
        else if(ind == 2){ return "y"; }
        else if(ind == 3){ return "u"; }
        else if(ind == 4){ return "i"; }
        else if(ind == 5){ return "o"; }
        else { return "No vowels in end words"; }
    }


    static int foo(int num){
        int array[] = {};
        int n = num;
        int i = 0;
        while (n > 0){
            array = Arrays.copyOf(array, array.length+1);
            array[i] = n % 10;
            n /= 10;
            i++;
        }
        Arrays.sort(array);
        n = 0;
        for (i = 0; i < array.length; i++){
            n += array[i]*Math.pow(10, i);
        }
        if (num - n >= 0 ){
            return num - n;
        }
        return 0;
    }

    static int largestGap(int array[]){
        Arrays.sort(array);
        int diff = 0;
        for (int i = 0; i < array.length-1; i++){
            if ( array[i+1]-array[i] > diff){ diff = array[i+1] - array[i];}
        }
        return diff;

    }

    static String xPronounce(String str){
        String st;
        if (str.charAt(0) == 'x'){
            st = "csk";
        }
        else{
            st = String.valueOf(str.charAt(0));
        }
        for (int i = 1; i < str.length()-1; i++){
            if (str.charAt(i-1) == ' ' && str.charAt(i) == 'x' && str.charAt(i+1) == ' '){
                st += "csk";

            }
            else if (str.charAt(i-1) == ' ' && str.charAt(i) == 'x'){
               st += "z"; 
            }
            else if (str.charAt(i) == 'x'){
                st += "csk";

            }
            else{
                st += String.valueOf(str.charAt(i));
            }
        }
        if (str.charAt(str.length()-1) == 'x'){
            st += "csk";
        }
        else{
            st += String.valueOf(str.charAt(str.length()-1));
        }
        return st;
    }

    static String noYelling(String str){
        int l = str.length();
        String st = "";
        while ( str.charAt(l-1) == '!' || str.charAt(l-1) == '?'){
            l--; 
        }
        for (int i = 0; i <= l; i++){
            st += String.valueOf(str.charAt(i));
        }
        return st;
    }

    static String unmix(String str){
        String st = "";
        if (str.length() % 2 == 0){
            for (int i = 0; i < str.length(); i += 2){
            st += String.valueOf(str.charAt(i+1)) + String.valueOf(str.charAt(i));
            }
        }
        else{
            for (int i = 0; i < str.length()-1; i += 2){
            st += String.valueOf(str.charAt(i+1)) + String.valueOf(str.charAt(i));
            }
            st += String.valueOf(str.charAt(str.length()-1));
        }
        return st;
            
    }

    static boolean cons(int array[]){
        HashSet<Integer> duplicates = new HashSet<>();
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){ min = array[i]; }

            if(!duplicates.add(array[i])){
                return false;
            }
        }
        for (int i = 1; i < duplicates.size(); i++){
            if (!duplicates.contains(min+i)){ return false; }
        }
        return true;
    }

    static String sevenBoom(int array[]){
        int n;
        for (int i = 0; i < array.length; i++){
            while (array[i] > 0){
                n = array[i] % 10;
                if (n == 7){
                    return "Boom!";
                }
                array[i] /= 10;

            }            
        }
        return "not seven";
    }
}