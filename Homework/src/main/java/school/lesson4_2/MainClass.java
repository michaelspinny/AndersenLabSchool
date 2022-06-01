package school.lesson4_2;

public class MainClass {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Black cat", 10);
        Plate plate = new Plate(25);

        firstCat.eat(plate);
        plate.info();

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("ArnoldCat", 5);
        catsArray[1] = new Cat("EdwardCat", 3);
        catsArray[2] = new Cat("LewisCat", 10);
        catsArray[3] = new Cat("CharlesCat", 9);
        catsArray[4] = new Cat("PercyCat", 3);

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            System.out.println();
        }
    }
}
