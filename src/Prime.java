import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many prime do you want?");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        boolean isPrime = true;

        while (count < numbers) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
                count++;
            }
            N++;
            isPrime = true;
        }
    }
}


