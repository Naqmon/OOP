class Task1 {
    public static int mod(int divisible, int divisor){
        int quotient = divisible/divisor;
        return divisible - quotient*divisor;
    }
    public static int frames(int minutes, int fps){
        return minutes*fps*60;
    }
    public static boolean profitableGamble(double prob, int prize, int pay){
        return prob*prize > pay;
    }
    public static int squared(int a){
        return a*a;
    }
    public static int howManyWalls(int n, int w, int h){
        return n/(w*h);
    }
    public static boolean or(boolean x, boolean y){
        return x || y;
    }
    public static boolean divisibleByFive(int x){
        return x % 5 == 0;
    }
    public static int footballPoints(int win, int draw, int defeat){
        return win*3 + draw;
    }
    public static int points(int twop, int threep){
        return twop*2 + threep*3;
    }
    public static int convert(int weeks){
        return 7*weeks*24*60*60;
    }
    public static void main(String[] args) {
        System.out.print("convert(34) -> \t");
        System.out.println(convert(34));
        System.out.print("points(22, 35) -> \t");
        System.out.println(points(22, 35));
        System.out.print("footballPoints(2, 5, 11) -> \t");
        System.out.println(footballPoints(2, 5, 11));
        System.out.print("divisibleByFive(34) -> \t");
        System.out.println(divisibleByFive(34));
        System.out.print("and(true, true) -> \t");
        System.out.println(and(true, true));
        System.out.print("howManyWalls(92, 5, 11) -> \t");
        System.out.println(howManyWalls(92, 5, 11));
        System.out.print("squared(12) -> \t");
        System.out.println(squared(12));
        System.out.print("profitableGamble(0.2, 5, 11) -> \t");
        System.out.println(profitableGamble(0.2, 5, 11));
        System.out.print("frames(22, 35) -> \t");
        System.out.println(frames(22, 35));
        System.out.print("mod(34, 3) -> \t");
        System.out.println(mod(34, 3));
    }
}




