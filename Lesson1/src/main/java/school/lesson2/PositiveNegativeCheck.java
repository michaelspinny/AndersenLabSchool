package school.lesson2;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        positiveNegativeCheck(8);
        positiveNegativeCheck(0);
        positiveNegativeCheck(-1);
        positiveNegativeCheck(100);
        positiveNegativeCheck(-34);
    }

    public static void positiveNegativeCheck(int value) {
        if (value >= 0) {
            System.out.println("Number is Positive!");
        } else {
            System.out.println("Number is Negative!");
        }
    }
}
