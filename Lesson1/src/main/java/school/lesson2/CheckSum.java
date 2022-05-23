package school.lesson2;

public class CheckSum {
    public static void main(String[] args) {
        System.out.println(checkSum(4, 5));
        System.out.println(checkSum(5, 5));
        System.out.println(checkSum(5, 6));
        System.out.println(checkSum(9, 10));
        System.out.println(checkSum(10, 10));
        System.out.println(checkSum(10, 11));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
