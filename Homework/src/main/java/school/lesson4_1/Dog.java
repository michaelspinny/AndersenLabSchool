package school.lesson4_1;

public class Dog extends Animal {

    private static final int DOG_RANGE_RUN = 500;
    private static final int DOG_RANGE_SWIM = 10;

    public void run(int obstacleLength) {
        if (obstacleLength > DOG_RANGE_RUN) {
            obstacleLength = DOG_RANGE_RUN;
        }
        System.out.println("Dog runs " + obstacleLength);
    }
    public void swim(int obstacleLength) {
        if (obstacleLength > DOG_RANGE_SWIM) {
            obstacleLength = DOG_RANGE_SWIM;
        }
        System.out.println("Dog swims " + obstacleLength);
    }

    public static void main(String[] args) {
        Dog blackDog = new Dog();
        blackDog.run(350);
        blackDog.swim(9);
    }
}
