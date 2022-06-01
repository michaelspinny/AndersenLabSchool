package school.lesson4_2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Cannot feed the cat!");
        }
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public int getFoodAmount() {
        return food;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
}
