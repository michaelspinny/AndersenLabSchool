package school.lesson4_1;

public abstract class Dog extends Animal {

    private static final int DOG_RANGE_RUN = 500;
    private static final int DOG_RANGE_SWIM = 10;

    public void run(int obstacleLength) {
        if (obstacleLength > DOG_RANGE_RUN) {
            obstacleLength = DOG_RANGE_RUN;
        }
    }
    public void swim(int obstacleLength) {
        if (obstacleLength > DOG_RANGE_SWIM) {
            obstacleLength = DOG_RANGE_SWIM;
        }
    }
}
