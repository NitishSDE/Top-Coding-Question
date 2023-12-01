import java.util.*;
public class Main2 {
    public static int sumOfNNumbers(int n){
        if(n == 0){
            return 0;
        }
        else {
            return n + sumOfNNumbers(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of First "+ n + " Natural Number is " + sumOfNNumbers(n));

    }
}