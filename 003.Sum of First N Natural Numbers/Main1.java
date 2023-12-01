import java.util.*;
public class Main1 {
    public static int sumOfNNumbers(int n){
        return (n*(n+1))/2;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of First "+ n + " Natural Number is " + sumOfNNumbers(n));

    }
}