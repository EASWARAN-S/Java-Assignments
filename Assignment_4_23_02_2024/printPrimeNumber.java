//  Program to print prime number between 1 to 30
public class printPrimeNumber {
    public static void main(String[] args) {
        int[] primeNumber = new int[30];
        int count = 0;
        // A number divide only by one and itself is called prime number 
        
        for (int i = 2; i <= 30; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                primeNumber[count] = i;
                count++;
            }
        }
        // To print prime numbers between one and thirty 
        System.out.println("prime numbers are");
        for (int j = 0; j < count; j++) {
            System.out.println(primeNumber[j]);
        }
    }
}
