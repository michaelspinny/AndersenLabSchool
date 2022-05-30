package school.lesson4_2;

public class MainClass {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Black cat", 10);
        Plate plate = new Plate(10);

        firstCat.eat(plate);
        plate.info();

    }
}
