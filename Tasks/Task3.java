public class Task3 {
    public static boolean parityAnalysis(int num){
        int sum = 0;
        int n = num;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        if (sum % 2 == num % 2){ return true;}
        return false;
    }

    public static double mean (int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public static double totalDistance(double fuel, double cons, double pass, boolean fan){
        cons += cons*pass/20;
        if (fan) {cons += cons/10; }
        return fuel/cons*100;
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h){
        if (a*b <= w*h || a*c <= w*h || b*c <= w*h){
            return true;
        }
        return false;
    }
    public static String inator(String str){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int l = str.length();
        boolean flag = false;
        for (int i = 0; i < vowels.length; i++){
            if (vowels[i] == str.charAt(l-1)){
                flag = true;
                break;
            }
        }
        if (flag){
            str += "-inator " + Integer.toString(str.length()) + "000";
        }
        else{
            str += "inator " + Integer.toString(str.length()) + "000";
        }
        return str;
    }
    public static String reverseCase(String str){
        String strUp = str.toUpperCase();
        String strLow = str.toLowerCase();
        String st = "";
        for (int i = 0; i < str.length(); i++){
            if (strUp.charAt(i) == str.charAt(i)){st += strLow.charAt(i); }
            else { st += strUp.charAt(i); }
        }
        return st;
    }

    public static int warOfNumbers(int[] array){
        int odds = 0;
        int evens = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i] % 2 == 0){ evens += array[i]; }
            else { odds += array[i]; }
        }
        return Math.abs(evens-odds);
    }

    public static String rps(String one, String two){
        if(one == "rock" && two == "scissors" || one == "scissors" && two == "paper" || one == "paper" && two == "rock"){
            return "Player 1 wins";
        }
        else if (two == "rock" && one == "scissors" || two == "scissors" && one == "paper" || two == "paper" && one == "rock"){
            return "Player 2 wins";
        }
        else{
            return "TIE";
        }
    }
    public static double[] otherSides(double a){
        double c = a*2;
        double b = a*Math.sqrt(3);
        double[] array = {c, b};
        return array;
    }

    public static Object[][] millionsRounding(Object[][] array){
        for (int i = 0; i < array.length; i++){
            int div = (Integer)array[i][1]/1000000;
            int mod = (Integer)array[i][1]%1000000;
            if(mod >= 500000){ div++; }
            array[i][1] = 1000000*div;
        }
        return array;
    }

    public static void main(String[] args){
        System.out.println(inator("adse"));
    }
}
