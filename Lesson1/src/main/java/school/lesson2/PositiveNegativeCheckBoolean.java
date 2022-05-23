package school.lesson2;

public class PositiveNegativeCheckBoolean {
    public static void main(String[] args) {
        System.out.println(positiveNegativeCheck(20));
        System.out.println(positiveNegativeCheck(0));
        System.out.println(positiveNegativeCheck(-14));
        System.out.println(positiveNegativeCheck(78));
        System.out.println(positiveNegativeCheck(-909));
    }

    public static boolean positiveNegativeCheck(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
