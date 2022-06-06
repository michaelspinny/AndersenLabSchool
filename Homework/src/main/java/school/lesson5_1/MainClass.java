package school.lesson5_1;

public class MainClass {
    public static void main(String[] args) {

        String[] newArray = {"Derek", "Liza", "Michael", "Cindy"};
        ChangeElementsPosition.arrayElementsSwap(newArray,0,1);
        ChangeElementsPosition.arrayElementsSwap(newArray,3,0);
    }
}
