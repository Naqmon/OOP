public class Primes{
    public static boolean isPrime(int n){
        if (n == 2){return true;}
        else if ( n % 2 == 0) { return false; }
        for(int i = 3; i < n; i += 2){
            if (n % i == 0){return false;}
        }
        return true;
    }
            
    public static void main(String[] args){
        for (int i = 2; i < 100; i++){
            System.out.print(i);
            System.out.print("\t");
            System.out.println(isPrime(i));

        }

    }
}
