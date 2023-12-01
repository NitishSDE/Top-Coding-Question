public class Main {
    public static void checkEvenOdd(int n){
        if (n % 2 == 0){
            System.out.println(n + " is a Even Number");
        }
        else{
            System.out.println(n + " is an Odd Number");
        }
    }


    public static void main(String[] args) {
        checkEvenOdd(12);
        checkEvenOdd(45);
    }
}