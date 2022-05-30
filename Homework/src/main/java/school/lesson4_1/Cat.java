package school.lesson4_1;

public class Cat extends Animal {
    private static final int CAT_RANGE = 200;

    public void run(int obstacleLength) {
        if (obstacleLength > CAT_RANGE) {
            obstacleLength = CAT_RANGE;
        }
        System.out.println("Cat runs " + obstacleLength);
    }

    public void swim(int obstacleLength) {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Cat blackCat = new Cat();
        blackCat.run(220);
        blackCat.swim(3);
    }
}
