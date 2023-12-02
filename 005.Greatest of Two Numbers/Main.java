public class Main {
    public static void getMax(int a, int b){
        if(a > b){
            System.out.println(a +" is Gretaer Than "+ b);
        }
        else if(a < b){
            System.out.println(b +" is Gretaer Than "+ a);
        }
        else{
            System.out.println(a +" Is Equal to "+ b);
        }
    }
    public static void main(String[] args) {
        getMax(45, 78);
        getMax(23, 12);
        getMax(47, 47);
    }
}