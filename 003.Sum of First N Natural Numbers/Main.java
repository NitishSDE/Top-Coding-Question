import java.util.*;
public class Main {
    public static int sumOfNNumbers(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of First "+ n + " Natural Number is " + sumOfNNumbers(n));

    }
}