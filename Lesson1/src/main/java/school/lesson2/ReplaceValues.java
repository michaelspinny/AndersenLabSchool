package school.lesson2;

public class ReplaceValues {
    public static void main(String[] args) {

    }

    public static void replaceValues() {
        int[] newArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 1) {
                newArr[i] = 0;
            } else if (newArr[i] == 0) {
                newArr[i] = 1;
            }
        }
    }
}
