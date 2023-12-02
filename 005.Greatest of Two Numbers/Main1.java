public class Main1 {
    public static void getMax(int a, int b){
        if(a == b){
            System.out.println("Both Are Equal");
        }
        else{
            int temp = (a > b) ?  a : b;
            System.out.println(temp + " is greater");
        }
    }
    public static void main(String[] args) {
        getMax(12, 12);
        getMax(12, 13);
        getMax(23, 4);
    }
}