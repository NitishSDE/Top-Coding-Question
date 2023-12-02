public class Main1 {
    public static int getSum(int a, int b){
        int sum = (b*(b+1))/2 - (a*(a+1))/2 + a;
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 10));
    }
}