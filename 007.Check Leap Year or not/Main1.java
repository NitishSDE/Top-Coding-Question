public class Main1 {
    public static boolean checkLeapYear(int n){
        
        if((n % 400 == 0) ||((n % 4 == 0) && (n % 100 != 0))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkLeapYear(1600));
        System.out.println(checkLeapYear(1500));
        System.out.println(checkLeapYear(2016));
        System.out.println(checkLeapYear(2011));
    }
}