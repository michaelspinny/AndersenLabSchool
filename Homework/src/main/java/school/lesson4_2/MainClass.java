package school.lesson4_2;

public class MainClass {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Black cat", 5);
        Plate plate = new Plate(30);

        firstCat.eat(plate);
        plate.info();

    }
}
