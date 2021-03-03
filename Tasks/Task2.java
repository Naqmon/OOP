public class Task2 {
    public static boolean sameAscii(String a, String b){
        int suma = 0;
        for (int i = 0; i < a.length(); i++){
            suma += a.charAt(i);
        }
        int sumb = 0;
        for (int i = 0; i < b.length(); i++){
            sumb += b.charAt(i);
        }
        return suma == sumb;
    }

    public static String bomb(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length()-4; i++){
            if (str.substring(i, i+4).equals("bomb")){
                return "DUCK!";
            }
        }
        return "Relax, there's no bomb.";
    }
    public static boolean getXO(String s){
        int x = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'x'){x++;}
            if (s.charAt(i) == 'o'){o++;}
        }
        if (x == o) { return true; }
        return false;
    }
    
    public static int programmers(int a, int b, int c){
        int[] array = {a, b, c};
        return differenceMaxMin(array);
    }
    public static String reverse(String s){
        String str = "";
        for (int i = s.length()-1; i >= 0; i--){
            str += s.charAt(i);
        }
        return str;
    }
    public static int equal(int a, int b, int c){
        if (a == b && b == c){
            return 3;
        }
        else if(a == b || a == c || b == c){
            return 2;
        }
        else{ return 0; }
    }
    public static int differenceMaxMin(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if ( array[i] > max) { max = array[i];}
            if ( array[i] < min) { min = array[i];}
        }
        return max - min;
    }
    public static double discount(int price, int sale){
        return price*(1 - sale/100.0);
    }

    public static String nameShuffle(String name){
        return name.split(" ")[1] + " " + name.split(" ")[0];
    }

    public static int oppositeHouse(int number_house, int lenght_street){
        return lenght_street*2-number_house+1;
    }

    public static void main(String[] args){
        int[] array = {324, 4, 36, 7435, 23, -345, -3};
        System.out.print("oppositeHouse(3, 8) -> ");
        System.out.println(oppositeHouse(3, 8));
        System.out.print("nameShuffle(Ivan Ivanov) -> ");
        System.out.println(nameShuffle("Ivan Ivanov"));
        System.out.print("discount(500, 50) -> ");
        System.out.println(discount(500, 50));
        System.out.print("differenceMaxMin(array) -> ");
        System.out.println(differenceMaxMin(array));
        System.out.print("equal(12, 12, 32) -> ");
        System.out.println(equal(12, 12, 32));
        System.out.print("reverse(abcdefg) -> ");
        System.out.println(reverse("abcdefg"));
        System.out.print("programmers(123, 421, 532) -> ");
        System.out.println(programmers(123, 421, 532));
        System.out.print("getXO(xasxoo oxogoscohsox) -> ");
        System.out.println(getXO("xasxoo oxogoscohsox"));
        System.out.print("bomb(asdfbomb bcsdf) -> ");
        System.out.println(bomb("asdfbomb bcsdf"));
        System.out.print("sameAscii(abc, cba) -> ");
        System.out.println(sameAscii("abc", "cba"));
    }
}