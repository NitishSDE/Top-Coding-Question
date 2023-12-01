import java.util.*;
public class Main1 {
    // Function Defining to check Even or Odd.
    public static String checkEvenOdd(int n){
       return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n + " is "+ checkEvenOdd(n));
    }
}