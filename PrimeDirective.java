import java.util.ArrayList;
import java.util.Arrays;  

 
 public class PrimeDirective{
    public boolean isPrime(int number){
        if (number == 1){
            return true;
        }
        else if (number < 2){
             return false;
        }
      for(int i =2 ; i < number;i++ ){
        if (number%i ==0){
            return false;
        }
      }
       return true;
    }
   public ArrayList<Integer> onlyPrimes(int[] numbers) {
  ArrayList<Integer> primes = new ArrayList<Integer>();
 
  for (int number : numbers) {
    if (isPrime(number)) {
      primes.add(number);
    }
  }
 
  return primes;
} 
 public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println("The are list "+Arrays.toString(numbers));

System.out.println("THE PRIME ARRAY LIST IS" +pd.onlyPrimes(numbers));
  }  
}