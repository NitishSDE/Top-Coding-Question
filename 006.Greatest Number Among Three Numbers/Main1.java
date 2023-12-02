public class Main1 {
    public static int getMax(int a, int b, int c){
        int temp = (a > b) ? a : b;
        int result = (temp > c) ? temp : c;
        return result;
    }
    

    public static void main(String[] args) {
        System.out.println(getMax(12, 48, 92));
        System.out.println(getMax(12, 189, 92));
        System.out.println(getMax(120, 48, 92));
    }
}