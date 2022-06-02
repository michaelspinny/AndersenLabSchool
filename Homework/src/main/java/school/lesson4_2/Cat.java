package school.lesson4_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullBelly;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullBelly = false;
    }

    public void eat(Plate plate){
        if (appetite < plate.getFoodAmount()) {
            plate.decreaseFood(appetite);
            fullBelly = true;
            System.out.println("Cat has a full belly!");
        } else {
            System.out.println("Not enough food");
        }
    }
}
