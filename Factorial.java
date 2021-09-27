import java.util.Scanner;
 class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose factorial is to be found: ");
        int num = sc.nextInt();
        while( i <= num ){
            factorial = factorial * i;
            i++;
        }
        System.out.println("\nFactorial of " + num + " is: " + factorial);
    }
}