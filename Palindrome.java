import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int val = n;
        int rev = 0; // 

        while (n != 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }

        if (val == rev) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}