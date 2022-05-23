package school.lesson2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        settingValuesOnDiagonal();
    }

    public static void settingValuesOnDiagonal() {
        int[][] newArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            newArray[i][i] = 1;
            newArray[i][9 - i] = 1;
        }
    }
}
