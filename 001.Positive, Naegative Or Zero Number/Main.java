public class Main {

    public static void checkNumber(int n){
        if (n > 0) {
            System.out.println(n + " is a Positive Number");
        }
        else if(n < 0){
            System.out.println(n + " is a Negative Number");
        }
        else{
            System.out.println(n + " is a Zero");
        }
    }

    public static void main(String[] args) {
        checkNumber(12);
        checkNumber(-45);
        checkNumber(0);
    }
}