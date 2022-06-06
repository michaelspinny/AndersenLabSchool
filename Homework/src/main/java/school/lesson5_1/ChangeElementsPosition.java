package school.lesson5_1;

public class ChangeElementsPosition {
    public static void arrayElementsSwap(String[] newArray, int k, int m) {

        System.out.println("Array before swap" + "\n");
        printArray(newArray);

        String tempValue = newArray[k];
        newArray[k] = newArray[m];
        newArray[m] = tempValue;
        System.out.println("\n");

        System.out.println("Array after swap" + "\n");
        printArray(newArray);

    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
