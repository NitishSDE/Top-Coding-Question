public class Main2 {
    // Function Defining to check Even or Odd.
    public static void checkEvenOdd(int n){
        if ((n & 1) == 0) {
            System.out.println(n + " is an Even Number");
        }
        else{
            System.out.println(n + " is an Odd Number");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(12);
        checkEvenOdd(35);
    }
}