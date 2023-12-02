public class Main {

    public static int getSum(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 10));
    }
}