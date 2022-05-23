package school.lesson2;

public class PrintLineNumberOfTimes {
    public static void main(String[] args) {
        printLineNumberOfTimes(4, "I am printed ");
        printLineNumberOfTimes(6, "I am printed ");
        printLineNumberOfTimes(0, "I am not printed ");
    }

    public static void printLineNumberOfTimes(int value, String string) {
        for (int i = 0; i < value; i++) {
            System.out.println(string + value + " times!");
        }
    }
}
