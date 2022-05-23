package school.lesson2;

import java.util.Arrays;

public class ArrayNumberMultiplicator {
    public static void main(String[] args) {
        arrayNumberMultiplicator();
    }

    public static void arrayNumberMultiplicator() {
        int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 6) {
                newArray[i] *= 2;
            }
            System.out.println(newArray[i]);
        }
    }
}
